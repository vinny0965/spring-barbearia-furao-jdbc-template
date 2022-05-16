package br.com.barbeariaFuraoJDBC.conversor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.barbeariaFuraoJDBC.datasource.model.Estoque;
import br.com.barbeariaFuraoJDBC.datasource.model.Produto;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.ProdutoRepository;
import br.com.barbeariaFuraoJDBC.resource.model.EstoqueResource;

@Component
public class EstoqueConversor {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public EstoqueResource conversor(Estoque estoque) throws ResourceExeption {
		try {
			EstoqueResource estoqueResource = new EstoqueResource(estoque);
			return estoqueResource;
		} catch (Exception e) {
			throw new ResourceExeption("não foi possível converter a entidade para resource");
			// TODO: handle exception
		}
		
	}
	
	public List<EstoqueResource> conversor(List<Estoque>estoques) throws ResourceExeption{
		List<EstoqueResource>estoqueResources = new ArrayList<>();
		try {
			for (Estoque estoqueCurrent : estoques) {
				EstoqueResource estoqueResource = new EstoqueResource(estoqueCurrent);
				estoqueResources.add(estoqueResource);
			}
		} catch (Exception e) {
			throw new ResourceExeption("Não foi possível converter a entidade para resource");
			// TODO: handle exception
		}
		return estoqueResources;
	}
	
	public Estoque conversor(EstoqueResource estoqueResource,int idProduto) throws NotFoundException, ResourceExeption {
		Produto buscarPorId = produtoRepository.buscarPorId(idProduto);
		try {
			Estoque estoque = new Estoque();
			estoque.setProduto(buscarPorId);
			estoque.setLote(estoqueResource.getLote());
			estoque.setQuantidade(Integer.valueOf(estoqueResource.getQuantidade()));
			return estoque;
		} catch (Exception e) {
			throw new ResourceExeption("Não foi possível converter o resource para entidade");

			// TODO: handle exception
		}
	}
}
