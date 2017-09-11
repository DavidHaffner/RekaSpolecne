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
public class TeamFleet {
    protected ArrayList<Ship> teamFleet = new ArrayList<Ship>();

    public void addShip(Ship lod) {
        teamFleet.add(lod);
    }

    public void removeShip(Ship lod) {
        teamFleet.remove(lod);
    }
}
