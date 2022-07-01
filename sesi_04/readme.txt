Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:

Di Sesi 4 ini, saya mempelajari tentang Array dan Tree.

ARRAY
Array merupakan sebuah tipe data yang bisa menyimpan beberapa item sekaligus yang bertipe data sama.
Misal: {3, 1, 5} atau {"tes", "halo", "dunia"}

Terdapat 3 cara menginisiasi array, yaitu:
1) String[] nama;
2) String nama[];
3) String[] nama = new String[5];

Kita bisa melakukan looping array dengan 2 cara, yaitu:
1) Foor loop biasa dengan batas menggunakan length dari array
   for(int i = 0; i < namaArray.length; i++)
   untuk mendapatkan item array bisa menggunakan array[i]
2) For each, misal item di dalam array bertipe data int
   for(int item : namaArray)
   Kita hanya mendapatkan item saja, sedangkan jika ingin mendapatkan indexnya,
   perlu membuat counter sendiri

Lalu ada juga Array Multidimensi, yaitu Array di dalam Array, contohnya adalah:
{{1, 3}, {2, 4}, {5, 7}}
Misal, array x adalah array luarnya. Di dalam array x terdapat 3 array, misal array
a, b, dan c. Di dalam array a berisi 2 item, yaitu 1 dan 3, dan seterusnya.

---------------------------------------------------------------------------------------

TREE
Lalu berikutnya adalah tree yang berisi beberapa node. Misal dalam tree terdapat sebuah
node parent. Lalu node parent memiliki 4 node di bawahnya. Lalu masing-masing
dari 4 node itu juga bisa memiliki node lainnya di bawahnya, dan begitu seterusnya.

Lalu terdapat juga Binary Tree dimana setiap node hanya bisa memiliki 2 node saja di bawahnya.
Lalu ada juga Binary Search Tree(BST) yang merupakan Binary Tree yang posisinya disesuaikan
sedemikian rupa sehinga sebuah node memiliki maksimum 2 node di bawahnya, di mana node kiri
lebih kecil dari node tersebut dan node kanan lebih besar dari node tersebut.

Lalu dalam BST, juga terdapat tiga jenis order, yaitu:
1. PreOrder
   Print data terlebih dahulu, lanjut ke node kiri, lanjut ke node kanan
2. InOrder
   Lanjut ke node kiri terlebih dahulu, print data, lanjut ke node kanan
3. PostOrder
   Lanjut ke node kiri terlebih dahulu, lanjut ke node kanan, print data