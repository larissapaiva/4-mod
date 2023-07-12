package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.ControleJanelaConsulta;

public class JanelaConsulta extends JFrame{
	private JPanel contentPane;
	private JTextField textEspecialidade;
	private JTextField textDtconsulta;
	private JTextField textHrconsulta;
	private JTextField textPaciente;
	private JTextField textCpfpaciente;
	
	private ControleJanelaConsulta cjc = new ControleJanelaConsulta();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaConsulta frame = new JanelaConsulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public JanelaConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeConsulta = new JLabel("CADASTRO DE SESS\u00D5ES");
		lblCadastroDeConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeConsulta.setBounds(40, 11, 198, 24);
		contentPane.add(lblCadastroDeConsulta);
		
		JLabel lblEspecialidade = new JLabel("Especialidade:");
		lblEspecialidade.setBounds(10, 49, 46, 14);
		contentPane.add(lblEspecialidade);
		
		JLabel lblData = new JLabel("DATA:");
		lblData.setBounds(10, 74, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblHora = new JLabel("HORA:");
		lblHora.setBounds(10, 99, 46, 14);
		contentPane.add(lblHora);
		
		JLabel lblPaciente = new JLabel("PACIENTE:");
		lblPaciente.setBounds(10, 129, 46, 14);
		contentPane.add(lblPaciente);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 154, 46, 14);
		contentPane.add(lblCpf);
		
		textEspecialidade = new JTextField();
		textEspecialidade.setBounds(50, 46, 46, 20);
		contentPane.add(textEspecialidade);
		textDtconsulta.setColumns(10);
		
		textDtconsulta = new JTextField();
		textDtconsulta.setBounds(50, 71, 46, 20);
		contentPane.add(textDtconsulta);
		textDtconsulta.setColumns(10);
		
		textHrconsulta = new JTextField();
		textHrconsulta.setBounds(50, 99, 86, 20);
		contentPane.add(textHrconsulta);
		textHrconsulta.setColumns(10);
		
		textPaciente = new JTextField();
		textPaciente.setBounds(50, 126, 86, 20);
		contentPane.add(textPaciente);
		textPaciente.setColumns(10);
		
		textCpfpaciente = new JTextField();
		textCpfpaciente.setBounds(50, 157, 200, 20);
		contentPane.add(textCpfpaciente);
		textCpfpaciente.setColumns(10);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String especialidade = textEspecialidade.getText();
				String data = textDtconsulta.getText();
				String hora = textHrconsulta.getText();
				String paciente = textPaciente.getText();
				String cpfpaciente = textCpfpaciente.getText();
				
				cjc.incluirConsulta(especialidade ,data, hora, paciente, cpfpaciente);
				
				JOptionPane.showMessageDialog(null, 
						"Consulta cadastrada com sucesso!");
				
				textEspecialidade.setText("");
				textDtconsulta.setText("");
				textHrconsulta.setText("");
				textPaciente.setText("");
				textCpfpaciente.setText("");
			}
		});
		btnCadastrar.setBounds(47, 154, 119, 23);
		contentPane.add(btnCadastrar);
	}
}
