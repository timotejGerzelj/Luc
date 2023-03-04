public class RocnaSvetilka extends Luc {
    private boolean vodoodporna;

    public RocnaSvetilka(String barvaZarnice, boolean elektrika, int volti, boolean vodoodporna) throws Exception {

        super(barvaZarnice, elektrika, volti);
        if (volti < 0 || volti > 160) {
            throw new Exception("Teh številk ni možno nastaviti");
        }
        this.vodoodporna = vodoodporna;
    }

    public void potopZRocnoSvetilko() throws Exception {
        if (this.vodoodporna == true){
            System.out.println("Rocna svetilka je vodoodporna, zato lahko nadaljujete z uporabo.");
        }
        else {
            throw new Exception("Rocna svetilka ni vodoodporna, zato uporaba pod vodo ni dovoljena!");
        }
    }
    public boolean getVodoodporna() {
        return vodoodporna;
    }
}