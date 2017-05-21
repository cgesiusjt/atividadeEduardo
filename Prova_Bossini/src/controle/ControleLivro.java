package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Livro;


@WebServlet("/controle")
public class ControleLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Livro livro;
	
	private Integer codigo = 0;
	
	public static List<Livro> lista =new ArrayList<>();
	
	
	
	public ControleLivro() {
		super();
		livro = new Livro();
		

	}

	protected void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String acao = request.getParameter("acao");
        
        if(acao!=null){
        	
        	if(acao.equalsIgnoreCase("cadastrar")){
        		
        		
        		try{
        			
        			String titulo = request.getParameter("titulo");
            		Integer numpagn = Integer.parseInt(request.getParameter("numpagn"));
            		String autor = request.getParameter("autor");
            		
            		codigo = livro.geraCodigo(codigo);
            		
            		livro = new Livro();
            		livro.setIdLivro(codigo);
            		livro.setTitulo(titulo);
            		livro.setNumPagn(numpagn);
            		livro.setAutor(autor);
            		lista.add(livro);
            		
            		request.setAttribute("mensagem", "Livro ID: " + livro.getIdLivro() + " Cadastrado com sucesso ");
            		
        		}catch(Exception e){
        			request.setAttribute("Erro", e.getMessage());
        			
        		}finally{
        			
        			request.getRequestDispatcher("Mensagem.jsp").forward(request, response);
        		}
        		
        		
        		
        	} 
        }
 		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		execute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		execute(request, response);;
		
	}

}
