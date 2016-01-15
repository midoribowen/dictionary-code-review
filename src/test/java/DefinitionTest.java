import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

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
  public void definition_changesInputDescriptionToLowerCase() {
    Definition testDefinition = new Definition("To Draw Or Paint On A Surface");
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

  @Test
  public void getId_definitionsInstantiateWithAnId_true() {
    Definition myDefinition = new Definition("to draw or paint on a surface");
    assertEquals(Definition.all().size(), myDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionsWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("to draw or paint on a surface");
    Definition secondDefinition = new Definition("to outline in clear sharp detail");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(1000) == null);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList() {
    Definition myDefinition = new Definition("to draw or paint on a surface");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }

}
