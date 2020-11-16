package com.ipartek.formacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.modelo.PerroDAOSqlite;
import com.ipartek.formacion.pojo.Perro;

/**
 * Servlet implementation class PerroDetalleController
 */
@WebServlet("/perro-detalle")
public class PerroDetalleController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private PerroDAOSqlite dao = PerroDAOSqlite.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerroDetalleController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// coger el VALUE del parametro que me envias desde la vista, el cual se llama "id"
		// <a href="perro-detalle?id=${perro.id">
		
		String parametroId = request.getParameter("id");		
		int id = Integer.parseInt(parametroId);
		
		Perro perro = dao.recuperar(id);
		
		request.setAttribute("perro", perro);
		
		request.getRequestDispatcher("detalle.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
