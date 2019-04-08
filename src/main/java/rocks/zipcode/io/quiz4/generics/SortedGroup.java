package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_>{
    private List<_> sorted;
    private _ compared;
    public SortedGroup() {
        this.sorted = new ArrayList<>();
    }

    @Override
    public void insert(_ value) {
        this.sorted.add(value);
        this.sorted.sort(Comparator.naturalOrder());
    }

    @Override
    public void delete(_ value) {
        this.sorted.remove(value);
        this.sorted.sort(Comparator.naturalOrder());
    }

    public Integer indexOf(_ value) {
        this.sorted.sort(Comparator.naturalOrder());
        return this.sorted.indexOf(value);

    }

}
