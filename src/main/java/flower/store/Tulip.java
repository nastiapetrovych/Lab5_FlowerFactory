package flower.store;
import lombok.Getter;

public class Tulip extends Flower{
    @Getter
    private String name = "tulip";
    @Override
    public  String toString() {
        return "The charming tulip is found";
    }
}
