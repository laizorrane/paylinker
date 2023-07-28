package com.alfatecsolutions.paylinker.model.empresa;

import com.alfatecsolutions.paylinker.model.endereco.EnderecoDTO;
import com.alfatecsolutions.paylinker.model.usuario.UsuarioDTO;
import com.alfatecsolutions.paylinker.model.cliente.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpresaDTO {

    private Long id;
    private String nome;
    private String nomeFantasia;
    private String cnpj;
    private EnderecoDTO enderecoDTO;
    private String telefone;
    private String email;
    private Set<ClienteDTO> clienteDTOS;
    private Set<UsuarioDTO> usuarioDTOS;



}
