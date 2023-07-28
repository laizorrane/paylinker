package com.alfatecsolutions.paylinker.domain.empresa;

import com.alfatecsolutions.paylinker.domain.cliente.Cliente;
import com.alfatecsolutions.paylinker.domain.endereco.Endereco;
import com.alfatecsolutions.paylinker.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
public class Empresa {

    @Id
    @Column(name = "id_cliente")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @OneToMany()
    private Set<Cliente> clientes;

    @OneToMany()
    private Set<Usuario> usuarios;

    @JoinColumn(name = "id_endereco")
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

}
