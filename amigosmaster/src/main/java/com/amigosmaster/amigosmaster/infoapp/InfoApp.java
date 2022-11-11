package com.amigosmaster.amigosmaster.infoapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "info.app")
public class InfoApp {
    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "InfoApp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
