//package br.com.barbeariaFuraoJDBC.conversor;
//
//import java.time.LocalDate;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
//import br.com.barbeariaFuraoJDBC.datasource.model.Endereco;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.ClienteResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarEnderecoServiceImpl;
//
//@Component
//public class ClienteConversor {
//	
//	@Autowired
//	private BuscarEnderecoServiceImpl buscarEnderecoServiceImpl;
//
//	public Cliente converter(ClienteResource clienteResource) throws ResourceExeption, NotFoundException {
//		Endereco buscarEnderecoPorId = buscarEnderecoServiceImpl.buscarEnderecoPorIdd(Integer.parseInt(clienteResource.getIdEndereco()));
//		try {
//			Cliente cliente = new Cliente();
//			cliente.setNome(clienteResource.getNome());
//			cliente.setCpf(clienteResource.getCpf());
//			cliente.setDataNascimento(LocalDate.parse(clienteResource.getDataNascimento()));
//			cliente.setEmail(clienteResource.getEmail());
//			cliente.setSexo(clienteResource.getSexo());
//			cliente.setTelefone(clienteResource.getTelefone());
//			cliente.setEndereco(buscarEnderecoPorId);
//			return cliente;
//			
//		} catch (Exception e) {
//			throw new ResourceExeption("não foi possível converter o cliente resource para entidade resource:"+clienteResource);
//		}
//	}
//	
//	
//}
