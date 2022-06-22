Nama: Gusti Fahmi Fadhila
Kode peserta: JVSB001ONL012
Link Github: https://github.com/gustifahmi/basic_java_spring_hacktiv8

Panduan penggunaan aplikasi:
Di sesi 9 ini saya belajar untuk membuat program dapat membaca file xml.
Terdapat 2 cara, yaitu:
1. Simple Api XML (SAX)
2. Document Object Model (DOM)

Terdapat 4 project, yaitu sax, challenge1 (menggunakan SAX), dom, dan challenge2 (menggunakan DOM).
Untuk menjalankan program, bisa menggunakan perintah berikut:

1. sax
   mvn exec:java -Dexec.mainClass="com.learning.xml.sax.JavaReadXmlSaxEx"

2. challenge1
   mvn exec:java -Dexec.mainClass="com.learning.xml.challenge1.JavaReadXmlSaxEx"

3. dom
   mvn exec:java -Dexec.mainClass="com.learning.xml.dom.ParseKnownXMLStructure"

4. challenge2
   mvn exec:java -Dexec.mainClass="com.learning.xml.challenge2.ReadXmlAlexaApi"