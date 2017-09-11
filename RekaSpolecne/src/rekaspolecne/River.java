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
 * @author Student
 */
public class River {
    protected ArrayList<TeamFleet> reka = new ArrayList<TeamFleet>();

    public River () {
        this.reka = reka;
    }
    
    public void addFleet(TeamFleet teamFleet) {
        reka.add(teamFleet);
    }

    public void removeFleet(TeamFleet teamFleet) {
        reka.remove(teamFleet);
    }

    public int getSize() {
        return reka.size();
    }

    public TeamFleet getTeamFleet(int teamFleetIndex) {
        return reka.get(teamFleetIndex);
    }

  

    @Override
    public String toString() {
        String dataElements = "";
        for (TeamFleet teamFleet : reka) {
            dataElements += teamFleet.toString() + " " + "\n";
        }
        return "River(" + dataElements + ")";

    }

}
