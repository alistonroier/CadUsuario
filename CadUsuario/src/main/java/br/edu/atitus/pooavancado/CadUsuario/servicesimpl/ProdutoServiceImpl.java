package br.edu.atitus.pooavancado.CadUsuario.servicesimpl;

import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;
import br.edu.atitus.pooavancado.CadUsuario.services.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService{
	
	final ProdutoRepository produtoRepository;
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	@Override
	public ProdutoRepository getRepository() {
		return produtoRepository;
	}

}
