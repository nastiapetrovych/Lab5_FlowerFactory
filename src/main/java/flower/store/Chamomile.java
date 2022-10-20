package flower.store;
import lombok.Getter;

public class Chamomile extends Flower {
    @Getter
    public String name = "chamomile";
    @Override
    public  String toString() {
        return "The charming chamomile is found";
    }
}
