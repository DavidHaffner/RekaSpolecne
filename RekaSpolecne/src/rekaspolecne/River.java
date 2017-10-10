/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DHA
 */
public class River {

    // hlavní atribut třídy
    protected ArrayList<Fleet> river = new ArrayList<>();

    public River(int numberShips, int numberFleets, String[] fleetNames) {
        for (int i = 0; i < numberFleets; i++) {
            Fleet fleet = new Fleet(fleetNames[i], numberShips);
            this.addFleet(fleet);
        }
    }
    /**
     * Adds Fleets Ships in graveyard to empty docks via free RescueShips
     */
    public void setFleetsShipsForRepair(Graveyard graveyard){
     for (Fleet fleet:this.river){
          try {
         fleet.setShipsForRepair(graveyard);
          }
          catch (Exception ex) {
                Logger.getLogger(River.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }
    /**
     * Adds fleet to AL river
     *
     * @param fleet Fleet
     */
    public void addFleet(Fleet fleet) {
        this.river.add(fleet);
    }

    /**
     * Removes Fleet from AL river at specified index position
     *
     * @param indexFleet int
     */
    public void removeFleet(int indexFleet) {
        this.river.remove(indexFleet);
    }

    /**
     * Returns size of the AL river
     *
     * @return int
     */
    public int getSize() {
        return this.river.size();
    }

    /**
     * Returns fleet in the AL river at specified index
     *
     * @param indexFleet int
     * @return Fleet
     */
    public Fleet getFleet(int indexFleet) {
        return this.river.get(indexFleet);
    }

    /**
     * Metoda pro opravu vsech lodi ve vsech flotilach
     */
    public void RepairAllShips() {
        for (Fleet f : this.river) {
            try {
                f.repairFleetShips();
            } catch (Exception ex) {
                Logger.getLogger(River.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        String dataElements = "";
        for (Fleet teamFleet : river) {
            dataElements += teamFleet.toString() + "\n";
        }
        return dataElements;

    }

}
