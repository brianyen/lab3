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
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversedNonZero() {
    int[] input1 = {4, 5, 9};
    assertArrayEquals(new int[] {9, 5, 4}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReverseInPlaceLonger() {
    int[] input1 = {5, 9, 19, 4, 2};
    int[] input2 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] {2, 4, 19, 9, 5}, input1);
    assertArrayEquals(new int[] {4, 3, 2, 1}, input2);
  }
}
