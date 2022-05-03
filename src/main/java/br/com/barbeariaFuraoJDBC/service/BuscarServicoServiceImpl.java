package br.com.barbeariaFuraoJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.barbeariaFuraoJDBC.conversor.ServicoConversor;
import br.com.barbeariaFuraoJDBC.datasource.model.Servico;
import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
import br.com.barbeariaFuraoJDBC.repository.ServicoRepository;
import br.com.barbeariaFuraoJDBC.resource.model.ServicoResource;

@Service
public class BuscarServicoServiceImpl {

	@Autowired
	private ServicoRepository servicoRepository;
	
	@Autowired
	private ServicoConversor servicoConversor;
	
	public List<ServicoResource> listarServicos() throws ResourceExeption{
		return servicoConversor.conversor(servicoRepository.list());
		
	}
	
	public ServicoResource buscarServicoPorId(int id) throws NotFoundException, ResourceExeption {
		Servico byId = servicoRepository.getById(id);
		if(byId == null) {
			throw new NotFoundException("serviço não encontrado pelo id");
		}
		return servicoConversor.conversor(byId);
	}
	
	public void deletarServico(int id) throws NotFoundException {
		if(servicoRepository.deleteById(id)==0) {
			throw new NotFoundException("não foi possível deletar o serviço");
		}
	}
	
	public void atualizarServico(ServicoResource servicoResource, int id) throws ResourceExeption, NotFoundException {
		Servico conversor = servicoConversor.conversor(servicoResource, id);
		if(servicoRepository.updateById(conversor, id)==0) {
			throw new NotFoundException("não foi possível atualizar o serviço, id inválido");
		}
	}
	
	
}
