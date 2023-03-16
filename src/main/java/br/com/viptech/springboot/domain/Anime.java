package br.com.viptech.springboot.domain;

public class Anime {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {

    }


}