
class GenericList<S> //istenilen tipte oluşturulmasını sağlamak için generic yapısını oluşturan kod parçası.
{
    private final Object[] array;
    public final int length;
    public GenericList(int length) //verilen uzunluğa göre bir liste yaratır.
    {
        array = new Object[length];
        this.length = length;
    }
    S get(int i) { // listenin i. indexini döndürür.
        @SuppressWarnings("unchecked")
        final S s = (S) array[i];
        return s;
    }
    void set(int i, S s) { //listenin i. indexine verilen tipteki atamayı yapar.
        array[i] = s;
    }
}


public class Main {
    public static void main(String[] args) {
        String[] milliParkAdlari = {"Yozgat Çamlığı Milli Parkı"," Karatepe - Aslantaş Milli Parkı", "Soğuksu Milli Parkı", "Kuşcenneti Milli Parkı", "Uludağ Milli Parkı" ,"Yedigöller Milli Parkı", "Dilek Y. – B. Menderes D. Milli Parkı", "Spil Dağı Milli Parkı", "Kızıldağ Milli Parkı","Güllük Dağı - Termessos Milli Parkı",
                "Kovada Gölü Milli Parkı", "Munzur Vadisi Milli Parkı", "Beydağları Sahil Milli Parkı", "Köprülü Kanyon Milli Parkı", "Ilgaz Dağı Milli Parkı", "Başkomutan Tarihi Milli Parkı", "Altındere Vadisi Milli Parkı","Boğazköy – Alacahöyük Milli Parkı",
                "Nemrut Dağı Milli Parkı", "Beyşehir Gölü Milli Parkı", "Kazdağı Milli Parkı", "Altınbeşik Mağarası Milli Parkı" ,"Hatila Vadisi Milli Parkı", "Karagöl – Sahara Milli Parkı" ,
                "Kaçkar Dağları Milli Parkı", "Aladağlar Milli Parkı" ,"Marmaris Milli Parkı", "Saklıkent Milli Parkı", "Troya Tarihi Milli Parkı","Honaz Dağı Milli Parkı", "Küre Dağları Milli Parkı" ,"Sarıkamış-Allahuekber Dağları Milli Parkı","Ağrı Dağı Milli Parkı","Gala Gölü Milli Parkı","Sultan Sazlığı Milli Parkı",
                "Tek Tek Dağları Milli Parkı ","İğneada Longoz Ormanları Milli Parkı", "Yumurtalık Lagünü Milli Parkı", "Nene Hatun Tarihi Milli Parkı", "Sakarya Meydan Muharebesi Tarihi Milli Parkı", "Kop Dağı Müdafaası Tarihi Milli Parkı","Malazgirt Meydan Muharebesi Tarihi Milli Parkı","İstiklal Yolu Tarihi Milli Parkı ","Botan Vadisi Milli Parkı", "Hakkari Cilo ve Sat Dağları Milli Parkı", "Sarıçalı Dağı Milli Parkı", "Derebucak Çamlık Mağaraları Milli Parkı", "Abant Gölü Milli Parkı"};
        String[] ilAdlari = {"Yozgat", "Osmaniye", "Ankara" ,"Balıkesir", "Bursa" ,"Bolu", "Aydın",
                "Manisa", "Isparta", "Antalya", "Isparta" ,"Tunceli", "Antalya", "Antalya", "Kastamonu", "Afyonkarahisar",
                "Trabzon", "Çorum", "Adıyaman", "Konya","Balıkesir", "Antalya", "Artvin", "Artvin", "Rize" ,"Niğde",
                "Muğla", "Muğla" ,"Çanakkale" ,"Denizli" ,"Kastamonu", "Kars", "Ağrı", "Edirne", "Kayseri", "Şanlıurfa",
                "Kırklareli", "Adana", "Erzurum", "Ankara", "Bayburt","Muş",
                "Kastamonu" ,"Siirt", "Hakkari" ,"Ankara", "Konya" ,"Bolu"};
        int [] ilanYillari = {1958 ,1958 ,1959 ,1959 ,1961 ,1965,1966,1968 ,1969,1970,1970,1971,1972,1973 ,1976,1981
                ,1987,1988,1988 ,1993 ,1994 ,1994 ,1994 ,1994 ,1994 ,1995 ,1996 ,1996 ,1996 ,1998 ,2000,2004,2004 ,2005
                ,2006 ,2007,2007,2008 ,2009,2015 ,2016, 2018, 2018, 2019, 2020, 2021, 2022, 2022};
        int[] yuzOlcumleri = {517, 4143 ,1186 ,17058 ,13024 ,1623,27598, 6801, 80200, 6700,6551 ,42674 ,31166 ,47473,
                1118 ,34834 ,4468, 2600,13827 ,82157, 20935 ,1147 ,16944 ,3251 ,52970 ,55064 ,29206 ,1643 ,13517 ,9429 ,
                37753, 22520,88015, 5923, 24358 ,19335,3155,16980 ,387,  13850 ,6335,238, 236, 11358,27500, 1024 ,1147, 1262};

        int[] urunSayilari = {8, 9, 6, 7, 10, 1, 11, 5, 3, 4, 2 };

        int index = 0;
        int index2 = 0;

        for (int i = 0; i < 48; i++) {
            MilliPark milliParkNesnesi = new MilliPark(milliParkAdlari[i], ilAdlari[i], ilanYillari[i], yuzOlcumleri[i]); //listeden çekilen bilgilere göre nesnenin oluşturulduğu kısım.
            int sinirhektar = 15000;
            if (milliParkNesnesi.getYuzOlcumu() < sinirhektar){
                index ++; //küçük milli parkların sayısı arttırılıyor.
            }else{
                index2 ++; //büyük milli parkların sayısı arttırılıyor.
            }
        }

        //küçük ve büyük milli parkların generic şekilde listesinin oluşturulduğu yer.
        GenericList<Object> kucukMilliParklar = new GenericList<>(index);
        GenericList<Object> buyukMilliParklar = new GenericList<>(index2);

        int sonIndex = 0;
        int sonIndex2 = 0;
        int toplamkucuk = 0;
        int toplambuyuk = 0;


        //küçük ve büyük milli parkların yüzölçümü toplamlarının hesaplandığı kod.
        for (int i = 0; i < 48; i++) {
            MilliPark milliParkNesnesi = new MilliPark(milliParkAdlari[i], ilAdlari[i], ilanYillari[i], yuzOlcumleri[i]);
            int sinirhektar = 15000;

            if (milliParkNesnesi.getYuzOlcumu() < sinirhektar){
                kucukMilliParklar.set(sonIndex,milliParkNesnesi);
                toplamkucuk += milliParkNesnesi.getYuzOlcumu();
                sonIndex ++;
            }else{
                buyukMilliParklar.set(sonIndex2,milliParkNesnesi);
                toplambuyuk += milliParkNesnesi.getYuzOlcumu();
                sonIndex2 ++;
            }
        }

        GenericList<GenericList<Object>> tumMilliParklar = new GenericList<>(2); // küçük ve büyük milli parkların tutulduğu 2 elemanlı generic liste.
        tumMilliParklar.set(0, kucukMilliParklar);
        tumMilliParklar.set(1, buyukMilliParklar);

        //gerekli metodların çağrıldığı kısım.
        GenericListeYazdir(tumMilliParklar);
        System.out.println();
        System.out.println("Küçük Milli Parkların Yüz Ölçümü Toplamı: " + toplamkucuk);
        System.out.println("Büyük Milli Parkların Yüz Ölçümü Toplamı: " + toplambuyuk);
        System.out.println();
        System.out.println("------- Milli Park's Stack Array ------");
        stackOlusturYazdir(milliParkAdlari,ilAdlari,ilanYillari,yuzOlcumleri);
        System.out.println();
        System.out.println("------- Milli Park's Queue Array ------");
        queueOlusturYazdir(milliParkAdlari,ilAdlari,ilanYillari,yuzOlcumleri);
        System.out.println();
        System.out.println("------- Milli Park's Priority Queue Array ------");
        priorityQueueOlusturYazdir(milliParkAdlari,ilAdlari,ilanYillari,yuzOlcumleri);
        System.out.println();
        System.out.println("------- Kasada Bekleyen Müşteriler Kuyruğu ------");
        QueueKasaOlusturYazdir(urunSayilari);
        System.out.println();
        System.out.println();
        System.out.println("------- Kasada Bekleyen Müşteriler Öncelikli Kuyruğu ------");
        PriorityQueueKasaOlusturYazdir(urunSayilari);
    }


