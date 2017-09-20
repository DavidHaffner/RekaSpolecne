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
public class Graveyard {
    // kolekce lodí s 0 HP
    ArrayList<Ship> graveyard = new ArrayList<>();
    
    


    /**
     * Method to add dead ship to graveyard.
     * @param lod Ship
     */
     public void addShip(Ship lod) {
        this.graveyard.add(lod);
    }

    /**
     * Method to remove ship from graveyard. Ship should be removed only if it is moved to dock for repair
     * @param lod Ship
     */
    public void removeShip(Ship lod) {
        this.graveyard.remove(lod);
    }


    /**
     * Getter for AL graveyard size
     * @return int
     */
    public int getSize() {
        return this.graveyard.size();
    }

    /* vrati lod na danem indexu - David: je to vůbec potřeba?
    public Ship getShip(int shipIndex) {
        return graveyard.get(shipIndex);
    } */

  

    @Override
    public String toString() {
        String graveyardElements = "";
        for (Ship ship : graveyard) {
            graveyardElements += ship.toString() +"\n";
        }
        return graveyardElements;
    }
    
}
