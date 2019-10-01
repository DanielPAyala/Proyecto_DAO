package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ProductoService;

/**
 * Servlet implementation class ServletProducto
 */
@WebServlet("/ServletProducto")
public class ServletProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 ProductoService serProducto = new ProductoService();
	
    /**
     * Default constructor. 
     */
    public ServletProducto() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String xtipo = request.getParameter("tipo");
		if(xtipo.equals("listar")) {
			listar(request, response);
		}
	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data", serProducto.listarProductos());
		request.getRequestDispatcher("listarProducto.jsp").forward(request, response);
	}

}
