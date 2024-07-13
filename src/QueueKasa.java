
public class QueueKasa {

    private final int capacity;
    private final int[] queueArrayKasa;
    private  int first;
    private  int last;

    public QueueKasa(int capacity) { //kasa kuyruğu için gerekli değişken atamlarının yapıldığı yer.
        this.capacity = capacity;
        this.queueArrayKasa = new int[capacity];
        this.last = -1;
        this.first = 0;

    }
    public void insert(int islem){ //kasa kuyruğuna ekleme sağlayan kod.
        if(last == capacity -1){
            last = -1;
        }
        queueArrayKasa[++last] = islem;
    }

    public int remove(){ // kasa kuyruğunda baştan silmeyi sağlayıp işlem süresini döndüren metod.
        int islem = queueArrayKasa[first];
        queueArrayKasa[first] = 0;
        first++;
        if (first == capacity){
            first = 0;
        }
        return  islem;

    }


}
