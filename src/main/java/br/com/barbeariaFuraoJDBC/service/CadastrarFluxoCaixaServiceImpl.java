//package br.com.barbeariaFuraoJDBC.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
//import br.com.barbeariaFuraoJDBC.datasource.model.Caixa;
//import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
//import br.com.barbeariaFuraoJDBC.datasource.model.FluxoCaixa;
//import br.com.barbeariaFuraoJDBC.datasource.model.dao.FluxoCaixaDao;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.FluxoCaixaResource;
//
//@Service
//public class CadastrarFluxoCaixaServiceImpl {
//	
//	@Autowired
//	private BuscarAgendamentoServiceImpl agendamentoServiceImpl;
//	
//	@Autowired
//	private BuscarCaixaServiceImpl buscarCaixaServiceImpl;
//	
//	@Autowired
//	private BuscarCupomServiceImpl buscarCupomServiceImpl;
//	
//	public ResponseEntity<FluxoCaixaResource> cadastar(FluxoCaixaResource fluxoCaixaResource) throws ResourceExeption {
//		boolean create = FluxoCaixaDao.create(fluxoCaixaResource);
//		if(create == false) {
//			throw new ResourceExeption("não foi possível criar um fluxo de caixa, resouce: "+fluxoCaixaResource);
//		}else {
//			return new ResponseEntity<>(fluxoCaixaResource,HttpStatus.CREATED);
//		}
//	}
//	
////	public ResponseEntity<FluxoCaixaDto> cadastarFluxoCaixa(FluxoCaixaDto fluxoCaixaDto,int idAgendamento, int idCaixa, int idCupom) throws ResourceExeption, NotFoundException {
////		Agendamento buscarAgendamento = agendamentoServiceImpl.buscarAgendamento(idAgendamento);
////		Caixa buscarCaixaPorId = buscarCaixaServiceImpl.buscarCaixaPorId(idCaixa);
////		CupomDesconto buscarCupomPorId = buscarCupomServiceImpl.buscarCupomPorIds(idCupom);
////		fluxoCaixaDto.setAgendamento(buscarAgendamento);
////		fluxoCaixaDto.setCaixa(buscarCaixaPorId);
////		fluxoCaixaDto.setCupomDesconto(buscarCupomPorId);
////		FluxoCaixa map = mapper.map(fluxoCaixaDto, FluxoCaixa.class);
////		boolean create = FluxoCaixaDao.createFluxoCaixa(map,idAgendamento,idCaixa,idCupom);
////		if(create == false) {
////			throw new ResourceExeption("não foi possível criar um fluxo de caixa, resouce: "+fluxoCaixaDto);
////		}else {
////			return new ResponseEntity<>(fluxoCaixaDto,HttpStatus.CREATED);
////		}
////	}
//	
//
//}
