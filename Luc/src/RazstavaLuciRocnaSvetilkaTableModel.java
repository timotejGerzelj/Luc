import javax.swing.table.*;


public class RazstavaLuciRocnaSvetilkaTableModel extends DefaultTableModel {
    public RazstavaLuciRocnaSvetilkaTableModel() {
        super();
        addColumn("Barva Zarnice");
        addColumn("Elektrika");
        addColumn("Volti");
        addColumn("Vodoodporna");
        Object[] vrsticaLuc = new Object[] {"Barva Zarnice", "Elektrika", "Volti", "Vodoodporna"};

        addRow(vrsticaLuc);
    }



    public void addRS(RocnaSvetilka rs) {
        Object[] vrstica = new Object[] {rs.getBarvaZarnice(), rs.getElektrika(), rs.getVolti(), rs.getVodoodporna()};
        addRow(vrstica);

    }

}