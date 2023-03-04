import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class TestiranjeLuci {
    private static BufferedReader in;

    public static void main(String[] args) {
        List<Luc> svetilke = new ArrayList<>();

     /*   in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Enter the properties of the Luc, or press Enter to finish:");
                System.out.print("Barva žarnice: ");
                String barvaZarnice = in.readLine();

            if (barvaZarnice.isEmpty()) {
                break;
            }

                System.out.print("Elektrika (true/false): ");
                boolean elektrika = Boolean.parseBoolean(in.readLine());

                System.out.print("Volti (0-160): ");
                int volti = Integer.parseInt(in.readLine());

                Luc luc = new Luc(barvaZarnice, elektrika, volti);
                svetilke.add(luc);
        } catch (Exception e) {
            System.out.println("Napaka pri ustvarjanju luci: " + e.getMessage());
        }
    }
    }*/
    try {
    Luc luc = new Luc("modra", false, 160);
    luc.osvetli();
    luc.zatemni();
    luc.zatemni();
    luc.zatemni();
    luc.zatemni();
    luc.zatemni();
    luc.osvetli();
    luc.osvetli();
    luc.osvetli();
    luc.osvetli();
    }
    catch (Exception e){
        System.out.println(e);
    }

}
}
