import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MagicBox<T> {
    protected int maxValue;
    private List<T> values = new ArrayList<>();

    public MagicBox(int maxValue) {
        this.maxValue = maxValue;
    }

    public boolean add(T item) {
        if (maxValue <= values.size()) {
            return false;
        }
        values.add(item);
        return true;
    }

    public T pick() {
        if (maxValue == values.size()) {
            Random random = new Random();
            int randomInt = random.nextInt(maxValue);
            return values.get(randomInt);
        } else {
            throw new RuntimeException("Коробка не полна, осталось еще " + (maxValue - values.size()) + " ячейки!");
        }
    }
}
