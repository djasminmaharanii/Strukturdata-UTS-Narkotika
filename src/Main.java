public class Main {
    public static void main(String[] args) {
        String csvFilePath = "data/putusan 50.csv";

        System.out.println("=== MEMUAT DATASET NARKOTIKA ===");
        CustomArrayList<PutusanNarkotika> listPutusan = CSVLoader.loadData(csvFilePath);

        System.out.println("Total data berhasil dimuat: " + listPutusan.size() + " baris.\n");

        // Menampilkan 3 data pertama sebagai pengujian
        System.out.println("=== 3 DATA PERTAMA ===");
        int limit = Math.min(3, listPutusan.size());
        for (int i = 0; i < limit; i++) {
            PutusanNarkotika p = listPutusan.get(i);
            System.out.println("Data ke-" + (i + 1) + ":");
            System.out.println("  Case ID         : " + p.getCaseId());
            System.out.println("  Nomor Perkara   : " + p.getNomorPerkara());
            System.out.println("  Pengadilan      : " + p.getPengadilan());
            System.out.println("  Jenis Narkotika : " + p.getJenisNarkotika());
            System.out.println("  Berat Bukti (g) : " + p.getBeratBarangBuktiGram());
            System.out.println("  Vonis (bulan)   : " + p.getVonisBulan());
            System.out.println("----------------------------------------");
        }
    }
}