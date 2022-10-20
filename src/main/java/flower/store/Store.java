package flower.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Store{
    @Getter
    static
    Map<Object, Integer> catalog = new HashMap<Object, Integer>();

    public void addFlower(Flower flower){
        if (catalog.containsKey(flower.getFlowerType())){
            catalog.put((flower.getFlowerType()), catalog.get(flower.getFlowerType()) + 1);
        }
        else{
            catalog.put((flower.getFlowerType()), 1);
        }
    }
    public static String search(Flower flower) {
        if ((catalog.get(flower.getFlowerType()) > 0)) {
            catalog.put((flower.getFlowerType()), catalog.get(flower.getFlowerType()) - 1);
             return flower.toString();
        }
        else{
            return "Not found";
        }
    }
}
