/*
 * hra lode 
 */
package rekaspolecne;

/**
 *
 * @author DHA
 */
public class RekaSpolecne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nejdříve založíme flotilu Ameriky
        Ship indianapolis = new BattleShip ("Indianapolis",1,8);
        Ship grant = new Cruiser ("Grant",1,7);
        Ship lee = new Cruiser ("Lee",1,8);
        Ship mississippi = new RescueShip ("Mississippi",1,4);
        
        TeamFleet fleetUSA = new TeamFleet ();
        fleetUSA.addShip(indianapolis);
        fleetUSA.addShip(grant);
        fleetUSA.addShip(lee);
        fleetUSA.addShip(mississippi);
        
        // a dále flotilu Sovětského Svazu
        Ship rudyRijen = new BattleShip ("Rudý říjen",2,7);
        Ship kutuzov = new Cruiser ("Kutuzov",2,6);
        Ship kursk = new Cruiser ("Kursk",2,5);
        Ship lenin = new RescueShip ("Lenin",2,4);
        
        TeamFleet fleetUSSR = new TeamFleet ();
        fleetUSSR.addShip(rudyRijen);
        fleetUSSR.addShip(kutuzov);
        fleetUSSR.addShip(kursk);
        fleetUSSR.addShip(lenin);
        
        // umístění flotil do kolekce river
        River river = new River ();
        river.addFleet(fleetUSA);
        river.addFleet(fleetUSSR);
        
        // a dále spustíme bitvu dvou flotil
        BattleSimulator battleSimulator = new BattleSimulator (river);
        battleSimulator.battle();
    }
    
}
