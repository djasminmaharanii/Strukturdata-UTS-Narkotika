# ADR 0002: Strategi Algoritma Pencarian dan Pengurutan

## Status
Diterima (Accepted)

## Konteks
Aplikasi membutuhkan fitur pencarian perkara berdasarkan nomor perkara/caseId yang dapat melaporkan jumlah langkah komparasi, serta fitur pengurutan data berdasarkan vonis hukuman pidana penjara.

## Keputusan
1. **Pencarian:** Menggunakan **Linear Search** pada `CustomArrayList<T>` dengan pencacah langkah (*step counter*).
2. **Pengurutan:** Menggunakan **Bubble Sort** (Ascending) yang beroperasi langsung pada `CustomArrayList<T>` tanpa merusak invariant struktur data.

## Konsekuensi
* **Linear Search:** Kompleksitas $O(n)$, aman untuk data yang belum terurut dan mudah menghitung exact steps.
* **Bubble Sort:** Kompleksitas $O(n^2)$, mudah diimplementasikan secara in-place pada array dinamis tanpa bantuan library eksternal.