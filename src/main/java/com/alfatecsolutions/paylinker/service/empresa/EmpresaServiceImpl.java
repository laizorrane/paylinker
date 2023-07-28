package com.alfatecsolutions.paylinker.service.empresa;

import com.alfatecsolutions.paylinker.model.empresa.EmpresaDTO;
import com.alfatecsolutions.paylinker.model.empresa.EmpresaFiltro;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Override
    public EmpresaDTO buscarEmpresaPeloId(Long id) {
        return null;
    }

    @Override
    public String editarEmpresa(EmpresaDTO empresa) {
        return null;
    }

    @Override
    public String deletarEmpresa(Long id) {
        return null;
    }

    @Override
    public String criarEmpresa(EmpresaDTO empresa) {
        return null;
    }

    @Override
    public List<EmpresaDTO> listarEmpresas(Pageable pageable, EmpresaFiltro empresaFiltro) {
        return null;
    }
}
