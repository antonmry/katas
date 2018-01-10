import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardErrorStreamLog;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;

public class SolutionTest {

    @Rule
    public final StandardErrorStreamLog stdErrLog = new StandardErrorStreamLog();
    @Rule
    public final StandardOutputStreamLog stdOutLog = new StandardOutputStreamLog();
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void firstTest() throws IOException {

        String input = "";
        try (Stream<String> linesIn = java.nio.file.Files.lines(Paths.get("input/input01.txt"))) {
            input = linesIn.collect(Collectors.joining());
        }
        String expected = "";
        try (Stream<String> linesOut = java.nio.file.Files.lines(Paths.get("output/output01.txt"))) {
            expected= linesOut.collect(Collectors.joining("\n"));
        }

        systemInMock.provideText(input + "\n");

        Solution.main(new String[]{});

        assertThat(stdOutLog.getLog(), is(expected + "\n"));
    }

}

