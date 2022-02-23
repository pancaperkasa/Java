package builderpattern;

public abstract class IkanHiasLaut implements Item{
    @Override
    public Lingkungan lingkungan(){
        return new AirLaut();
}
    @Override
    public  Makanan makanan(){
        return  new Pelet();
    
}
    
    @Override
    public abstract float harga();
 
}
