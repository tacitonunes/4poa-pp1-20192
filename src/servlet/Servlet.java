package servlet;

//NÃO ESQUECER DE IMPORTAR AS CLASSES: package.NomeDaClasse;
import objetos.Carro;
import objetos.Escrita;
import objetos.Leitura;
import java.util.LinkedList;
import java.util.Collections;

//IMPORTAÇÕES AUTOMÁTICAS (OU DEVERIA)
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PASSO 2.1 - APAGAR OU COMENTAR O CODIGO ABAIXO
		//doGet(request, response);
		
		//PASSO 2.2 - PEGAR OS PARAMETROS DO INDEX
			//getParameter("name=id") => PEGAR DO TYPE TEXT, RADIO OU SELECT
		String pla = request.getParameter("placa");
		String mon = request.getParameter("montadora");
		String mod = request.getParameter("modelo");
		String ano = request.getParameter("ano");
			// getParameterValues("name=id") => PEGAR DO TYPE CHECKBOX (CRIAR UM ARRAY DE ATRIBUTOS "TICADOS"
		String[] opc = request.getParameterValues("opcionais");
		
		//PASSO 2.3 - INSTANCIAR HTTPSESSION (CRIAR OU BUSCAR SESSAO) E FAÇA A IMPORTAÇÃO
		HttpSession novaSessao = request.getSession();
//import javax.servlet.http.HttpSession;
		
		//PASSO 2.4 - CRIE UM PACOTE EM: "JAVA RESOURCES/SRC" CHAMADO objetos E, DENTRO DELE, UMA NOVA CLASSE
			// ESTA SERÁ A SUA CLASSE PRINCIPAL. NO NOSSO CASO AQUI, SERÁ CARRO!!
		
		//PASSO 2.5 - INSTANCIE UM NOVO OBJETO DA CLASSE CRIADA, USANDO O CONSTRUTOR E FAÇA A IMPORTAÇÃO DA CLASSE
//import objetos.Carro;
		Carro carro = new Carro(pla, mon, mod, ano, opc);
		
		//PASSO 2.6 - CRIE A CLASSE (PRONTA) ESCRITA E FAÇA A IMPORTAÇÃO DA CLASSE
//import objetos.Escrita;
		Escrita.escrever(carro);
		
		//PASSO 2.7 - CRIE A CLASSE (PRONTA) LEITURA E FAÇA A IMPORTAÇÃO
//import objetos.Leitura;
		
		//PASSO 2.8 - INSTANCIE UMA LISTA LIGADA E ATRIBUA AO RETORNO DA FUNÇÃO LER DA CLASSE DE LEITURA E FAÇA A IMPORTAÇÃO
		LinkedList<Carro> listagem = Leitura.ler();
//import java.util.LinkedList;
		
		//PASSO 2.9 - ORDENE A SUA LISTAGEM, CONFORME O MÉTODO compareTo PRESENTE NA SUA CLASSE E FAÇA A IMPORTAÇÃO
		Collections.sort(listagem);
//import java.util.Collections;
		
		//PASSO 2.10 - ATRIBUA UM NOVO ATRIBUTO PARA CHAMAR NA PÁGINA DE RETORNO PELO MÉTODO DA SESSÃO CRIADA NO PASSO 2.3
		novaSessao.setAttribute("lista", listagem);
		
		//PASSO 2.11 - CRIE UMA PASTA DENTRO DE WEBCONTENT E, DENTRO DELA, UM ARQUIVO JSP (NO NOSSO CASO AQUI, retorno.jsp)
		
		//PASSO 2.12 - CHAME O MÉTODO DE RESPOSTA DA REQUISIÇÃO COM REDIRECIONAMENTO PARA A PÁGINA CRIADA
		response.sendRedirect("paginas/retorno.jsp");
		
		//PASSO 2.13 - ABRA-O. LÁ, TEREMOS MAIS INFORMAÇÕES! ESTÁ ACABANDO!
	}

}
