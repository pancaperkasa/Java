package builderpattern;

public abstract class IkanHiasTawar implements Item{
    @Override
    public Lingkungan lingkungan(){
        return new AirTawar();
}
    @Override
    public  Makanan makanan(){
        return  new Pelet();
    
}
    
    @Override
    public abstract float harga();
 
}
