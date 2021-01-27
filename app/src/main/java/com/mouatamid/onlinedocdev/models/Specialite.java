package com.mouatamid.onlinedocdev.models;

public class Specialite {
    private int id;
    private String titre;
    private int image;

    public Specialite(int id, String titre, int image) {
        this.id = id;
        this.titre = titre;
        this.image = image;
    }

    public Specialite(String titre, int image) {
        this.titre = titre;
        this.image = image;
    }

    public Specialite() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
