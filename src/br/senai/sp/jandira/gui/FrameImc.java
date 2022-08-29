package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameImc {

	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDosLabels;
	public Font fonteDoTitulo;
	public Color corDoTitulo;
	public Color corDaCaixaDeTexto;
	public Color corLetraCaixa;
	

	public void criarTela() {

		JFrame tela = new JFrame();

		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		// Obter instância da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela);

		// Criar os componentes
		JButton buttonCalcularImc = new JButton();
		buttonCalcularImc.setText("Calcular");
		buttonCalcularImc.setBounds(170, 320, 100, 30);

		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(100, 10, 100, 30);
		labelImc.setForeground(corDoTitulo);
		labelImc.setFont(fonteDoTitulo);

		// Nome
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 50, 100, 30);
		labelNome.setForeground(corDosLabels);
		labelNome.setFont(fonteDosLabels);

		JTextField textNome = new JTextField();
		textNome.setBounds(30, 80, 200, 30);
		textNome.setBackground(corDaCaixaDeTexto);
		textNome.setForeground(corLetraCaixa);

		// Peso
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 120, 300, 30);
		labelPeso.setForeground(corDosLabels);
		labelPeso.setFont(fonteDosLabels);

		JTextField textPeso = new JTextField();
		textPeso.setBounds(30, 160, 60, 30);
		textPeso.setBackground(corDaCaixaDeTexto);
		textPeso.setForeground(corLetraCaixa);

		// Altura
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 200, 400, 30);
		labelAltura.setForeground(corDosLabels);
		labelAltura.setFont(fonteDosLabels);

		JTextField textAltura = new JTextField();
		textAltura.setBounds(30, 240, 60, 30);
		textAltura.setBackground(corDaCaixaDeTexto);
		textAltura.setForeground(corLetraCaixa);

		// Data Nascimento
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data Nascimento:");
		labelDataNascimento.setBounds(30, 280, 500, 30);
		labelDataNascimento.setForeground(corDosLabels);
		labelDataNascimento.setFont(fonteDosLabels);

		JTextField textDataNascimento = new JTextField();
		textDataNascimento.setBounds(30, 320, 120, 30);
		textDataNascimento.setBackground(corDaCaixaDeTexto);
		textDataNascimento.setForeground(corLetraCaixa);

		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC é xxxx");
		labelResultadoImc.setBounds(30, 370, 230, 30);
		labelResultadoImc.setForeground(corDosLabels);
		labelResultadoImc.setFont(fonteDosLabels);

		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Você está xxxx");
		labelStatusImc.setBounds(30, 450, 230, 30);
		labelStatusImc.setForeground(corDosLabels);
		labelStatusImc.setFont(fonteDosLabels);

		// Eventos
		buttonCalcularImc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Cliente cliente = new Cliente();
				cliente.nome = textNome.getText();
				cliente.peso = Double.parseDouble(textPeso.getText());
				cliente.altura = Double.parseDouble(textAltura.getText());

				labelResultadoImc.setText(cliente.nome + " , seu IMC é " + cliente.getImc());
				labelStatusImc.setText("Status IMC: " + cliente.getStatus());
				
			}
		});
		
		textPeso.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textPeso.setText(textPeso.getText().replaceAll("[^0-9]", ""));
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyCode());
				if(e.getKeyCode() == 10) {
					textAltura.requestFocus();
				}
				
			}
		});

		// Adicionar ao painel
		painel.add(buttonCalcularImc);
		painel.add(labelImc);
		painel.add(labelNome);
		painel.add(textNome);
		painel.add(labelPeso);
		painel.add(textPeso);
		painel.add(labelAltura);
		painel.add(textAltura);
		painel.add(labelDataNascimento);
		painel.add(textDataNascimento);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);

		tela.setVisible(true);
	}

}
