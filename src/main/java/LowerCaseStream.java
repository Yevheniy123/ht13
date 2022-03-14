import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseStream {
    private List<String> collection;

    public LowerCaseStream() {
        this.collection = null;
    }

    public LowerCaseStream(List<String> collection) {
        this.collection = collection;
    }

    public List<String> getCollection() {
        return collection;
    }

    public void setCollection(List<String> collection) {
        this.collection = collection;
    }

    public List<String> lowerCaseString() {
        this.collection = collection.stream()
                        .filter(str -> str.equals(str.toLowerCase()))
                        .filter(str -> str.length() == 4)
                        .collect(Collectors.toList());

        return collection;
    }
}
