
public class Main {
    public static void main(String[] args) {
        String[] parkAdi = {"Yozgat Çamlığı Milli Parkı"," Karatepe - Aslantaş Milli Parkı", "Soğuksu Milli Parkı", "Kuşcenneti Milli Parkı", "Uludağ Milli Parkı" ,"Yedigöller Milli Parkı", "Dilek Y. – B. Menderes D. Milli Parkı", "Spil Dağı Milli Parkı" ,"Kızıldağ Milli Parkı","Güllük Dağı - Termessos Milli Parkı",
                "Kovada Gölü Milli Parkı", "Munzur Vadisi Milli Parkı", "Beydağları Sahil Milli Parkı", "Köprülü Kanyon Milli Parkı", "Ilgaz Dağı Milli Parkı", "Başkomutan Tarihi Milli Parkı", "Altındere Vadisi Milli Parkı","Boğazköy – Alacahöyük Milli Parkı",
                "Nemrut Dağı Milli Parkı", "Beyşehir Gölü Milli Parkı", "Kazdağı Milli Parkı", "Altınbeşik Mağarası Milli Parkı" ,"Hatila Vadisi Milli Parkı", "Karagöl – Sahara Milli Parkı" ,
                "Kaçkar Dağları Milli Parkı", "Aladağlar Milli Parkı" ,"Marmaris Milli Parkı", "Saklıkent Milli Parkı", "Troya Tarihi Milli Parkı","Honaz Dağı Milli Parkı",
                "Küre Dağları Milli Parkı" ,"Sarıkamış-Allahuekber Dağları Milli Parkı","Ağrı Dağı Milli Parkı","Gala Gölü Milli Parkı","Sultan Sazlığı Milli Parkı",
                "Tek Tek Dağları Milli Parkı ","İğneada Longoz Ormanları Milli Parkı", "Yumurtalık Lagünü Milli Parkı", "Nene Hatun Tarihi Milli Parkı", "Sakarya Meydan Muharebesi Tarihi Milli Parkı",
                "Kop Dağı Müdafaası Tarihi Milli Parkı","Malazgirt Meydan Muharebesi Tarihi Milli Parkı","İstiklal Yolu Tarihi Milli Parkı ","Botan Vadisi Milli Parkı", "Hakkari Cilo ve Sat Dağları Milli Parkı", "Sarıçalı Dağı Milli Parkı", "Derebucak Çamlık Mağaraları Milli Parkı", "Abant Gölü Milli Parkı"};
        String[] ilAdlari = {"Yozgat", "Osmaniye", "Ankara" ,"Balıkesir", "Bursa" ,"Bolu", "Aydın",
                "Manisa", "Isparta", "Antalya", "Isparta" ,"Tunceli", "Antalya", "Antalya", "Kastamonu", "Afyonkarahisar",
                "Trabzon", "Çorum", "Adıyaman", "Konya","Balıkesir", "Antalya", "Artvin", "Artvin", "Rize" ,"Niğde",
                "Muğla", "Muğla" ,"Çanakkale" ,"Denizli" ,"Kastamonu", "Kars", "Ağrı", "Edirne", "Kayseri", "Şanlıurfa",
                "Kırklareli", "Adana", "Erzurum", "Ankara", "Bayburt","Muş",
                "Kastamonu" ,"Siirt", "Hakkari" ,"Ankara", "Konya" ,"Bolu"};
        int[] ilanYili ={1958 ,1958 ,1959 ,1959 ,1961 ,1965,1966,1968 ,1969,1970,1970,1971,1972,1973 ,1976,1981
                ,1987,1988,1988 ,1993 ,1994 ,1994 ,1994 ,1994 ,1994 ,1995 ,1996 ,1996 ,1996 ,1998 ,2000,2004,2004 ,2005
                ,2006 ,2007,2007,2008 ,2009,2015 ,2016, 2018,2018, 2019, 2020, 2021, 2022, 2022};
        int[] yuzolcum = {517, 4143 ,1186 ,17058 ,13024 ,1623,27598, 6801, 80200, 6700,6551 ,42674 ,31166 ,47473, 1118 ,34834 ,4468,
                2600,13827 ,82157, 20935 ,1147 ,16944 ,3251 ,52970 ,55064 ,29206 ,1643 ,13517 ,9429 ,37753,
                22520,88015, 5923, 24358 ,19335,3155,16980 ,387,  13850 ,6335,238, 236, 11358,27500, 1024 ,1147, 1262};
        int[] sayilar = {8, 9, 6, 7, 10, 1, 11, 5, 3, 4, 2};
        int sayac = 0;
        int sayac2 = 0;
        for (int i = 0; i < parkAdi.length; i++) {                                                  // parkın büyük veya küçük olduğunun anlaşıldığı yer.
            MilliPark parknesnesi = new MilliPark(parkAdi[i],ilAdlari[i],ilanYili[i],yuzolcum[i]);
            if (parknesnesi.getYuzolcumu() < 15000){
                sayac++;
            }
            else
                sayac2++;
        }

        Array<Object> kucukNesneler = new Array<>(sayac);                   // Object tipinde veri tutan dizilerin oluşturulduğu yer.
        Array<Object> buyukNesneler = new Array<>(sayac2);
        Stack stack = new Stack(parkAdi.length);
        Kuyruk kuyruk = new Kuyruk(parkAdi.length);
        OncelikliKuyruk kuyruk2 = new OncelikliKuyruk(parkAdi.length);

        int kucuk_toplam = 0;  int buyuk_toplam = 0;  int sayac3 = 0;   int sayac4 = 0;

        for (int i = 0; i < parkAdi.length; i++) {                           // parkın büyük veya küçük olduğunun anlaşılıp toplama eklenen yer.
            MilliPark parknesnesi = new MilliPark(parkAdi[i],ilAdlari[i],ilanYili[i],yuzolcum[i]);
            if (parknesnesi.getYuzolcumu() < 15000){
                kucuk_toplam += parknesnesi.getYuzolcumu();
                kucukNesneler.set(sayac3,parknesnesi);
                sayac3++;
            }
            else{
                buyuk_toplam += parknesnesi.getYuzolcumu();
                buyukNesneler.set(sayac4,parknesnesi);
                sayac4++;
            }
        }
        Array<Array<Object>> kucukbuyukListe = new Array<>(2);
        kucukbuyukListe.set(0,kucukNesneler);
        kucukbuyukListe.set(1,buyukNesneler);

        listele(kucukbuyukListe);                                                        // listeleme ve printlerin başladığı yer.
        System.out.println();
        System.out.println("Küçük arazilerin yüzölçümü toplamı = "+kucuk_toplam);
        System.out.println("Büyük arazilerin yüzölçümü toplamı = "+buyuk_toplam);
        System.out.println();
        System.out.println("MİLLİ PARK YIĞIT YAPISI");System.out.println();
        stackEkle(parkAdi,ilAdlari,ilanYili,yuzolcum,stack);
        stackYazdir(parkAdi,stack);
        System.out.println();
        System.out.println("MİLLİ PARK KUYRUK YAPISI");System.out.println();
        queueEkle(parkAdi,ilAdlari,ilanYili,yuzolcum,kuyruk);
        queueYazdir(parkAdi,kuyruk);
        System.out.println();
        System.out.println("öNCELİKLİ KUYRUK YAPISI");System.out.println();
        onceliklikuyrukYazdir(parkAdi,ilAdlari,ilanYili,yuzolcum,kuyruk2);System.out.println();
        System.out.println("KUYRUK YAPISINDA MÜŞTERİLERİN BEKLEME SÜRESİ");System.out.println();
        kuyrukKasaYazdir(sayilar);System.out.println();
        System.out.println("ÖNCELİKLİ KUYRUK YAPISINDA MÜŞTERİLERİN BEKLEME SÜRESİ");System.out.println();
        oncelikliKasaYazdir(sayilar);
    }

