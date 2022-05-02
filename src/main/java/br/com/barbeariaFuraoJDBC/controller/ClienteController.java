package br.com.barbeariaFuraoJDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.barbeariaFuraoJDBC.datasource.model.Cliente;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.resource.model.ClienteResource;
import br.com.barbeariaFuraoJDBC.service.BuscarClienteServiceImpl;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private BuscarClienteServiceImpl buscarClienteServiceImpl;
	
//	@Autowired
//	private CadastrarClienteServiceImpl cadastrarClienteServiceImpl;
	
	@GetMapping(path = "/clientes")
	public List<ClienteResource> listarClientes() throws ResourceExeption, NotFoundException{
		return buscarClienteServiceImpl.listarClientes();
	}
	
	
//	@GetMapping(path = "/cliente/id/{id}")
//	public Cliente buscarClientePorId(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarClienteServiceImpl.buscarClientePorId(id);
//	}
//	
//	@DeleteMapping(path = "/cliente/delete/id/{id}")
//	public void deletarClientePorId(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		buscarClienteServiceImpl.deletarCliente(id);
//	}
//	
//	@PutMapping(path = "/cliente/update/id/{id}")
//	public void atualizarClientePorId(@PathVariable(name = "id",required = true)int id, @RequestBody ClienteResource clienteResource) throws ResourceExeption {
//		buscarClienteServiceImpl.atualizarCliente(clienteResource, id);
//	}
//	
//	@PostMapping(path = "/cliente/save")
//	public void cadastrarCliente(@RequestBody ClienteResource clienteResource) throws ResourceExeption {
//		cadastrarClienteServiceImpl.cadastrar(clienteResource);
//	}
	
//	@PostMapping(path = "/cliente/savec")
//	public void cadastrarClientec(@RequestParam(value = "endereco",defaultValue = "0")int idEndereco,@RequestBody ClienteResource clienteResource) throws ResourceExeption, NotFoundException {
//		cadastrarClienteServiceImpl.cadastrarClienteResource(clienteResource);
//	}

}
