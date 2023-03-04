public class Reflektor extends Luc {
    private int kotOsvetlitve;

    public Reflektor(String barvaZarnice, boolean elektrika, int volti, int kotOsvetlitve) throws Exception {
        super(barvaZarnice, elektrika, volti);
        if (volti < 0 || volti > 160) {
            throw new Exception("Teh številk ni možno nastaviti");
        }
        this.kotOsvetlitve = kotOsvetlitve;

    }

    public void premakniOsvetlitev(int novKot) throws Exception{
        if (getElektrika() != false){
            if (novKot <= -1 || novKot >= 361) {
                throw new Exception("Teh številk ni možno nastaviti!");

            }
            else if (novKot == getKotOsvetlitve()){
                System.out.println("Izbrali ste enako vrednost kot jo imamo že nastavljeno!");
            }
            else{
                this.kotOsvetlitve = novKot;
                System.out.println("Osvetlitev reflektorja je nastavljena na " + novKot + " stopinj!");
            }
        }
        else {
           throw new Exception("Nič se ni spremenilo ker je reflektor ugasnjen!");
        }
    }
    public int getKotOsvetlitve() {
        return kotOsvetlitve;
    }
}




