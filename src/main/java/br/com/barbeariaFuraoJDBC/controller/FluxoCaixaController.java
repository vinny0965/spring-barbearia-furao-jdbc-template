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
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import br.com.barbeariaFuraoJDBC.datasource.model.FluxoCaixa;
//import br.com.barbeariaFuraoJDBC.exception.NotFoundException;
//import br.com.barbeariaFuraoJDBC.exception.ResourceExeption;
//import br.com.barbeariaFuraoJDBC.resource.model.FluxoCaixaResource;
//import br.com.barbeariaFuraoJDBC.service.BuscarFluxoCaixaServiceImpl;
//import br.com.barbeariaFuraoJDBC.service.CadastrarFluxoCaixaServiceImpl;
//
//@RestController
//@RequestMapping("/api")
//public class FluxoCaixaController {
//	
//	@Autowired
//	private BuscarFluxoCaixaServiceImpl buscarFluxoCaixaServiceImpl;
//	
//	@Autowired
//	private CadastrarFluxoCaixaServiceImpl cadastrarFluxoCaixaServiceImpl;
//	
//	@GetMapping(path = "/fluxos-caixa")
//	public List<FluxoCaixa> listarFluxoxCaixa(){
//		return buscarFluxoCaixaServiceImpl.listarFluxosCaixa();
//	}
//	
//	@GetMapping(path = "/fluxos-caixa/id/{id}")
//	public FluxoCaixa busFluxoCaixa (@PathVariable(name = "id",required = true)int id) throws NotFoundException {
//		return buscarFluxoCaixaServiceImpl.buscarFluxoCaixaPorId(id);
//	}
//	
//	@PostMapping(path = "/fluxos-caixa/create")
//	public ResponseEntity<FluxoCaixaResource> create(@RequestBody FluxoCaixaResource fluxoCaixaResource) throws ResourceExeption {
//		return cadastrarFluxoCaixaServiceImpl.cadastar(fluxoCaixaResource);
//	}
//
//	@PutMapping(path = "/fluxos-caixa/update/id/{id}")
//	public ResponseEntity<Void> atualizarFluxoCaixaPorId(@PathVariable(name = "id",required = true)int id, @RequestBody FluxoCaixaResource fluxoCaixaResource) throws ResourceExeption   {
//		return buscarFluxoCaixaServiceImpl.atualizarFluxoCaixa(fluxoCaixaResource, id);
//	}
//	
//	@DeleteMapping(path = "/fluxos-caixa/delete/id/{id}")
//	public ResponseEntity<Void> deleteByID(@PathVariable(name = "id",required = true)int id) throws NotFoundException  {
//		return buscarFluxoCaixaServiceImpl.deletarPorId(id);
//	}
////	@PostMapping(path = "/fluxos-caixa/createe")
////	public ResponseEntity<FluxoCaixaDto> createFluxoCaixa(@RequestParam(value = "agendamento",defaultValue = "0")int idAgendamento,@RequestParam(value = "caixa",defaultValue = "0")int idCaixa,@RequestParam(value = "cupom",defaultValue = "0")int idCupom,@RequestBody FluxoCaixaDto fluxoCaixaDto) throws ResourceExeption, NotFoundException {
////		return cadastrarFluxoCaixaServiceImpl.cadastarFluxoCaixa(fluxoCaixaDto,idAgendamento,idCaixa,idCupom);
////	}
//}
