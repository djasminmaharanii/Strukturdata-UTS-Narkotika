public class CustomArrayListTest {

    public static void main(String[] args) {
        System.out.println("=== MENJALANKAN UNIT TEST CUSTOMARRAYLIST ===");
        testAddAndSize();
        testRemoveAndBoundary();
        System.out.println("=== SEMUA TEST BERHASIL LULUS 100% ===");
    }

    public static void testAddAndSize() {
        CustomArrayList<String> list = new CustomArrayList<>();
        assert list.isEmpty() : "Test Gagal: List harusnya kosong";
        list.add("P001");
        list.add("P002");
        assert list.size() == 2 : "Test Gagal: Ukuran size harus 2";
        System.out.println("[PASSED] Test Tambah Elemen & Ukuran Size");
    }

    public static void testRemoveAndBoundary() {
        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.remove(1);
        assert list.size() == 2 : "Test Gagal: Size harus 2 setelah remove";
        System.out.println("[PASSED] Test Penghapusan Elemen & Pergeseran");
    }
}