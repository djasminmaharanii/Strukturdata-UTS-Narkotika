# Pernyataan Penggunaan AI (AI_USAGE.md)

**Mata Kuliah**: Struktur Data  
**Proyek**: Pengolahan Data Putusan Pengadilan Narkotika  
**Kelompok**: 13

---

## Kebijakan & Komitmen

Dokumen ini mencatat seluruh penggunaan alat bantu AI generatif selama pengerjaan proyek UTS Struktur Data. Kami memastikan bahwa AI hanya digunakan sebagai alat bantu pendiskusian konsep, perbaikan sintaks/format dokumentasi, dan validasi skenario pengujian. Seluruh logika utama struktur data `CustomArrayList`, pembacaan data, serta pengujian telah diverifikasi dan dipahami sepenuhnya oleh anggota kelompok.

---

##  Log Catatan Penggunaan AI

### 1. R A. Djasmin Irdina Dzikra Maharani (`@djasminmaharanii`)

* **Tanggal**: 13 - 15 November 2026
* **Alat AI**: Gemini
* **Tujuan**:
    - Diskusi perancangan struktur data generik `CustomArrayList` dan perhitungannya tanpa koleksi `java.util`.
    - Penyusunan draf skenario unit test menggunakan assertion bawaan Java (`-ea`).
    - Format penyelarasan berkas `README.md` dan `CONTRIBUTIONS.md` sesuai spesifikasi UTS.
* **Prompt / Ringkasan Interaksi**:
    - *"Bagaimana cara membuat CustomArrayList generik di Java tanpa impor java.util?"*
    - *"Bagaimana penulisan skenario pengujian unit test assertion di Java?"*
* **Bagian Output yang Digunakan**: Logika *array resizing* (kapasitas ganda) dan referensi sintaks klausa `assert`.
* **Modifikasi & Verifikasi**: Kode disesuaikan dengan kontrak interface `StrukturData.java` kelompok dan diuji langsung lewat kompilasi terminal.

---

### 2. Fevian Setiawan Putri (`@feviansetiawanputri-eng`)

* **Tanggal**: 13 - 15 November 2026
* **Alat AI**: Gemini
* **Tujuan**:
    - Penyusunan dokumen keputusan arsitektur (ADR 0001 & ADR 0002).
    - Penyusunan teks analisis kompleksitas waktu & ruang (*Execution Trace*) pada operasi `add` dan `remove`.
* **Prompt / Ringkasan Interaksi**:
    - *"Bagaimana struktur penulisan ADR untuk pemilihan array dinamis?"*
    - *"Bagaimana penjelasan execution trace dan kompleksitas waktu Amortized O(1) pada array dinamis?"*
* **Bagian Output yang Digunakan**: Templat format ADR dan struktur penjelasan kompleksitas algoritma.
* **Modifikasi & Verifikasi**: Menyesuaikan isi ADR dan *trace* dengan implementasi riil pada metode `CustomArrayList.java`.

---

##  Pernyataan Keaslian

Kami menyatakan bahwa:
1. Tidak ada kode atau data hukum yang dihasilkan secara otomatis lalu diakui tanpa proses pengujian dan pemahaman.
2. Dataset 50 putusan narkotika pada `data/putusan 50.csv` dan `docs/data-provenance.csv` diekstrak dan diverifikasi secara manual dari sumber resmi Mahkamah Agung.
3. Repositori ini dapat dibangun, diuji, dan dijelaskan secara langsung oleh seluruh anggota kelompok.