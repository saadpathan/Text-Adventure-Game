/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import combat.Spells;
import game.io.Reader;

/**
 *
 * @author ChillCoders Group
 */
public class Major {
    public String name, ascii, desc, id;
    public int hp, attack, defense;
    public double hpScaling, atkScaling, defScaling;
    public Spells[] availableSpells = new Spells[3];
    // Constructor
    public Major (String s) {
        ascii = Reader.getAsciiArt(s); // Gets the appropriate ascii art to represent the major
        getStats(s);
        
        
    }
    // Method to assign the proper stats and spells with the string array returned by readMajorsFile() method.
    public void getStats (String majorName) {
        id = majorName;
        String[] e = Reader.readMajorsFile(majorName);
        name = e[0];
        desc = e[1];
        hp = Integer.parseInt(e[2]);
        attack = Integer.parseInt(e[3]);
        defense = Integer.parseInt(e[4]);
        hpScaling = Double.parseDouble(e[5]);
        atkScaling = Double.parseDouble(e[6]);
        defScaling = Double.parseDouble(e[7]);
        availableSpells[0] = new Spells(e[8]);
        availableSpells[1] = new Spells(e[9]);
        availableSpells[2] = new Spells(e[10]);
    }
    
    
}
