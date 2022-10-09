package modelo.javabeans;

import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private int idEmpleado;
	private String nombre;
	private double salario;
	
	//Constructor sin parametros
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	//Constructor con parametros 
	public Empleado(int idEmpleado, String nombre, double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.salario = salario;
	}
	/*
	 * Como tiene los datos privados necesita los getter and seter
	 */
	//Métodos getters and setters
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Método hashCode
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}
	//Método equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	//Método toString
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	public double salarioMensual(int meses) {
		return salario / meses;
	}

}
