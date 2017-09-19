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
    
    public void addFleet(Fleet fleet) {
        river.add(fleet);
    }

    public void removeFleet(int indexFleet) {
        river.remove(indexFleet);
    }

    public int getSize() {
        return river.size();
    }

    public Fleet getFleet(int indexFleet) {
        return river.get(indexFleet);
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
