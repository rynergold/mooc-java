package part01.s02printing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This file demonstrates how incredibly simple testing is when we 
 * aren't dealing with System.out printing! 
 * 
 * Notice there are no "buckets", no streams, and no @BeforeEach 
 * or @AfterEach teardowns.
 */
class MathExampleTest {

    @Test
    public void testAddition() {
        // 1. Trigger the method
        int result = MathExample.add(2, 3);
        
        // 2. Assert the result
        // assertEquals(expected, actual)
        assertEquals(5, result, "2 + 3 should equal 5");
    }
}
