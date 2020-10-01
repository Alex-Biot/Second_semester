import java.util.Comparator;
import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {


    private static class Node<T> {

        public Node(T elt, Node<T> next, Node<T> prev) {
            this.elt = elt;
            this.next = next;
            this.prev = prev;
        }

        T elt;
        Node<T> next;
        Node<T> prev;
    }

    private int size;
    Node<T> first;
    Node<T> last;


    @Override
    public void add(T elt) {
        Node<T> newNode = new Node<>(elt, null, last);

        if (size == 0) {
            last = first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }

        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int set(int index, T elt) {
        Node eltf = getNodeIndex(index);
        eltf.elt = elt;
        return index;
    }

    private Node getNodeIndex(int index) {
        Node elt = first;
        for (int i = 0; i < index; i++) {
            elt = elt.next;
        }
        return elt;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node elt = first;
        for (int i = 0; i < index; i++) {
            elt = elt.next;
        }
        return (T) elt.elt;
    }

    @Override
    public boolean contains(T elt) {
        int i = 0;
        Node eltF = first;
        while (i < size)
            if (eltF.elt.equals(elt)) return true;
            else {
                eltF = eltF.next;
                ++i;
            }
        return false;
    }

    private int contains1(T elt) {
        int i = 0;
        Node eltF = first;
        while (i < size)
            if (eltF.elt.equals(elt)) return i;
            else {
                eltF = eltF.next;
                ++i;
            }
        return -1;
    }

    @Override
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node removedNode = getNodeIndex(index);

        if (removedNode.prev == null) {
            first = first.next;
            first.prev = null;
            size--;
            return (T) removedNode.elt;
        }
        if (removedNode.next == null) {
            last = last.prev;
            last.next = null;
            size--;
            return (T) removedNode.elt;
        }
        // n3 ( value, prev: n2, next: n4)
        removedNode.prev.next = removedNode.next;
        removedNode.next.prev = removedNode.prev;
        size--;

        return (T) removedNode.elt;
    }


    @Override
    public boolean remove(T elt) {
        return remove(contains1(elt)).equals(elt);
    }

    @Override
    public void sort() {

    }

    @Override
    public void sort(Comparator<T> comparator) {

    }

    @Override
    public Iterator<T> iterator() {
        return new DefaultIterator();
    }

    class DefaultIterator implements Iterator<T> {

        Node eltF = first;

        @Override
        public boolean hasNext() {
            return eltF.next != null;
        }

        @Override
        public T next() {
            T eltFake = (T) eltF.elt;
            eltF = eltF.next;
            return (eltFake);
        }
    }


}
