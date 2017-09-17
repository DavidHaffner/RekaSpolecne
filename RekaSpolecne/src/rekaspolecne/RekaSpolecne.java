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
        /* PŘEDPOKLAD: zatím jen 2 flotily po 4 lodích & stejná struktura flotil;
        -> do budoucna předělat na x flotil s y loděmi & náhodné losování */
        
        // nejdříve založíme flotilu Ameriky
        Ship indianapolis = new BattleShip ("Indianapolis",1,8);
        Ship grant = new Cruiser ("Grant",1,7);
        Ship lee = new Cruiser ("Lee",1,8);
        Ship mississippi = new RescueShip ("Mississippi",1,4);
        
        TeamFleet fleetUSA = new TeamFleet ();
        fleetUSA.setTeamName("Flotila USA");
        fleetUSA.addTeamShip(indianapolis);
        fleetUSA.addTeamShip(grant);
        fleetUSA.addTeamShip(lee);
        fleetUSA.addTeamShip(mississippi);
        
        // a dále flotilu Sovětského Svazu
        Ship rudyRijen = new BattleShip ("Rudý říjen",2,7);
        Ship kutuzov = new Cruiser ("Kutuzov",2,6);
        Ship kursk = new Cruiser ("Kursk",2,5);
        Ship lenin = new RescueShip ("Lenin",2,4);
        
        TeamFleet fleetUSSR = new TeamFleet ();
        fleetUSSR.setTeamName("Flotila USSR");
        fleetUSSR.addTeamShip(rudyRijen);
        fleetUSSR.addTeamShip(kutuzov);
        fleetUSSR.addTeamShip(kursk);
        fleetUSSR.addTeamShip(lenin);
        
        // umístění flotil do kolekce river
        River river = new River ();
        river.addFleet(fleetUSA);
        river.addFleet(fleetUSSR);
        
        // a dále spustíme bitvu dokud nezůstane 1 vítězná flotila
        BattleSimulator battleSimulator = new BattleSimulator (river); 
        River victor = battleSimulator.battle();
        System.out.println("A bitvu vyhrává: " + victor.getTeamFleet(0).getTeamName());
    }    
}

