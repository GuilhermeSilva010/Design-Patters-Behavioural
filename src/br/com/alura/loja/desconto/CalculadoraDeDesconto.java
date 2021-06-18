package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Orcamento orcamento){
		Descontos desconto = new DescontoItens( new DescontoValor(new SemDesconto()));
		return desconto.efetuarCalculo(orcamento);
		}
	
}
