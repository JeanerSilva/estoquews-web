package br.com.caelum.estoque.ws;

import java.util.Arrays;

import javax.jws.WebService;

@WebService(endpointInterface="br.com.caelum.estoque.ws.EstoqueWS", 
serviceName="EstoqueWS", 
portName="EstoqueWSPort")
public class EstoqueWSImpl implements EstoqueWS {

	@Override
	public ListaItens todosOsItens(Filtros filtros) {
	    System.out.println("Chamando todos os Itens");
	    ListaItens listaItens = new ListaItens();
	    listaItens.item = Arrays.asList(
	    		new Item("MEA","MEAN", 5, "Livro"), 
	    		new Item("JEA","JEAN", 2, "Celular"),
	    		new Item("TEA","TEAN", 1, "Celular")
	    		
	    		);
	    
	    
	    return listaItens;
	}

	@Override
	public CadastrarItemResponse cadastrarItem(CadastrarItem parameters, TokenUsuario tokenUsuario) throws AutorizacaoFault {
	    System.out.println("Chamando cadastarItem");
	    CadastrarItemResponse resposta = new CadastrarItemResponse();
	    resposta.setItem(geraItem());
	    return resposta;
	}

	//método auxiliar
	private Item geraItem() {
	    Item item = new Item("MEA","MEAN",5, "Livro");
	    return item;
	}

	
	
	
}
