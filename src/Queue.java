

public class Queue {
    private final int capacity;
    private final MilliPark[] queueArray;
    private  int first;
    private  int last;

    public Queue(int capacity) { // gerekli değişkenleri atayan kod.
        this.capacity = capacity;
        this.queueArray = new MilliPark[capacity];
        this.last = -1;
        this.first = 0;
    }

    public void insert(MilliPark milliPark){ // ekleme yapan kod.
        if(last == capacity -1){
            last = -1;
        }
        queueArray[++last] = milliPark;
    }

    public Object remove(){ //çıkarılan nesneyi döndürür.
        MilliPark milliPark = queueArray[first];
        queueArray[first] = null;
        first++;
        if (first == capacity){
            first = 0;
        }
        return "Kuyruktan çıkarılıyor.... " + milliPark;

    }
    public Object peek(){
        return queueArray[first];
    }

}
