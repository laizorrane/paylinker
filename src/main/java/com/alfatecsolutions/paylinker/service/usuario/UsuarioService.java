package com.alfatecsolutions.paylinker.service.usuario;

import com.alfatecsolutions.paylinker.model.usuario.UsuarioDTO;
import com.alfatecsolutions.paylinker.model.usuario.UsuarioFiltro;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface UsuarioService {

        public UsuarioDTO buscarUsuarioPeloId(Long id);
        public String editarUsuario(UsuarioDTO usuarioDTO);
        public String deletarUsuario(Long id);
        public String criarUsuario(UsuarioDTO usuarioDTO);
        public List<UsuarioDTO> listarUsuarios(Pageable pageable, UsuarioFiltro usuarioFiltro);

}
