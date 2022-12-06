package skijanje.oprema;

import skijanje.TipSkijanja;

import java.util.GregorianCalendar;

public abstract class SkiOprema {
    private String markaModel;
    private int duzina;
    private TipSkijanja tipSkijanja;
    private GregorianCalendar datumIzdavanja;

    public String getMarkaModel() {
        return markaModel;
    }

    public void setMarkaModel(String markaModel) throws RuntimeException {
        if (markaModel!=null || markaModel.length()>2)
        this.markaModel = markaModel;
        else throw new RuntimeException();
    }

    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public TipSkijanja getTipSkijanja() {
        return tipSkijanja;
    }

    public void setTipSkijanja(TipSkijanja tipSkijanja) {
        System.out.println("Allowed values are only REKREATIVNO or TRENING or TAKMICARSKO");
        this.tipSkijanja = tipSkijanja;
    }

    public GregorianCalendar getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(int year, int month, int day) throws RuntimeException {
        System.out.println("For a date enter in format: y/m/d");
        datumIzdavanja.set(year, month-1, day);
        if (datumIzdavanja.after(new GregorianCalendar())||datumIzdavanja.equals(null))
            throw new RuntimeException();
    }
}
