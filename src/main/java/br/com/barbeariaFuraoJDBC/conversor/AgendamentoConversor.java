//package br.com.barbeariaFuraoJDBC.conversor;
//
//import java.sql.Time;
//import java.time.LocalDate;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Agendamento;
//import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
//import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AgendamentoResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarClienteServiceImpl;
//import br.com.barbeariaFuraoJDBC.service.BuscarServicoServiceImpl;
//
//@Component
//public class AgendamentoConversor {
//
//	@Autowired
//	private BuscarClienteServiceImpl buscarClienteServiceImpl;
//	
//	@Autowired
//	private BuscarServicoServiceImpl buscarServicoServiceImpl;
//	
//	public Agendamento conversor(AgendamentoResource agendamentoResource) throws ResourceExeption, NotFoundException {
//		Cliente buscarClientePorId = buscarClienteServiceImpl.buscarClientePorId(Integer.parseInt(agendamentoResource.getIdCliente()));
//		Servico buscarServicoPorId = buscarServicoServiceImpl.buscarServicoPorId(Integer.parseInt(agendamentoResource.getIdServico()));
//		try {
//			Agendamento agendamento = new Agendamento();
//			agendamento.setDataAgendamento(LocalDate.parse(agendamentoResource.getDataAgendamento()));
//			agendamento.setHorario(Time.valueOf(agendamentoResource.getHorario()));
//			agendamento.setFuncionario(agendamentoResource.getFuncionario());
//			agendamento.setServico(buscarServicoPorId);
//			agendamento.setCliente(buscarClientePorId);
//			return agendamento;
//		} catch (Exception e) {
//			throw new ResourceExeption("não foi possível converter o resouce para entidade, resouce: "+agendamentoResource);
//		}
//	}
//	
//
//}
