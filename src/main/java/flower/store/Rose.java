package flower.store;
import lombok.Getter;

public class Rose extends Flower {
    @Getter
    private String name = "rose";
    @Override
    public  String toString() {
        return "The charming rose is found";
    }
    }

