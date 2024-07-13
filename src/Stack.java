
public class Stack {
    private int indeks;
    private final int kapasite;
    private final Object[] stackListesi;
    public Stack(int kapasite) {
        this.kapasite = kapasite;
        this.stackListesi = new Object[kapasite];
        this.indeks = -1;
    }

    public boolean bosMu(){
        return indeks < kapasite - 1;
    }
    public void ekle(Object product){                   // yığıta ekleme yapılan metod.
        if(bosMu()){
            indeks = indeks + 1;
            stackListesi[indeks] = product;
        }else{
            System.out.println("Overflow durumu oluştu!");
        }
    }
    public Object sil(){                                // yığıttan silme yapılan metod.
        if (indeks == -1){
            return "Underflow durumu oluştu!";
        }
        else
        {
            Object milliPark = stackListesi[indeks];
            stackListesi[indeks] = null;
            indeks = indeks - 1;
            return  "Yığıttan çıkarılıyor... " + milliPark;
        }
    }
}
