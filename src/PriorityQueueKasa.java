import java.util.*;

public class PriorityQueueKasa {
    private final int capacity;
    private final ArrayList<Integer> priorityQueueArray;
    private int last ;
    private int first;


    public PriorityQueueKasa(int capacity) { // öncelikli kuyruk değişkenlerinin atandığı yer.
        this.capacity = capacity;
        this.priorityQueueArray = new ArrayList<>(capacity) ;
        this.last = -1;

    }

    public void insert(int islem){ // ekleme işleminin yapıldığı metod.
        if(last == capacity -1){
            last = -1;
        }
        priorityQueueArray.add(++last,islem);

    }

    public int remove(){ //sıralayarak en az ürün sayısını döndürür.
        int enKucuk = 999999;
        int enkucukindex = 0;
        for (int i = 0; i < priorityQueueArray.size(); i++) {
            if (priorityQueueArray.get(i) < enKucuk){
                enKucuk = priorityQueueArray.get(i);
                enkucukindex = i;
            }
        }
        int islem = priorityQueueArray.get(enkucukindex);
        priorityQueueArray.remove(enkucukindex);

        if (first == capacity){
            first = 0;
        }
        return  islem;


    }

    public boolean isEmpty(){
        return (priorityQueueArray.size() == 0);
    }

    public boolean isFull(){
        return (priorityQueueArray.size() == capacity);
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "priorityQueueArray=" + priorityQueueArray +
                '}';
    }
}

