import javax.swing.table.*;


public class RazstavaLuciReflektorTableModel extends DefaultTableModel {
    public RazstavaLuciReflektorTableModel() {
        super();
        addColumn("Barva Zarnice");
        addColumn("Elektrika");
        addColumn("Volti");
        addColumn("Kot osvetlitve");
        Object[] vrsticaReflektor = new Object[] {"Barva Zarnice", "Elektrika", "Volti", "Kot Osvetlitve"};
        addRow(vrsticaReflektor);
    }
    public void addReflektor(Reflektor r){
        Object[] vrsta = new Object[] {r.getBarvaZarnice(), r.getElektrika(), r.getVolti(), r.getKotOsvetlitve() };
        addRow(vrsta);
    }
}