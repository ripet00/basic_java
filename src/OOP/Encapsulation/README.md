# **Pengenalan Encapsulation dalam Java**

---

**1. Apa itu Encapsulation?**

Encapsulation adalah salah satu prinsip utama dalam pemrograman berorientasi objek (OOP) yang menggabungkan data dan metode yang beroperasi pada data ke dalam sebuah unit tunggal yang disebut sebagai kelas. Prinsip ini membantu dalam menyembunyikan detail implementasi dan melindungi data dari akses langsung.

**2. Tujuan Encapsulation:**

- Melindungi data dari modifikasi yang tidak disengaja.
- Meningkatkan keamanan aplikasi dengan menyembunyikan detail implementasi.
- Mempermudah pengelolaan kode dengan menyediakan antarmuka yang terstruktur.

**3. Konsep-konsep Kunci:**

- **Variabel Instance Private**: Data yang terkait dengan sebuah objek disimpan sebagai variabel instance private, yang tidak dapat diakses secara langsung dari luar kelas.
  
- **Metode Publik**: Metode-metode publik digunakan untuk mengakses dan memanipulasi data yang disembunyikan. Ini memungkinkan untuk menerapkan logika bisnis dan validasi data sebelum mengakses atau mengubahnya.

**4. Manfaat Encapsulation:**

- **Keamanan Data**: Data dienkapsulasi dalam kelas, sehingga hanya metode-metode yang ditentukan yang dapat mengakses atau memanipulasi data tersebut.
  
- **Fleksibilitas**: Implementasi internal kelas dapat berubah tanpa mempengaruhi klien eksternal yang menggunakan kelas tersebut.
  
- **Pengelolaan Kode yang Lebih Baik**: Dengan membatasi akses langsung ke data, perubahan internal kelas dapat dikelola lebih mudah.

## **Proyek Sederhana: Sistem Manajemen Pegawai**

---

**Deskripsi Proyek:**

Kita akan membuat sistem sederhana untuk manajemen pegawai dengan menggunakan prinsip Encapsulation. Setiap pegawai memiliki nama, gaji, dan ID pegawai. Kita akan menggunakan kelas untuk merepresentasikan pegawai dan menerapkan encapsulation untuk menyembunyikan detail implementasi.

**Implementasi:**

[*Sistem managament pegawai*](EmployeeManagementSystem.java)

**Penjelasan:**

- Dalam kelas `Employee`, variabel instance `name`, `salary`, dan `employeeId` dideklarasikan sebagai private untuk menerapkan encapsulation.
  
- Metode-metode publik seperti `getName()`, `setName()`, `getSalary()`, `setSalary()`, dan `getEmployeeId()` digunakan untuk mengakses dan memanipulasi data yang disembunyikan.
  
- Kita menggunakan konstruktor untuk inisialisasi objek saat pembuatan instance.

**Kesimpulan:**

Dalam proyek ini, kita telah menerapkan prinsip Encapsulation dalam pembuatan sistem manajemen pegawai. Dengan membatasi akses langsung ke data dan menyediakan metode publik untuk mengakses dan memanipulasi data, kita dapat menciptakan kode yang lebih aman, fleksibel, dan mudah dimengerti. Prinsip ini adalah salah satu fondasi penting dari pemrograman berorientasi objek dalam Java.
