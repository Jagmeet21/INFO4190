import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortableArrayTest {

    @Test
    public void testSortIntegers() {
        int[] input = {5, 3, 8, 1, 2};
        int[] expected = {1, 2, 3, 5, 8};
        assertArrayEquals(expected, SortableArray.sortIntegers(input));
    }
}
