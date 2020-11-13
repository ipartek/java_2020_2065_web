package com.ipartek.formacion.modelo;

import java.util.ArrayList;


/**
 * DAO para definir las operaciones de CRUD con una Clase Generica, 
 * en este caso hemos usado una P de Pojo
 * @author ur00
 *
 */
public interface IDao<P>{
	
	/**
	 * lista de pojos
	 * @return todos los pojos, si no existe ninguno ArrayList<P> vacio no null
	 */
	ArrayList<P> listar();
	
	/**
	 * Recupera el detalle de un pojo
	 * @param id identificador
	 * @return pojo con sus datos o null si no encuentra por su id
	 */
	P recuperar(int id);
	
	/**
	 * Crea un nuevo pojo y cuando es guardado se le asigan una nueva id
	 * @param p pojo con los datos a guardar
	 * @throws Exception si el nombre del pojo ya existe
	 * @return pojo con su id actualizado
	 */
	P crear( P p ) throws Exception;
	
	
	/**
	 * Modifica un pojo
	 * @param p pojo con los datos nuevos
	 * @return pojo modificado
	 * @throws Exception si no encuentra el pojo, o el nombre ya existe
	 */
	P modificar(P p)throws Exception;
	
	/**
	 * Elimina el pojo gracias a su identificador
	 * @param id identificador
	 * @throws Exception 
	 * @return true si elimina, false en caso contrario
	 */
	boolean eliminar( int id ) throws Exception;


}
