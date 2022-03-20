package utilidades;

import dao.ClienteDAO;
import dao.PedidoDAO;
import dao.ProdutoDAO;
import dao.UsuarioDAO;
import entidades.Usuario;

public class App {

	public static void main(String[] args) {
		 ClienteDAO dao = new ClienteDAO();
//		 PedidoDAO e = new PedidoDAO();
//		System.out.println(d.relacaoPedido(2)); 
//		System.out.println(user.conferencia("jef@gmail.com", "12").getNome()); 
		
		System.out.println(dao.getPedidoCliente(1));
		

	}
}
