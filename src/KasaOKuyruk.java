import java.util.ArrayList;
import java.util.List;
public class KasaOKuyruk {

    private final int kapasite; private final List<Integer> kuyrukListesi; private int bas; private int son;
    public KasaOKuyruk(int s) {
        kapasite = s;
        kuyrukListesi = new ArrayList<>();
        bas = 0;
        son = -1;
    }
    public void ekle(int i)                 // kuyruğa ekleme yapılan metod.
    {
        if(son == kapasite -1) {
            son = -1;
        }
        kuyrukListesi.add(++son,i);
    }
    public int sil(){                   //kuyruktan öncelikli silme yapılan ve silineni döndüren metod.
        int kucukSayi = 999999;
        int kucukSayiIndex = 0;
        for (int i = 0; i < kuyrukListesi.size(); i++) {
            if (kuyrukListesi.get(i) < kucukSayi){
                kucukSayi = kuyrukListesi.get(i);
                kucukSayiIndex = i;
            }
        }
        int silinen = kuyrukListesi.get(kucukSayiIndex);
        kuyrukListesi.remove(kucukSayiIndex);
        if (bas == kapasite){
            bas = 0;
        }
        return silinen;
    }
}
