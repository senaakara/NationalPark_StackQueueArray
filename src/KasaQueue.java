
public class KasaQueue
{
    private final int index; private final int[] kuyrukListesi; private int bas; private int son;
    public KasaQueue(int s) {
        index = s;
        kuyrukListesi = new int[index];
        bas = 0;
        son = -1;
    }
    public void insert(int j)                   // kuyruğa ekleme yapılan metod.
    {
        if(son == index -1) {
            son = -1;
        }
        kuyrukListesi[++son] = j;
    }
    public int sil()                        // kuyruktan silme yapılan ve silineni döndüren metod.
    {
        int gecici = kuyrukListesi[bas];
        kuyrukListesi[bas] = 0;
        bas++;
        if(bas == index)
            bas = 0;

        return gecici;
    }

}