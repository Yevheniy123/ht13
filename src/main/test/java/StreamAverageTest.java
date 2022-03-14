import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class StreamAverageTest {

    private static int counter;
    private double result;
    private final List<Integer> integerListTest = List.of(1, 5, 6, -2);

    @BeforeEach
    void setUp() {
        StreamAverage avg = new StreamAverage(integerListTest);
        result = avg.calculateAverageStream();
    }

    @AfterEach
    void successfulOutput() {
        counter++;
        System.out.println(counter);
    }

    @Test
    void calculateAverageStream() {
        Assertions.assertEquals(2.5, result);
    }

    @Test
    void calculateAverageStreamNegative() {
        Assertions.assertNotEquals(3, result);
    }
}