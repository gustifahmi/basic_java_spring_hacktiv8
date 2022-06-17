//Class AnakUmur1Tahun yang merupakan subclass dari Induk dan mengimplementasikan interface
class AnakUmur1Tahun extends Induk implements InterfaceAnakUmur1Tahun {
    public void anakSiapa() {
		System.out.println("Nama anaknya adalah : " + namaAnak);
	}

    public void hobiAnak() {
		System.out.println("Hobi anaknya adalah : " + hobiAnak);
    }
}

//Parent class bernama Induk
class Induk {
	public String namaAnak = "Gusti Fahmi Fadhila";
	public String hobiAnak = "Main";

	public void makan() {
		System.out.println("Lagi makan nasi uduk");
	}

	public void minum() {
		System.out.println("Lagi minum air");
	}
}

//Interface
interface InterfaceAnakUmur1Tahun {
	void anakSiapa();
	void hobiAnak();
}

public class Driver {
    public static void main(String[] args) {
        //Class itu sendiri
        AnakUmur1Tahun anak = new AnakUmur1Tahun();
		anak.anakSiapa();
		anak.makan();

        //Class lain
		Induk induk = new AnakUmur1Tahun();
		induk.minum();

        //Interface
		InterfaceAnakUmur1Tahun interfaceAnak = new AnakUmur1Tahun();
		interfaceAnak.hobiAnak();
    }
}
