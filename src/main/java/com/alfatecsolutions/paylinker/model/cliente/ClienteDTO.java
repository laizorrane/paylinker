package com.alfatecsolutions.paylinker.model.cliente;

import com.alfatecsolutions.paylinker.model.endereco.EnderecoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Long id;
    private String nome;
    private String cpfCnpj;
    private Set<EnderecoDTO> enderecoDTO;
    private String telefone;
    private String email;

}
