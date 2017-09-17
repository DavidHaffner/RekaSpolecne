/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekaspolecne;

/**
 *
 * @author Student
 */
public class Ship implements Cloneable {

    /*
    UPRAVENO 1.9. SHIP ma pouze atributy ktere maji vschny ostatni lode, na ostatni pouzijte dedicnost!
     */
    protected String name;
    protected int hp;
    protected int nCannon;
    protected int team;
    protected int accuracy;
    
    public Ship(String name, int team, int accuracy) {
        this.name = name;
        this.team = team;
        this.accuracy=accuracy;
    }
// vrati HP
    public int getHp() {
        return this.hp;
    }
// vrati pocet kanonu
    public int getNcannon() {
        return this.nCannon;
    }
// vrati team
    public int getTeam() {
        return this.team;
    }
// vrati accuracy
    public int getAccuracy() {
        return this.accuracy;
    }    
// nastavi HP
    public void setHp(int hp) {
        this.hp = hp;
    }
// nastavi kanony
    public void setNcannon(int nCannon) {
        this.nCannon = nCannon;
    }
// nastavi team
    public void setTeam(int team) {
        this.team = team;
    }
// nastavi accuracy
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }    
    
    @Override
    public String toString() {
        return "Jmeno lodi: " +this.name +";\n" +"Pocet zivotu: " + this.getHp()
                +";\n" + "Pocet kanonu: " + this.getNcannon() +";\n" 
                +"Přesnost střelby: " +this.accuracy +";\n";
    }

    /* David: pom. metoda na klonování */
    public Object clone() throws CloneNotSupportedException {
        Ship ship = (Ship)super.clone();
        return ship;
    }
}
