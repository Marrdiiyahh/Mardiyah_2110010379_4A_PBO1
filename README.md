# Mardiyah_2110010379_4A_PBO1
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mahasiswa`, `MahasiswaDetail`, dan `MahasiswaBeraksi` adalah contoh dari class.

```bash
public class wisatakalsel {
    ...
}

public class wisataAlam {
    ...
}

public class wisataDetail extends wisatakalsel {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mhs[i] = new MahasiswaDetail(nama, npm);` adalah contoh pembuatan object.

```bash
 wisatakalsel wsta = new wisatakalsel("Tanah Laut");
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `npm` adalah contoh atribut.

```bash
public String kabupaten;
int pilihan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public wisatakalsel(String kabupaten ) {
        this.kabupaten = kabupaten;
}

public wisataDetail(String kabupaten) {
        super(kabupaten);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
}

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNpm`, `getTahunMasuk`, `getFakultas`, `getProdi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
 public String getKabupaten() {
        return kabupaten;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 public String kabupaten;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class MahasiswaDetail extends Mahasiswa {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
 public String hasil() {
        return "kabupaten: " +getKabupaten();
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
 if(pilihan == 1) {
            System.out.println("1. Pantai Takisung\n2. Pantai Batakan");
        } else if(pilihan == 2) {
            System.out.println("1. Gunung Pria\n2. Gunung Teletubis");

        } 
        System.out.println("==================================");
11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.



12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner masuk = new Scanner(System.in);
        int pilihan;
        System.out.println("WISATA KALIMANTAN SELATAN");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash


14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
   } catch (Exception e) {
        System.out.println("Ada kesalahan yang muncul");
    } finally {
        System.out.println("Terima kasih telah menjalankan program");
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    -    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   -    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **80** |

## Pembuat

Nama: Mardiyah
NPM: 2110010379
