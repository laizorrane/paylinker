package com.alfatecsolutions.paylinker.service.cliente;

import com.alfatecsolutions.paylinker.model.cliente.ClienteDTO;
import com.alfatecsolutions.paylinker.model.cliente.ClienteFiltro;
import com.alfatecsolutions.paylinker.service.cliente.ClienteService;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {


    @Override
    public ClienteDTO buscarClientePeloId(Long id) {
        return null;
    }

    @Override
    public String editarCliente(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public String deletarCliente(Long id) {
        return null;
    }

    @Override
    public String criarCliente(ClienteDTO clienteDTO) {
        return null;
    }

    @Override
    public List<ClienteDTO> listarClientes(Pageable pageable, ClienteFiltro clienteFiltro) {
        return null;
    }
}
