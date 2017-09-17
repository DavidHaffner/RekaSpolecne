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
    
    
    // pridani lodi do graveyardu - umre jde do graveyardu
     public void addShip(Ship lod) {
        graveyard.add(lod);
    }
    //odebrani lodi z graveyardu > jde do docku
    public void removeShip(Ship lod) {
        graveyard.remove(lod);
    }
    // vrati velikost graveyardu
    public int getSize() {
        return graveyard.size();
    }

    /* vrati lod na danem indexu - David: je to vůbec potřeba?
    public Ship getShip(int shipIndex) {
        return graveyard.get(shipIndex);
    } */

  

    @Override
    public String toString() {
        String grYaElements = "";
        for (Ship ship : graveyard) {
            grYaElements += ship.toString() +"\n";
        }
        return grYaElements;
    }
    
}
