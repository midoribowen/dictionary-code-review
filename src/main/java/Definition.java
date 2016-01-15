import java.util.ArrayList;

public class Definition {

  private String mDefinition;
  private boolean mCompleted;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();

  public Definition(String definition) {
    mDefinition = definition;
    mCompleted = false;
    instances.add(this);
  }

  public String getDefinition() {
    return mDefinition;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

}
