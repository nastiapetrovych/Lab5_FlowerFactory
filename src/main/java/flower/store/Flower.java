package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    @Getter @Setter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}