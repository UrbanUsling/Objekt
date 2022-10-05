package Inlämning1;


import java.text.DecimalFormat;

public class KöttVäxt extends LängdBeroende{
    /*Implementerar Längdberoende och är växt samtidigt. HÄR kapslas allt relevant in för denna specifika
    växttyp. Variablerna kan bara definieras här.  Definitionen static ska användas sparsamt.
    Den ärver metoder som en växt behöver, dock definieras kroppen här inne för denna typ.
    Den kommunicerar med VattenTyper för att få rätt enum av vätska
     */
    private String namn;
    private double längd;
    private double vattenmängd;
    //3 skyddade variabler
    DecimalFormat df = new DecimalFormat("###.##");//klass för att begränsa decimaler
    public KöttVäxt(String namn, double längd){//2 av variablerna initieras vid konstruktoranrop som parametrar
        this.namn=namn;
        this.längd = längd;
        setVattenmängd(längd);//metodanrop som ger objektet rätt vattenmängd
    }
    @Override//är denna metod som körs vid anrop och inte en i superklass
    public String getDos() {//String som skriver ut beräknad vattenmängd av rätt vattentyp. Anrop av emun
        return df.format(vattenmängd) + " liter "+ VattenTyper.PRT.getString();
    }

    @Override
    public String getNamn() {
        return this.namn.toLowerCase();
    }
    //Metod med kropp för att få ut namnet på objekt i små bokstäver för jämförelser
    public double getLängd(){return längd;}

    public double getVattenmängd(){return vattenmängd;}//Dessa två metoder finns för testkörning
    @Override
    void setVattenmängd(double längd) {
        this.vattenmängd = 0.1 + (0.2 * längd);
    }//Superklassen ser till att vi måste definiera denna metod här. Garant för att vattenmängden får värde
}