    public static void GenericListeYazdir(GenericList<GenericList<Object>> dizi){ // 2 elemanlı generic listenin yazdırılmasını sağlayan metod.
        System.out.println("-------- Küçük Milli Parklar --------");
        for (int i = 0; i < dizi.get(0).length; i++) {
            System.out.println(dizi.get(0).get(i));
        }

        System.out.println();

        System.out.println("-------- Büyük Milli Parklar --------");
        for (int k = 0; k < dizi.get(1).length; k++) {
            System.out.println(dizi.get(1).get(k));
        }
    }

    //Stack yapısına ekleme yapılan ve yazdırılmasını sağlayan metod.
    public static void stackOlusturYazdir(String[] milliParkAdlari, String[]ilAdlari, int[]ilanYillari , int[]yuzOlcumleri){
        Stack milliParkStack = new Stack(48);
        for (int i = 0; i < 48; i++) {
            MilliPark milliParkNesnesi = new MilliPark(milliParkAdlari[i], ilAdlari[i], ilanYillari[i], yuzOlcumleri[i]);
            milliParkStack.push(milliParkNesnesi);
        }

        for (int i = 0; i < 48; i++) {
            System.out.println("Stackten çıkarılıyor... " + milliParkStack.pop());
        }

    }

    //queue yapısına ekleme yapılan ve yazdırılmasını sağlayan metod.
    public static void queueOlusturYazdir(String[] milliParkAdlari, String[]ilAdlari, int[]ilanYillari , int[]yuzOlcumleri){
        Queue milliParkQueue = new Queue(48);
        for (int i = 0; i < 48; i++) {
            MilliPark milliParkNesnesi = new MilliPark(milliParkAdlari[i], ilAdlari[i], ilanYillari[i], yuzOlcumleri[i]);
            milliParkQueue.insert(milliParkNesnesi);
        }

        for (int i = 0; i < 48; i++) {
            System.out.println("Kuyruktan çıkarılıyor... " + milliParkQueue.peek());
            milliParkQueue.remove();

        }
    }

