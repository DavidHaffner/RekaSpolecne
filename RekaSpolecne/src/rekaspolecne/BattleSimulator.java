/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.Random;

/**
 *
 * @author společně
 */
public class BattleSimulator {
    River river;
    Graveyard graveyard;

    public BattleSimulator (River river) {
        this.river = river;
    }

    /* metoda simuluje boj všech flotil až do konečného řešení vítězné otázky,
    tj. dokud nezůstane poslední flotila */
    public River run () {
        
        HitEvaluator hitEvaluator = new HitEvaluator();
        
        /* až zůstane v kolekci river poslední flotila, tak kolekci vrátíme jako output
        tj. právě s 1 elementem */
        while (this.river.getSize()>1) {
            
            // opravi vsechny lode
            river.RepairAllShips();
            //vytahne z graveyards znicene lode skrze vsechny volne Rescueshipy do vsech volnych doku 
            river.setFleetsShipsForRepair();
            //cyklus - náhodná loď z každé flotily vystřelí na náhodný cíl
            for (int i=0; i<this.river.getSize(); i++) {
                // index lodi, která bude útočit
                int indexShipAttacker = (int) (Math.random()*this.river.getFleet(i).sizeFleetShips());
                
                // index flotily, na kterou bude útočeno
                int indexFleetDefender = (int) (Math.random()*this.river.getSize());
                while (i==indexFleetDefender) {
                        indexFleetDefender = (int) (Math.random()*this.river.getSize());
                }
                
                // index lodi z vybrané flotily, na kterou bude útočeno
                int indexShipDefender = (int) (Math.random()*
                        this.river.getFleet(indexFleetDefender).sizeFleetShips());
                
                Ship attacker = this.river.getFleet(i).getFleetShip(indexShipAttacker);
                Ship defender = this.river.getFleet(indexFleetDefender).getFleetShip(indexShipDefender);
                
                if (hitEvaluator.hitEvaluator(attacker, defender)) { //jestli se útočník trefí
                    if (attacker instanceof BattleShip) {
                        //vystřelí do obránce
                        defender.setHp(defender.getHp()-((BattleShip)attacker).getNumberCannon());
                        if (defender.getHp()<0){defender.setHp(0);}
                    }
                    if (attacker instanceof Cruiser) { 
                        //vystřelí do obránce
                        defender.setHp(defender.getHp()-((Cruiser)attacker).getNumberCannon()); 
                        if (defender.getHp()<0){defender.setHp(0);}
                    }
                }
                
                System.out.printf(defender.toString()); //výstup do konzole
                System.out.println();
                if (defender.getHp()<1) {
                defender.setHp(0);  //nechceme záporné HP - nastavení na nulu
                
                graveyard.addShip((Ship)defender);  //přidá zničeného obránce do graveyardu
                defender.setIsInGraveyard(true);
                this.river.getFleet(indexFleetDefender).removeShip(indexShipDefender); //odstraní z flotily
                }
                if (this.river.getFleet(indexFleetDefender).sizeFleetShips()==0) {
                    this.river.removeFleet(indexFleetDefender); //flotila bez lodí je odstraněna z river
                }
            }
        }
        return this.river;
    }
}
