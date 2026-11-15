# Pengolahan Data Putusan Narkotika (`CustomArrayList`)

Proyek UTS Mata Kuliah **Struktur Data** untuk mengolah 50 data putusan pengadilan narkotika menggunakan struktur data array dinamis kustom.

---

##  Anggota Kelompok 13

- **R A. Djasmin Irdina Dzikra Maharani** (NIM: 202510370110265) – [@djasminmaharanii](https://github.com/djasminmaharanii)
- **Fevian Setiawan Putri** (NIM: 202510370110254) – [@feviansetiawanputri-eng](https://github.com/feviansetiawanputri-eng)

**Dosen Pengampu:** Galih W. Wicaksono  
**Kelas:** B 

---

##  Pilihan Struktur Data Utama

- **Struktur Utama:** `CustomArrayList<T>` (Array Dinamis Generik tanpa koleksi bawaan `java.util`).
- **Representasi:** Penyimpanan berbasis indeks untuk menampung 50 objek `PutusanNarkotika`.
- **Operasi Minimum:** `resize`, `add`, `insert`, `get`, `set`, `remove`, `search`, `size`, `isEmpty`, `clear`.
- **Invariant Utama:** Kapasitas internal selalu $\ge$ jumlah elemen aktif (`size`), dan data tersusun kontigu tanpa elemen `null` di tengah.

---

##  Struktur Repositori

```text
Strukturdata-UTS-Narkotika/
├── data/
│   └── putusan 50.csv
├── docs/
│   ├── adr/
│   │   ├── 0001-pemilihan-struktur-data.md
│   │   └── 0002-strategi-pencarian-dan-pengurutan.md
│   ├── demo/
│   │   └── demo-skenario.md
│   ├── trace/
│   │   └── eksekusi-trace.md
│   └── data-provenance.csv
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── CSVLoader.java
│   │       ├── CustomArrayList.java
│   │       ├── Main.java
│   │       ├── PutusanNarkotika.java
│   │       └── StrukturData.java
│   └── test/
│       └── java/
│           └── CustomArrayListTest.java
├── .gitignore
├── AI_USAGE.md
├── CONTRIBUTIONS.md
└── README.md
```

---

##  Fitur Utama Program

1. **Impor Dataset CSV:** Membaca 50 record dari `data/putusan 50.csv` secara otomatis ke `CustomArrayList`.
2. **Tampil Data:** Menampilkan ringkasan seluruh record putusan secara terstruktur.
3. **Pencarian Data (`searchWithSteps`):** Mencari perkara berdasarkan kata kunci dan menghitung jumlah langkah komparasi (Linear Search).
4. **Filter Data (`filterByJenis`):** Memfilter putusan berdasarkan jenis narkotika (misal: "Shabu").
5. **Agregasi Data (`getRataRataVonis`):** Menhitung rata-rata masa vonis penjara (bulan) dari dataset.
6. **Pengurutan Data (`sortByVonisAscending`):** Mengurutkan putusan berdasarkan masa vonis secara *ascending* (Bubble Sort).

---

## Cara Menjalankan & Pengujian Program

### Prasyarat
- Java Development Kit (JDK) 11 atau yang lebih baru.
- Terminal Git Bash / IDE (IntelliJ IDEA).

### Jalankan Program Utama & Unit Test
Buka terminal di direktori utama proyek, lalu jalankan perintah berikut:

```bash
# 1. Kompilasi & Jalankan Program Utama
javac -d out src/main/java/*.java
java -cp out Main

# 2. Kompilasi & Jalankan Unit Test
javac -d out -cp src/main/java src/test/java/CustomArrayListTest.java
java -ea -cp out:src/main/java CustomArrayListTest
```