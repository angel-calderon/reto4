package com.reto3.usa.pruebaJueves.reto3.services;


import com.reto3.usa.pruebaJueves.reto3.entity.Category;
import com.reto3.usa.pruebaJueves.reto3.repository.CategoryRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repositorio;
    
    public Category CategorySave(Category categoria){
        return repositorio.save(categoria);
    }
    
    public List<Category> CategoryGetAll(){
        return repositorio.findAll();
    }
}
