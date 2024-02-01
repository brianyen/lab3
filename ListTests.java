import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

class StringMatcher implements StringChecker {
    String match;

    public StringMatcher(String match) {
        this.match = match;
    }

    public boolean checkString(String s) {
        return s.contains(match);
    }
}

public class ListTests {
	@Test 
    public void testFilter() {
        StringChecker checker = new StringMatcher("he");
        List<String> strInput = new ArrayList<>();
        List<String> strInput2 = new ArrayList<>();
        strInput.add("hello");
        strInput.add("world");
        strInput.add("helloo");
        strInput2.add("hello");
        strInput2.add("helloo");
        List<String> output = ListExamples.filter(strInput, checker);
        assertEquals(output, strInput2);
    }

    @Test
    public void testMerge() {
        List<String> strInput1 = new ArrayList<>();
        List<String> strInput2 = new ArrayList<>();

        strInput2.add("string!");

        assertEquals(strInput2, ListExamples.merge(strInput1, strInput2));
    }
}
