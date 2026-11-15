
# Penelusuran Alur Eksekusi (Execution Trace)

Dokumen ini memetakan jejak eksekusi kode (*execution path*) dan analisis kompleksitas ruang & waktu pada operasi utama `CustomArrayList`.

---

## 1. Alur Eksekusi Operasi `add(T element)`

1. **Pemanggilan**: `list.add(data)` dipanggil oleh `CSVLoader`.
2. **Pengecekan Kapasitas**:
   - Program memeriksa apakah `size == elements.length`.
   - Jika `true`, lakukan pencetak-ulangan kapasitas (*resize*) sebesar $2 \times \text{kapasitas saat ini}$.
3. **Penempatan Elemen**: `elements[size] = element`.
4. **Inkremen**: Nilai `size` bertambah 1 (`size++`).
5. **Kompleksitas**: 
   - Rata-rata (*Amortized*): $\mathcal{O}(1)$
   - Kasus Terburuk (*Worst-case resize*): $\mathcal{O}(n)$

---

## 2. Alur Eksekusi Operasi `remove(int index)`

1. **Pemanggilan**: `list.remove(position)` dipanggil.
2. **Validasi Batas (Boundary Check)**:
   - Memeriksa apakah `index < 0` atau `index >= size`. Jika ya, lemparkan `IndexOutOfBoundsException`.
3. **Penyimpanan Elemen**: Simpan elemen yang akan dihapus untuk nilai kembalian.
4. **Pergeseran Elemen (Shift Left)**:
   - Lakukan perulangan dari `i = index` hingga `i < size - 1`.
   - Geser elemen: `elements[i] = elements[i + 1]`.
5. **Pembersihan Referensi**: Set `elements[size - 1] = null` dan kurangi `size` (`size--`).
6. **Kompleksitas Waktu**: $\mathcal{O}(n)$ karena harus menggeser elemen di sebelah kanan indeks yang dihapus.

---

## 3. Matriks Kompleksitas Operasi CustomArrayList

| Operasi | Kompleksitas Waktu | Keterangan |
| :--- | :--- | :--- |
| `get(int index)` | $\mathcal{O}(1)$ | Akses acak berbasis indeks array |
| `add(T element)` | $\mathcal{O}(1)$ *Amortized* | Menambahkan di akhir list |
| `remove(int index)` | $\mathcal{O}(n)$ | Memerlukan pergeseran elemen ke kiri |
| `isEmpty()` | $\mathcal{O}(1)$ | Pengecekan nilai `size == 0` |
| `size()` | $\mathcal{O}(1)$ | Pengembalian variabel `size` |