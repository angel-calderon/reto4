
package com.reto3.usa.pruebaJueves.reto3.services;

import com.reto3.usa.pruebaJueves.reto3.entity.Game;
import com.reto3.usa.pruebaJueves.reto3.repository.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GameService {
    @Autowired
    private GameRepository repositorio;
    
    //CRUD Create, Read, Update, Delete
    //create
    public Game saveGame(Game game){
        return repositorio.save(game);
    }
    
    //read
    public List<Game> GamesGetAll(){
        return repositorio.findAll();
    }
    //Update 
//Update
    public Game updateGames(Game juego){
        Game existeJuego=repositorio.findById(juego.getId()).orElse(null);
        existeJuego.setName(juego.getName());
        existeJuego.setDeveloper(juego.getDeveloper());
        existeJuego.setYear(juego.getYear());
        existeJuego.setDescription(juego.getDescription());
        return repositorio.save(existeJuego);
    }
    //Delete
    public String deleteGames(int game_id){
        repositorio.deleteById(game_id);
        return "Registro con id "+game_id+" ha sido eliminado";
        
    }

    
    
}