package io.github.AdenilsonDeveloper.service;

import io.github.AdenilsonDeveloper.model.Cliente;
import io.github.AdenilsonDeveloper.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }
    public void savalrCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        // aplica validações
    }
}
