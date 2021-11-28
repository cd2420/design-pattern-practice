package prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBag implements Cloneable {

    private List<Item> itemList;

    public ShoppingBag() {
        this.itemList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    protected ShoppingBag clone() {
        ShoppingBag newShoppingBag = new ShoppingBag();
        for(Item item: itemList){
            newShoppingBag.addItem(new Item(item.getName()));
        }
        return newShoppingBag;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "ShoppingBag{" +
                "itemList=" + itemList +
                '}';
    }
}
