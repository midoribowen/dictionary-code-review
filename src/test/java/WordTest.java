import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("limn");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void word_instantiatesWithWord_true() {
    Word testWord = new Word("limn");
    assertEquals("limn", testWord.getWord());
  }

}
