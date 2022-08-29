package br.senai.sp.jandira.model;

import java.awt.Color;
import java.time.LocalDate;

public class Cliente {

	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = { "Feminino", "Masculino", "Outros" };
	public double peso;
	public double altura;

	public double getImc() {
		return peso / Math.pow(altura, 2);
	}

	public String getStatus() {
		if (getImc() <= 18.5) {
			return "Abaixo do peso";
		} else if (getImc() > 18.5 && getImc() < 25.0) {
			return "Peso ideial";
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return "Levemente acima do peso";
		} else if (getImc() >= 30.0 && getImc() < 35.0) {
			return "Obesidade Grau I";
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return "Obesidade Grau II";
		} else {
			return "Obesidade Grau III";
		}

	}

}
