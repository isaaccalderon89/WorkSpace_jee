package modelo.Dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Empleado;

public class EmpleadoDaoImplList implements EmpleadoDao {
	
	private List<Empleado> lista;
	
	//Generamos el constructor 
	public EmpleadoDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Empleado(114, "Raphaelly", 110000));
		lista.add(new Empleado(115, "Koo", 20000));
		lista.add(new Empleado(116, "Baida", 30000));
		lista.add(new Empleado(117, "Colmenares", 25000));
		lista.add(new Empleado(118, "Himuro", 22000));
		lista.add(new Empleado(119, "Tobias", 24000));
	}

	@Override
	public Empleado buscarUno(int idEmpleado) {
		
		return null;
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public int altaEmpleado(Empleado empleado) {
		if(!lista.contains(empleado)) {//Significado: Si la lista no contiene al empleado 
			lista.add(empleado);
			return 1;//Dado de alta
		}
		return 0;//No se ha podido dar de alta
	}

	@Override
	public int eliminarEmpleado(int idEmpleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean eliminarEmpleado(Empleado empleado) {
		return lista.remove(empleado);

	}
	

}
