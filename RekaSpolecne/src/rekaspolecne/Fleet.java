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
    public void addShip(Ship ship) {
        this.fleetShips.add(ship);
    }
    public void removeShip(int indexShip) {
        this.fleetShips.remove(indexShip);
    }
    public void addDock(Dock dock) {
        this.fleetDocks.add(dock);
    }
    public void removeDock(int indexDock) {
        this.fleetDocks.remove(indexDock);
    }
    
    
    
    
    @Override
    public String toString() {
        return this.fleetName;
    }

    

    /**
     * @param teamName the teamName to set
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }
    
    public int sizeFleetShips () {
        return this.fleetShips.size();
    }
    
    public Ship getFleetShip (int index) {
        return this.fleetShips.get(index); 
    }
}
