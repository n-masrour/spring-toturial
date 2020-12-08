package com.tutorial.spring.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;


import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.LinkedList;
import java.util.List;

@Entity
public class User extends AbstractEntity implements Cloneable {

    @NotNull
    @NotEmpty
    @Column(name = "userName")
    private String userName;

    @NotNull
    @NotEmpty
    @Column(name = "password")
    private String password;

    @Column(name = "roles")
    @OneToMany(mappedBy = "role", fetch = FetchType.EAGER)
    private List<Role> roles = new LinkedList<>();

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
