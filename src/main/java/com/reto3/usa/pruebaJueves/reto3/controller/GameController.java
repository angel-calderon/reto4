
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Game;
import com.reto3.usa.pruebaJueves.reto3.services.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Game")
public class GameController {
    @Autowired
    private GameService servicio;
    
    @GetMapping("/all")
    public List<Game> gameFindAll(){
        return servicio.GamesGetAll();
    }
    
    @PostMapping("/save")
    public ResponseEntity gameAdd(@RequestBody Game juego){
        servicio.saveGame(juego);
        return ResponseEntity.status(201).build();
    }
    
    @PutMapping("/update")
    public ResponseEntity updateGames(@RequestBody Game juego){
        servicio.updateGames(juego);
        return ResponseEntity.status(201).build();
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity deleteGames(@RequestBody Game juego){
        servicio.deleteGames(juego.getId());
        return ResponseEntity.status(204).build();
    }
    
}
