package com.ipartek.formacion.modelo;

import com.ipartek.formacion.pojo.Perro;

/**
 * DAO para definir las operaciones de CRUD<br>
 * Fijaros como interferimos la clase generica {@code IDao<P>} por {@code IDao<Perro> }
 * @author ur00
 *
 */
public interface PerroDao extends IDao<Perro>{

}
