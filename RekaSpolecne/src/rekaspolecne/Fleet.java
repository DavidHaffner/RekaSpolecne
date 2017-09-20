/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;

/**
 *
 * @author DHA
 */
public class Fleet {
    private String fleetName;
    protected ArrayList<Ship> fleetShips = new ArrayList<>();
    protected ArrayList<Dock> fleetDocks = new ArrayList<>();
    
    public Fleet () {
    }
    
    // přidavače a odebírače do atributů: kolekcí teamShips, teamDocks a teamGY 

    /**
     * Adds Ship to AL fleetShips in object Fleet
     * @param ship Ship which will be added to the AL
     * 
     */
    public void addShip(Ship ship) {
        this.fleetShips.add(ship);
    }
    
    /**
     * Removes ship at the specified index from AL fleetShips in object Fleet
     * @param indexShip  specifies index from which remove ship
     * 
     */
    public void removeShip(int indexShip) {
        this.fleetShips.remove(indexShip);
    }
    
    /**
     * Adds Dock to AL fleetDocks in object Fleet
     * @param dock Dock
     * the Dock to be added
     * 
     */
    public void addDock(Dock dock) {
        this.fleetDocks.add(dock);
    }
    
     /**
     * Removes Dock at the specified index from AL fleetDocks in object Fleet
     * @param indexDock
     * 
     */
    public void removeDock(int indexDock) {
        this.fleetDocks.remove(indexDock);
    }
    
    
    
    
    @Override
    public String toString() {
        return this.fleetName;
    }

    

    /**
     * Setter for fleetName
     * @param fleetName String
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }
    
    /**
     * Returns AL fleetShips' size
     * @return int
     * 
     */
    public int sizeFleetShips () {
        return this.fleetShips.size();
    }
    
    /**
     * Return's fleetShips Ship at specified index
     * @return Ship
     * 
     */
    public Ship getFleetShip (int index) {
        return this.fleetShips.get(index); 
    }
}
