import java.util.Scanner;

//Object Tree
class Tree {
    //Private attribute yang menyimpan node root
    private Node root;

    //Constructor Tree
    Tree(Node root) {
        this.root = root;
    }

    //Getter root
    Node getRoot() {
        return this.root;
    }
}

//Object Node
class Node {
    //Private attribute
    private Node left, right, parent;
    private int value;

    //Constructor Node
    Node(int value) {
        this.value = value;
    }

    //Setter
    void setLeft(Node node) {
        this.left = node;
    }

    void setRight(Node node) {
        this.right = node;
    }

    void setParent(Node node) {
        this.parent = node;
    }

    //Getter
    Node getLeft() {
        return this.left;
    }

    Node getRight() {
        return this.right;
    }

    Node getParent() {
        return this.parent;
    }

    int getValue() {
        return this.value;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        //Jalankan scanner
        Scanner scan = new Scanner(System.in);

        //Inisiasi objek tree dengan rootnya sebuah node bervalue 0
        Tree tree = new Tree(new Node(0));

        //Inisiasi terrisExist dan jalan
        boolean treeIsExist = false;
        boolean jalan = true;

        //Selama jalan = true, akan terus looping
        while(jalan) {
            //Input perintah user
            System.out.print("\n1. Input\n2. View\n3. Exit\n");
            System.out.print("Masukkan perintah yang kamu inginkan: ");
            int perintah = scan.nextInt();

            //Jika perintahnya 1
            if(perintah == 1) {
                //Minta input angka dari user
                System.out.print("\nMasukkan nilai baru: ");
                int value = scan.nextInt();

                //Buat node baru
                Node newNode = new Node(value);

                /*
                Kalau belum ada tree, selain tree yang diinisiasi, buat tree baru,
                lalu ubah treeIsExist menjadi true, kalau sudah tambahkan ke dalam tree
                */
                if(!treeIsExist) {
                    tree = new Tree(newNode);
                    treeIsExist = true;
                } else {
                    insert(tree.getRoot(), newNode);
                }
            }
            
            /*
            Kalau perintahnya 2, periksa dulu tree memang sudah ada atau masih default
            Kalau sudah ada, tampilkan output
            */
            else if(perintah == 2) {
                if(tree.getRoot().getValue() == 0) {
                    System.out.println("\nTree masih kosong. Silahkan input angka terlebih dahulu");
                } else {
                    view(tree);
                }
            }
            
            //Kalau perintahnya 3, jalan = false, sehingga keluar dari while loop
            else if(perintah == 3) {
                System.out.println("\nProgram dihentikan. Terima kasih!!!\n");
                jalan = false;
            }
            
            //Perintah angka yang lain tidak diterima
            else {
                System.out.println("\nPerintah tidak dikenal, silahkan coba lagi");
            }
        }
    }

    //Masukkan node baru ke dalam tree
    static void insert(Node base, Node addition) {
        //Bandingkan 2 node, kalau lebih besar dari node pembadning, masuk ke if ini
        if(addition.getValue() > base.getValue()) {
            //Kalau node kanan masih kosong, tambahkan sebagai node kanan
            if(base.getRight() == null) {
                base.setRight(addition);
                addition.setParent(base);
                System.out.printf("%d di kanan %d\n", addition.getValue(), base.getValue());
            } else {
                //Kalau node kanan tidak kosong, pindah ke node kanan sebagai node pembanding
                insert(base.getRight(), addition);
            }
        }
        
        //Bandingkan 2 node, kalau lebih kecil dari node pembadning, masuk ke if ini
        else if(addition.getValue() < base.getValue()) {
            //Kalau node kiri masih kosong, tambahkan sebagai node kanan
            if(base.getLeft() == null) {
                base.setLeft(addition);
                addition.setParent(base);
                System.out.printf("%d di kiri %d\n", addition.getValue(), base.getValue());
            } else {
                //Kalau node kiri tidak kosong, pindah ke node kanan sebagai node pembanding
                insert(base.getLeft(), addition);
            }
        }
        
        //Kalau nilainya sama dengan node pembanding, berarti terdapat duplikasi, tolak penambahan
        else if(addition.getValue() == base.getValue()) {
            System.out.printf("Angka %d sudah pernah diinput, coba ulangi lagi dengan angka baru\n", addition.getValue());
        }
    }

    //Tampilkan output
    static void view(Tree tree) {
        //PreOrder
        System.out.printf("\nPre Order  : ");
        preOrder(tree.getRoot());

        //InOrder
        System.out.printf("\nIn Order   : ");
        inOrder(tree.getRoot());

        //PostOrder
        System.out.printf("\nPost Order : ");
        postOrder(tree.getRoot());

        //Kasih satu baris
        System.out.println();
    }

    //PreOrder
    static void preOrder(Node node) {
        //Print value
        System.out.printf("%d ", node.getValue());

        //Pindah ke node kiri
		if (node.getLeft() != null) {
			preOrder(node.getLeft());
		}

        //Pindah ke node kanan
		if (node.getRight() != null) {
			preOrder(node.getRight());
		}
    }

    //InOrder
    static void inOrder(Node node) {
        //Pindah ke node kiri
        if (node.getLeft() != null) {
			inOrder(node.getLeft());
		}

        //Print value
        System.out.printf("%d ", node.getValue());

        //Pindah ke node kanan
		if (node.getRight() != null) {
			inOrder(node.getRight());
		}
    }

    //PostOrder
    static void postOrder(Node node) {
        //Pindah ke node kiri
        if (node.getLeft() != null) {
			postOrder(node.getLeft());
		}

        //Pindah ke node kanan
		if (node.getRight() != null) {
			postOrder(node.getRight());
		}

        //Print value
        System.out.printf("%d ", node.getValue());
    }
}
