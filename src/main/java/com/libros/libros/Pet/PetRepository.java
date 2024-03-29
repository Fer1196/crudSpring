package com.libros.libros.Pet;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {

    Optional<Pet> getPetByName(String name);
    
}
