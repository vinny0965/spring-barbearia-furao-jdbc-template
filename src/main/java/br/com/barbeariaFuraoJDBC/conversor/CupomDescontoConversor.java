//package br.com.barbeariaFuraoJDBC.conversor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
//import br.com.barbeariaFuraoJDBC.datasource.model.CupomDesconto;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CupomDescontoResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarAdministradorServiceImpl;
//
//@Component
//public class CupomDescontoConversor {
//
//	@Autowired
//	private BuscarAdministradorServiceImpl buscarAdministradorServiceImpl;
//	
//	public CupomDesconto conversor(CupomDescontoResource cupomDescontoResource) throws ResourceExeption, NotFoundException {
//		Administrador buscarAdministradorPorId = buscarAdministradorServiceImpl.buscarAdministradorPorId(Integer.parseInt(cupomDescontoResource.getIdAdministrador()));
//		try {
//			CupomDesconto cupomDesconto = new CupomDesconto();
//			cupomDesconto.setAdministrador(buscarAdministradorPorId);
//			cupomDesconto.setCodigo(cupomDescontoResource.getCodigo());
//			cupomDesconto.setValor(Double.parseDouble(cupomDescontoResource.getValor()));
//			return cupomDesconto;
//		} catch (Exception e) {
//			throw new ResourceExeption("não foi possível converter o resouce para entidade, resource: "+cupomDescontoResource);
//		}
//	}
//	
//}
