package com.example.clients.service;

import com.example.clients.model.Client;
import com.example.clients.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements ClientService {
    ClientRepository repository;

    public List<Client> getAll(){
        return repository.findAll();
    }

    public Client  getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Client create(Client client){
        return repository.save(client);
    }
}
