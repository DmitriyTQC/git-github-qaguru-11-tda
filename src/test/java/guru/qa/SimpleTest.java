package guru.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test
    void assetTrue() {
      assertTrue (3 > 1)

    }

    @Test
    void assetFalse() {
        assertFalse(3 < 2);
    }
}
