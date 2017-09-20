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

    protected int numberCannon = 1;

    public Cruiser(String name, Fleet fleet, int accuracy) {
        super(name, fleet, accuracy);
        hp = 2;
        maxHp = 2;
    }

    /**
     * Returns number of ship's cannons
     * @return int
     */
    public int getNumberCannon() {
        return numberCannon;
    }
    /**
     * Setter for ship's cannons
     * @param numberCannon int
     */
    public void setNumberCannon(int numberCannon) {
        this.numberCannon = numberCannon;
    }

    /* nějaké extra metody speciálně pro Cruiser? */
}
