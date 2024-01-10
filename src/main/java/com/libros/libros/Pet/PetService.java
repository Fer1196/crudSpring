package com.libros.libros.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.libros.libros.book.Book;
@Service
public class PetService {
    private final PetRepository petRepository;

    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public ResponseEntity<Object> deleteByName(String name){
       Optional <Pet> res = petRepository.getPetByName(name);
       HashMap<String, Object> datos = new HashMap<>();
        if(res.isPresent()){
            
            Pet  pet = res.get();
            petRepository.deleteById(pet.getId());
            datos.put("message", "Createds succesfull"); 
            datos.put("data",res);
            return new ResponseEntity<>(
                datos, 
                HttpStatus.CREATED
            );
        }

        datos.put("message", "No exste el elemento");

         return new ResponseEntity<>(datos, HttpStatus.CONFLICT);
    }

    public Pet  createPet(Pet pet){
        return this.petRepository.save(pet);
    }


    public List<Pet> getAllPets(){
        return this.petRepository.findAll();
    }

     public ResponseEntity<Object> getByName(String name){
       Optional <Pet> res = petRepository.getPetByName(name);
       HashMap<String, Object> datos = new HashMap<>();
        if(res.isPresent()){
            
           
            datos.put("message", "Createds succesfull"); 
            datos.put("data",res);
            return new ResponseEntity<>(
                datos, 
                HttpStatus.CREATED
            );
        }

        datos.put("message", "No exste el elemento");

         return new ResponseEntity<>(datos, HttpStatus.CONFLICT);
    }

    
}
