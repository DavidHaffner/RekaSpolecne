/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;


import java.util.ArrayList;
import java.util.logging.Level;
import static rekaspolecne.RekaSpolecne.logger;

/**
 *
 * @author DHA
 */
public class Fleet {

    protected String fleetName;
    protected ArrayList<Ship> fleetShips = new ArrayList<>();
    protected ArrayList<Dock> fleetDocks = new ArrayList<>();

    public Fleet(String fleetName) {
        this.fleetName = fleetName;
    }

    public Fleet(String fleetName, int numberShips) {
        this.fleetName = fleetName;
        createFleet(numberShips);
    }

    // přidavače a odebírače do atributů: kolekcí teamShips, teamDocks a teamGY 
    /**
     * Adds Ship to AL fleetShips in object Fleet
     *
     * @param ship Ship which will be added to the AL
     *
     */
    public void addShip(Ship ship) {
        this.fleetShips.add(ship);
    }

    /**
     * Removes ship at the specified index from AL fleetShips in object Fleet
     *
     * @param indexShip specifies index from which remove ship
     *
     */
    public void removeShip(int indexShip) {
        this.fleetShips.remove(indexShip);
    }

    /**
     * Adds Dock to AL fleetDocks in object Fleet
     *
     * @param dock Dock the Dock to be added
     *
     */
    public void addDock(Dock dock) {
        this.fleetDocks.add(dock);
    }

    /**
     * Removes Dock at the specified index from AL fleetDocks in object Fleet
     *
     * @param indexDock
     *
     */
    public void removeDock(int indexDock) {
        this.fleetDocks.remove(indexDock);
    }

    /**
     * Metoda pro opravu vsech lodi ve flotile Vola metodu docku repair()
     */
    public void repairFleetShips() throws Exception {
        for (Dock d : this.fleetDocks) {
            if (d.isEmpty()) {
                throw new Exception("Dock is empty!");
            }
            d.repair();
        }
    }
    /**
     * metoda pro overeni zda je Rescue Ship pripravena pro odvoz lodi do doku
     * @return 
     * vrací boolean
     */
    public boolean isRescueShipReady() {
        return this.fleetShips.stream().filter((ship) -> (ship instanceof RescueShip)).map((ship) -> (RescueShip)ship).anyMatch((rescueShip) -> (!rescueShip.getWorkMode()&&!rescueShip.isInDock&&!rescueShip.isInGraveyard));
    }
    /**
     * metoda pro overeni zda je Dock pripravena pro prijem lodi do doku
     * @return 
     * vrací boolean
     */
    public boolean isDockReady() {
        return this.fleetDocks.stream().anyMatch((dock) -> (dock.isEmpty()));
    }
    /**
     * metoda pro overeni zda je Dock pripravena pro prijem lodi do doku
     * @return 
     * vrací boolean
     */
    public boolean isFleetShipInGraveyard() {
        return this.fleetShips.stream().anyMatch((ship) -> (ship.isInGraveyard));
    } 
    /**
     * metoda pro zavolání doku jenž je pripraven pro prijem lodi do doku
     * @return 
     * vrací volnou Dock
     */
    public Dock getDockReady() {
        for(Dock dock:this.fleetDocks){
           if (dock.isEmpty()){
               return dock;
           }
        }      
        return null;
    }
    /**
     * metoda pro zavolání RescueShip jenž je pripravena pro odvoz lodi do doku
     * @return 
     * vrací volnou RescueShip
     */
    public RescueShip getRescueShipReady() {
        for(Ship ship:this.fleetShips){
           if(ship instanceof RescueShip){
               RescueShip rescueShip = (RescueShip)ship;
               if (!rescueShip.getWorkMode()&&!rescueShip.isInDock&&!rescueShip.isInGraveyard){
                   return rescueShip;
               }
           }
        }      
        return null;
    }/**
     * metoda pro zavolání ship z graveyardu pro odvoz do doku na opravu
     * @return 
     * Vrací zničenou loď 
     */
    public Ship getFleetShipInGraveyard() {
        for(Ship ship:this.fleetShips){
           if (ship.isInGraveyard){
               return ship;
           }
        }      
        return null;
    }
    /**
     * metoda pro dokování lodí na opravu.
     * metoda probíha dokavad jsou kdyspozici volné doky, rescueShipy a zničené lodě.
     */
    public void setShipsForRepair(){
        if (isDockReady()&&isRescueShipReady()&&isFleetShipInGraveyard()){
            RescueShip rescueShip;
            Ship ship;
            for(Dock dock:this.fleetDocks){
                if (dock.isEmpty()&&isRescueShipReady()&&isFleetShipInGraveyard()){
                    
                        rescueShip=getRescueShipReady();
                        ship=getFleetShipInGraveyard();
                        rescueShip.setWorkMode(true);
                        ship.setIsInGraveyard(false);
                        ship.setIsInDock(true);
                        dock.setShipForDocking(ship);
                        dock.setIsEmpty(false);
                    
                }
            }
        }
    }
    

    @Override
    public String toString() {
        return this.fleetName;
    }

    /**
     * Setter for fleetName
     *
     * @param fleetName String
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    /**
     * Returns AL fleetShips' size
     *
     * @return int
     *
     */
    public int sizeFleetShips() {
        return this.fleetShips.size();
    }

    /**
     * Return's fleetShips Ship at specified index
     *
     * @return Ship
     *
     */
    public Ship getFleetShip(int index) {
        return this.fleetShips.get(index);
    }

    // metoda dostane na vstupu počet lodí ve flotile a vygeneruje kolekci lodí do fleetShips
    public void createFleet(int numberShips) {
        for (int i = 1; i <= numberShips; i++) {
            String shipName = "Loď " + i;
            if (i % 4 == 0) { //každá čtvrtá loď je RescueShip + vytvoří i dok
                RescueShip rescueShip = new RescueShip(shipName, this, 0);
                this.addShip(rescueShip);
                Dock dock = new Dock();
                this.addDock(dock);
            } else {
                /*vytvářím buď BattleShip nebo Cruiser;
                 hodnota accuracy bude v rozmezí 3-8 */
                int randomShip = (int) (Math.random() * 2);
                int randomAccuracy = (int) (Math.random() * 6 + 3);
                switch (randomShip) {
                    case 0:
                        BattleShip battleShip = new BattleShip(shipName, this, randomAccuracy);
                        this.addShip(battleShip);
                        break;
                    case 1:
                        Cruiser cruiser = new Cruiser(shipName, this, randomAccuracy);
                        this.addShip(cruiser);
                        break;
                    default:
                        logger.log(Level.INFO, "Chyba při tvorbě flotily");
                }
            }
        }
    }
}
