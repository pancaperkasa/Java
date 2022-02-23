package builderpattern;

import java.util.ArrayList;
import java.util.List;

public class Ikan {
    private List<Item> items = new ArrayList<Item>();
    
    public void addItem(Item item){
        items.add(item);
    }
    
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items){
            cost += item.harga();
        }
        return cost;
    }
    
    public void showItems(){
        for(Item item : items){
            System.out.print("Item : " + item.nama());
            System.out.print(", Lingkungan : " + item.lingkungan().alam());
            System.out.print(", Harga : " + item.harga());
            System.out.println(", Makanan : " + item.makanan().Makanan());
        }
    }
    
    
}
