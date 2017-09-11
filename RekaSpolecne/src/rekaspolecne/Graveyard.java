/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;

/**
 *
 * @author Vilda
 */
public class Graveyard extends River {
    
    ArrayList<Ship> graveyard = new ArrayList<Ship>();
    
    
    // pridani lodi do graveyardu - umre jde do graveyardu
     public void addShip(Ship lod) {
        graveyard.add(lod);
    }
//odebrani lodi z graveyardu > jde do docku
    public void removeShip(Ship lod) {
        graveyard.remove(lod);
    }
// vrati velikost graveyardu
    @Override
    public int getSize() {
        return graveyard.size();
    }

    // vrati lod na danem indexu
    public Ship getShip(int shipIndex) {
        return graveyard.get(shipIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        for (Ship ship : graveyard) {
            dataElements += ship.toString() + " " + "\n";
        }
        return "River(" + dataElements + ")";

    }
    
}
