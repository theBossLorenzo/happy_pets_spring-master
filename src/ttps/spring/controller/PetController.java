package ttps.spring.controller;

import org.omg.CORBA.portable.ValueOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ttps.spring.model.Pet;
import ttps.spring.service.PetService;

import java.util.List;

@RestController
@RequestMapping
public class PetController {
    @Autowired
    PetService petService;

    @GetMapping("/pets/{id}")
    public ResponseEntity<List<Pet>> listAllPets(@PathVariable("id")long id){
        List<Pet> pets = petService.getAllPets(id);
        if(pets.isEmpty()){
            return new  ResponseEntity<List<Pet>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Pet>>(pets, HttpStatus.OK);
    }
    
    @PutMapping("/pets")
    public ResponseEntity<Void> createPet(@RequestBody Pet pet){
    	System.out.println(pet);
    	if(petService.isPetExist(pet)) {
    		return new ResponseEntity<Void>(HttpStatus.CONFLICT);
    	}
    	petService.savePet(pet);
    	return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

}
