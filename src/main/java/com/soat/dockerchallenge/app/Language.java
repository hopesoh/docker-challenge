package com.soat.dockerchallenge.app;

import jakarta.persistence.*;
import org.springframework.util.Assert;

import java.io.Serializable;

@Entity
public class Language implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Language(String name) {
        Assert.hasText(name, "name could nout be empty");
        this.name = name;
    }

    /**
     * @javadoc
     * Hibernate eyes only
     */
    @Deprecated
    public Language() {
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
}
