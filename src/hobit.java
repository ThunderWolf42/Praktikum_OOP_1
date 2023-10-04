public class hobit {
    // instant variabel
    public String nama;
    public int umur;
    public hobit temanHobit;
    private boolean magis= false;
    protected double tinggi = 2.6;
    public static final int MAX_HEIGHT=3;// maksimum tinggi

    // Constructor atau konstruktor
    hobit (String nm, int umr, hobit tmn, double tng)
    {
        nama = nm;
        umur = umr;
        temanHobit= tmn;
        tinggi = tng;
    }

    //default konstruktor atau konstruktor bawaan
    hobit()
    {
        nama = "Hayam Wuruk";
        umur = 34;
        temanHobit= null;
        tinggi =2.1;
    }

    // methods atau metode
    public static void buatRaja(hobit h)
    {
        h.nama = "Raja" + h.ambilNamaAsli();
        h.magis= true;
    }

    public void buatRaja()
    {
        nama= "Raja"+ambilNamaAsli();
        magis=true;
    }

    public boolean apakahMagis(){return magis};
    public void aturTinggi(int tinggiBaru) {tinggi=tinggiBaru};
    public String ambilNamaAsli() {return nama};
    public void ubahHobit(String s){nama=s;}
}
