# Skenario Demo Aplikasi Penanganan Data Narkotika

Dokumen ini berisi langkah-langkah pengujian langsung (*live demo*) untuk memverifikasi fungsionalitas aplikasi penanganan data putusan narkotika menggunakan struktur data `CustomArrayList`.

---

## 1. Persiapan Lingkungan

1. Pastikan Java Development Kit (JDK 11+) dan IntelliJ IDEA sudah terinstal.
2. Pastikan file dataset `data-provenance.csv` berada di dalam direktori `docs/` atau `data/`.
3. Kompilasi dan jalankan program melalui file utama `src/main/java/Main.java`.

---

## 2. Langkah-Langkah Skenario Demo

### Skenario A: Memuat Dataset CSV
- **Tindakan**: Jalankan metode `CSVLoader.loadData()`.
- **Ekspektasi Output**: Program berhasil membaca file CSV dan menyimpan seluruh baris data ke dalam objek `CustomArrayList<PutusanNarkotika>`.
- **Hasil**: Data berhasil dimuat tanpa error parsing.

### Skenario B: Manipulasi Data pada CustomArrayList
- **Tindakan**:
    1. Menampilkan jumlah total data yang dimuat (`list.size()`).
    2. Mengambil elemen pertama (`list.get(0)`) untuk verifikasi identitas putusan.
    3. Menghapus satu elemen data tertentu menggunakan `list.remove(index)`.
- **Ekspektasi Output**: Ukuran *list* berkurang 1 dan elemen tersisa bergeser secara konsisten tanpa meninggalkan celah *null*.

### Skenario C: Menjalankan Unit Test Otomatis
- **Tindakan**: Jalankan file `src/test/java/CustomArrayListTest.java`.
- **Ekspektasi Output**:
  ```text
  === MENJALANKAN UNIT TEST CUSTOMARRAYLIST ===
  [PASSED] Test Tambah Elemen & Ukuran Size
  [PASSED] Test Penghapusan Elemen & Pergeseran
  === SEMUA TEST BERHASIL LULUS 100% ===