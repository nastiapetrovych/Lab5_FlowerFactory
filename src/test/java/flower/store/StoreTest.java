package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Flower flower;
    private Store store;

    @BeforeEach
    public void init() {
        flower = new Flower();
        store = new Store();
    }


    @Test
    public void testStore() {
        store.addFlower(new Rose());
        store.addFlower(new Rose());
        store.addFlower(new Tulip());
        Flower wantedFlower = new Rose();
        Assertions.assertEquals("The charming rose is found", Store.search(wantedFlower));
    }
}
