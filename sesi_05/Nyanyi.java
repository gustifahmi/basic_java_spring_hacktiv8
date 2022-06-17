//Class Manusia 
abstract class Manusia {
    protected abstract void nyanyiLagu();
}

//Class Cewek
class Cewek extends Manusia {
    protected void nyanyiLagu() {
        System.out.println("Bintang Kecil di Langit yang Biru");
    }
}

//Class Cowok
class Cowok extends Manusia {
    protected void nyanyiLagu() {
        System.out.println("Ada Anak Bertanya pada Bapaknya");
    }
}

//Class Nyanyi
public class Nyanyi {
    public static void main(String[] args) {
        //Buat objek cewek
        Manusia cewek = new Cewek();

        //Jalankan method nyanyiLagu milik cewek
        System.out.print("Cewek Nyanyi: ");
        cewek.nyanyiLagu();

        //Buat objek cowok
        Manusia cowok = new Cowok();

        //Jalankan method nyanyiLagu milik cowok, walaupun nama method sama tapi override
        System.out.print("Cowok Nyanyi: ");
        cowok.nyanyiLagu();
    }
}
