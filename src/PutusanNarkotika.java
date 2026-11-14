public class PutusanNarkotika {
    private String caseId;
    private String nomorPerkara;
    private String pengadilan;
    private String tanggalPutusan;
    private String terdakwaKode;
    private String jenisNarkotika;
    private double beratBarangBuktiGram;
    private String pasalTerbukti;
    private int tuntutanBulan;
    private int vonisBulan;
    private double dendaRupiah;
    private String keadaanMemberatkan;
    private String keadaanMeringankan;
    private String statusVerifikasi;

    public PutusanNarkotika(String caseId, String nomorPerkara, String pengadilan, String tanggalPutusan,
                            String terdakwaKode, String jenisNarkotika, double beratBarangBuktiGram,
                            String pasalTerbukti, int tuntutanBulan, int vonisBulan, double dendaRupiah,
                            String keadaanMemberatkan, String keadaanMeringankan, String statusVerifikasi) {
        this.caseId = caseId;
        this.nomorPerkara = nomorPerkara;
        this.pengadilan = pengadilan;
        this.tanggalPutusan = tanggalPutusan;
        this.terdakwaKode = terdakwaKode;
        this.jenisNarkotika = jenisNarkotika;
        this.beratBarangBuktiGram = beratBarangBuktiGram;
        this.pasalTerbukti = pasalTerbukti;
        this.tuntutanBulan = tuntutanBulan;
        this.vonisBulan = vonisBulan;
        this.dendaRupiah = dendaRupiah;
        this.keadaanMemberatkan = keadaanMemberatkan;
        this.keadaanMeringankan = keadaanMeringankan;
        this.statusVerifikasi = statusVerifikasi;
    }

    // Getter methods
    public String getCaseId() { return caseId; }
    public String getNomorPerkara() { return nomorPerkara; }
    public String getPengadilan() { return pengadilan; }
    public String getTanggalPutusan() { return tanggalPutusan; }
    public String getTerdakwaKode() { return terdakwaKode; }
    public String getJenisNarkotika() { return jenisNarkotika; }
    public double getBeratBarangBuktiGram() { return beratBarangBuktiGram; }
    public String getPasalTerbukti() { return pasalTerbukti; }
    public int getTuntutanBulan() { return tuntutanBulan; }
    public int getVonisBulan() { return vonisBulan; }
    public double getDendaRupiah() { return dendaRupiah; }
    public String getKeadaanMemberatkan() { return keadaanMemberatkan; }
    public String getKeadaanMeringankan() { return keadaanMeringankan; }
    public String getStatusVerifikasi() { return statusVerifikasi; }

    @Override
    public String toString() {
        return "PutusanNarkotika{" +
                "caseId='" + caseId + '\'' +
                ", nomorPerkara='" + nomorPerkara + '\'' +
                ", jenisNarkotika='" + jenisNarkotika + '\'' +
                ", vonisBulan=" + vonisBulan +
                '}';
    }
}