package com.alfatecsolutions.paylinker.web.rest.v1.empresa;

import com.alfatecsolutions.paylinker.model.empresa.EmpresaDTO;
import com.alfatecsolutions.paylinker.service.empresa.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/empresa/cadastro")
    public ResponseEntity<String> criaEmpresa(@RequestBody EmpresaDTO empresaDTO) {
        return ResponseEntity.ok(empresaService.criarEmpresa(empresaDTO));
    }

    @PutMapping("/empresa/atualiza")
    public ResponseEntity<String> atualizaEmpresa(@RequestBody EmpresaDTO empresaDTO) {
        return ResponseEntity.ok(empresaService.editarEmpresa(empresaDTO));
    }

    @DeleteMapping("/empresa/deleta")
    public ResponseEntity<String> deletaEmpresa(@RequestParam Long id) {
        return ResponseEntity.ok(empresaService.deletarEmpresa(id));
    }

    @GetMapping("/empresa/busca")
    public ResponseEntity<EmpresaDTO> buscaEmpresa(@RequestParam Long id) {
        return ResponseEntity.ok(empresaService.buscarEmpresaPeloId(id));
    }

    /*Implementar dependencia de paginação Spring Data*/
    /*@GetMapping("/empresa/lista")
    public String listaEmpresa(@RequestBody EmpresaFiltro empresaFiltro, Pageable pageable) {
        return null;
    }

     */

}
