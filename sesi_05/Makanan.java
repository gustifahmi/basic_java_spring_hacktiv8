//Class restoran
class Restoran {
    //Inisialisasi private attribute
    private String menu;
    private int harga;
    private boolean spesial;

    //Setter
    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

    //Getter
    public String getMenu() {
        return menu;
    }

    public int getHarga() {
        return harga;
    }

    public boolean getSpesial() {
        return spesial;
    }
}

public class Makanan {
    public static void main(String[] args) {
        //Buat objek restoran
        Restoran restoran = new Restoran();

        //Set menu, harga, dan spesial
        restoran.setMenu("Ayam Goreng");
        restoran.setHarga(17000);
        restoran.setSpesial(true);

        //Print
        System.out.printf("Menu Makanan: %s\n", restoran.getMenu());
        System.out.printf("Harga Makanan: %d\n", restoran.getHarga());
        System.out.printf("Menu Spesial: %b\n", restoran.getSpesial());
    }
}