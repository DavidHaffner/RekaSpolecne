/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.Random;

/**
 *
 * @author Student
 */
public class BattleSimulator {

    River reka;
    Random rand = new Random();

    int fleetIndex;
    TeamFleet fleetA;
    TeamFleet fleetB;
    int hp;              // David: je to tu k něčemu?       
    int x = 0;           // David: je to tu k něčemu?

    int tempIndex;

    public BattleSimulator(River reka) {
        this.reka = reka;

    }

    public int getFleetIndex() {
        reka.getSize();
        return rand.nextInt(reka.getSize());
        
    }

    public void battle() {

        while ((reka.getSize() > 1)) { 

            
            
            fleetA = reka.getTeamFleet(this.getFleetIndex());
            
            fleetB = reka.getTeamFleet(this.getFleetIndex());
            if (fleetA.equals(fleetB)) {
                battle();
            }
            
            /* David: tady se to musí komplet vymyslet a přepsat na flotily
             
            hp = shipB.getHp() - (shipA.getNcannon() * 5);
            System.out.println("Utok lodi A: " + shipA.getNcannon() * 5);
            System.out.println("Zivoty lodi B: " + shipB.getHp());
            shipB.setHp(hp);
            System.out.println("Zivoty lodi B po utoku: " + shipB.getHp());
            
            if (shipB.getHp() < 1) {
            reka.removeShip(shipB);
            }                                     */
            
            
            x++;

        }

    }

}
