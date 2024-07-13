import java.util.*;
public class PriorityQueue {
    private final int capacity;
    private final List<MilliPark> priorityQueueArray;
    private int last ;
    private int first;

    public PriorityQueue(int capacity) { // gerekli değişkenlerin atandığı metod.
        this.capacity = capacity;
        this.priorityQueueArray = new ArrayList<>(capacity) ;
        this.last = -1;

    }

    public void insert(MilliPark milliPark){ // ekleme yapan kod.
        if(last == capacity -1){
            last = -1;
        }
        priorityQueueArray.add(++last,milliPark);

    }

    public Object remove(){ // öncelikli kuyruk yapısında nesnenin çıkartılmasını sağlayan kod.
        int enKucuk = 999999;
        int enkucukindex = 0;
        for (int i = 0; i < priorityQueueArray.size(); i++) {
            if (priorityQueueArray.get(i).getYuzOlcumu() < enKucuk){
                enKucuk = priorityQueueArray.get(i).getYuzOlcumu();
                enkucukindex = i;
            }
        }
        MilliPark milliPark = priorityQueueArray.get(enkucukindex);
        priorityQueueArray.remove(enkucukindex);

        if (first == capacity){
            first = 0;
        }
        return milliPark;

    }


    public boolean isEmpty(){
        return (priorityQueueArray.size() == 0);
    } //liste boş mu? kontrolünü yapar.

    public boolean isFull(){
        return (priorityQueueArray.size() == capacity);
    } //liste dolu mu? kontrolünü yapar.

    @Override
    public String toString() { //yazdırılmayı sağlayan metod.
        return "PriorityQueue{" +
                "priorityQueueArray=" + priorityQueueArray +
                '}';
    }
}
