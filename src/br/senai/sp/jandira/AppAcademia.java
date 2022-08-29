package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {

		FrameImc tela = new FrameImc();
		tela.titulo = "Caculadora de IMC";
		tela.largura = 305;
		tela.altura = 600;
		tela.corDeFundoDaTela = new Color(129, 116, 118);
		tela.fonteDosLabels = new Font("Serif", Font.BOLD, 16);
		tela.corDoTitulo = new Color(255, 00, 00);
		tela.corDosLabels = new Color(30, 55, 40);
		tela.fonteDoTitulo = new Font("Serif", Font.BOLD, 30);
		tela.corDaCaixaDeTexto = new Color(255, 00, 00);
		tela.criarTela();

//		FrameImc tela2 = new FrameImc();
//		tela2.titulo = "sfdgsdfgsfdgsfdg";
//		tela2.largura = 300;
//		tela2.altura = 600;
//		tela2.corDeFundoDaTela = new Color(50, 63, 100);
//		tela2.fonteDosLabels = new Font("Serif", Font.BOLD, 16);
//		tela2.corDoTitulo = new Color(20, 0, 255);
//		tela2.criarTela();

		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();

		// System.out.println(ana);

		// System.out.println(pedro);

		ana.nome = "Ana Maria Braga";
		ana.dataDeNascimento = LocalDate.of(1950, 06, 21);
		ana.peso = 58.;
		ana.altura = 1.60;

		pedro.nome = "Pedro Dias";
		pedro.dataDeNascimento = LocalDate.of(2000, 02, 19);
		pedro.peso = 72;
		pedro.altura = 1.83;

		System.out.println(ana.getImc());
		System.out.println(ana.getStatus());
		System.out.println();
		System.out.println(pedro.getImc());
	}

}
