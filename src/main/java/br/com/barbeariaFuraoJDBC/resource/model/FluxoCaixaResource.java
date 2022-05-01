package br.com.barbeariaFuraoJDBC.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FluxoCaixaResource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 600900485048408676L;

	@JsonProperty("forma_pagamento")
	private String formaPagamento;
	@JsonProperty("total_pagamento")
	private String totalPagamento;
	@JsonProperty("id_caixa")
	private String caixa;
	@JsonProperty("id_agendamento")
	private String agendamento;
	@JsonProperty("id_cupom")
	private String cupomDesconto;
	public FluxoCaixaResource(String formaPagamento, String totalPagamento, String caixa, String agendamento,
			String cupomDesconto) {
		super();
		this.formaPagamento = formaPagamento;
		this.totalPagamento = totalPagamento;
		this.caixa = caixa;
		this.agendamento = agendamento;
		this.cupomDesconto = cupomDesconto;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public String getTotalPagamento() {
		return totalPagamento;
	}
	public void setTotalPagamento(String totalPagamento) {
		this.totalPagamento = totalPagamento;
	}
	public String getCaixa() {
		return caixa;
	}
	public void setCaixa(String caixa) {
		this.caixa = caixa;
	}
	public String getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(String agendamento) {
		this.agendamento = agendamento;
	}
	public String getCupomDesconto() {
		return cupomDesconto;
	}
	public void setCupomDesconto(String cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
