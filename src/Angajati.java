public class Angajati {
    public String angNume = "Implicit";
    public String tarifOrar = "";
    public String oreLucrate = "";
    public String avansSalariu = "";

    public Angajati(){}
    public Angajati(String angNume,String tarifOrar,String oreLucrate,String avansSalariu){
        if (!angNume.equals(""))
            this.angNume=angNume;


        this.tarifOrar=tarifOrar;
        this.oreLucrate=oreLucrate;
        this.avansSalariu=avansSalariu;
    }

    public void setNume(){
        this.angNume=angNume;
    }
    public String getNume(){
        return angNume;
    }
    public void setTarif(){
        this.tarifOrar=tarifOrar;
    }
    public String getTarif(){
        return tarifOrar;
    }
    public void setOre(){
        this.oreLucrate=oreLucrate;
    }
    public String getOre(){
        return oreLucrate;
    }
    public void setAvans(){
        this.avansSalariu=avansSalariu;
    }
    public String getAvans(){
        return avansSalariu;
    }
    public String toString(){
        return ("Nume:"+ angNume+ " Tarif:"+tarifOrar+" Ore lucrate"+ oreLucrate+ " Avans salariu:"+ avansSalariu);
    }
}
