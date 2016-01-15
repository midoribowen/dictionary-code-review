import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("to draw or paint on a surface");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDescription_true() {
    Definition testDefinition = new Definition("to draw or paint on a surface");
    assertEquals("to draw or paint on a surface", testDefinition.getDefinition());
  }

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    Definition myDefinition = new Definition("to draw or paint on a surface");
    assertEquals(false, myDefinition.isCompleted());
  }

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("to draw or paint on a surface");
    Definition secondDefinition = new Definition("to outline in clear sharp detail");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

}
