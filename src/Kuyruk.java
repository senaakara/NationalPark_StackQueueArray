
public class Kuyruk
{
    private final int kapasite; private final Object[] kuyrukListesi; private int bas; private int son;
    public Kuyruk(int s) {
        kapasite = s;
        kuyrukListesi = new Object[kapasite];
        bas = 0;
        son = -1;
    }
        public void ekle(Object j)          // kuyruğa ekleme yapılan metod.
        {
            if(son == kapasite -1) {
                son = -1;
            }
        kuyrukListesi[++son] = j;
    }
public Object sil()             //kuyruktan silme yapılan metod.
    {
        Object gecici = kuyrukListesi[bas];
        kuyrukListesi[bas] = null;
        bas++;
        if(bas == kapasite)
            bas = 0;
        return "Kuyruktan çıkarılıyor... "+gecici;
    }
        }