import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UpperCaseStream {
    private List<String> collection;

    public UpperCaseStream(List<String> collection) {
        this.collection = collection;
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public Map<String, String> upperCaseCollection() {
        return collection.stream()
                .collect(Collectors.toMap(String::toLowerCase, String::toUpperCase));
    }
}
