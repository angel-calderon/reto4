package com.reto3.usa.pruebaJueves.reto3.services;


import com.reto3.usa.pruebaJueves.reto3.entity.Client;
import com.reto3.usa.pruebaJueves.reto3.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {
    @Autowired
    private ClientRepository repositorio;
    //Create
    public Client saveClient(Client cliente){
        return repositorio.save(cliente);
    }
    //Read
    public List<Client> getClientAll(){
        return repositorio.findAll();
    }
    //Update
    public Client updateClient(Client cliente){
        Client existeCliente=repositorio.findById(cliente.getIdClient()).orElse(null);
        existeCliente.setName(cliente.getName());
        existeCliente.setEmail(cliente.getEmail());
        existeCliente.setAge(cliente.getAge());
        existeCliente.setPassword(cliente.getPassword());
        return repositorio.save(existeCliente);
    }
    //Delete
    public String deleteClient(int id_cliente){
        repositorio.deleteById(id_cliente);
        return "Registro con id "+id_cliente+" ha sido eliminado";
        
    }
}