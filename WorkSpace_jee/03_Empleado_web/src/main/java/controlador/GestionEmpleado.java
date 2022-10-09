package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Dao.EmpleadoDao;
import modelo.Dao.EmpleadoDaoImplList;
import modelo.javabeans.Empleado;

/**
 * Servlet implementation class GestionEmpleado
 */
@WebServlet("/empleados")
public class GestionEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private  EmpleadoDao edao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionEmpleado() {
        super();
        edao = new EmpleadoDaoImplList();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		switch(opcion) {
		case "eliminar":
			procEliminarEmpleado(request, response);
			break;
		case "editar":
			procEditarEmpleado(request, response);
			break;
		case "alta":
			procAltaEmpleado(request, response);
			break;
		default:
			System.out.println("opción errónea : " + opcion);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void procEliminarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Empleado emp1 = edao.buscarUno(Integer.parseInt(request.getParameter("id")));
		String mensaje = null;
		if (edao.eliminarEmpleado(emp1))
			mensaje = "empleado eliminado";
		else 
			mensaje ="Empleado no se ha podido eliminar";
		
		request.setAttribute("mensaje", response);
		request.getRequestDispatcher("inicio").forward(request, response);
		
	}
	protected void procEditarEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	protected void procAltaEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
