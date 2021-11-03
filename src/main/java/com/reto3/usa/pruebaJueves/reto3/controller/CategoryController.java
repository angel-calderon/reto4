
package com.reto3.usa.pruebaJueves.reto3.controller;

import com.reto3.usa.pruebaJueves.reto3.entity.Category;
import com.reto3.usa.pruebaJueves.reto3.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping("/api/Category")
public class CategoryController {
        @Autowired
        private CategoryService servicio;

        @GetMapping("/all")
        public List<Category> categoryFindAll() {
            return servicio.CategoryGetAll();
        }

        @PostMapping("/save")
        public ResponseEntity categoryAdd(@RequestBody Category categoria) {
            servicio.CategorySave(categoria);
            return ResponseEntity.status(201).build();
        }
    
 }