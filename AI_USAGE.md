# Laporan Penggunaan Generative AI

**Kelompok:** 13  
**Mata Kuliah:** Struktur Data  
**Proyek:** Aplikasi Pengolahan Data Putusan Narkotika Menggunakan CustomArrayList

---

## Catatan Penggunaan AI

| Tanggal | Anggota | Alat AI | Tujuan / Prompt Ringkas | Bagian / Output yang Digunakan | Cara Verifikasi & Penyesuaian |
| :--- | :--- | :--- | :--- | :--- | :--- |
| 2026-11-13 | R A. Djasmin Irdina Dzikra M. | Google Gemini | Diskusi rekomendasi struktur folder repositori Java dan format berkas `.gitignore` | Draf struktur folder dan berkas `.gitignore` | Diuji langsung pada proyek IntelliJ IDEA dan repositori GitHub |
| 2026-11-13 | R A. Djasmin Irdina Dzikra M. | Google Gemini | Konsultasi alur logika struktur data linier tanpa koleksi `java.util` | Konsep pengelolaan kapasitas array mentah `Object[]` (`resize`) | Dipelajari konsepnya, lalu ditulis dan disesuaikan secara mandiri pada kelas `CustomArrayList<T>` |
| 2026-11-14 | Fevian Setiawan Putri | Google Gemini | Diskusi strategi penanganan parsing baris CSV pada modul `CSVLoader` | Panduan logika pemisahan string (*regex split*) | Diuji langsung menggunakan dataset `putusan 50.csv` dan diverifikasi dengan `data-provenance.csv` |
| 2026-11-14 | R A. Djasmin Irdina Dzikra M. | Google Gemini | Diskusi pembuatan logika pencarian Linear Search dengan hitungan langkah | Konsep dasar iterasi pencarian elemen | Diimplementasikan pada method `searchWithSteps()` dan diverifikasi melalui eksekusi `Main.java` |
| 2026-11-14 | Fevian Setiawan Putri | Google Gemini | Diskusi alur algoritma Bubble Sort untuk pengurutan vonis secara *ascending* | Referensi alur pembandingan dan pertukaran elemen (*swapping*) | Ditulis ulang pada method `sortByVonisAscending()` dan dipastikan hasil pengurutannya benar |
| 2026-11-14 | Joint (Djasmin & Fevian) | Google Gemini | Panduan langkah penyelesaian bentrokan Git lokal dan penataan format dokumen `CONTRIBUTIONS.md` | Perintah dasar terminal Git (`git pull`, `git reset`) dan templat tabel Markdown | Dijalankan langsung di terminal Git Bash dan diperiksa kerapihannya pada browser GitHub |

---

## Deklarasi Transparansi

1. Generative AI (Google Gemini) dimanfaatkan terbatas sebagai mitra diskusi (*thought partner*) untuk pemahaman konsep algoritma, penyelesaian kendala perintah Git, serta penataan format dokumen proyek.
2. Seluruh kode program utama (`CustomArrayList`, `PutusanNarkotika`, `CSVLoader`, `Main`), dataset, dan alur kolaborasi GitHub (Issue, Branching, Pull Request, dan Review) dipahami, dibuat, serta diuji secara langsung oleh anggota kelompok.
3. Tidak ada koleksi bawaan `java.util` yang digunakan untuk menggantikan fungsi struktur data utama dalam proyek ini.