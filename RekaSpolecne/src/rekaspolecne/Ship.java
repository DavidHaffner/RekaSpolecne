/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 *
 * @author Student
 */
public class Ship {

    protected String name;
    protected int hp;
    protected int maxHp;  //instance hodnotu získají až u potomků
    protected Fleet fleet;  //instance hodnotu získají až u potomků
    protected boolean isInDock =false;
    protected boolean isInGraveyard =false;
    protected int accuracy;
    
    public Ship(String name, Fleet fleet, int accuracy) {
        this.name = name;
        this.fleet = fleet;
        this.accuracy=accuracy;
    }

    
    @Override
    public String toString() {
        return "Jmeno lodi: " +this.getName() +";\n" +"Pocet zivotu: " + this.getHp()
                +";\n" + this.getFleet().toString() +";\n";
    }

    
    /* public Object clone() throws CloneNotSupportedException {
        Ship ship = (Ship)super.clone();
        return ship;
    } */

    /**
     * Getter for ship name
     * @return String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for ship name
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for ship HP
     * @return int
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Setter for ship's hp
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Getter for ship's maxHp
     * @return int
     */
    public int getMaxHp() {
        return this.maxHp;
    }

    /**
     * Getter for ship's Fleet
     * @return Fleet
     */
    public Fleet getFleet() {
        return this.fleet;
    }

    /**
     * Setter for ship's Fleet
     * @param fleet Fleet
     */
    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    /**
     * Method to check if ship is docked
     * @return boolean
     */
    public boolean isIsInDock() {
        return this.isInDock;
    }

    /**
     * Setter for isInDock
     * @param isInDock boolean
     */
    public void setIsInDock(boolean isInDock) {
        this.isInDock = isInDock;
    }

    /**
     * Method to check if ship's in graveyard
     * @return boolean
     */
    public boolean isIsInGraveyard() {
        return this.isInGraveyard;
    }

    /**
     * Setter for isInGraveyard
     * @param isInGraveyard boolean
     */
    public void setIsInGraveyard(boolean isInGraveyard) {
        this.isInGraveyard = isInGraveyard;
    }

    /**
     * Getter for ship's accuracy
     * @return int
     */
    public int getAccuracy() {
        return this.accuracy;
    }

    /**
     * Setter for ship's accuracy
     * @param accuracy int
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
    
}
