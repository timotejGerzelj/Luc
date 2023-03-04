import javax.swing.table.*;


public class RazstavaLuciTableModel extends DefaultTableModel {
    public RazstavaLuciTableModel() {
        super();
        addColumn("Barva Zarnice");
        addColumn("Elektrika");
        addColumn("Volti");
        Object[] vrsticaLuc = new Object[] {"Barva Zarnice", "Elektrika", "Volti"};

        addRow(vrsticaLuc);
    }



    public void addLuc(Luc l) {
        Object[] vrstica = new Object[] {l.getBarvaZarnice(), l.getElektrika(), l.getVolti()};
        addRow(vrstica);

    }

}