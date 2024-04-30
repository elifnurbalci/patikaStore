import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Magaza magaza = new Magaza();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Marka Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case  1:
                    System.out.println("Cep Telofonu Eklemek için 1' e basın..");
                    System.out.println("Notebook  Eklemek için 2' ye basın..");
                    int techSecim = scanner.nextInt();
                    System.out.print("Ürün Adı: ");
                    String urunAdi = scanner.nextLine();
                    System.out.print("Birim Fiyat: ");
                    double birimFiyat = scanner.nextDouble();
                    System.out.print("Stok Miktarı: ");
                    int stokMiktari = scanner.nextInt();
                    System.out.print("Marka ID: ");
                    int markaId = scanner.nextInt();

                    scanner.nextLine();
                    Marka marka = magaza.getMarkaById(markaId);
                    if (marka != null){
                        int depolama, kamera, ram;
                        double ekranBoyutu, pilGucu;
                        if (techSecim == 1){
                            System.out.print("Depolama (GB): ");
                            depolama = scanner.nextInt();
                            System.out.print("Ekran Boyutu (inç): ");
                            ekranBoyutu = scanner.nextDouble();
                            System.out.print("Kamera (MP): ");
                            kamera = scanner.nextInt();
                            System.out.print("Pil Gücü (mAh): ");
                            pilGucu = scanner.nextDouble();
                            scanner.nextLine();
                            Urun cepTelefonu = new Urun(birimFiyat,stokMiktari,urunAdi,marka,depolama,ekranBoyutu,kamera,pilGucu);
                            magaza.urunEkle(cepTelefonu,techSecim);
                        }else {
                            System.out.print("Depolama (GB): ");
                            depolama = scanner.nextInt();

                            System.out.print("RAM (GB): ");
                            ram = scanner.nextInt();
                            System.out.print("Ekran Boyutu (inç): ");
                            ekranBoyutu = scanner.nextDouble();
                            scanner.nextLine();
                            Urun notebook = new Urun(birimFiyat,stokMiktari,urunAdi,marka,depolama,ekranBoyutu,ram);
                            magaza.urunEkle(notebook,techSecim);
                        }
                        System.out.println("Urun Eklendi");
                    }else {
                        System.out.println("Geçersiz marka ID");
                    }
                    break;

                case 2:
                    magaza.urunListele();
                    break;
                case 3:
                    System.out.println("Silmek istediğiniz ürünü seçin");
                    int silinecekId = scanner.nextInt();
                    magaza.urunSil(silinecekId);
                    System.out.println("Urun Silindi");
                    break;
                case 4:
                    magaza.markaListele();
                    break;
                case 5:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz Seçim...");

            }
        }
    }


}
