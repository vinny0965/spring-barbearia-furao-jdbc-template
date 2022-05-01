//package br.com.barbeariaFuraoJDBC.conversor;
//
//import java.time.LocalDate;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Caixa;
//import br.com.barbeariaFuraoJDBC.datasource.model.Endereco;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CaixaResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarEnderecoServiceImpl;
//
//@Component
//public class CaixaConversor {
//	
//	@Autowired
//	private BuscarEnderecoServiceImpl buscarEnderecoServiceImpl;
//	
//	
//	public Caixa conversor(CaixaResource caixaResource) throws ResourceExeption, NotFoundException {
//		Endereco buscarEnderecoPorId = buscarEnderecoServiceImpl.buscarEnderecoPorIdd(Integer.parseInt(caixaResource.getIdEndereco()));
//		try {
//			Caixa caixa = new Caixa();
//			caixa.setNome(caixaResource.getNome());
//			caixa.setCpf(caixaResource.getCpf());
//			caixa.setDataNascimento(LocalDate.parse(caixaResource.getDataNascimento()));
//			caixa.setEmail(caixaResource.getEmail());
//			caixa.setEndereco(buscarEnderecoPorId);
//			caixa.setLogin(caixaResource.getLogin());
//			caixa.setMatricula(caixaResource.getMatricula());
//			caixa.setSenha(caixaResource.getSenha());
//			caixa.setSexo(caixaResource.getSexo());
//			caixa.setTelefone(caixaResource.getTelefone());
//			return caixa;
//			
//		} catch (Exception e) {
//			throw new ResourceExeption("erro ao converter resource caixa para entidade, resource: "+caixaResource);
//		}
//	}
//	
//
//}
