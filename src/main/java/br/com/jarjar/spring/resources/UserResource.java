package br.com.jarjar.spring.resources;


import br.com.jarjar.spring.entities.User;
import br.com.jarjar.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {


    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() { // retorna uma lista de usuários
        List<User> list = userService.findAll();
        return ResponseEntity.ok().body(list);
    }



    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id){
        User obj = userService.findUserById(id);
        return ResponseEntity.ok().body(obj);
    }





}
