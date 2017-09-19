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
    protected int numberCannon =2;
    
    public BattleShip (String name, Fleet fleet, int accuracy) {
        super (name, fleet, accuracy);
        hp =3;
        maxHp =3;
    }

    

    /**
     * @return the numberCannon
     */
    public int getNumberCannon() {
        return numberCannon;
    }

    /**
     * @param numberCannon the numberCannon to set
     */
    public void setNumberCannon(int numberCannon) {
        this.numberCannon = numberCannon;
    }
    
    @Override
    public String toString() {
        return "Jmeno lodi: " +this.getName() +";\n" +"Pocet zivotu: " +this.getHp()
                +";\n" +"Pocet del: " +this.getNumberCannon() +";\n"   
                +this.getFleet().toString() +";\n";
    }
}
