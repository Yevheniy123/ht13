/*
 *
 * Имеется коллекция из Integers, используйте стримы, чтобы посчитать среднее значение всех чисел.
 *
 * */
import java.util.List;

public class StreamAverage {

    private List<Integer> collection;

    public StreamAverage(List<Integer> collection) {
        this.collection = collection;
    }

    public List<Integer> getCollection() {
        return collection;
    }

    public void setCollection(List<Integer> collection) {
        this.collection = collection;
    }

    public double calculateAverageStream() {
        return collection.stream().mapToInt(avg -> avg).average().getAsDouble();
    }
}
