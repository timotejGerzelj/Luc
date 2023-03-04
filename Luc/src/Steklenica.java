/*
    Ime datoteke: Steklenica.java
    Avtor: Timotej Gerželj
    Vhodni parametri; Kapaciteta steklenice
    Vhodni podatki:  /
    Opis:            
    Izhodni podatki: Hello World

*/

public class Steklenica {
    private int kolicinaVsebine;
    private String vrstaVsebine;
    private boolean jeOdprta;
    private int kapaciteta;
    public static final String material = "Steklo";
    public Steklenica(int k){
        kolicinaVsebine = 0;
        vrstaVsebine = "";
        jeOdprta = false;
        kapaciteta = k;
        System.out.println("Ustvarjam nov objekt tipa steklenica s kapaciteto " + k);
    }

    public int napolni(int k, String v) throws Exception {
        System.out.println("Steklenico polnim z " + v);
        System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
    if(jeOdprta){
        kolicinaVsebine = kolicinaVsebine + k;
        vrstaVsebine = vrstaVsebine + v;

        System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
    }
    else {
        throw new Exception("Steklenica je zaprta");
    }
            return kolicinaVsebine;

    }
    public boolean odpri() {
        System.out.println("Odpiram steklenico ...");
        if(jeOdprta){
            return false;
        }
        else {
            jeOdprta = true;
            return true;
        }
    }

    public boolean zapri() {
        System.out.println("Zapiram steklenico ...");
        if(!jeOdprta){
            return false;
        }
        else {
            jeOdprta = false;
            return true;
        }
    }
    public int getKolicinaVsebine() {
        return kolicinaVsebine;
    }

}