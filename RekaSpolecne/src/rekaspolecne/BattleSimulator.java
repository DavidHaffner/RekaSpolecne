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
                Ship defender = this.river.getFleet(indexFleetDefender).
                        getFleetShip(indexShipDefender);
                
                if (hitEvaluator.hitEvaluator(attacker, defender)) { //jestli se útočník trefí
                    defender.setHp(defender.getHp()-attacker.getNcannon()); //vystřelí do obránce
                }
                System.out.printf(defender.toString()); //výstup do konzole
                System.out.println();
                if (defender.getHp()<1) {
                defender.setHp(0);  //nechceme záporné HP
                                    //přidá zničeného obránce do graveyardu
                this.river.getFleet(indexFleetDefender).removeShip(indexShipDefender); //odstraní z flotily
            }
                
                
            }
            
            
            
            
            
            
            
            if (fleetB.sizeFleetShips()==0) {
                river.removeFleet(indFlB);  // potopená flotila je odstraněna
            }     
        }
        return this.river;
    }
    
    /* NAKONEC NEPOUŽITO:
    metoda simuluje boj 2 flotil: bojujeme tak dlouho, dokud jedna z flotil 
    nebude mít v atributu teamShips nulu, tj. bude bez lodí
    private void duel (Fleet fleetA, Fleet fleetB) {
        HitEvaluator hitEvaluator = new HitEvaluator();
        
        while (fleetA.sizeTeamShips()>0 && fleetB.sizeTeamShips()>0) {
            int indShA = rand.nextInt(fleetA.sizeTeamShips()); // index ship A
            int indShB = rand.nextInt(fleetB.sizeTeamShips()); // index ship B    
            Ship shipA = fleetA.getTeamShip(indShA);
            Ship shipB = fleetB.getTeamShip(indShB);
            
            if (hitEvaluator.hitEvaluator(shipA, shipB)) { // jestli se A trefí
            shipB.setHp(shipB.getHp()-shipA.getNcannon()); // výstřel A do B
            }
            if (hitEvaluator.hitEvaluator(shipB, shipA)) { // jestli se B trefí
            shipA.setHp(shipA.getHp()-shipB.getNcannon()); // výstřel B do A
            }
            System.out.printf(shipB.toString()); // výstup do konzole
            System.out.printf(shipA.toString());
            System.out.println();
            
            if (shipA.getHp()<1) {
                shipA.setHp(0);  // nechceme záporné HP
                fleetA.addTeamGraveyard(shipA);
                fleetA.removeTeamShip(indShA);
            }
            if (shipB.getHp()<1) {
                shipB.setHp(0);  // nechceme záporné HP
                fleetB.addTeamGraveyard(shipB);
                fleetB.removeTeamShip(indShB);
            }
        }        
    } */
}
