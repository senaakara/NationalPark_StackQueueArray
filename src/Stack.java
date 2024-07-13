
public class Stack {
    private int index;
    // Oluşturulan dizinin kapasitesini tutar.
    private final int capacity;
    // MilliPark tipinde veri tutan bir yığıt dizisi oluşturulur.
    private final MilliPark[] stackArray;


    public Stack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new MilliPark[capacity];
        this.index = -1;
    }
    /*Yığıtın boş olup olmadığının kontrolünü yapar. Belirlenen kapasitenin
    altındayken yığıt boştur ve true değerini döndürür.*/
    public boolean isEmpty(){
        return index < capacity - 1;
    }
    /*Yığıtın boş veya dolu olmasına göre ya ekleme yapar ya da yığıtın
   taştığının bilgisini verir*/
    public void push(MilliPark milliPark){
        if(isEmpty()){
            index = index + 1;
            stackArray[index] = milliPark;
        }else{
            System.out.println("Stack is overflow, cannot be added!!");
        }
    }

    //Yığıtın en üstündeki elemanı çıkartarak geri döndürür.
    public Object pop(){
        // İndexin -1 olması yığıtın boş olduğunu gösterir.
        if (index == -1){
            System.out.println("Stack is underflow, the element cannot be retrieved!!");
            return -1;
        }
        else /* Yığıt doluysa index(üstünü tutan değer) 1 azaltılır çıkarılan
             nesneler yazdırılır. */
        {
            MilliPark milliPark = stackArray[index];

            index = index -1;
            return  milliPark;


        }
    }

}

