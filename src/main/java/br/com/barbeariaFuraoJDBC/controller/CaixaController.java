//package br.com.barbeariaFuraoJDBC.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.Caixa;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.CaixaResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarCaixaServiceImpl;
//import br.com.barbeariaFuraoJDBC.service.CadastrarCaixaServiceImpl;
//
//@RestController
//@RequestMapping("/api")
//public class CaixaController {
//	
//	@Autowired
//	private BuscarCaixaServiceImpl buscarCaixaServiceImpl;
//	
//	@Autowired
//	private CadastrarCaixaServiceImpl cadastrarCaixaServiceImpl;
//	
//	@GetMapping(path = "/caixas")
//	public ResponseEntity<List<Caixa>> listarCaixas(){
//		return buscarCaixaServiceImpl.listarCaixas();
//	}
//	
//	@GetMapping(path = "/caixa/id/{id}")
//	public Caixa busCaixa(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarCaixaServiceImpl.buscarCaixaPorId(id);
//	}
//
//	@PutMapping(path = "/caixa/update/id/{id}")
//	public ResponseEntity<Void> atualizarCaixa(@PathVariable(name = "id",required = true)int id, @RequestBody CaixaResource caixaResource) throws ResourceExeption {
//		return buscarCaixaServiceImpl.atualizarCaixa(caixaResource, id);
//	}
//	
//	@DeleteMapping(path = "/caixa/delete/id/{id}")
//	public ResponseEntity<Void> deletarCaixaPorId(@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarCaixaServiceImpl.deletarCaixa(id);
//	}
//	
//	@PostMapping(path = "/caixa/save")
//	public ResponseEntity<CaixaResource> cadastrarCaixa(@RequestBody CaixaResource caixaResource) throws ResourceExeption {
//		return cadastrarCaixaServiceImpl.CadastrarCaixa(caixaResource);
//		
//	}
//	
//	
//	
//}
