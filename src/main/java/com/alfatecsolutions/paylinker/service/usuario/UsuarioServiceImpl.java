package com.alfatecsolutions.paylinker.service.usuario;

import com.alfatecsolutions.paylinker.model.usuario.UsuarioDTO;
import com.alfatecsolutions.paylinker.model.usuario.UsuarioFiltro;
import com.alfatecsolutions.paylinker.service.usuario.UsuarioService;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {


    @Override
    public UsuarioDTO buscarUsuarioPeloId(Long id) {
        return null;
    }

    @Override
    public String editarUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public String deletarUsuario(Long id) {
        return null;
    }

    @Override
    public String criarUsuario(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public List<UsuarioDTO> listarUsuarios(Pageable pageable, UsuarioFiltro usuarioFiltro) {
        return null;
    }
}
