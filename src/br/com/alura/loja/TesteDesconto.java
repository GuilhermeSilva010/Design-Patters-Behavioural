package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDesconto {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"),6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);
		
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(segundo));

	}

}
