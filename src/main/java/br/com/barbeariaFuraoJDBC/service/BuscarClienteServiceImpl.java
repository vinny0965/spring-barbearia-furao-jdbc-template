package br.com.barbeariaFuraoJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.ClienteConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.ClienteRepository;
import br.com.barbeariaFuraoJDBC.resource.model.ClienteResource;

@Service
public class BuscarClienteServiceImpl {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteConversor clienteConversor;
	
	public List<ClienteResource> listarClientes() throws ResourceExeption, NotFoundException{
		List<ClienteResource> converter = clienteConversor.converter(clienteRepository.list());
		return converter;
	}

	public ClienteResource buscarClientePorId(int id) throws NotFoundException, ResourceExeption {
		Cliente byId = clienteRepository.getById(id);
		return clienteConversor.conv(byId);
	}
	
	public void atualizarCliente(ClienteResource clienteResource, int id) throws  ResourceExeption, NotFoundException {
		Cliente converter = clienteConversor.converter(clienteResource);
		if(clienteRepository.UpdateById(converter, id) == 0) {
			throw new NotFoundException("erro ao atualizar cliente pelo id: "+id);
		}
	}
	
	public void deletarCliente(int id) throws NotFoundException {
		if(clienteRepository.deleteById(id) ==0) {
			throw new NotFoundException("não foi possível encontrar o cliente pelo id: "+id);
		}
	}
	
}
