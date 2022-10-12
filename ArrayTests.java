import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlaceBug() {
    int[] input1 = {3, 5, 7};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7, 5, 3}, input1);
	}

  @Test
  public void testReversedBug() {
    int[] input1 = {2, 4, 6};
    assertArrayEquals(new int[]{6, 4, 2}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWOLowest() {
    double[] input1 = {2.0, 4.0, 6.0};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAverageWOLowest2() {
    double[] input1 = {2.0, 4.0, 2.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
