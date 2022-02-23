package builderpattern;

public abstract class IkanPredatorTawar implements Item{
    @Override
    public Lingkungan lingkungan(){
        return new AirTawar();
}
    @Override
    public  Makanan makanan(){
        return  new AnakIkan();
    
}
    
    @Override
    public abstract float harga();
 
}
