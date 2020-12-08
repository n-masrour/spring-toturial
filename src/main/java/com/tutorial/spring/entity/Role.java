package com.tutorial.spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name="user")
public class Role extends AbstractEntity implements Cloneable {

    @NotNull
    @NotEmpty
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "permission", fetch = FetchType.EAGER)
    @Column(name = "permissions")
    private List<Permission> permissions = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
