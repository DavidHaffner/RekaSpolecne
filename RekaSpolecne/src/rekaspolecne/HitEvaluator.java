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
//clas pro vyhodnocování trefy
public class HitEvaluator {
//berou se hodnoty z lodí které ze sebou bojují. shipA je útočící loď shipB je loď která se brání
   public boolean hitEvaluator(Ship shipA,Ship shipB){
        Random rand = new Random();
    return rand.nextInt(shipA.accuracy)+shipA.nCannon>rand.nextInt(shipB.accuracy)+shipB.hp-shipA.nCannon;
    }
}
