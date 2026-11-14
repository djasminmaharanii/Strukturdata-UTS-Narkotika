public class CustomArrayList<T> implements StrukturData<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(T value) {
        ensureCapacity();
        elements[size++] = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Index diluar jangkauan: " + position);
        }
        return (T) elements[position];
    }

    @SuppressWarnings("unchecked")
    @Override
    public T remove(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Index diluar jangkauan: " + position);
        }
        T removedValue = (T) elements[position];
        int numMoved = size - position - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, position + 1, elements, position, numMoved);
        }
        elements[--size] = null;
        return removedValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    public boolean validateInvariant() {
        return size >= 0 && size <= elements.length;
    }
}