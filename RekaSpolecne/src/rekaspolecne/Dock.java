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

    // metoda na objektu tř. Ship zvedne atr. hp
    public void repair() {
        if (getShipForDocking().getHp()<getShipForDocking().getMaxHp()) { 
            getShipForDocking().setHp(getShipForDocking().getHp() + 1);
            System.out.println(getShipForDocking().toString() + " byla opravena za 1HP");
        } else {
            System.out.println(getShipForDocking().toString() + " je na maximu HP");
        }
    }

    /**
     * @return the shipForDocking
     */
    public Ship getShipForDocking() {
        return shipForDocking;
    }

    /**
     * @param shipForDocking the shipForDocking to set
     */
    public void setShipForDocking(Ship shipForDocking) {
        this.shipForDocking = shipForDocking;
        shipForDocking.isInDock =true;
        this.isEmpty =false;
    }

    /**
     * @return the isEmpty
     */
    public boolean isEmpty() {
        return isEmpty;
    }

    /**
     * @param isEmpty the isEmpty to set
     */
    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

}
