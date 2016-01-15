import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("to draw, paint, outline, or describe");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDescription_true() {
    Definition testDefinition = new Definition("to draw, paint, outline, or describe");
    assertEquals("to draw, paint, outline, or describe", testDefinition.getDefinition());
  }

}
