package skijanje;

import skijanje.oprema.SkiOprema;
import skijanje.renta.SkiRenta;
import skijanje.TipSkijanja;
import sun.util.calendar.Gregorian;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SkiRadnja implements SkiRenta {
    private ArrayList<SkiOprema> skiOprema= new ArrayList<SkiOprema>();

    public void unesi (SkiOprema x) throws NullPointerException {
        if (x != null)
            skiOprema.add(0, x);
        else throw new NullPointerException();
    }

        public SkiOprema izdajOpremu (int duzina, boolean ski, TipSkijanja tipSkijanja) {
        SkiOprema temp = null;

            for (int i=0; i<skiOprema.size(); i++) {
        if (skiOprema.get(i).getDatumIzdavanja()==null &&
                skiOprema.get(i).getDuzina()==duzina && ski &&
                skiOprema.get(i).getTipSkijanja().equals(tipSkijanja)) {
        temp.setMarkaModel(skiOprema.get(i).getMarkaModel());
        temp.setDuzina(skiOprema.get(i).getDuzina());
        temp.setTipSkijanja(skiOprema.get(i).getTipSkijanja());
        temp.setDatumIzdavanja(GregorianCalendar.YEAR, GregorianCalendar.MONTH, GregorianCalendar.DAY_OF_MONTH);

            }

        }
        return temp;
    }
    public void vratiOpremu (String markaModel, GregorianCalendar datumIzdavanja) {
        double s=0;
        boolean ski=true;
        int y=GregorianCalendar.YEAR-datumIzdavanja.get(GregorianCalendar.YEAR);
        int d=GregorianCalendar.DAY_OF_YEAR-datumIzdavanja.get(GregorianCalendar.DAY_OF_YEAR);
        for (SkiOprema a:skiOprema) {
            if (a.getMarkaModel().equals(markaModel)&&a.getDatumIzdavanja().equals(datumIzdavanja)) {
                if (ski) s=2000*(365*y+d);
            else s=1000*(365*y+d); }
        }
        try {
            FileWriter fw= new FileWriter("racun.txt");
            BufferedWriter br = new BufferedWriter(fw);
            PrintWriter pr = new PrintWriter(br);
            pr.println(s);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
           }
}