    //öncelikli kuyruk yapısına ekleme yapan ve yazdırılmasını sağlayan metod.
    public static void  priorityQueueOlusturYazdir(String[] milliParkAdlari, String[]ilAdlari, int[]ilanYillari , int[]yuzOlcumleri){
        PriorityQueue milliParkPriQueue = new PriorityQueue(48);
        for (int i = 0; i < 48; i++) {
            MilliPark milliParkNesnesi = new MilliPark(milliParkAdlari[i], ilAdlari[i], ilanYillari[i], yuzOlcumleri[i]);
            milliParkPriQueue.insert(milliParkNesnesi);
        }

        for (int i = 0; i < 48; i++) {
            System.out.println("Öncelikli kuyruktan çıkartılıyor... " + milliParkPriQueue.remove());
        }
    }

    //Kasada bekleyen müşteriler kuyruğunu oluşturup yazdıran ve gerekli işlemleri gerçekleştiren metod.
    public static void QueueKasaOlusturYazdir(int[] urunSayilari){
        QueueKasa urunSayilariQueue = new QueueKasa(urunSayilari.length);
        int sum = 0;
        int allSum = 0;

        for (int j : urunSayilari) {
            urunSayilariQueue.insert(j);
        }

        for (int i = 0; i < urunSayilari.length; i++) {
            sum += urunSayilariQueue.remove()*3;
            allSum +=  sum;
            System.out.println((i+1)+ ". müşterinin bekleme süresi:: "+ sum + " saniye");
        }
        double avarageTime = (double) allSum/ urunSayilari.length;
        System.out.println();
        System.out.printf("%s","Müşterilerin ortalama bekleme süresi: ");
        System.out.printf("%.2f",avarageTime );
        System.out.printf("%s"," saniye");
    }

    // Öncelikli kuyruk yapısına göre kasada bekleyen müşterileri ekleyen ve yazdırıp gerekli işlemleri gerçekleştiren metod.
    public static void PriorityQueueKasaOlusturYazdir(int[] urunSayilari){
        PriorityQueueKasa urunSayilariPriQueue = new PriorityQueueKasa(urunSayilari.length);
        int sum = 0;
        int allSum = 0;

        for (int j : urunSayilari) {
            urunSayilariPriQueue.insert(j);
        }
        for (int i = 0; i < urunSayilari.length; i++) {
            sum += urunSayilariPriQueue.remove() * 3;
            System.out.println( (i+1)+ ". müşterinin bekleme süresi:: "+ sum + " saniye" );
            allSum += sum;
        }
        double avarageTime = (double) allSum / urunSayilari.length;
        System.out.println();
        System.out.printf("%s","Müşterilerin ortalama bekleme süresi: ");
        System.out.printf("%.2f",avarageTime );
        System.out.printf("%s"," saniye");
    }
}

