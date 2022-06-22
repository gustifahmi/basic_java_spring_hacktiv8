//Class BangunDatar
abstract class BangunDatar {
    //Inisiasi attribut luas dan keliling
    private float luas, keliling;

    //Setter luas dan keliling
    void setLuas(float luas) {
        this.luas = luas;
    }

    void setKeliling(float keliling) {
        this.keliling = keliling;
    }

    //Getter luas dan keliling
    float getLuas() {
        return luas;
    }

    float getKeliling() {
        return keliling;
    }

    //Abstract method
    abstract void calculateLuas();
    abstract void calculateKeliling();
}

//Class Persegi
class Persegi extends BangunDatar {
    //Inisiasi sisi
    private float sisi;

    //Constructor
    Persegi(float sisi) {
        this.sisi = sisi;
        calculateLuas();
        calculateKeliling();
    }

    //Setter sisi
    void setSisi(float sisi) {
        this.sisi = sisi;
    }

    //Getter sisi
    float getSisi() {
        return sisi;
    }

    //Calculate luas
    void calculateLuas() {
        float luas = (float)Math.pow(this.sisi, 2);
        setLuas(luas);
    }

    //Calculate keliling
    void calculateKeliling() {
        float keliling = 4 * this.sisi;
        setKeliling(keliling);
    }
}

//Class Lingkaran
class Lingkaran extends BangunDatar {
    //Inisiasi r
    private float r;

    //Constructor
    Lingkaran(float r) {
        this.r = r;
        calculateLuas();
        calculateKeliling();
    }

    //Setter r
    void setR(float r) {
        this.r = r;
    }

    //Getter r
    float getR() {
        return r;
    }

    //Calculate Luas
    void calculateLuas() {
        float luas = (float)3.14 * (float)Math.pow(this.r, 2);
        setLuas(luas);
    }

    //Calculate Keliling
    void calculateKeliling() {
        float keliling = 2 * (float)3.14 * this.r;
        setKeliling(keliling);
    }
}

//Class Persegi Panjang
class PersegiPanjang extends BangunDatar {
    //Inisiasi panjang dan lebar
    private float panjang, lebar;

    //Constructor
    PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        calculateLuas();
        calculateKeliling();
    }    

    //Setter panjang dan lebar
    void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    void setLebar(float lebar) {
        this.lebar = lebar;
    }

    //Getter panjang dan lebar
    float getPanjang() {
        return panjang;
    }

    float getLebar() {
        return lebar;
    }

    //Calculate Luas
    void calculateLuas() {
        float luas = this.panjang * this.lebar;
        setLuas(luas);
    }

    //Calculate Keliling
    void calculateKeliling() {
        float keliling = (2 * this.panjang) + (2 * this.lebar);
        setKeliling(keliling);
    }
}

class Segitiga extends BangunDatar {
    //Inisiasi alas dan tinggi
    private float alas, tinggi, sisi;

    //Constructor
    Segitiga(float alas, float tinggi, float sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        calculateLuas();
        calculateKeliling();
    }  
    
    //Setter alas, tinggi, dan sisi
    void setAlas(float alas) {
        this.alas = alas;
    }

    void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    void setSisi(float sisi) {
        this.sisi = sisi;
    }

    //Getter alas, tinggi, dan sisi
    float getAlas() {
        return alas;
    }

    float getTinggi() {
        return tinggi;
    }

    float getSisi() {
        return sisi;
    }

    //Calculate Luas
    void calculateLuas() {
        float luas = this.alas * this.tinggi / 2;
        setLuas(luas);
    }

    //Calculate Keliling
    void calculateKeliling() {
        float keliling = alas + tinggi + sisi;
        setKeliling(keliling);
    }
}

//Class yang memiliki main method
public class LatihanObjek {
    public static void main(String[] args) {
        //Persegi
        float panjangPersegi = 8;
        Persegi persegi = new Persegi(panjangPersegi);

        System.out.printf("Sisi: %.2f, Luas: %.2f, Keliling: %.2f\n",
        panjangPersegi, persegi.getLuas(), persegi.getKeliling());
    
        //Lingkaran
        float rLingkaran = 10;
        Lingkaran lingkaran = new Lingkaran(rLingkaran);

        System.out.printf("Jari-jari: %.2f, Luas: %.2f, Keliling: %.2f\n",
        rLingkaran, lingkaran.getLuas(), lingkaran.getKeliling());
    
        //Persegi Panjang
        float panjangPersegiPanjang = 5;
        float lebarPersegiPanjang = 7;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.printf("Panjang: %.2f, Lebar: %.2f, Luas: %.2f, Keliling: %.2f\n", 
        panjangPersegiPanjang, lebarPersegiPanjang, persegiPanjang.getLuas(), persegiPanjang.getKeliling());

        //Segitiga
        float alasSegitiga = 6;
        float tinggiSegitiga = 8;
        float sisiSegitiga = 10;
        
        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, sisiSegitiga);
        System.out.printf("Alas: %.2f, Tinggi: %.2f, Sisi: %.2f, Luas: %.2f, Keliling: %.2f\n",
        alasSegitiga, tinggiSegitiga, sisiSegitiga, segitiga.getLuas(), segitiga.getKeliling());
    }
}