package skijanje.oprema;

import java.util.GregorianCalendar;

public class Snoubord extends SkiOprema {
    @Override
    public String toString() {
        return "Snoubord:\nMarka i Model: "+getMarkaModel()+"\n"+
                "duzina skija: "+getDuzina()+"\n"+
                "datum izdavanja: "+getDatumIzdavanja().get(GregorianCalendar.DAY_OF_MONTH)+"/"+
                getDatumIzdavanja().get(GregorianCalendar.MONTH+1)+
                getDatumIzdavanja().get(GregorianCalendar.YEAR)+"\n"+
                "tip skijanja: "+getTipSkijanja();
    }
}
