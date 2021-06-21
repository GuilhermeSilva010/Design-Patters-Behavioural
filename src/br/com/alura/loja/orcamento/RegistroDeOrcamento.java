package br.com.alura.loja.orcamento;

import java.util.HashMap;
import java.util.Map;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroDeOrcamento {
	
	private HttpAdapter http;
	
	public RegistroDeOrcamento(HttpAdapter http) {
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		if(orcamento.isFinalizado()) {
			throw new DomainException("orcamento não finalizado");
		}
		String url = "http://www.google.com.br";
		Map<String, Object> dados = new HashMap<String, Object>();
		dados.put("valor", orcamento.getValor());
		dados.put("quantidadeItens", orcamento.getQuantidadeItens());
			
		http.post(url, dados);
		
	}

}
