
public class Array<E> {
    private final Object[] dizi;
    public final int uzunluk;

    // constructor metot
    public Array(int uzunluk)
    {
        // object tutan yeni bir dizi oluşturur.
        dizi = new Object[uzunluk];
        this.uzunluk = uzunluk;
    }

    // get metodu
    public E get(int i) {
        @SuppressWarnings("unchecked")
        final E e = (E) dizi[i];
        return e;
    }

    // set metodu
    public void set(int i, E e) {
        dizi[i] = e;
    }
}
