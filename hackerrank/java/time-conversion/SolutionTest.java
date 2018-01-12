import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Rule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class SolutionTest {

    @Rule
    public final SystemOutRule stdOutLog = new SystemOutRule().enableLog();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void firstTest() throws IOException {

        String input = "";
        try (Stream<String> linesIn = java.nio.file.Files.lines(Paths.get("input/input00.txt"))) {
            input = linesIn.collect(Collectors.joining("\n"));
        }
        String expected = "";
        try (Stream<String> linesOut = java.nio.file.Files.lines(Paths.get("output/output00.txt"))) {
            expected= linesOut.collect(Collectors.joining("\n"));
        }

        systemInMock.provideLines(input);

        Solution.main(new String[]{});

        assertThat(stdOutLog.getLog(), is(expected + "\n"));
    }

    @Test
    public void midnightAMTest() throws IOException {
      String input = "12:00:00AM";
      String expected = "00:00:00";
      Assert.assertEquals(Solution.timeConversion(input), expected);
    }

    @Test
    public void midnightPMTest() throws IOException {
      String input = "12:00:00PM";
      String expected = "12:00:00";
      Assert.assertEquals(Solution.timeConversion(input), expected);
    }

}

