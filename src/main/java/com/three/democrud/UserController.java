package com.three.democrud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


   
@RestController
public class UserController {

	//@Autowired(required=true)
	@Autowired
	UserInterface re;
	//@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	@GetMapping("/jpa/getAll")
	public List<User> getAlluser(){
		
		return re.findAll();
	}
	@GetMapping("/jpa/getOne/{id}")
	public Optional<User> getOne(@PathVariable int id){
		
	return re.findById(id);
	
	}
	@PostMapping("/jpa/post")
	public User postUser(@RequestBody User add) {
		return re.save(add);
	}
	@DeleteMapping("/jpa/delete/{id}")
	public void delete(@PathVariable int id) {
		re.deleteById(id);
	}
	@PutMapping("/jpa/put/{id}")
	public User putUser(@RequestBody User put){
	return re.save(put);
	}
	@PatchMapping("/jpa/patch/{patch}")
	public User patchUser(@RequestBody User patch){
	return re.save(patch);
	}	
}
