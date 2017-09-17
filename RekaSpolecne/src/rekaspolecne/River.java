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
    protected ArrayList<TeamFleet> river = new ArrayList<>();

    public River () {
    }
    
    public void addFleet(TeamFleet teamFleet) {
        river.add(teamFleet);
    }

    public void removeFleet(int indTeamFleet) {
        river.remove(indTeamFleet);
    }

    public int getSize() {
        return river.size();
    }

    public TeamFleet getTeamFleet(int teamFleetIndex) {
        return river.get(teamFleetIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        for (TeamFleet teamFleet : river) {
            dataElements += teamFleet.toString() + "\n";
        }
        return dataElements;

    }

}
