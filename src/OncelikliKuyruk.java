import java.util.ArrayList;
import java.util.List;
public class OncelikliKuyruk {

    private final int kapasite; private final List<MilliPark> kuyrukListesi; private int bas; private int son;
    public OncelikliKuyruk(int s) {
        kapasite = s;
        kuyrukListesi = new ArrayList<>();
        bas = 0;
        son = -1;
    }
    public void ekle(MilliPark milliPark)               // kuyruğa ekleme yapılan metod.
    {
        if(son == kapasite -1) {
            son = -1;
        }
        kuyrukListesi.add(++son,milliPark);
    }
    public Object sil(){                            //kuyruktan öncelikli silme yapılan metod.
        int kucukSayi = 999999;
        int kucukSayiIndex = 0;
        for (int i = 0; i < kuyrukListesi.size(); i++) {
            if (kuyrukListesi.get(i).getYuzolcumu() < kucukSayi){
                kucukSayi = kuyrukListesi.get(i).getYuzolcumu();
                kucukSayiIndex = i;
            }
        }
        MilliPark milliPark = kuyrukListesi.get(kucukSayiIndex);
        kuyrukListesi.remove(kucukSayiIndex);
        if (bas == kapasite){
            bas = 0;
        }
        return "Öncelikli kuyruktan çıkarılıyor.... " + milliPark;
}
    public boolean bosMu(){
        return (kuyrukListesi.size() == 0);
    }
}
