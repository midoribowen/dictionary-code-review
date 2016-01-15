import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("limn");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void getWord_instantiatesWithWord_true() {
    Word testWord = new Word("limn");
    assertEquals("limn", testWord.getWord());
  }

  // @Test
  // public void getTasks_intiallyReturnsEmptyArrayList() {
  //   Word testWord = new Word("limn");
  //   assertTrue(testWord.getWord() instanceof ArrayList);
  // }
  //
  // @Test
  // public void getId_returnsWordId() {
  //   Word testWord = new Word("limn");
  //   assertTrue(Word.all().size() == testWord.getId());
  // }



}
