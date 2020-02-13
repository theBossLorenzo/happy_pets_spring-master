package ttps.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ttps.spring.interfacesDAO.UserDAOInterface;
import ttps.spring.model.Admin;
import ttps.spring.model.Owner;
import ttps.spring.model.Pet;
import ttps.spring.model.User;
import ttps.spring.model.Vet;
import ttps.spring.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
    UserService userService;
    
	@CrossOrigin(origins = "*")
    @PostMapping("/login")
    public ResponseEntity<Object> listAllPets(@RequestBody User user ){
        Boolean users = userService.getUser(user);   
        if(!users){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
        }
        
        return new ResponseEntity<Object>(userService.findUser(user), HttpStatus.OK);
    }
	
	@PutMapping("/updateVet")
    public ResponseEntity<Object> updateVet(@RequestBody Vet vet){
		Boolean users = userService.getUser(vet);   
        if(!users){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
        }
    	return new ResponseEntity<Object>(userService.updateVet(vet), HttpStatus.OK);
    }
	
	@PutMapping("/updateAdmin")
    public ResponseEntity<Object> updateAdmin(@RequestBody Admin admin){
		Boolean users = userService.getUser(admin);   
        if(!users){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
        }
    	return new ResponseEntity<Object>(userService.updateAdmin(admin), HttpStatus.OK);
    }
	
	@PutMapping("/updateOwner")
    public ResponseEntity<Object> updateOwner(@RequestBody Owner owner){
		Boolean users = userService.getUser(owner);   
        if(!users){
            return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
        }
    	return new ResponseEntity<Object>(userService.updateOwner(owner), HttpStatus.OK);
    }
	
	@PostMapping(value = "/signUpVet")
    public ResponseEntity<Vet> signUpVet(@RequestBody Vet vet){
    	if(userService.getUser(vet)) {
    		return new ResponseEntity<Vet>(vet,HttpStatus.CONFLICT);
    	}
    	userService.saveVet(vet);
    	return new ResponseEntity<Vet>(vet,HttpStatus.OK);
    }
 
 @PostMapping(value = "/signUpAdmin")
    public ResponseEntity<Admin> signUpAdmin(@RequestBody Admin admin){
    	if(userService.getUser(admin)) {
    		return new ResponseEntity<Admin>(admin,HttpStatus.CONFLICT);
    	}
    	userService.saveAdmin(admin);
    	return new ResponseEntity<Admin>(admin,HttpStatus.OK);
    }

 @PostMapping(value = "/signUpOwner")
    public ResponseEntity<Owner> signUpOwner(@RequestBody Owner owner){
    	if(userService.getUser(owner)) {
    		return new ResponseEntity<Owner>(owner,HttpStatus.CONFLICT);
    	}
    	userService.saveOwner(owner);
    	return new ResponseEntity<Owner>(owner,HttpStatus.OK);
    }



}