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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the maxHp
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * @return the fleet
     */
    public Fleet getFleet() {
        return fleet;
    }

    /**
     * @param fleet the fleet to set
     */
    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    /**
     * @return the isInDock
     */
    public boolean isIsInDock() {
        return isInDock;
    }

    /**
     * @param isInDock the isInDock to set
     */
    public void setIsInDock(boolean isInDock) {
        this.isInDock = isInDock;
    }

    /**
     * @return the isInGraveyard
     */
    public boolean isIsInGraveyard() {
        return isInGraveyard;
    }

    /**
     * @param isInGraveyard the isInGraveyard to set
     */
    public void setIsInGraveyard(boolean isInGraveyard) {
        this.isInGraveyard = isInGraveyard;
    }

    /**
     * @return the accuracy
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * @param accuracy the accuracy to set
     */
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
