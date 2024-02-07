## Refleksi 1:

Saat mengimplementasikan fitur baru menggunakan Spring Boot, telah diperhatikan beberapa prinsip pemrograman bersih dan praktik keamanan yang telah dipelajari:

**Kepatuhan terhadap Standar Kode**: Memastikan bahwa kode mengikuti standar penulisan yang jelas dan konsisten. Variabel, metode, dan kelas dinamai dengan deskriptif, menggunakan casing yang sesuai, dan mengikuti konvensi yang diterima umum.

**Penggunaan Dependency Injection**: Menggunakan Dependency Injection (DI) untuk memasukkan objek layanan ke dalam kelas pengontrol. Hal ini memungkinkan fleksibilitas dalam mengganti implementasi layanan tanpa mengubah kode yang terlalu banyak, serta meningkatkan pengujian dan pemeliharaan kode.

**Validasi Input**: Melakukan validasi input, seperti memeriksa jumlah produk yang dimasukkan, untuk memastikan bahwa data yang diterima oleh aplikasi adalah valid dan aman dari serangan yang berpotensi.

**Penggunaan Template Engine**: Menggunakan Thymeleaf sebagai mesin template untuk memisahkan logika bisnis dari tampilan HTML. Ini memungkinkan pengembangan frontend dan backend secara terpisah, meningkatkan keterbacaan dan pemeliharaan kode.

**Prinsip Keterbacaan Kode**: Memastikan bahwa kode mudah dibaca dan dimengerti oleh orang lain dengan memberikan komentar yang jelas dan deskriptif di tempat yang diperlukan, serta membagi kode menjadi fungsi-fungsi yang logis dan berukuran kecil.

Meskipun kode telah memenuhi sebagian besar prinsip-prinsip ini, ada beberapa area di mana bisa meningkatkan kualitas kode:

**Validasi yang Lebih Mendalam**: Meskipun telah melakukan validasi input dasar, bisa meningkatkan validasi dengan melakukan pemeriksaan yang lebih mendalam, seperti validasi pada tingkat domain untuk memastikan integritas data yang lebih baik.

**Manajemen Eksepsi yang Lebih Baik**: Dapat memperbaiki manajemen eksepsi dengan menangani kasus-kasus eksepsi yang mungkin terjadi dengan lebih baik, seperti menangani eksepsi koneksi basis data atau kegagalan operasi jaringan.

**Penggunaan Logging**: Bisa meningkatkan penggunaan logging untuk memudahkan pelacakan dan penanganan masalah di masa mendatang, terutama pada bagian-bagian penting dari kode yang mungkin menyebabkan kesalahan.
