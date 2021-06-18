package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Descontos {

	protected Descontos proximo;

	public Descontos(Descontos proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		
		return proximo.calcular(orcamento);
	}

	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
}
