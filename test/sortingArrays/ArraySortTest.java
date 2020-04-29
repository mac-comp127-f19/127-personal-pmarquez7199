package sortingArrays;

import org.junit.Test;

import static sortingArrays.ArraySort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray(){
        assertArrayEquals(
                new String[]{},
                sort(new String[]{})
        );
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(
                new String[]{null},
                sort(null)
        );
    }

    @Test
    public void testTwoElements(){
        assertArrayEquals(new String[]{"three","one"},
                sort(new String[]{"one","three"})
        );
    }

    @Test
    public void testThreeElements() {
        assertArrayEquals(new String[]{"three","one","two"},
                sort(new String[]{"one","two","three"})
        );

    }

    @Test
    public void testCaseSorting(){

    }

}
