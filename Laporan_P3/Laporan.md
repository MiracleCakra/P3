# LAPORAN PRAKTIKUM 3 (JOBSHEET 3)

Nama    : Cakra Wangsa M.A.W

Kelas   : TI-1H

Prodi   : D4 Teknik Informatika

Absen   : 07


### 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

### 3.2.1 Langkah-langkah Percobaan

class Persegi panjang 

<img src = "PersegiPanjang.png">

Array Objects

<img src = "ArrayObjects.png">

### 3.2.2 Verifikasi Hasil Percobaan

Run pada kode program
<img src = "outArrayObjects.png">

### 3.2.3 Pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!

    Jawab: Class yang akan dibuat array of object tidak harus selalu memiliki atribut dan sekaligus method. Class yang akan dibuat array of object hanya perlu memiliki konstruktor yang dapat digunakan untuk membuat objek dari class tersebut.

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
    ``` java
    ppArray[1] = new PersegiPanjang();
    ```

    Jawab:
    
    Tidak, karena sudah memiliki konstruktor pada class PersegiPanjang dan mengapa dipanggil, agar class pada PersegiPanjang bisa terhubung dengan Arrayobjects 

3. Apa yang dimaksud dengan kode berikut ini:

    ``` java
    PersegiPanjang [] ppArray = new PersegiPanjang[3];
    ```

    Jawab: Kode tersebut berfungsi untuk mendeklarasikan dan membuat sebuah array of objects dari class PersegiPanjang dengan panjang 3 elemen.

4. Apa yang dimaksud dengan kode berikut ini:

    ``` java
    ppArray[1] = new PersegiPanjang();
    ppArray[1].panjang = 80;
    ppArray[1].lebar = 40;
    ```

    Jawab: 
    Kode tersebut digunakan untuk membuat sebuah objek dari class PersegiPanjang dan akan menyimpannya ke dalam elemen kedua dari array ppArray, serta mengubah nilai dari atribut panjang dan lebar dari objek tersebut.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba

    Jawab: agar method lebih mudah untuk dikerjakan


### 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping

### 3.3.1 Langkah-langkah Percobaan

<img src = "in ArrayPerco2.png">

### 3.3.2 Verifikasi Hasil Percobaan

<img src = "out ArrayPerco2.png">

### 3.3.3 Pertanyaan

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

    Jawab:

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

    Jawab:

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?

    Jawab:

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

    Jawab:

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

    Jawab:



### 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method

### 3.4.1 Langkah-langkah Percobaan


