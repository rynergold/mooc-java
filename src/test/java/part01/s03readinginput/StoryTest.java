package part01.s03readinginput;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @see part01.s03readinginput.Story
 */
class StoryTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void setInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    public void testStoryWithBobBuilder() {
        setInput("Bob\na builder\n");
        Story.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("I will tell you a story, but I need some information first."), "Intro missing");
        assertTrue(output.contains("What is the main character called?"), "Prompt 1 missing");
        assertTrue(output.contains("What is their job?"), "Prompt 2 missing");
        assertTrue(output.contains("Here is the story:"), "Story header missing");
        assertTrue(output.contains("Once upon a time there was Bob, who was a builder."), "Story line 1 missing");
        assertTrue(output.contains("On the way to work, Bob reflected on life."), "Story line 2 missing");
        assertTrue(output.contains("Perhaps Bob will not be a builder forever."), "Story line 3 missing");
    }

    @Test
    public void testStoryWithAdaDataScientist() {
        setInput("Ada\na Data scientist\n");
        Story.main(new String[]{});

        String output = outContent.toString();
        assertTrue(output.contains("I will tell you a story, but I need some information first."), "Intro missing");
        assertTrue(output.contains("Once upon a time there was Ada, who was a Data scientist."), "Story line 1 missing");
        assertTrue(output.contains("On the way to work, Ada reflected on life."), "Story line 2 missing");
        assertTrue(output.contains("Perhaps Ada will not be a Data scientist forever."), "Story line 3 missing");
    }
}
