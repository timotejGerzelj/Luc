import javax.swing.*;
import java.awt.event.*;

public class RazstavaLuci extends JFrame implements ActionListener {
    private JPanel razstava, lucPanel, reflektorPanel, rSPanel;
    private JButton dodajLucButton, dodajReflektorButton, dodajRSButton;
    private JTextField lucBarvaZarniceField, lucElektrikaField, lucVoltiField;
    private JTextField reflektorBarvaZarniceField, reflektorElektrikaField, reflektorVoltiField, reflektorKotOsvetlitveField;
    private JTextField rSBarvaZarniceField, rSElektrikaField, rSVoltiField, rSVodoodporna;
    private JTable tabelaLuc, tabelaReflektor, tabelaRS;
    private RazstavaLuciTableModel modelTabele = new RazstavaLuciTableModel();
    private RazstavaLuciReflektorTableModel modelTabeleReflektor = new RazstavaLuciReflektorTableModel();
    private RazstavaLuciRocnaSvetilkaTableModel modelTabeleRS = new RazstavaLuciRocnaSvetilkaTableModel();

    public static void main(String[] args) {
        RazstavaLuci m = new RazstavaLuci("Razstava Luci");
    }

    public RazstavaLuci(String n) {
        super(n);

        razstava = new JPanel();
        lucPanel = new JPanel();
        reflektorPanel = new JPanel();
        rSPanel = new JPanel();
        
        dodajLucButton = new JButton("Dodaj Luc");
        dodajReflektorButton = new JButton("Dodaj Reflektor");
        dodajRSButton = new JButton("Dodaj Rocno Svetilko");

        lucBarvaZarniceField = new JTextField(10);
        lucElektrikaField = new JTextField(8);
        lucVoltiField = new JTextField(8);

        reflektorBarvaZarniceField = new JTextField(10);
        reflektorElektrikaField = new JTextField(8);
        reflektorVoltiField = new JTextField(8);
        reflektorKotOsvetlitveField = new JTextField(8);

        rSBarvaZarniceField = new JTextField(10);
        rSElektrikaField = new JTextField(8);
        rSVoltiField = new JTextField(8);
        rSVodoodporna = new JTextField(8);

        tabelaLuc = new JTable(modelTabele);
        tabelaReflektor = new JTable(modelTabeleReflektor);
        tabelaRS = new JTable(modelTabeleRS);

        dodajLucButton.addActionListener(this);
        dodajReflektorButton.addActionListener(this);
        dodajRSButton.addActionListener(this);

        lucPanel.add(new JLabel("Barva Zarnice"));
        lucPanel.add(lucBarvaZarniceField);
        lucPanel.add(new JLabel("Je elektrika vžgana? true/false"));
        lucPanel.add(lucElektrikaField);
        lucPanel.add(new JLabel("Volti"));
        lucPanel.add(lucVoltiField);
        lucPanel.add(dodajLucButton);
        lucPanel.add(new JLabel("Luci:"));
        lucPanel.add(tabelaLuc);


        reflektorPanel.add(new JLabel("Barva Zarnice"));
        reflektorPanel.add(reflektorBarvaZarniceField);
        reflektorPanel.add(new JLabel("Je elektrika vžgana? true/false"));
        reflektorPanel.add(reflektorElektrikaField);
        reflektorPanel.add(new JLabel("Volti"));
        reflektorPanel.add(reflektorVoltiField);
        reflektorPanel.add(new JLabel("Kot Osvetlitve"));
        reflektorPanel.add(reflektorKotOsvetlitveField);
        reflektorPanel.add(dodajReflektorButton);
        reflektorPanel.add(new JLabel("Reflektor:"));
        reflektorPanel.add(tabelaReflektor);

        rSPanel.add(new JLabel("Barva Zarnice"));
        rSPanel.add(rSBarvaZarniceField);
        rSPanel.add(new JLabel("Je elektrika vžgana? true/false"));
        rSPanel.add(rSElektrikaField);
        rSPanel.add(new JLabel("Volti"));
        rSPanel.add(rSVoltiField);
        rSPanel.add(new JLabel("Je svetilka vodoodporna? true/false"));
        rSPanel.add(rSVodoodporna);
        rSPanel.add(dodajRSButton);
        rSPanel.add(new JLabel("Reflektor:"));
        rSPanel.add(tabelaRS);


        razstava.add(lucPanel);
        razstava.add(reflektorPanel);
        razstava.add(rSPanel);

        add(razstava);
        setVisible(true);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Ustvarjam objekt RazstavaLuci");
    }
    public void actionPerformed(ActionEvent e) {

        //double d = Double.parseDouble(barvaZarniceField.getText());
        //PivskaSteklenica flasa = new PivskaSteklenica(barvaZarniceField.getText(), 500, Double.parseDouble(barvaZarniceField.getText()););
        if (e.getSource() == dodajLucButton) {

        try {
        System.out.println("Dodajam Luc...");
        System.out.println("Barva je " + lucBarvaZarniceField.getText());
        System.out.println("Volt elektrike je " + lucVoltiField.getText());
        modelTabele.addLuc(new Luc(lucBarvaZarniceField.getText(), Boolean.parseBoolean(lucElektrikaField.getText()), Integer.parseInt(lucVoltiField.getText())));
        }
        catch(Exception ev) {
            System.out.println(ev);
        }}
        else if (e.getSource() == dodajReflektorButton) {
            System.out.println("Dodajam Reflektor...");
            System.out.println("Barva je " + reflektorBarvaZarniceField.getText());
            System.out.println("Volt elektrike je " + reflektorElektrikaField.getText());
            System.out.println("Kot osvetlitve je " + reflektorKotOsvetlitveField.getText());
            try {
            System.out.println(modelTabeleReflektor);
            modelTabeleReflektor.addReflektor(new Reflektor(reflektorBarvaZarniceField.getText(), Boolean.parseBoolean(reflektorElektrikaField.getText()), Integer.parseInt(reflektorVoltiField.getText()), Integer.parseInt(reflektorKotOsvetlitveField.getText())));
            }
            catch(Exception ev) {
                System.out.println(ev);
            }


         }
         else {
            System.out.println("Dodajam Rocno Svetilko...");
            System.out.println("Barva je " + rSBarvaZarniceField.getText());
            System.out.println("Volt elektrike je " + rSVoltiField.getText());
            System.out.println("Vodoodpornost svetilke je " + rSVodoodporna.getText());
            try {
            System.out.println(modelTabeleRS);
            modelTabeleRS.addRS(new RocnaSvetilka(rSBarvaZarniceField.getText(), Boolean.parseBoolean(rSElektrikaField.getText()), Integer.parseInt(rSVoltiField.getText()), Boolean.parseBoolean(rSVodoodporna.getText())));
            }
            catch(Exception ev) {
                System.out.println(ev);
            }


         }

    }

}