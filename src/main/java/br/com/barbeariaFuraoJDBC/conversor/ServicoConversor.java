//package br.com.barbeariaFuraoJDBC.conversor;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
//import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ServicoResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarAdministradorServiceImpl;
//
//@Component
//public class ServicoConversor {
//	
//	@Autowired
//	private BuscarAdministradorServiceImpl buscarAdministradorServiceImpl;
//	
//	public Servico conversor(ServicoResource servicoResource) throws ResourceExeption, NotFoundException  {
//		Administrador buscarAdministradorPorId = buscarAdministradorServiceImpl.buscarAdministradorPorId(Integer.parseInt(servicoResource.getIdAdministrador()));
//		try {
//			Servico servico = new Servico();
//			servico.setTipoServico(servicoResource.getTipoServico());
//			servico.setValor(Double.parseDouble(servicoResource.getValor()));
//			servico.setAdministrador(buscarAdministradorPorId);
//			return servico;
//		} catch (Exception e) {
//			throw new ResourceExeption("não foi possível converter o resource servico para entidade resouce: "+servicoResource);
//		}
//	}
//
//}