    public static void listele(Array<Array<Object>> kucukbuyukListe){
        System.out.println();
        System.out.println("KÜÇÜK ARAZİYE SAHİP MİLLİ PARKLAR");
        System.out.println();
        for (int i = 0; i < kucukbuyukListe.get(0).uzunluk; i++) {
            System.out.println(kucukbuyukListe.get(0).get(i));
        }
        System.out.println();
        System.out.println("BÜYÜK ARAZİYE SAHİP MİLLİ PARKLAR");
        System.out.println();
        for (int i = 0; i < kucukbuyukListe.get(1).uzunluk; i++) {
            System.out.println(kucukbuyukListe.get(1).get(i));
        }
    }

    public static void stackEkle(String[] parkAdi,String[] ilAdlari,int[]ilanYili,int[]yuzolcum,Stack stack){  // yığıtımıza ekleme yaptığımız metod.

    for (int i = 0; i < parkAdi.length; i++) {
        MilliPark parknesnesi = new MilliPark(parkAdi[i],ilAdlari[i],ilanYili[i],yuzolcum[i]);
        stack.ekle(parknesnesi);
    }
}
    public static void stackYazdir(String[] parkAdi,Stack stack){                                               // yığıtımızdan elemanları çıkartarak yazdırdığımız metod.
        for (int i = 0; i < parkAdi.length; i++) {
            System.out.println(stack.sil());
        }
}
    public static void queueEkle(String[] parkAdi,String[] ilAdlari,int[]ilanYili,int[]yuzolcum,Kuyruk kuyruk){ // kuyruğumuza ekleme yaptığımız metod.

        for (int i = 0; i < parkAdi.length; i++) {
            MilliPark parknesnesi = new MilliPark(parkAdi[i],ilAdlari[i],ilanYili[i],yuzolcum[i]);
            kuyruk.ekle(parknesnesi);
        }
    }
    public static void queueYazdir(String[] parkAdi, Kuyruk kuyruk){                                        // kuyruğumuzdan elemanları çıkartarak yazdırdığımız metod.
        for (int i = 0; i < parkAdi.length; i++) {
            System.out.println(kuyruk.sil());
        }
    }
    public static void onceliklikuyrukYazdir(String[] parkAdi,String[] ilAdlari,int[]ilanYili,int[]yuzolcum,OncelikliKuyruk kuyruk){        // öncelikli kuyruğa ekleme yaparak yazdıran metod.

            for (int i = 0; i < parkAdi.length; i++) {
                MilliPark parknesnesi = new MilliPark(parkAdi[i],ilAdlari[i],ilanYili[i],yuzolcum[i]);
                kuyruk.ekle(parknesnesi);
            }
        if(!kuyruk.bosMu()){
            for (int i = 0; i < parkAdi.length; i++) {
                System.out.println(kuyruk.sil());
            }
        }
    }

