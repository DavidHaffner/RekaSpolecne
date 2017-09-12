/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 * Třída reprezentuje lodi, které budou schopné z river přesouvat do dock na upgrade
   nebo z graveyard do dock na repair
 * @author DHA -> Vilda -> DHA
 */
public class RescueShip extends Ship {
    private boolean workMode = false;
    private int hp = 1;
    private int nCannon = 0;

    public RescueShip (String name, int team, int accuracy) {   // objekt RescueShip
        super (name, team, accuracy); // dědíme z ship
    }

// zjistění WorkMode T/F
    public boolean getWorkMode() {
        return this.workMode;
    }
// nastavení WorkMode T/F
    public void setWorkMode(boolean workMode) {
        this.workMode = workMode;
    }
    
    @Override
   public String toString() {
        return "Jmeno lodi: " + this.name + "Pocet zivotu: " + this.hp
                + ";" + "\n" + "Pocet kanonu: " + this.nCannon + ";" + "\n" +"Přesnost střelby: "+this.accuracy+";"+"\n" + "WorkMode: " + this.workMode;
    }
}