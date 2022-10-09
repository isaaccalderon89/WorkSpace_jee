package modelo.Dao;

import java.util.List;

import modelo.javabeans.Empleado;

public interface EmpleadoDao {
	
	/*
	 * Un interface es una clase abstracta llevado al mas puro nivel que todos los 
	 * metodos son publicos y abstractos. Por eso solo 
	 * se pone lo que DEVUELVE lo que RECIBE y como se llama el metodo
	 */
	Empleado buscarUno(int idEmpleado);//Creamos un método que se llama findById, devuelve un empleado y recibe un entero que es el ID del empleado 
	List<Empleado> buscarTodos();// va a devolver una lista del java util 
	int altaEmpleado(Empleado empleado);// va a devolver un entero y recibe un empleado de la clase empleado
	int eliminarEmpleado(int idEmpleado);// va a devolver un entero que va a ser el idEmpleado
	boolean eliminarEmpleado (Empleado empleado);//Aquí pasamos un empleado para eliminar un empleado
	

}
