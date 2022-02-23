package builderpattern;

public abstract class IkanPredatorLaut implements Item{
    @Override
    public Lingkungan lingkungan(){
        return new AirLaut();
}
    @Override
    public  Makanan makanan(){
        return  new AnakIkan();
    
}
    
    @Override
    public abstract float harga();
 
}
