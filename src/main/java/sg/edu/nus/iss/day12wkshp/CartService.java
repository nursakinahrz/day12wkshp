package sg.edu.nus.iss.day12wkshp;

import java.util.List;
import java.util.ArrayList;

public class CartService {
    
    public List<Item> getShoppingItems() {

        List<Item> listItems = new ArrayList<>();

        Item itm = new Item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("Macbook Pro");
        itm.setQuantity(10);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantity(2);
        listItems.add(itm);

        itm = new Item();
        itm.setItemName("LV Tot Bag");
        itm.setQuantity(8);
        listItems.add(itm);

        return listItems;

        
    }
}
