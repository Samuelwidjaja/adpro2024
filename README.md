## Module 1

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

## Module 2

## Refleksi:
Masalah Kualitas Kode yang Diperbaiki:
Kesalahan pada ID HTML: Kesalahan dengan ID productName dalam HTML menunjukkan masalah potensial pada kasus pengujian Selenium. Dengan memastikan bahwa elemen HTML diidentifikasi dengan benar dan diinteraksi, kita meningkatkan kehandalan dan ketepatan tes tersebut.

Masalah dengan Fungsi Edit dan Hapus: Mengalami masalah dengan fungsi edit dan hapus menunjukkan adanya bug potensial atau implementasi yang salah dalam logika aplikasi. Dengan mengidentifikasi dan menangani masalah ini, kita meningkatkan fungsionalitas dan pengalaman pengguna keseluruhan dari aplikasi e-shop.

Strategi untuk Memperbaiki:
Untuk mengatasi masalah kualitas kode, saya akan memulai dengan meninjau kasus pengujian Selenium untuk memastikan bahwa mereka mencerminkan perilaku yang diharapkan dari aplikasi secara akurat. Ini melibatkan verifikasi ID elemen, interaksi, dan asertions. Selanjutnya, saya akan melakukan debugging terhadap fungsionalitas edit dan hapus dalam kode aplikasi untuk mengidentifikasi kesalahan logika atau konfigurasi yang mungkin.

Integrasi Berkelanjutan dan Penyampaian Berkelanjutan:
Implementasi saat ini kemungkinan tidak sepenuhnya memenuhi definisi Integrasi Berkelanjutan (CI) dan Penyampaian Berkelanjutan (CD) jika terdapat masalah kualitas kode seperti tes yang gagal atau bug dalam aplikasi. Proses CI/CD bertujuan untuk mengotomatisasi pembangunan, pengujian, dan penyampaian perangkat lunak, memastikan pengiriman pembaruan yang cepat dan andal ke produksi. Namun, jika tes gagal atau terdapat masalah kritis dalam aplikasi, hal tersebut dapat mengganggu jalur CI/CD dan menghambat proses pengiriman kontinyu. Oleh karena itu, menyelesaikan masalah kualitas kode adalah hal yang penting untuk mencapai semua manfaat dari CI/CD, memungkinkan siklus umpan balik yang lebih cepat dan siklus implementasi yang lebih lancar.




