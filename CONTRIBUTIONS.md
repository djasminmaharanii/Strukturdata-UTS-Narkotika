# Dokumentasi Kontribusi Anggota Kelompok (CONTRIBUTIONS.md)

**Mata Kuliah**: Struktur Data  
**Proyek**: Penanganan Data Putusan Narkotika  
**Kelompok**: 13

---

## Ringkasan Pembagian Tugas & Kolaborasi

| Anggota Kelompok | NIM | Peran Utama | Fokus Kontribusi |
| :--- | :--- | :--- | :--- |
| **R A. Djasmin Irdina Dzikra Maharani** (`@djasminmaharanii`) | 202510370110265 | Lead Developer & Tester | Desain `CustomArrayList`, Implementasi Unit Testing, Refactoring Folder, ADR & Release Tag |
| **Fevian Setiawan Putri** (`@feviansetiawanputri-eng`) | 202510370110254 | Data & Architecture Specialist | Ekstraksi Dataset, Implementasi `CSVLoader`, Fitur Aggregation & Sorting, Skenario Demo & Trace |

---

## Detail Kontribusi Individual

### 1. R A. Djasmin Irdina Dzikra Maharani (`@djasminmaharanii`)
- **Ekstraksi Data & Provenance**: Mengkstrak 25 record data putusan narkotika dan verifikasi pada file `docs/data-provenance.csv`.
- **Implementasi Kode**:
  - Membangun interface `StrukturData.java` dan kelas `CustomArrayList.java` (Commit: `832fafd`).
  - Membangun model kelas `PutusanNarkotika.java` (Commit: `32957f6`).
  - Membangun pengujian integrasi `CSVLoader` di kelas `Main.java` (Commit: `884d4c9`).
  - Mengimplementasikan fitur pencarian (*search*) beserta pelaporan jumlah langkah eksekusi & filter (Commit: `5ad413e`).
  - Melakukan refactoring struktur proyek ke `src/main/java` dan unit test `CustomArrayListTest.java` di `src/test/java` (Commit: `2c61500`, `87f52bc`).
- **Dokumentasi & GitHub Workflow**:
  - Mengulas (*review*) dan menyetujui Merge Pull Request #3, #7, #9, #15.
  - Menerbitkan Release Tag resmi `uts-v1.0`.

### 2. Fevian Setiawan Putri (`@feviansetiawanputri-eng`)
- **Ekstraksi Data & Provenance**: Mengkstrak 25 record data putusan narkotika serta melengkapi metadata sumber PDF `docs/data-provenance.csv`.
- **Implementasi Kode**:
  - Menambahkan dataset `putusan 50.csv` dan `data-provenance.csv` (Commit: `aeaed8f`).
  - Membangun pembaca berkas CSV `CSVLoader.java` (Commit: `0c5a9ae`).
  - Mengimplementasikan fitur agregasi data dan pengurutan (*sorting*) berdasarkan vonis (Commit: `7cb8c2e`).
- **Dokumentasi & GitHub Workflow**:
  - Menyusun dokumen ADR (`0001-pemilihan-struktur-data.md` dan `0002-strategi-pencarian-dan-pengurutan.md`) (Commit: `ca81f31`).
  - Menyusun dokumen `docs/demo/demo-skenario.md` dan `docs/trace/eksekusi-trace.md` (Commit: `9273851`).
  - Mengulas (*review*) dan menyetujui Merge Pull Request #5, #10, #13.

---

## 🔗 Bukti Lacak Git (Issues & Pull Requests Riil)

- **PR #3**: Merge feature/custom-structure (Reviewed by `@feviansetiawanputri-eng`) [Commit `16667f3`]
- **PR #5**: Merge feature/dataset-loader (Reviewed by `@djasminmaharanii`) [Commit `a5b52da`]
- **PR #7**: Merge feature/model-putusan (Reviewed by `@feviansetiawanputri-eng`) [Commit `47022a0`]
- **PR #9**: Merge feature/csv-loader (Reviewed by `@djasminmaharanii`) [Commit `68cb702`]
- **PR #10**: Merge feature/main-loader-test (Reviewed by `@feviansetiawanputri-eng`) [Commit `c83c961`]
- **PR #13**: Merge feature/search-filter (Reviewed by `@feviansetiawanputri-eng`) [Commit `24fb881`]
- **PR #15**: Merge feature/aggregate-sort (Reviewed by `@djasminmaharanii`) [Commit `769c4b0`]