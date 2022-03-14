import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UpperCaseStreamTest {

    private static int counter;
    private UpperCaseStream upperCollection;
    private Map<String, String> testMapUpperCollection;
    private List<String> testList = List.of("one", "tWo", "Three", "FOUR");

    @BeforeEach
    void setUp() {
        this.upperCollection = new UpperCaseStream(testList);
        this.testMapUpperCollection = new HashMap<>();

        testMapUpperCollection.put("one", "ONE");
        testMapUpperCollection.put("two", "TWO");
        testMapUpperCollection.put("three", "THREE");
        testMapUpperCollection.put("four", "FOUR");
    }

    @AfterEach
    void successfulOutput() {
        counter++;
        System.out.println(counter );
    }


    @Test
    void upperCaseCollection() {
        Map<String, String> mapUpperCollection = upperCollection.upperCaseCollection();
        Assertions.assertEquals(testMapUpperCollection, mapUpperCollection);
    }

    @Test
    void upperCaseCollectionNegative() {
        Map<String, String> mapUpperCollection = upperCollection.upperCaseCollection();
        testMapUpperCollection.put("five", "FIVE");

        Assertions.assertNotEquals(testMapUpperCollection, mapUpperCollection);
    }
}