package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    private Stack<SomeType> mine;
    public MyStack() {
        this.mine = new Stack<>();
    }

    public Boolean isEmpty() {
        return this.mine.isEmpty();
    }

    public void push(SomeType i) { this.mine.push(i); }

    public SomeType peek() {
        if(this.mine.isEmpty()){
            return null;
        }
        return this.mine.peek();
    }

    public SomeType pop() {
        return this.mine.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
