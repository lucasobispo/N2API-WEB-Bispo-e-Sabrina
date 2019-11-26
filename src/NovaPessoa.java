import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaPessoa")
public class NovaPessoa extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cadastrando novo usuario");
		
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");

		
		
		Pessoa empresa = new Pessoa();
		empresa.setNome(nome);
		empresa.setData(data);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		request.setAttribute("empresa", empresa.getNome());
		
		//response.sendRedirect("listaEmpresas");
		
//		//chamar o JSP ou Servlet
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
			// TODO Auto-generated method stub
			//System.out.println("Meus livros");
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

}