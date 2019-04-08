package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    private List<String> stringList;
    public SimpleStringGroup() {
        stringList = new ArrayList<>();
    }

    public Integer count() {
        return this.stringList.size();
    }

    public void insert(String string) { this.stringList.add(string);
    }

    public Boolean has(String string) {
        return this.stringList.contains(string);
    }

    public String fetch(int indexOfValue) {
        return this.stringList.get(indexOfValue);
    }

    public void delete(String string) {
        this.stringList.remove(string);
    }

    public void clear() { this.stringList.clear();
    }
}
