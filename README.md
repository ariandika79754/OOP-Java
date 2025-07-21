# 📘 Materi OOP (Object-Oriented Programming) Menggunakan Java 

Materi ini membahas konsep lengkap OOP (Object-Oriented Programming) menggunakan Java, dari teori dasar hingga praktik kode. Cocok untuk pemula maupun menengah yang ingin memperkuat pemahaman OOP di Java.

---

## 📌 Apa Itu OOP?

**Object-Oriented Programming (OOP)** adalah paradigma pemrograman yang berfokus pada pembuatan dan penggunaan **objek**. Dalam Java, hampir semuanya adalah objek — class, exception, collection, hingga GUI.

OOP bertujuan untuk membuat kode:
- Lebih terstruktur dan mudah dipahami
- Mudah untuk dikembangkan dan dipelihara
- Dapat digunakan kembali (reusable)

---

## 🔑 Konsep Dasar OOP

| Konsep         | Penjelasan                                                                 |
|----------------|---------------------------------------------------------------------------|
| **Class**      | Cetak biru (template) dari objek. Berisi atribut (variabel) dan method.  |
| **Object**     | Instansi (perwujudan) dari class.                                          |
| **Encapsulation** | Menyembunyikan data (private) dan mengaksesnya melalui getter/setter.   |
| **Inheritance**   | Pewarisan dari superclass ke subclass.                                  |
| **Polymorphism**  | Kemampuan objek memiliki banyak bentuk (method overriding/overloading). |
| **Abstraction**   | Menyembunyikan implementasi dan hanya menampilkan fungsionalitas.       |

---

## 🧱 Contoh Kode Dasar OOP Java

### 1. Class dan Object

```java
public class Mahasiswa {
    String nama;
    int umur;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Ari";
        mhs.umur = 20;
        mhs.tampilkanData();
    }
}
```

### 2. Constructor

```java
public class Mahasiswa {
    String nama;
    int umur;

    // Constructor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Budi", 21);
        mhs.tampilkanData();
    }
}
```

### 3. Encapsulation

```java
public class Mahasiswa {
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
```

### 4. Inheritance (Pewarisan)

```java
class Hewan {
    void suara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan h = new Kucing();
        h.suara();  // Output: Meong!
    }
}
```

### 5. Polymorphism

#### a. Overriding (run-time polymorphism)

```java
class Kendaraan {
    void jalankan() {
        System.out.println("Kendaraan berjalan");
    }
}

class Mobil extends Kendaraan {
    void jalankan() {
        System.out.println("Mobil melaju di jalan");
    }
}
```

#### b. Overloading (compile-time polymorphism)

```java
class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }
}
```

### 6. Abstraction

```java
abstract class Bentuk {
    abstract void gambar();
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar Lingkaran");
    }
}
```

### 7. Interface

```java
interface Kendaraan {
    void nyalakanMesin();
}

class Motor implements Kendaraan {
    public void nyalakanMesin() {
        System.out.println("Mesin motor dinyalakan.");
    }
}
```

---

## 🏗️ Struktur Proyek Sederhana

```
/OOPJavaProject
│
├── Main.java
├── Mahasiswa.java
├── Hewan.java
├── Kucing.java
├── Bentuk.java
├── Lingkaran.java
└── README.md
```

---

## 🧠 Latihan dan Proyek Mini

✅ Buat program manajemen mahasiswa:
- Tambah, edit, dan tampilkan data
- Gunakan list atau array
- Gunakan encapsulation dan constructor

🐾 Buat sistem kebun binatang:
- Gunakan inheritance: Hewan, Kucing, Burung, dll.
- Gunakan polymorphism untuk suara()

🚗 Buat sistem kendaraan:
- Interface Kendaraan
- Implementasi Mobil, Motor
- Polymorphism dalam method `nyalakanMesin()`

---

## 📚 Referensi Belajar Tambahan

- [Official Java Docs](https://docs.oracle.com/javase/8/docs/)
- [W3Schools Java OOP](https://www.w3schools.com/java/java_oop.asp)
- [Programiz Java OOP](https://www.programiz.com/java-programming/object-oriented-programming)

---

## 📝 Penutup

Dengan memahami dan menerapkan prinsip OOP, kamu akan dapat membangun aplikasi Java yang lebih modular, efisien, dan scalable. Semangat belajar dan bereksperimen! 💪
