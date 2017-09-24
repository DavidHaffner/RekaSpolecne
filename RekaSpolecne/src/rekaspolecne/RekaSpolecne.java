/*
 * hra lode 
 */
package rekaspolecne;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

/**
 *
 * @author společně
 */
public class RekaSpolecne {

    static Logger logger = Logger.getLogger(RekaSpolecne.class.getName());
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fleetNames = {"Flotila USA","Flotila USSR","Flotila Japonsko","Flotila Německo","Flotila UK"};
        int numberShips =4;   //zde se zadává počet lodí ve flotile
        int numberFleets =4;  //zde se zadává počet flotil ve hře
        
        
        try {
        Handler fileHandler = new FileHandler("logger.log", 2000, 5);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        
        
        // vygenerování flotil do kolekce river
        River river = new River (numberShips, numberFleets, fleetNames);
        Graveyard graveyard = new Graveyard();
        BattleSimulator battleSimulator = new BattleSimulator (river); 
        battleSimulator.run();
        
        /* DODĚLAT
        // a dále spustíme bitvu dokud nezůstane 1 vítězná flotila
        BattleSimulator battleSimulator = new BattleSimulator (river); 
        River victor = battleSimulator.battle();
        System.out.println("A bitvu vyhrává: " + victor.getTeamFleet(0).getTeamName()); */
    }    
}

