package composite;

import java.util.ArrayList;

public class Category extends ProductCategory {

    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<>();
    }

    @Override
    public void addProduct(ProductCategory productCategory) {
        list.add(productCategory);
    }

    @Override
    public void removeProduct(ProductCategory productCategory) {
        for (ProductCategory tmp: list) {
            if(tmp.getId() == productCategory.getId()) {
                list.remove(tmp);
                return;
            }
        }

        System.out.println("삭제할 상품이 없습니다.");
    }

    @Override
    public int getPrice() {
        int price = 0;
        for(ProductCategory tmp: list) {
            price += tmp.getPrice();
        }
        return price;
    }

    @Override
    public int getCount() {
        int count = 0;
        for(ProductCategory tmp: list) {
            count += tmp.getCount();
        }
        return count;
    }

    @Override
    public String getName() {
        return list.toString();
    }

    @Override
    public int getId() {
        return 0;
    }
}
