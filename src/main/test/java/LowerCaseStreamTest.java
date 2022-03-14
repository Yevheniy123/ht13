import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class LowerCaseStreamTest {

    private static int counter;
    private LowerCaseStream lowerCollection;
    private List<String> stringList = List.of("hellO", "oppo", "Good", "ProS", "cons");

    @BeforeEach
    void setUp() {
        this.lowerCollection = new LowerCaseStream(stringList);
    }

    @AfterEach
    void successfulOutput() {
        counter++;
        System.out.println(counter ");
    }

    @Test
    void lowerCaseString() {
        List<String> result = List.of("oppo", "cons");
        List<String> testCollection = lowerCollection.lowerCaseString();
        Assertions.assertEquals(result, testCollection);
    }

    @Test
    void lowerCaseStringNegative() {
        List<String> result = List.of("oppo", "cons", "Good");
        List<String> testCollection = lowerCollection.lowerCaseString();
        Assertions.assertNotEquals(result, testCollection);
    }
}