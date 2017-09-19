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

    public RescueShip (String name, Fleet fleet, int accuracy) {
        super (name, fleet, accuracy);
        hp =1;
        maxHp =1;
    }

// zjistění WorkMode T/F
    public boolean getWorkMode() {
        return this.workMode;
    }
// nastavení WorkMode T/F
    public void setWorkMode(boolean workMode) {
        this.workMode = workMode;
    }
    
}