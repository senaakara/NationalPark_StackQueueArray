public class MilliPark {
    String MilliPark_Adi, Il_Adlari; int Ilan_Yili,Yuzolcumu;
    public int getYuzolcumu() {
        return Yuzolcumu;
    }

    public MilliPark(String milliPark_Adi, String il_Adlari, int ilan_Yili, int yuzolcumu) {
        MilliPark_Adi = milliPark_Adi;
        Il_Adlari = il_Adlari;
        Ilan_Yili = ilan_Yili;
        Yuzolcumu = yuzolcumu;
    }
    @Override
    public String toString() {
        return "MilliPark{" +
                "MilliPark_Adi='" + MilliPark_Adi + '\'' +
                ", Il_Adlari='" + Il_Adlari + '\'' +
                ", Ilan_Yili=" + Ilan_Yili +
                ", Yuzolcumu=" + Yuzolcumu +
                '}';
    }
}
