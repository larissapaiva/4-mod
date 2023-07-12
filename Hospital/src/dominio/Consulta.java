package dominio;

public class Consulta {
	private String especialidade, dtconsulta, hrconsulta, paciente, cpfpaciente;

	public Consulta(String especialidade, String dtconsulta, String hrconsulta, String paciente, String cpfpaciente) {
		this.setEspecialidade(especialidade);
		this.setDtconsulta(dtconsulta);
		this.setHrconsulta(hrconsulta);
		this.setPaciente(paciente);
		this.setCpfpaciente(cpfpaciente);
	}

	public String getDtconsulta() {
		return dtconsulta;
	}

	public void setDtconsulta(String dtconsulta) {
		this.dtconsulta = dtconsulta;
	}

	public String getHrconsulta() {
		return hrconsulta;
	}

	public void setHrconsulta(String hrconsulta) {
		this.hrconsulta = hrconsulta;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getCpfpaciente() {
		return cpfpaciente;
	}

	public void setCpfpaciente(String cpfpaciente) {
		this.cpfpaciente = cpfpaciente;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
