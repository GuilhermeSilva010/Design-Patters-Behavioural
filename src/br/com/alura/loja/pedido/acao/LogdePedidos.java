package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class LogdePedidos implements AcaoAposGerarPedido{

	@Override
	public void executarAcao(Pedido pedido) {
		System.out.println("Pedido gerado: " + pedido) ;
	}

}
