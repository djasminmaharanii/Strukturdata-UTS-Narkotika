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

    // Mencari berdasarkan Case ID atau Nomor Perkara dan mengembalikan jumlah langkah iterasi
    public int searchWithSteps(String keyword) {
        int steps = 0;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            steps++;
            PutusanNarkotika p = (PutusanNarkotika) elements[i];
            if (p.getCaseId().equalsIgnoreCase(keyword) || p.getNomorPerkara().equalsIgnoreCase(keyword)) {
                System.out.println("Data ditemukan pada indeks ke-" + i + ":");
                System.out.println("  Case ID       : " + p.getCaseId());
                System.out.println("  Nomor Perkara : " + p.getNomorPerkara());
                System.out.println("  Jenis         : " + p.getJenisNarkotika());
                System.out.println("  Vonis (bulan) : " + p.getVonisBulan());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Data dengan keyword '" + keyword + "' tidak ditemukan.");
        }
        return steps;
    }

    // Filter berdasarkan jenis narkotika
    public CustomArrayList<PutusanNarkotika> filterByJenis(String jenis) {
        CustomArrayList<PutusanNarkotika> result = new CustomArrayList<>();
        for (int i = 0; i < size; i++) {
            PutusanNarkotika p = (PutusanNarkotika) elements[i];
            if (p.getJenisNarkotika().toLowerCase().contains(jenis.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}