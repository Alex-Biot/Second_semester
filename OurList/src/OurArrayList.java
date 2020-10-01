import java.util.Comparator;
import java.util.Iterator;

/**
 * An implementation of the List data structure, made via array under the hood.
 * The initial array has length 16. In the case the array is full, a new
 * array with the capacity of 2*<old length> must be created as a new
 * source for the elements.
 *
 * @param <T>
 */
public class OurArrayList<T> implements OurList<T> {

    Object[] source;
    private  int size;
    private int capacity = 16;

    public OurArrayList() {
        source = new Object[capacity];
        size=0;
    }


    @Override
    public void add(T elt) {
        if (size<capacity)
        addCapacity();
        source[size++]=elt;
    }

    private void addCapacity() {
        capacity=capacity*2;
        Object [] source1 = new Object[capacity];
        System.arraycopy(source,0,source1,0,size);
        source=source1;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void set(int index, T elt) {
        if (index<0 ||index>size)
            throw new IndexOutOfBoundsException();
        else source[index] = elt;

    }

    @Override
    public T get(int index) {
        if (index<0 ||index>size)
            throw new IndexOutOfBoundsException();
        return (T) source[index];
    }

    /**
     * if necessary to override equals
     */
    @Override
    public boolean contains(T elt) {
        for (int i = 0; i <size; i++) {
            if (source[i].equals(elt)) return true;

        }
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public boolean remove(T elt) {
        return false;
    }

    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}