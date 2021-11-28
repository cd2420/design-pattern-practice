package prototype;

public class PrototypeTest {

    public static void main(String[] args) {
        ShoppingBag shoppingBag1 = new ShoppingBag();

        shoppingBag1.addItem(new Item("사과"));
        shoppingBag1.addItem(new Item("사과1"));
        shoppingBag1.addItem(new Item("사과2"));

        ShoppingBag shoppingBag2 = shoppingBag1.clone();

        System.out.println(shoppingBag1);
        System.out.println(shoppingBag2);

        shoppingBag1.getItemList().get(0).setName("바나나");
        System.out.println(shoppingBag1);
        System.out.println(shoppingBag2);

        shoppingBag2.getItemList().get(0).setName("딸기");
        System.out.println(shoppingBag1);
        System.out.println(shoppingBag2);
    }
}
