package skijanje.renta;

import skijanje.TipSkijanja;
import skijanje.oprema.SkiOprema;
import sun.util.calendar.Gregorian;

import java.util.GregorianCalendar;

public interface SkiRenta {
    public SkiOprema izdajOpremu (int duzina, boolean ski, TipSkijanja tipSkijanja);
    public void vratiOpremu (String markaModel, GregorianCalendar datumIzdavanja);
}
