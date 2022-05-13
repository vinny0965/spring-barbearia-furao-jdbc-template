package br.com.barbeariaFuraoJDBC.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
import br.com.barbeariaFuraoJDBC.datasource.model.FluxoCaixa;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.AgendamentoRepository;
import br.com.barbeariaFuraoJDBC.repository.CupomRepository;
import br.com.barbeariaFuraoJDBC.resource.model.FluxoCaixaResource;

@Component
public class FluxoCaixaConversor {
	
	@Autowired
	private CupomRepository cupomRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;
	
	
	public FluxoCaixa conversor(FluxoCaixaResource fluxoCaixaResource,int idAgendamento, int idCupom) throws NotFoundException, ResourceExeption {
		Agendamento findById = agendamentoRepository.findById(idAgendamento);
		CupomDesconto byId = cupomRepository.getById(idCupom);
		try {
			FluxoCaixa fluxoCaixa = new FluxoCaixa();
			fluxoCaixa.setAgendamento(findById);
			fluxoCaixa.setCupomDesconto(byId);
			fluxoCaixa.setFormaPagamento(fluxoCaixaResource.getFormaPagamento());
			fluxoCaixa.setTotalPagamento(Double.parseDouble(fluxoCaixaResource.getTotalPagamento()));
			return fluxoCaixa;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ResourceExeption("não foi possível converter o resource para entidade, resource: "+fluxoCaixaResource);
		}
	}

	
	public FluxoCaixaResource conversor(FluxoCaixa fluxoCaixa) throws ResourceExeption {
		try {
			FluxoCaixaResource fluxoCaixaResource = new FluxoCaixaResource(fluxoCaixa);
			return fluxoCaixaResource;
		} catch (Exception e) {
			// TODO: handle exception
			throw new ResourceExeption("não foi possível converter o fluxo caixa para resource");

		}
	}
}
