public class MilliPark {
    String milliParkAdi;
    String ilAdi;
    int ilanYili;
    int yuzOlcumu;

    public MilliPark(String milliParkAdi, String ilAdi, int ilanYili, int yuzOlcumu) {
        this.milliParkAdi = milliParkAdi;
        this.ilAdi = ilAdi;
        this.ilanYili = ilanYili;
        this.yuzOlcumu = yuzOlcumu;
    }

    public String getMilliParkAdi() {
        return milliParkAdi;
    }

    public String getIlAdi() {
        return ilAdi;
    }

    public int getIlanYili() {return ilanYili;}


    public int getYuzOlcumu() {return yuzOlcumu;}


    @Override
    public String toString() {
        return
                "Adı:" + getMilliParkAdi() +
                " Bulunduğu İl: " + getIlAdi() +
                " İlan Yılı:" + getIlanYili() +
                " Yüz Ölçümü:" + getYuzOlcumu() ;
    }
}
