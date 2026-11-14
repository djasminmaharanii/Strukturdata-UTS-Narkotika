# Catatan Kontribusi Anggota Kelompok

**Kelompok:** 13  
**Mata Kuliah:** Struktur Data  
**Dosen Pengampu:** Galih W. Wicaksono

---

## Anggota Kelompok

1. **Nama:** R A. Djasmin Irdina Dzikra Maharani (NIM: 202510370110265) – GitHub: [@djasminmaharanii](https://github.com/djasminmaharanii)
2. **Nama:** Fevian Setiawan Putri (NIM: 202510370110254) – GitHub: [@feviansetiawanputri-eng](https://github.com/feviansetiawanputri-eng)

---

## Ringkasan Kontribusi Individual

### 1. R A. Djasmin Irdina Dzikra Maharani (Anggota 1)

- **Setup Repositori & Dokumentasi Awal:**
  - Inisialisasi struktur proyek Java, penambahan berkas `.gitignore`, `README.md`, `CONTRIBUTIONS.md`, dan `AI_USAGE.md`.
  - Tautan: [Issue #1](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/1) | [PR #1](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/1)

- **Implementasi Struktur Data Utama & Model Data:**
  - Merancang interface generik `StrukturData<T>` dan kelas struktur data utama `CustomArrayList<T>` (tanpa koleksi `java.util`).
  - Merancang dan mengimplementasikan kelas model `PutusanNarkotika`.
  - Tautan: [Issue #2](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/2) | [PR #3](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/3) & [Issue #6](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/6) | [PR #7](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/7)

- **Fitur Pencarian, Filter Data & Testing Integrasi:**
  - Mengimplementasikan pencarian data `searchWithSteps()` (Linear Search dengan perhitungan langkah) dan pemfilteran `filterByJenis()`.
  - Menguji integrasi `CSVLoader` pada kelas `Main`.
  - Tautan: [Issue #10](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/10) | [PR #10](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/10) & [Issue #11](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/11) | [PR #13](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/13)

- **Pengujian & Code Review (Maintainer/Reviewer):**
  - Melakukan review teknis spesifik, persetujuan (approval), dan merging Pull Request milik Anggota 2.
  - Tautan Review: [PR Review #5](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/5) | [PR Review #9](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/9) | [PR Review #15](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/15)

---

### 2. Fevian Setiawan Putri (Anggota 2)

- **Ekstraksi Data & Provenance:**
  - Mengumpulkan, membersihkan, dan memverifikasi 50 dataset putusan narkotika (`data/putusan 50.csv`) serta menyusun dokumen pelacakan asal-usul data (`docs/data-provenance.csv`).
  - Tautan: [Issue #3](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/3) | [PR #5](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/5)

- **Implementasi CSV Loader:**
  - Merancang dan mengimplementasikan kelas `CSVLoader` untuk membaca dataset CSV dan memasukkannya ke dalam `CustomArrayList`.
  - Tautan: [Issue #8](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/8) | [PR #9](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/9)

- **Implementasi Fitur Agregasi & Sorting (Bubble Sort):**
  - Mengimplementasikan kalkulasi statistik `getRataRataVonis()` dan pengurutan vonis secara ascending (`sortByVonisAscending()`) dengan algoritma Bubble Sort pada `CustomArrayList`.
  - Tautan: [Issue #14](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/issues/14) | [PR #15](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/15)

- **Pengujian & Code Review (Maintainer/Reviewer):**
  - Melakukan review teknis spesifik, persetujuan (approval), dan merging Pull Request milik Anggota 1.
  - Tautan Review: [PR Review #3](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/3) | [PR Review #7](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/7) | [PR Review #10](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/10) | [PR Review #13](https://github.com/djasminmaharanii/Strukturdata-UTS-Narkotika/pull/13)

---

## Tabel Pembagian Peran dan Bobot Kontribusi (50:50)

| Komponen Proyek | Kontributor Utama | Reviewer / Penguji | Status Bukti |
| :--- | :--- | :--- | :--- |
| Repository Setup & Initial Documentation | R A. Djasmin Irdina Dzikra M. | Fevian Setiawan Putri | Issue #1, PR #1 |
| Data Collection & Provenance CSV | Fevian Setiawan Putri | R A. Djasmin Irdina Dzikra M. | Issue #3, PR #5 |
| Interface `StrukturData` & `CustomArrayList` | R A. Djasmin Irdina Dzikra M. | Fevian Setiawan Putri | Issue #2, PR #3 |
| Model Class `PutusanNarkotika` | R A. Djasmin Irdina Dzikra M. | Fevian Setiawan Putri | Issue #6, PR #7 |
| Module `CSVLoader` | Fevian Setiawan Putri | R A. Djasmin Irdina Dzikra M. | Issue #8, PR #9 |
| Search (`searchWithSteps`) & Filter (`filterByJenis`) | R A. Djasmin Irdina Dzikra M. | Fevian Setiawan Putri | Issue #11, PR #13 |
| Aggregation (`getRataRataVonis`) & Sorting (`Bubble Sort`) | Fevian Setiawan Putri | R A. Djasmin Irdina Dzikra M. | Issue #14, PR #15 |
| Integration Testing & Main Verification | Joint (Djasmin & Fevian) | Joint (Djasmin & Fevian) | PR #10, Main.java |