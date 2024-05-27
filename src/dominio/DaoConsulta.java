package dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoConsulta {
	static final String url = "jdbc:postgresql://localhost:5432/Hospital";
	
	public void inserir(String especialidade, String dtconsulta, String hrconsulta, String paciente, String cpfpaciente) {
		String sql = "INSERT INTO consulta (especialidade, dtconsulta, hrconsulta, paciente, cpfpaciente) VALUES ('" + especialidade + "', '" + dtconsulta + "', '" + hrconsulta + "', '" + paciente + "', " + cpfpaciente + ")";
	
		try {
			Connection conexao = DriverManager.getConnection(url, "postgres", "lzd144");
			PreparedStatement inclusao = conexao.prepareStatement(sql);
			inclusao.execute();
		}
		catch (SQLException e) {
			System.out.println("Nao foi possivel acessar o BD");
		}
	}
}
