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

## Refleksi 2:

Setelah menulis CreateProductFunctionalTest.java bersama dengan kasus uji yang sesuai, dan diminta untuk membuat suite tes fungsional lain yang memverifikasi jumlah item dalam daftar produk, pertimbangkan kebersihan kode.

Penulisan kode baru yang serupa dengan suite tes fungsional sebelumnya bisa menambahkan sedikit duplikasi kode. Ini dapat mengurangi kualitas kode karena menyebabkan redundansi dan sulit dalam pemeliharaan.

Potensi masalah kebersihan kode dapat mencakup:

**Duplikasi Kode**: Duplikasi kode dapat mengarah pada kesulitan pemeliharaan dan peningkatan biaya pengembangan.
**Kelambatan**: Penambahan kode yang tidak perlu dapat mengurangi kinerja dan menyulitkan pemahaman kode.
Untuk meningkatkan kebersihan kode, dapat direkomendasikan untuk:

Refaktor kode untuk mengurangi duplikasi, mungkin dengan membuat fungsi bantuan yang digunakan oleh suite tes fungsional yang berbeda.
Gunakan pola desain yang sesuai, seperti Page Object Pattern, untuk mengelola interaksi dengan elemen web dan menghindari duplikasi kode.
Pertimbangkan untuk menggunakan pengujian parametris untuk menghindari duplikasi dalam pengujian yang serupa.
Dengan memperbaiki masalah-masalah ini, dapat meningkatkan kebersihan dan pemeliharaan kode.
