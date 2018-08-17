package br.com.caelum.testes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.ConnectionFactory;

public class MenuTest {
	public static void main(String[] args) throws SQLException {
		
		String valor  = JOptionPane.showInputDialog("= = = = Menu Teste = = = = \n"
				+ "Informe a opção desejada:\n\n"
				+ "1 - Inserir contato\n"
				+ "2 - Listar contatos existentes\n"
				+ "3 - Alterar dados de contatos\n"
				+ "4 - Remover contatos\n"
				+ "5 - Testar conexão com Banco de Dados\n"
				+ "6 - Sair\n");

		int opcao = Integer.parseInt(valor.trim());
		
		if(opcao == 1) {
			JOptionPane.showMessageDialog(null, "Option not yet CONFIGURED!\n");
		}else if (opcao == 2) {
			ListTest list = new ListTest();
			list.listTest();
		}else if(opcao == 3) {
			JOptionPane.showConfirmDialog(null,"Option not yet CONFIGURED!\n");
		}else if(opcao == 4) {
			JOptionPane.showConfirmDialog(null,"Option not yet CONFIGURED!\n");
		}else if(opcao == 5) {
			ConnectionTest conexao = new ConnectionTest();
			conexao.connectionTest();
		}else if(opcao == 6) {
			JOptionPane.showMessageDialog(null, "Finishing the software ...");
			System.exit(0);
		}
			
	}

}
