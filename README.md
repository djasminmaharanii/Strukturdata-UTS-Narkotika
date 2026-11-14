# Pengolahan Data Putusan Narkotika (`CustomArrayList`)

Proyek Ujian Tengah Semester (UTS) Mata Kuliah **Struktur Data** untuk mengolah 50 data putusan pengadilan narkotika menggunakan struktur data array dinamis kustom.

---

## Anggota Kelompok 13

* **R A. Djasmin Irdina Dzikra Maharani** (NIM: 202510370110265) – GitHub: [@djasminmaharanii](https://github.com/djasminmaharanii)
* **Fevian Setiawan Putri** (NIM: 202510370110254) – GitHub: [@feviansetiawanputri-eng](https://github.com/feviansetiawanputri-eng)

**Dosen Pengampu:** Galih W. Wicaksono  
**Kelas:** B

---

## 🛠️ Pilihan Struktur Data Utama

* **Struktur Utama:** `CustomArrayList<T>` (Array Dinamis Generik tanpa menggunakan koleksi bawaan `java.util`).
* **Representasi:** Arsip utama berbasis indeks untuk menampung seluruh 50 objek `PutusanNarkotika`.
* **Operasi Minimum:** `resize`, `add`, `insert`, `get`, `set`, `remove`, `search`, `size`, `isEmpty`, `clear`.
* **Invariant Utama:** Kapasitas minimal sama dengan jumlah elemen aktif (`size`), dan seluruh elemen tersusun secara kontigu (tanpa elemen `null` di tengah).

---

## 🚀 Fitur Utama Program

1. **Impor Dataset CSV:** Membaca 50 record dari `data/putusan 50.csv` secara otomatis ke dalam `CustomArrayList`.
2. **Tampil Data:** Menampilkan ringkasan seluruh record putusan secara terstruktur.
3. **Pencarian Data (`searchWithSteps`):** Mencari perkara berdasarkan kata kunci dan menghitung jumlah langkah komparasi (Linear Search).
4. **Filter Data (`filterByJenis`):** Memfilter putusan berdasarkan kategori jenis narkotika (misal: "Shabu").
5. **Agregasi Data (`getRataRataVonis`):** Menhitung nilai rata-rata masa vonis penjara (dalam bulan) dari seluruh dataset.
6. **Pengurutan Data (`sortByVonisAscending`):** Mengurutkan data putusan berdasarkan masa vonis penjara secara *ascending* menggunakan algoritma Bubble Sort.

---

## 💻 Cara Menjalankan & Pengujian Program

### Prasyarat
* Java Development Kit (JDK) 11 atau yang lebih baru.
* IDE (IntelliJ IDEA / Eclipse) atau Terminal Git Bash.

### Cara Compile dan Menjalankan (`Run`)
1. Buka terminal di direktori utama proyek.
2. Kompilasi seluruh berkas Java:
   ```bash
   javac -d out src/*.java