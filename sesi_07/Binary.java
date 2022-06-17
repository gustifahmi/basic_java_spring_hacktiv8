public class Binary {
    //Method binarySearch
    public static int binarySearch(int[] data, int angkaDicari) {
        //Inisiasi first, last, dan middle
        int first = 0;
        int last = data.length;
        int middle = data.length / 2;

        //While loop selagi mencari angka
        while(first <= last) {
            if (data[middle] < angkaDicari) {
                first = middle + 1;
            } else if (data[middle] > angkaDicari) {
                last = middle - 1;
            } else {
                return middle;
            }

            middle = (first + last) / 2;
        }

        //Ini terjadi jika sudah keluar dari while, artinya tidak ditemukan angka tersebut
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {5, 8, 12, 15, 17, 23, 26, 30, 34, 38, 42, 54, 64, 78, 81};
        int key1 = 26, key2 = 78, key3 = 8, key4 = 39;

        System.out.printf("Key %d: index %d\n", key1, binarySearch(myArray, key1));
        System.out.printf("Key %d: index %d\n", key2, binarySearch(myArray, key2));
        System.out.printf("Key %d: index %d\n", key3, binarySearch(myArray, key3));
        System.out.printf("Key %d: index %d\n", key4, binarySearch(myArray, key4));
    }
}
