package Model;

public class Privat extends Flugzeuge{

    String _typ;




    public Privat(String typ, String airline, String flugzeugnummer){
        super(flugzeugnummer, airline);
        setTyp(typ);
    }

    public String prepareStart(){
        return "Cock";
    }


    public void setTyp(String _typ) {
        this._typ = _typ;
    }

    public String getTyp() {
        return _typ;
    }

    
}
