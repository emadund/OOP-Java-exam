package skijanje.test;

import skijanje.SkiRadnja;
import skijanje.TipSkijanja;
import skijanje.oprema.SkiOprema;
import skijanje.oprema.Skije;

import static skijanje.TipSkijanja.REKREATIVNO;
import static skijanje.TipSkijanja.TAKMICARSKO;

public class ProbaSkiRadnja {
    public static void main(String[] args) {
        SkiRadnja myObj= new SkiRadnja();
        Skije obj2= new Skije();
        Skije obj3= new Skije();
        obj2.setDuzina(175);
        obj2.setMarkaModel("Atomic");
        obj2.setTipSkijanja(REKREATIVNO);
        obj3.setMarkaModel("Rossignol X3M");
        obj3.setDuzina(130);
        obj3.setDatumIzdavanja(2022,12,2);
        myObj.unesi(obj2); myObj.unesi(obj3);
        myObj.izdajOpremu(obj2.getDuzina(),true, TAKMICARSKO);
        myObj.vratiOpremu(obj2.getMarkaModel(), obj2.getDatumIzdavanja());
        obj2.toString();



    }
}
