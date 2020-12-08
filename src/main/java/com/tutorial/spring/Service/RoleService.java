package com.tutorial.spring.Service;

import com.tutorial.spring.entity.Role;
import com.tutorial.spring.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class RoleService {

    RoleRepository roleRepository;

    private static final Logger LOGGER = Logger.getLogger(RoleService.class.getName());


    public RoleService(){

    }

    public RoleService(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }

    public List<Role> getAll(){
        return roleRepository.findAll();
    }

    public void save(Role role){
        if(role != null)
            roleRepository.save(role);
        else {
            LOGGER.log(Level.SEVERE, "User is null");
            return;
        }
    }

    public Long count(){
        return roleRepository.count();
    }

    public Role findByName(String name){
        return roleRepository.findRoleByName(name);
    }
}
