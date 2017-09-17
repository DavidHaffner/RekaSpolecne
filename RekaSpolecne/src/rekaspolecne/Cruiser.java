/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 *
 * @author DHA
 */
public class Cruiser extends Ship {
    private int hp = 2;
    private int nCannon = 1;
    
    public Cruiser (String name, int team, int accuracy) {
        super(name, team, accuracy);
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the nCannon
     */
    public int getnCannon() {
        return nCannon;
    }

    /**
     * @param nCannon the nCannon to set
     */
    public void setnCannon(int nCannon) {
        this.nCannon = nCannon;
    }
    
    /* nějaké extra metody speciálně pro Cruiser? */    
    
    /* @Override
    public String toString() {
        return "Jmeno lodi: " + this.name + "Pocet zivotu: " + this.getHp()
                + ";" + "\n" + "Pocet kanonu: " + this.getnCannon() + ";" + "\n" +"Přesnost střelby: "+this.accuracy+";"+"\n";
    } */
}
