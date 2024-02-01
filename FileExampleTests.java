import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.junit.*;
public class FileExampleTests {
    @Test
    public void theOnlyTest() throws IOException {
        File inputFile = new File("some-files/");
        List<File> expectedList = new ArrayList<>();
        expectedList.add(new File("some-files/more-files/b.txt"));
        expectedList.add(new File("some-files/a.txt"));
        assertEquals(expectedList, FileExample.getFiles(inputFile));
    }
}
