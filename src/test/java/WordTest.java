import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWordEntry = new Word("limn");
    assertEquals(true, testWordEntry instanceof Word);
  }

  // @Test
  // public void word_instantiatesWithWord_true() {
  //   Word testWordEntry = new Word("limn");
  //   assertEquals("limn", testWordEntry.getWord());
  // }

}
