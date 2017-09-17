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
    private String teamName;
    protected ArrayList<Ship> teamShips = new ArrayList<>();
    protected ArrayList<Dock> teamDocks = new ArrayList<>();
    protected ArrayList<Ship> teamGraveyard = new ArrayList<>();
    
    public TeamFleet () {
    }
    
    // přidavače a odebírače do atributů: kolekcí teamShips, teamDocks a teamGY 
    public void addTeamShip(Ship ship) {
        this.teamShips.add(ship);
    }
    public void removeTeamShip(int indShip) {
        this.teamShips.remove(indShip);
    }
    public void addTeamDock(Dock dock) {
        this.teamDocks.add(dock);
    }
    public void removeTeamDock(int indDock) {
        this.teamDocks.remove(indDock);
    }
    public void addTeamGraveyard(Ship ship) {
        this.teamGraveyard.add(ship);
    }
    public void removeTeamGraveyard(int indShip) {
        this.teamGraveyard.remove(indShip);
    }
    
    // vypisovače jednotl kolekcí?
    
    @Override
    public String toString() {
        return this.getTeamName();
    }

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    public int sizeTeamShips () {
        return this.teamShips.size();
    }
    
    public Ship getTeamShip (int index) {
        return this.teamShips.get(index); 
    }
}
