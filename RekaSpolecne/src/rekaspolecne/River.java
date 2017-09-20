/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DHA
 */
public class River {
    protected ArrayList<Fleet> river = new ArrayList<>();

    public River () {
    }
    
    /**
     * Adds fleet to AL river
     * @param fleet Fleet
     */
    public void addFleet(Fleet fleet) {
        this.river.add(fleet);
    }

    /**
     * Removes Fleet from AL river at specified index position
     * @param indexFleet int
     */
    public void removeFleet(int indexFleet) {
        this.river.remove(indexFleet);
    }

    /**
     * Returns size of the AL river
     * @return int
     */
    public int getSize() {
        return this.river.size();
    }

    /**
     * Returns fleet in the AL river at specified index
     * @param indexFleet int
     * @return Fleet
     */
    public Fleet getFleet(int indexFleet) {
        return this.river.get(indexFleet);
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
