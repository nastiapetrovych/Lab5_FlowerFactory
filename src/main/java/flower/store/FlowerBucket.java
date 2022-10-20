package flower.store;

import java.util.LinkedList;
import java.util.List;

public class FlowerBucket {
    private int price = 0;
    private  FlowerPack initializer;
    List<Object> flowers = new LinkedList<Object>();
    public void add(FlowerPack flowerPack) {
        initializer = flowerPack;
        flowers.add(initializer);

    }

    public int getPrice() {
        price += (initializer.getPrice() * initializer.getQuantity());

        return price;

    }
}
