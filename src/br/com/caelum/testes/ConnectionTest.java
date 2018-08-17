package br.com.caelum.testes;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.*;

public class ConnectionTest {

	public void connectionTest() {
		try {
			Connection connection = new ConnectionFactory().getConnection();
			JOptionPane.showMessageDialog(null, "Open connection!");
			connection.close();
		} catch (Exception e) {
			throw new RuntimeException("Connection Error!");
		}
	}

}
