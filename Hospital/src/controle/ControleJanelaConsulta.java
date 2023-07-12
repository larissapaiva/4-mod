package controle;

import dominio.DaoConsulta;
import dominio.Consulta;

public class ControleJanelaConsulta {
	
	
	
	private Consulta co = new Consulta ("especialidade", "12300000", "1234", "Nome do Medico", "123456798");
	private DaoConsulta daoCo = new DaoConsulta();
	
	
	public void incluirConsulta(String especialidade, String dtconsulta, String hrconsulta, String paciente, String cpfpaciente) {
		co.setEspecialidade(especialidade);
		co.setDtconsulta(dtconsulta);
		co.setHrconsulta(hrconsulta);
		co.setPaciente(paciente);
		co.setCpfpaciente(cpfpaciente);
		
		daoCo.inserir(especialidade, dtconsulta, hrconsulta, paciente, cpfpaciente);
	}
}
