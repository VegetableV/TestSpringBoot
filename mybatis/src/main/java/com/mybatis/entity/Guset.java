package com.mybatis.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



public class Guset implements Serializable {

    private Integer id;

    private String name;

    private String role;

    public Guset(Integer id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Guset() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
