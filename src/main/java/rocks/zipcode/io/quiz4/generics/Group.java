package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface<_> {
    private List<_> group;
    public Group() {
        this.group = new ArrayList<>();
    }

    public Integer count() {
        return this.group.size();
    }

    public void insert(_ value) {
        this.group.add(value);
    }

    public Boolean has(_ value) {
        return this.group.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return this.group.get(indexOfValue);
    }

    public void delete(_ value) { this.group.remove(value);
    }

    public void clear() { this.group.clear(); }

    @Override
    public Iterator<_> iterator() {
        return this.group.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(group);
        return sb.toString();
    }
}
