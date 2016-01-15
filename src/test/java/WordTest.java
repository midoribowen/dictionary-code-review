import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

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

  @Test
  public void word_changesInputWordToLowerCase() {
    Word testWord = new Word("lImN");
    assertEquals("limn", testWord.getWord());
  }

  @Test
    public void getDefinitions_initiallyReturnsEmptyArrayList() {
      Word testWord = new Word("limn");
      assertTrue(testWord.getDefinitions() instanceof ArrayList);
    }

  @Test
  public void getId_returnsWordId() {
    Word testWord = new Word("limn");
    assertTrue(Word.all().size() == testWord.getId());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("limn");
    Word secondWord = new Word("brogue");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void find_returnsWordWithSameId() {
    Word testWord = new Word("limn");
    assertEquals(Word.find(testWord.getId()), testWord);
  }

  @Test
  public void addDefinition_addsDefinitionToWordList() {
    Word testWord = new Word("limn");
    Definition testDefinition = new Definition("to draw or paint on a surface");
    testWord.addDefinition(testDefinition);
    assertTrue(testWord.getDefinitions().contains(testDefinition));
  }

  @Test
  public void find_returnsNullWhenNoWordIsFound_null() {
    assertTrue(Word.find(1000) == null);
  }

  @Test
  public void clear_removesAllWordInstancesFromMemory() {
    Word testWord = new Word("limn");
    Word.clear();
    assertEquals(Word.all().size(), 0);
  }

}
