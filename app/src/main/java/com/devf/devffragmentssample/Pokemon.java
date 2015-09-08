package com.devf.devffragmentssample;


public class Pokemon {

    String nombre;
    int ataque;
    int defensa;
    int imageId;

    public Pokemon(String nombre, int ataque, int defensa) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public Pokemon(String nombre, int ataque, int defensa, int imageId) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.imageId = imageId;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getImageId() {
        return imageId;
    }
}
