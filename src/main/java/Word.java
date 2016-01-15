import java.util.ArrayList;

public class Word {

  private String mWord;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  // private int mId;
  private ArrayList<Definition> mDefinitions;

  public Word(String word) {

    mWord = word;
    instances.add(this);
    // mId = instances.size();
    mDefinitions = new ArrayList<Definition>();

  }

  public String getWord() {
    return mWord;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

}
