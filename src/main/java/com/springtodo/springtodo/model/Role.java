package com.springtodo.springtodo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="role_name")
    private String roleName;

    public Role() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", roleName='" + getRoleName() + "'" +
            "}";
    }

}
