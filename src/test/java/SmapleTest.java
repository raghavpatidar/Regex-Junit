import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * SmapleTest
 */
public class SmapleTest {

    @ParameterizedTest
    @ValueSource(strings = { "World" })
    public void addTest(String str) {
        assertEquals("World", str);
    }
}