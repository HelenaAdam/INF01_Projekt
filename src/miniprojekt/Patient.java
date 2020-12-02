/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojekt;

/**
 *
 * @author Iris Grießmaier, Viktoria Hohenbichler, Helena Adam, Corinna Greiner
 */
public class Patient {

    private String vorname;
    private String nachname;
    private String geschlecht;
    private String svnr;
    private String notfall;
    private String geburtsdatum;

    public Patient(String vorname, String nachname,String geschlecht, String svnr, String notfall, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.svnr = svnr;
        this.notfall = notfall;
        this.geburtsdatum=geburtsdatum;
    }    
    

    public Patient() {
    }
    
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getSvnr() {
        return svnr;
    }
    
     public String getNotfall(){
        return notfall;
    }
     public String getGeburtsdatum(){
         return geburtsdatum;
     }
    
    
    @Override
    public String toString() {
        return vorname+" "+nachname+" ("+geschlecht+") "+"geboren am " + geburtsdatum;
    }
}
