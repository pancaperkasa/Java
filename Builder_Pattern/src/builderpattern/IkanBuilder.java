package builderpattern;

public class IkanBuilder {
    
    public Ikan preparePaketTawar(){
        Ikan ikan = new  Ikan();
        ikan.addItem(new Oscar());
        ikan.addItem(new  Cupang());
        return ikan;
    }
    
    public Ikan preparePaketLaut(){
        Ikan ikan = new  Ikan();
        ikan.addItem(new Nemo());
        ikan.addItem(new  Pari());
        return ikan;
    }
    
    public Ikan preparePaketMix(){
        Ikan ikan = new  Ikan();
        ikan.addItem(new Arwana());
        ikan.addItem(new  Hiu());
        return ikan;
    }
}
