package com.alfatecsolutions.paylinker.service.cliente;

import com.alfatecsolutions.paylinker.model.cliente.ClienteDTO;
import com.alfatecsolutions.paylinker.model.cliente.ClienteFiltro;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface ClienteService {

        public ClienteDTO buscarClientePeloId(Long id);
        public String editarCliente(ClienteDTO clienteDTO);
        public String deletarCliente(Long id);
        public String criarCliente(ClienteDTO clienteDTO);
        public List<ClienteDTO> listarClientes(Pageable pageable, ClienteFiltro clienteFiltro);

}
