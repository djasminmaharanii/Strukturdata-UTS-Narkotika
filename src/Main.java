public class Main {
    public static void main(String[] args) {
        String csvFilePath = "data/putusan 50.csv";

        System.out.println("=== MEMUAT DATASET NARKOTIKA ===");
        CustomArrayList<PutusanNarkotika> listPutusan = CSVLoader.loadData(csvFilePath);
        System.out.println("Total data berhasil dimuat: " + listPutusan.size() + " baris.\n");

        System.out.println("=== UJI FITUR PENCARIAN (Search with Steps) ===");
        int steps1 = listPutusan.searchWithSteps("putusan_001");
        System.out.println("Jumlah langkah pencarian: " + steps1 + "\n");

        System.out.println("=== UJI FITUR FILTER (Jenis: Shabu) ===");
        CustomArrayList<PutusanNarkotika> hasilFilter = listPutusan.filterByJenis("Shabu");
        System.out.println("Total data ditemukan: " + hasilFilter.size() + " perkara.\n");
    }
}