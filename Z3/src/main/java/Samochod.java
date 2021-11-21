
public class Samochod {
    private int ciezar;
    private float wysokosc;
    private float aktualna_predkosc;
    private String marka;
//kontstruktor:
    public Samochod(){}
    public Samochod(int ciezar, float wysokosc, float aktualna_predkosc, String marka){
        this.ciezar = ciezar;
        this.wysokosc = wysokosc;
        this.aktualna_predkosc = aktualna_predkosc;
        this.marka=marka;
    }
     public int getCiezar() {
        return ciezar;
    }

    public float getWysokosc() {
        return wysokosc;
    }

    public float getAktualna_predkosc() {
        return aktualna_predkosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setCiezar(int ciezar) {
        this.ciezar = ciezar;
    }

    public void setWysokosc(float wysokosc) {
        this.wysokosc = wysokosc;
    }

    public void setAktualna_predkosc(float aktualna_predkosc) {
        this.aktualna_predkosc = aktualna_predkosc;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void wlacz_sie_do_ruchu(){
        System.out.println("Wlaczam do ruchu");
                }
    public void zatrzymaj_sie(){
        System.out.println("Zatrzymuje sie");
        while(getAktualna_predkosc()!=0){
                setAktualna_predkosc(getAktualna_predkosc()-1);
            
        }
        System.out.println(getAktualna_predkosc());
    }
    public void zwieksz_predkosc(float predkosc){
        while(getAktualna_predkosc()!= predkosc){
            if(getAktualna_predkosc()<predkosc){
                setAktualna_predkosc(getAktualna_predkosc()+1);
            }
            else if(getAktualna_predkosc()>predkosc){
                setAktualna_predkosc(getAktualna_predkosc()-1);
            }
        }
        System.out.println(getAktualna_predkosc());
    }

    @Override
    public String toString() {
        return "Samochod{" + "ciezar=" + ciezar + ", wysokosc=" + wysokosc + ", aktualna_predkosc=" + aktualna_predkosc + ", marka=" + marka + '}';
    }
}
