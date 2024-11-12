package br.com.jarjar.spring.services;


import br.com.jarjar.spring.entities.User;
import br.com.jarjar.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }


    public User findUserById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }







}
