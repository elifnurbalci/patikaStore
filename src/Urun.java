public class Urun {
    private static int idCounter = 1;
    private int id;
    private double birimFiyat;
    private double indirimOrani;
    private int stokMiktari;
    private String urunAdi;
    private Marka marka;
    private int depolama;
    private double ekranBoyutu;
    private int kamera;
    private double pilGucu;
    private int ram;
    private String renk;

    public Urun(double birimFiyat, int stokMiktari, String urunAdi, Marka marka, int depolama, double ekranBoyutu, int kamera, double pilGucu) {
        this.id = idCounter++;
        this.birimFiyat = birimFiyat;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
    }

    public Urun(double birimFiyat, int stokMiktari, String urunAdi, Marka marka, int depolama, double ekranBoyutu, int ram) {
        this.id = idCounter++;
        this.birimFiyat = birimFiyat;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.ram = ram;
    }

    public Urun( double birimFiyat, double indirimOrani, int stokMiktari, String urunAdi, Marka marka, int depolama, double ekranBoyutu, int kamera, double pilGucu, int ram, String renk) {
        this.id = idCounter++;
        this.birimFiyat = birimFiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.kamera = kamera;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public Marka getMarka() {
        return marka;
    }

    public int getDepolama() {
        return depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public int getKamera() {
        return kamera;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public int getRam() {
        return ram;
    }

    public String getRenk() {
        return renk;
    }
}
