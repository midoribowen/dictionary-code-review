import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinitionEntry = new Definition("to draw, paint, outline, or describe");
    assertEquals(true, testDefinitionEntry instanceof Definition);
  }

  // @Test
  // public void definition_instantiatesWithDescription_true() {
  //   Definition testDefinitionEntry = new Definition("to draw, paint, outline, or describe");
  //   assertEquals("to draw, paint, outline, or describe", testDefinitionEntry.getDefinition());
  // }

}
