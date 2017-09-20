/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 * Tato třída importuje instanci typu Ship a může na ní provést repair (zvýšení
 * atributu hp) 
 * @author DHA
 */
public class Dock {
    private Ship shipForDocking;
    private boolean isEmpty =true;

    public Dock() {
    }

    /**
     * Repairs ship for hp++
     */
    public void repair() {
        if (getShipForDocking().getHp()<getShipForDocking().getMaxHp()) { 
            getShipForDocking().setHp(getShipForDocking().getHp() + 1);
            System.out.println(getShipForDocking().toString() + " byla opravena za 1HP");
        } else {
            System.out.println(getShipForDocking().toString() + " je na maximu HP");
        }
    }

    /**
     * @return Ship shipForDocking
     */
    public Ship getShipForDocking() {
        return this.shipForDocking;
    }

    /**
     * Setter for the shipForDocking 
     * @param shipForDocking Ship
     */
    public void setShipForDocking(Ship shipForDocking) {
        this.shipForDocking = shipForDocking;
        shipForDocking.isInDock =true;
        this.isEmpty =false;
    }

    /**
     * Returns runtime value of isEmpty
     * @return boolean
     */
    public boolean isEmpty() {
        return this.isEmpty;
    }

    /**
     * Setter for isEmpty
     * @param isEmpty boolean
     */
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

}