    public static void kuyrukKasaYazdir(int[] sayilar){             // kasanın kuyruğuna ekleme yapıp yazdıran metod.
        KasaQueue kasaListesi = new KasaQueue(sayilar.length);
        int toplam = 0;
        int tumtoplam = 0;

        for (int j : sayilar) {
            kasaListesi.insert(j);
        }
        for (int i = 0; i < sayilar.length; i++) {
            toplam += kasaListesi.sil()*3;
            tumtoplam +=  toplam;
            System.out.println((i+1)+".müşterinin bekleme süresi = "+toplam+" saniye.");

        }
        double ortalamaSure =(double) tumtoplam/ sayilar.length;
        System.out.println();
        System.out.printf("%s","Kuyruk yapısında ortalama bekleme süresi = ");
        System.out.printf("%.2f",ortalamaSure);
        System.out.printf("%s"," saniye.");
        System.out.println();
    }
    public static void oncelikliKasaYazdir(int[] sayilar){                  // öncelikli kuyruğa ekleme yaparak yazdıran metod.
        KasaOKuyruk oncelikliListe = new KasaOKuyruk(sayilar.length);
        int toplam = 0;
        int tumtoplam = 0;
        for (int j : sayilar) {
            oncelikliListe.ekle(j);
        }
        for (int i = 0; i < sayilar.length; i++) {
            toplam += oncelikliListe.sil() * 3;
            System.out.println((i+1)+".müşterinin bekleme süresi = "+toplam+" saniye.");

            tumtoplam += toplam;
        }
        System.out.println();
        double ortalamaSure = (double)tumtoplam/sayilar.length;
        System.out.printf("%s","Öncelikli kuyruk yapısında ortalama bekleme süresi = ");
        System.out.printf("%.2f",ortalamaSure);
        System.out.printf("%s"," saniye.");
    }
}
