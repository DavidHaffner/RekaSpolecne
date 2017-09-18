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
public class BattleShip extends Ship {
    // private int hp = 3;
    // private int nCannon = 2;
    
    public BattleShip (String name, int team, int accuracy) {
        super(name, team, accuracy);
        hp=3;
        nCannon=2;
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
    
    /* @Override
    public String toString() {
        return "Jmeno lodi: " +this.name +";\n" +"Pocet zivotu: " +this.getHp()
                +";\n" +"Pocet kanonu: " +this.getnCannon() +";\n" 
                +"Přesnost střelby: " +this.accuracy +";\n";
    } */
}
