package com.alfatecsolutions.paylinker.web.rest.v1.cliente;

import com.alfatecsolutions.paylinker.model.cliente.ClienteDTO;
import com.alfatecsolutions.paylinker.service.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @PostMapping("/cliente/cadastro")
    public ResponseEntity<String> criaCliente(@RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteService.criarCliente(clienteDTO));
    }

    @PutMapping("/cliente/atualiza")
    public ResponseEntity<String> atualizaCliente(@RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteService.editarCliente(clienteDTO));
    }

    @DeleteMapping("/cliente/deleta")
    public ResponseEntity<String> deletaCliente(@RequestParam Long id) {
        return ResponseEntity.ok(clienteService.deletarCliente(id));
    }

    @GetMapping("/cliente/busca")
    public ResponseEntity<ClienteDTO> buscaCliente(@RequestParam Long id) {
        return ResponseEntity.ok(clienteService.buscarClientePeloId(id));
    }

    /*Implementar o filtro de cliente*/
    /*@GetMapping("/cliente/lista")
    public String listaCliente(@RequestBody ClienteFiltro clienteFiltro, Pageable pageable) {
        return null;
    }

     */

}
