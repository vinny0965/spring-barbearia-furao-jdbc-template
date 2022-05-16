package br.com.barbeariaFuraoJDBC.resource.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.barbeariaFuraoJDBC.datasource.model.Estoque;

public class EstoqueResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -420274480639752013L;

	private String id;
	
	@NotNull(message = "campo lote requerido")
	@JsonProperty("lote")
	private String lote;
	
	@NotNull(message = "campo quantidade requerido")
	@JsonProperty("quantidade")
	private String quantidade;

	@JsonProperty("id_produto")
	private String idProduto;

	public EstoqueResource(String id, String lote, String quantidade, String idProduto) {
		super();
		this.id = id;
		this.lote = lote;
		this.quantidade = quantidade;
		this.idProduto = idProduto;
	}
	public EstoqueResource(Estoque estoque) {
		super();
		this.id = String.valueOf(estoque.getId());
		this.lote = estoque.getLote();
		this.quantidade = String.valueOf(estoque.getQuantidade());
		this.idProduto = String.valueOf(estoque.getProduto().getId());
	}
	

	public EstoqueResource() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	
	
}
