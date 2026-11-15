# ADR 0001: Pemilihan Struktur Data Utama (CustomArrayList)

## Status
Diterima (Accepted)

## Konteks
Aplikasi pengolahan 50 data putusan pengadilan narkotika memerlukan struktur data linier untuk menyimpan seluruh objek secara urut di memori. Penggunaan koleksi bawaan `java.util` (seperti `ArrayList` atau `LinkedList`) dilarang oleh aturan UTS.

## Keputusan
Kelompok memutuskan untuk membangun dan menggunakan **`CustomArrayList<T>`** (Array Dinamis Generik) sebagai struktur data utama.

## Konsekuensi
* **Kelebihan:**
    - Pengaksesan elemen berdasarkan indeks sangat cepat ($O(1)$).
    - Alokasi memori yang rapat (contiguous memory) dan efisien.
* **Kekurangan:**
    - Operasi penambahan atau penghapusan di tengah array membutuhkan pergeseran elemen ($O(n)$).
    - Memerlukan mekanisme resize otomatis saat kapasitas penuh.