

package com.reto3.usa.pruebaJueves.reto3.services;


import com.reto3.usa.pruebaJueves.reto3.entity.Message;
import com.reto3.usa.pruebaJueves.reto3.repository.MessageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private MessageRepository repositorio;
    //Create
    public Message saveMessage(Message mensaje){
        return repositorio.save(mensaje);
    }
    //Read
    public List<Message> getMessageAll(){
        return repositorio.findAll();
    }
    //Update
    public Message updateMessage(Message mensaje){
        Message existeMensaje=repositorio.findById(mensaje.getIdMessage()).orElse(null);
        existeMensaje.setMessageText(mensaje.getMessageText());
        return repositorio.save(existeMensaje);
    }
    //Delete
    public String deleteGame(int id){
        repositorio.deleteById(id);
        return "Registro con id "+id+" ha sido eliminado";
        
    }
}
