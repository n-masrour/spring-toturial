package com.tutorial.spring.Service;

import com.tutorial.spring.entity.User;
import com.tutorial.spring.repository.RoleRepository;
import com.tutorial.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());


    public  UserService(UserRepository userRepository , RoleRepository roleRepository){
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public UserService(){

    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void save(User user){
        if(user != null)
            userRepository.save(user);
        else {
            LOGGER.log(Level.SEVERE, "User is null");
            return;
        }


    }

    public void delete(User user){
        userRepository.delete(user);
    }

    public Long count(){
        return userRepository.count();
    }
}
