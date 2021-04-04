package com.company;

public class Player {
    private String name;
    private int Health = 100;
    public boolean isAlive = true;
    public int power = 30;

    public void setName(String n) {
        name = n;
    }
    public void takeDamage(int tD) {
        Health -= tD;
        if (Health <= 0) {
            isAlive = false;
            System.out.println(name + " " + "сдох!");
        }

    }
    public int getHealth() {
        return Health;
    }




}
