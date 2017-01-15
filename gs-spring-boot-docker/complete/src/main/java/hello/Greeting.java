package hello;
import java.util.*;

public class Greeting {

    private final long id;
    private final String content;
    private ArrayList<String> obj = new ArrayList<String>();
    Map dictionary = new HashMap();

    public Greeting(long id, String content, ArrayList list, Map dictionary) {
        this.id = id;
        this.content = content;
        this.obj = list;
        this.dictionary = dictionary;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public ArrayList getList() {
        return obj;
    }

    public Map getMap() {
        return dictionary;
    }
}
