//package br.com.barbeariaFuraoJDBC.conversor;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Administrador;
//import br.com.barbeariaFuraoJDBC.datasource.model.Endereco;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.AdministradorResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarEnderecoServiceImpl;
//
//@Component
//public class AdministradorConversor {
//
//	@Autowired
//	private BuscarEnderecoServiceImpl buscarEnderecoServiceImpl;
//
//	public Administrador conversor(AdministradorResource administradorResource)
//			throws ResourceExeption, NotFoundException {
//		Integer checkIdEndereco = checkIdEndereco(administradorResource.getEndereco());
//		Endereco buscarEnderecoPorId = buscarEnderecoServiceImpl.buscarEnderecoPorIdd(checkIdEndereco);
//
//		try {
//			Administrador administrador = new Administrador();
//			LocalDate ceckDataNascimento = ceckDataNascimento(administradorResource.getDataNascimento());
////			Optional<Endereco> findById = enderecoRepository.findById(checkIdEndereco);
//			if (buscarEnderecoPorId != null) {
//				Endereco endereco = buscarEnderecoPorId;
//				administrador.setEndereco(endereco);
//			}
//			administrador.setCpf(administradorResource.getCpf());
//			administrador.setDataNascimento(ceckDataNascimento);
//			administrador.setEmail(administradorResource.getEmail());
//			administrador.setLogin(administradorResource.getLogin());
//			administrador.setSenha(administradorResource.getSenha());
//			administrador.setSexo(administradorResource.getSexo());
//			administrador.setTelefone(administradorResource.getSexo());
//			administrador.setNome(administradorResource.getNome());
//			return administrador;
//		} catch (Exception e) {
//			throw new ResourceExeption(
//					"não foi possível converter o resouce para entidade, resource:" + administradorResource);
//		}
//	}
//	
//	public List<AdministradorResource> conversor(List<Administrador>administradors){
//		List<AdministradorResource>administradorResources = new ArrayList<>();
//		try {
//			for (Administrador administrador : administradors) {
//				AdministradorResource administradorResource  = new AdministradorResource();
//				administradorResource.setCpf(administrador.getCpf());
//				administradorResource.setDataNascimento(String.valueOf(administrador.getDataNascimento()));
//				administradorResource.setEmail(administrador.getEmail());
//				administradorResource.setEndereco(String.valueOf(administrador.getEndereco().getId()));
//				administradorResource.setLogin(administrador.getLogin());
//				administradorResource.setNome(administrador.getNome());
//				administradorResource.setSenha(administrador.getSenha());
//				administradorResource.setSexo(administrador.getSexo());
//				administradorResource.setTelefone(administrador.getTelefone());
//				administradorResources.add(administradorResource);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return administradorResources;
//	}
//
//	public LocalDate ceckDataNascimento(String dataNascimento) {
//		return LocalDate.parse(dataNascimento);
//	}
//
//	public Integer checkIdEndereco(String idEndereco) {
//		return Integer.parseInt(idEndereco);
//	}
//
//}
