import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Your Dictionary");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a New Word"));
    fill("#word").with("limn");
    submit(".btn-success");
    assertThat(pageSource()).contains("Your word has been saved");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("limn");
    submit(".btn-success");
    click("a", withText("View Your Dictionary"));
    assertThat(pageSource()).contains("limn");
  }

  @Test
  public void wordIsDisplayedOnWordPage() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("limn");
    submit(".btn-success");
    click("a", withText("View Your Dictionary"));
    click("a", withText("limn"));
    assertThat(pageSource()).contains("limn");
  }

  @Test
  public void wordDefinitionFormIsDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("brogue");
    submit(".btn-success");
    click("a", withText("View Your Dictionary"));
    click("a", withText("brogue"));
    click("a", withText("Add a New Definition"));
    assertThat(pageSource()).contains("Add a Definition to brogue");
  }

  @Test
  public void definitionIsAddedAndDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("chirography");
    submit(".btn-success");
    click("a", withText("View Your Dictionary"));
    click("a", withText("chirography"));
    click("a", withText("Add a New Definition"));
    fill("#definition").with("handwriting, penmanship");
    submit(".btn");
    assertThat(pageSource()).contains("handwriting, penmanship");
  }

}
