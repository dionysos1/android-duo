package com.example.joshua.projectduo;

public class Gun {
    public String ammo;
    public int damage;
    public String img;
    public String naam;
    public String type;

    public Gun(String ammo, int damage, String img, String naam, String type) {
        this.ammo = ammo;
        this.damage = damage;
        this.img = img;
        this.naam = naam;
        this.type = type;

        //return ammo, damage, img, naam, type;
    }

    public String getAmmo() {
        return ammo;
    }

    public int getDamage() {
        return damage;
    }

    public String getImg() {
        return img;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }
}
