package com.alfatecsolutions.paylinker.web.rest.v1.usuario;

import com.alfatecsolutions.paylinker.model.usuario.UsuarioDTO;
import com.alfatecsolutions.paylinker.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario/cadastro")
    public ResponseEntity<String> criaUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.criarUsuario(usuarioDTO));
    }

    @PutMapping("/usuario/atualiza")
    public ResponseEntity<String> atualizaUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return ResponseEntity.ok(usuarioService.editarUsuario(usuarioDTO));
    }

    @DeleteMapping("/usuario/deleta")
    public ResponseEntity<String> deletaUsuario(@RequestParam Long id) {
        return ResponseEntity.ok(usuarioService.deletarUsuario(id));
    }

    @GetMapping("/usuario/busca")
    public ResponseEntity<UsuarioDTO> buscaUsuario(@RequestParam Long id) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPeloId(id));
    }

    /*Implementar dependencia de paginação Spring Data*/
    /*@GetMapping("/usuario/lista")
    public ResponseEntity<UsuarioDTO> listaUsuario(Pageable pageable, @RequestBody UsuarioFiltro usuarioFiltro) {
        return null;
    }*/

}
