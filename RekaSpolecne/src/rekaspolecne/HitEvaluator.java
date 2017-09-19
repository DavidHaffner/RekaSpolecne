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
    // pozn. David: tř.Ship nemá numberCannon - přepsat na přetypování na potomky pomocí instanceOf
    public boolean hitEvaluator(Ship shipA,Ship shipB){
        Random rand = new Random();
        return rand.nextInt(shipA.getAccuracy())+shipA.numberCannon>rand.nextInt(shipB.getAccuracy())
                +shipB.getHp()-shipA.numberCannon;
    }
}
