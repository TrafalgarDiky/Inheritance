# Tugas Implementasi PBO - Inheritance

Repository ini berisi implementasi konsep **Inheritance** pada Java sesuai materi kuliah PBO.

## Struktur Kode
- `Vehicle.java` → superclass dengan method `displayDetails()` dan `honk()`
- `Car.java` → subclass dari `Vehicle`, override `displayDetails()`
- `Bicycle.java` → subclass dari `Vehicle`, override `honk()`
- `Student.java` → superclass dengan data mahasiswa
- `GraduateStudent.java` → subclass dari `Student`, tambah field `thesisTopic`
- `Main.java` → berisi method `main()` untuk menjalankan demo semua class

## Cara Compile & Run
```bash
# compile semua file
javac src/*.java

# jalankan program
java src.Main
