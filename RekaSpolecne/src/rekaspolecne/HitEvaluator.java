/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

import java.util.Random;

/**
 *
 * @author Pavel
 */
//clas pro vyhodnocování trefy
public class HitEvaluator {
    
    public HitEvaluator () {
    }
    
    // berou se hodnoty z lodí které ze sebou bojují. shipA je útočící loď shipB je loď která se brání
 

    /**
     * Method to determine if shipA damages (hits) shipB
     * @param shipA Ship
     * @param shipB Ship
     * @return boolean
     */
    public boolean hitEvaluator(Ship shipA,Ship shipB){
        Random rand = new Random();
        if (shipA instanceof BattleShip) {
            shipA = (BattleShip) shipA;
            return rand.nextInt(shipA.getAccuracy())+((BattleShip)shipA).getNumberCannon()>
                    rand.nextInt(shipB.getAccuracy())+shipB.getHp()-((BattleShip)shipA).getNumberCannon();
        }
        if (shipA instanceof Cruiser) {
            return rand.nextInt(shipA.getAccuracy())+((Cruiser)shipA).getNumberCannon()>
                    rand.nextInt(shipB.getAccuracy())+shipB.getHp()-((Cruiser)shipA).getNumberCannon();
        } else {
            return false;    
        }
        
    }
}
