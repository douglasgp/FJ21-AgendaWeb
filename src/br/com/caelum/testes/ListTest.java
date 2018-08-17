package br.com.caelum.testes;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class ListTest {
	
	public void listTest() {
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		for(Contato contato: contatos) {
			JOptionPane.showMessageDialog(null, "Nome: " + contato.getNome() +
					"\nE-mail: " + contato.getEmail() +
					"\nEndereço: " + contato.getEndereco() + 
					"\nData de Nascimento: " + contato.getDataNascimento().getTime()+"\n");
		}
	}

}
