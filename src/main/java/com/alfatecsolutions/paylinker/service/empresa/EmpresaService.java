package com.alfatecsolutions.paylinker.service.empresa;

import com.alfatecsolutions.paylinker.model.empresa.EmpresaDTO;
import com.alfatecsolutions.paylinker.model.empresa.EmpresaFiltro;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface EmpresaService{

        public EmpresaDTO buscarEmpresaPeloId(Long id);
        public String editarEmpresa(EmpresaDTO empresa);
        public String deletarEmpresa(Long id);
        public String criarEmpresa(EmpresaDTO empresa);
        public List<EmpresaDTO> listarEmpresas(Pageable pageable, EmpresaFiltro empresaFiltro);

}
