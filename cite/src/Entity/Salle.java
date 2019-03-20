/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author asus
 */
public class Salle {
    private int id ;
    private String nom;
    private int capacite;
    private String type;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getType() {
        return type;
    }

    public Salle(int id, String nom, int capacite, String type) {
        this.id = id;
        this.nom = nom;
        this.capacite = capacite;
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", nom=" + nom + ", capacite=" + capacite + ", type=" + type + '}';
    }
    
}
