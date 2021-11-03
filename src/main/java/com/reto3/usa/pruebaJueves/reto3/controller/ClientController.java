
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Client;
import com.reto3.usa.pruebaJueves.reto3.services.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService servicio;
    
    @PostMapping("/save")
    public ResponseEntity addCliente(@RequestBody Client cliente){
        servicio.saveClient(cliente);
        return ResponseEntity.status(201).build();      
    }
    
   @GetMapping("/all")
   public List<Client> getAllClients(){
       return servicio.getClientAll();
   }
}