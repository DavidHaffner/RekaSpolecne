/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 * Třída je potomek třídy Ship rozšířený o parametr numberCannon - může střílet
 * na jiné lodě
 * @author DHA
 */ 
public class BattleShip extends Ship {
    /** parametr se používá pro boj, tj. střelbu na jinou loď a snížení jejích hp;
     u třídy BattleShip je defaultně nastaven na velikost 2*/
    protected int numberCannon =2;
    
    /** v konstruktoru defaultně nastaveny parametry hp a maxHp pro BattleShip na 3
     * @param name: String udává jméno lodi
     * @param fleet: Fleet značí příslušnost k určité flotile
     * @param accuracy: int udává přesnost střelby; hodnoty 3-8
     */
    public BattleShip (String name, Fleet fleet, int accuracy) {
        super (name, fleet, accuracy);
        hp =3;
        maxHp =3;
    }

    

    /**
     * Returns number of ship's cannons
     * @return int
     */
    public int getNumberCannon() {
        return this.numberCannon;
    }

    /**
     * Setter for ship's cannons
     * @param numberCannon int
     */
    public void setNumberCannon(int numberCannon) {
        this.numberCannon = numberCannon;
    }
    
    /** metoda přepisuje metodu toString a vrací všechny parametry BattleShip */
    @Override
    public String toString() {
        return "Jmeno lodi: " +this.getName() +";\n" +"Pocet zivotu: " +this.getHp()
                +";\n" +"Pocet del: " +this.getNumberCannon() +";\n"
                +"Přesnost: " +this.getAccuracy() +";\n"   
                +this.getFleet().toString() +";\n";
    }
}
