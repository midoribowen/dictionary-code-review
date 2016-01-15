import java.util.ArrayList;

public class Word {

  private String mWord;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private ArrayList<Definition> mDefinitions;
  private int mId;

  public Word(String word) {

    mWord = word;
    instances.add(this);
    mDefinitions = new ArrayList<Definition>();
    mId = instances.size();
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

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id-1);
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

}
