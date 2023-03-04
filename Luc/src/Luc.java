/*
    Ime datoteke: Luc.java
    Avtor: Timotej Gerželj
    Vhodni podatki: /
    Opis:
    Izhodni podatki: 

*/

public class Luc implements ZatemnitevOsvetlitev {
    private String barvaZarnice;
    private boolean elektrika;
    private int volti;

    public Luc(String barvaZarnice, boolean elektrika, int volti) throws Exception {
        this.barvaZarnice = barvaZarnice;
        this.elektrika = elektrika;
        this.volti = volti;
        if (volti < 0 || volti > 160) {
            throw new Exception("Teh številk ni možno nastaviti");
        }
    }

    public void pritisniStikalo() {
        if (this.elektrika == true){
            this.elektrika = false;
            System.out.println("Luč ugasnimo!");
        }
        else {
            this.elektrika = true;
            System.out.println("Luč je prižgana!");
        }
    }

    public void spremeniVolte(int volt) throws Exception {
        if (this.elektrika != false){
            if (!(volt <= -1) && !(volt >= 161)){
                this.volti = volt;
                if (volti  == 0){
                    System.out.println("Soba je popolnoma temna!");
                }
                else if (volti <= 80 ){
                    System.out.println("Soba je rahlo ostvetljena.");
                }
                else if (volti > 80 && volti < 110){
                    System.out.println("Soba je relativno normalno ostvetljena.");
        
                }
                else if (volti >= 110 && volti <= 160){
                    System.out.println("SLEPI!!!!");
                }
            }
            else {
                throw new Exception("Teh številk ni možno nastaviti");
            }
        }
        else {
            throw new Exception("Nič se ni spremenilo ker je žarnica ugašena!!!!");
        }
    }

    public void zamenjajZarnico(String novaBarva) {
        if (elektrika) {
            this.barvaZarnice = novaBarva;
            System.out.println("Zamenjali smo žarnico! Zdaj je barva žarnice in svetlobe barve: " + novaBarva + ".");
        } else {
            this.barvaZarnice = novaBarva;
            System.out.println("Zamenjali smo žarnico!: Vendar je soba ravnokar temna ker luč ni prižgana!.");
        }
    }
    @Override
    public String toString() {
        return "[barvaZarnice: " + this.barvaZarnice + ", elektrika: " + this.elektrika + ", volti: " + this.volti + "]";
    }
    @Override
    public void zatemni() throws Exception {
        if(this.elektrika == true){    

        if( this.volti == 0) {
            System.out.println("Soba je popolnoma temna!");

        }
        else if (this.volti <= 80) {
            this.volti = 0;
            System.out.println("Soba je popolnoma temna!");

        }   
        else if (this.volti > 80 && this.volti < 110) {
            this.volti = 80;
            System.out.println("Soba je rahlo ostvetljena.");

        }
        else if (volti >= 110 && volti <= 160){
            this.volti = 109;
            System.out.println("Soba je relativno normalno ostvetljena.");
        
        }
        }
        else {
            throw new Exception("Nič se ni spremenilo ker je žarnica ugašena!!!!");
        }
    }

    @Override
    public void osvetli() throws Exception {
    if(this.elektrika == true){    
        if( this.volti == 0) {
            this.volti = 80;
            System.out.println("Soba je rahlo ostvetljena!");

        }
        else if (this.volti <= 80) {
            this.volti = 109;
            System.out.println("Soba je relativno normalno ostvetljena");

        }   
        else if (volti > 80 && volti < 110) {
            this.volti = 120;
            System.out.println("SLEPI!!!");

        }
        else {
            System.out.println("SLEPI!!!");

        }
    }
    else {
        throw new Exception("Nič se ni spremenilo ker je žarnica ugašena!!!!");

    }
    }
    public String getBarvaZarnice() {
        return barvaZarnice;
    }
    public int getVolti() {
        return volti;
    }
    public boolean getElektrika() {
        return elektrika;
    }
}



interface ZatemnitevOsvetlitev {
    public void zatemni() throws Exception;
    public void osvetli() throws Exception;
}
