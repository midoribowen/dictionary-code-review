import java.util.ArrayList;

public class Definition {

  private String mDefinition;
  private boolean mCompleted;
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private int mId;

  public Definition(String definition) {
    mDefinition = definition;
    mCompleted = false;
    instances.add(this);
    mId = instances.size();
  }

  public String getDefinition() {
    return mDefinition.toLowerCase();
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id-1);
    } catch (IndexOutOfBoundsException ioobe) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }

}
