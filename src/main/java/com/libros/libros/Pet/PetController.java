package com.libros.libros.Pet;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping(path="api/v2/pet")

public class PetController {

    private final PetService petService;

    
    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }



    @GetMapping
    public List<Pet> getPets() {
        return this.petService.getAllPets();
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        //TODO: process POST request
        
        return this.petService.createPet(pet);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Object> deletePet (@PathVariable("name") String name){
        return this.petService.deleteByName(name);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Object> getPetByName(@PathVariable("name") String name) {
        return this.petService.getByName(name);
    }
    
    
    
    
}
