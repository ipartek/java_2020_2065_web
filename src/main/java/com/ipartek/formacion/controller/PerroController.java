package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.modelo.PerroDAOSqlite;
import com.ipartek.formacion.pojo.Perro;

/**
 * @WebServlet("/perro-controller") es la URL donde escucha este controlador.
 * No tiene nada que ver con el nombre de la clase PerroController extends HttpServlet
 */
@WebServlet("/perro-controller")
public class PerroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PerroDAOSqlite dao = PerroDAOSqlite.getInstance();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Perro> lista = new ArrayList<Perro>();
		try {
			// conseguir datos llamado al modelo ( bbdd ) 
			lista = dao.listar();

		} catch (Exception e) {

			e.printStackTrace();

		} 

		// Los DATOS (atributos) a enviar a la vista para pintarlos
		// request.setAttribute( String, Objeto);
		// String podeis poner el nombre que querais, pero eso mismo nombre lo usaremos en la JSP para acceder al Objeto
		// Objeto, podeis enviar lo que querais: String, boolean, Perro, ArrayList<Perro>,....		
		request.setAttribute("perros", lista);
		request.setAttribute("mensaje", "Recuperados " + lista.size() + " perros");

		// Comando para ir a la VISTA, hacemos un "forwad" y escribimos el nombre de la JSP "perros.jsp" 
		request.getRequestDispatcher("tabla-perros.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String mensaje = "";
		
		//recibri datos del formulario, fijaros en el input el atributo 'name'
		String nombre = request.getParameter("nombre");
		String raza = request.getParameter("raza");
	    float peso = Float.parseFloat(request.getParameter("peso"));
		boolean vacunado = ( request.getParameter("vacunado") == null ) ?  false : true;		
		String historia = request.getParameter("historia");
		
		Perro p = new Perro();
		p.setNombre(nombre);
		p.setRaza(raza);
		p.setPeso(peso);
		p.setVacunado(vacunado);
		p.setHistoria(historia);
		
		//guardarlo en la bbdd
		try {
			dao.crear(p);
			mensaje = "Perro insertado con exito";
			
		} catch (Exception e) {			
			e.printStackTrace();
			mensaje = "Lo sentimos pero " + p.getNombre() +" de perro ya existe";
			
		}finally {
		
			// enviarlos a la JSP
			request.setAttribute("perro", p);
			request.setAttribute("mensaje", mensaje);
			// ir a la JSP
			request.getRequestDispatcher("perro.jsp").forward(request, response);
		}	
	}

}
