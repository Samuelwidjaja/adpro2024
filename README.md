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

## Refleksi 3:

**1. Explain what principles you apply to your project!**
Saya mencoba menerapkan ke-5 prinsip yang saya pelajari di kelas. Berikut adalah prinsip-prinsip tersebut:

a. Single Responsibility Principle (SRP) --- Berarti bahwa sebuah kelas harus memiliki satu dan hanya satu alasan untuk berubah (harus memiliki hanya satu pekerjaan). Dengan prinsip ini, saya harus memisahkan 'CarController' dari 'ProductController' sehingga setiap file akan fokus pada satu pekerjaan/tanggung jawab. Sebagai contoh, CarController.java bertanggung jawab untuk menangani perilaku dan properti terkait mobil, sementara ProductController.java bertanggung jawab untuk menangani perilaku dan properti terkait produk.

b. Open-Closed Principle (OCP) --- Berarti bahwa objek atau entitas harus terbuka untuk ekstensi tetapi tertutup untuk modifikasi. Hal ini menyiratkan bahwa sebuah kelas harus dapat diperluas tanpa mengubah kelas itu sendiri. Saya telah menyertakan kemampuan untuk mengatur ID di konstruktor kelas Car, memungkinkan untuk perluasan. Jika ada kebutuhan untuk mengubah mekanisme penyetelan ID, tidak perlu mengubah kode sumber. Selain itu, memperkenalkan metode update yang mengubah objek Car sebagai keseluruhan, daripada atribut-atribut individual, meningkatkan fleksibilitas kelas CarRepository untuk perluasan tanpa keharusan untuk membuat perubahan pada kode sumber.

c. Liskov Substitution Principle (LSP) --- Berarti bahwa setiap subclass atau kelas turunan harus dapat digantikan oleh kelas dasar atau induk mereka. Saya mencoba membuat CarController tidak memperpanjang ProductController karena masing-masing dari mereka menggunakan model yang berbeda.

d. Interface Segregation Principle (ISP) --- Berarti bahwa klien tidak boleh dipaksa untuk mengimplementasikan sebuah antarmuka yang tidak digunakan, atau klien tidak boleh dipaksa untuk bergantung pada metode yang tidak digunakan. Saya mencoba membuat 2 antarmuka yang berbeda, yang disebut CarService dan ProductService.

e. Dependency Inversion Principle (DIP) --- Berarti bahwa entitas harus bergantung pada abstraksi, bukan pada konkret. Ini menyatakan bahwa modul tingkat tinggi tidak boleh bergantung pada modul tingkat rendah, tetapi mereka harus bergantung pada abstraksi. Di dalam CarController saya, saya mencoba untuk mengubah CarServiceImpl menjadi CarService.

**2. Explain the advantages of applying SOLID principles to your project with examples.**
Prinsip-prinsip SOLID bertujuan untuk membuat program yang lebih mudah dipelihara, diperluas, dan fleksibel. Berikut adalah beberapa keuntungan yang saya dapatkan dari menerapkan prinsip-prinsip SOLID pada proyek saya:

a. Single Responsibility Principle (SRP) ---

Keuntungan: Kode akan lebih mudah dipelihara dan lebih mudah dipahami karena setiap kelas memiliki hanya satu alasan untuk berubah.

Contoh: Membuat kelas CarController dan ProductController terpisah, masing-masing dengan satu tanggung jawab.

b. Open/Closed Principle (OCP) ---

Keuntungan: Memungkinkan penambahan fungsionalitas baru tanpa mengubah kode yang sudah ada, meningkatkan stabilitas.

Contoh: carData.set(i, updatedCar); di CarRepository.java.

c. Liskov Substitution Principle (LSP) ---

Keuntungan: Ini mempromosikan penggunaan kembali kode dan konsistensi.

Contoh: CarController tidak memperpanjang ProductController karena masing-masing dari mereka menggunakan model yang berbeda.

d. Interface Segregation Principle (ISP) ---

Keuntungan: Mencegah sebuah kelas menjadi terbebani dengan metode yang tidak relevan dan mempromosikan desain yang lebih modular.

Contoh: 2 antarmuka yang berbeda, yang disebut CarService dan ProductService.

e. Dependency Inversion Principle (DIP) ---

Keuntungan: Fleksibilitas, kemudahan pengujian, dan pemeliharaan kode.

Contoh: Di dalam CarController saya, saya mencoba untuk mengubah CarServiceImpl menjadi CarService.

**3. Explain the disadvantages of not applying SOLID principles to your project with examples.**
Tidak menerapkan prinsip SOLID dapat membuat basis kode kurang mudah dipelihara, sulit diperluas, dan rentan terhadap kesalahan. Berikut adalah beberapa kerugian:

a. TIDAK MENERAPKAN Single Responsibility Principle (SRP) ---

Kerugian: Kode akan sulit dipelihara dan dipahami.

Contoh: ProductController menangani baik CarController maupun ProductController itu sendiri. Jadi memiliki lebih dari satu tanggung jawab.

b. TIDAK MENERAPKAN Open/Closed Principle (OCP) ---

Kerugian: Kode akan rapuh dan memerlukan perubahan yang sering.

Contoh: dari carData.set(i, updatedCar); di CarRepository.java menjadi

car.setCarName(updatedCar.getCarName());

car.setCarColor(updatedCar.getCarColor());

car.setCarQuantity(updatedCar.getCarQuantity());

c. TIDAK MENERAPKAN Liskov Substitution Principle (LSP) ---

Kerugian: Kode tidak akan dapat digunakan kembali dan memiliki konsistensi yang rendah.

Contoh: kelas CarController memperpanjang ProductController, sementara ProductController dan CarController masing-masing menggunakan model yang berbeda.

d. TIDAK MENERAPKAN Interface Segregation Principle (ISP) ---

Kerugian: Sebuah kelas menjadi terbebani dengan metode yang tidak relevan.

Contoh: Jika ProductService mengimplementasikan metode yang tidak relevan dari CarService (atau mereka menggabungkannya).

e. TIDAK MENERAPKAN Dependency Inversion Principle (DIP) ---

Kerugian: Akan lebih sulit untuk menguji dan memelihara.

Contoh: CarServiceImpl bergantung pada CarRepository daripada antarmukanya atau ketika ProductServiceImpl bergantung pada ProductRepository daripada antarmukanya.

## Refleksi 4:

TDD flow: Mengonfirmasi bahwa tes fungsional mencukupi. Memastikan pengujian kasus tepi. Pertimbangkan pengujian terintegrasi. Tambahkan pengujian unit untuk memandu desain. Pastikan siklus umpan balik cepat. Pertimbangkan pengujian integrasi yang lebih cepat. Jalankan subset tes saat diperlukan. Manfaatkan waktu menunggu dengan multitasking.

F.I.R.S.T. adalah singkatan dari Fast, Isolated/Independent, Repeatable, Self-Validating, dan Timely. Prinsip ini mengarahkan pembuatan tes unit yang efektif. Tes harus berjalan cepat, mandiri, memberikan hasil yang konsisten, mudah divalidasi, dan ditulis sebelum kode produksi terkait. Prinsip ini membantu mengurangi risiko, meningkatkan keterbacaan, dan mendukung integrasi perubahan dengan baik.

Unit tests: Pastikan tes cepat, terisolasi, ulang, dan validasi diri. Dibuat sebelum kode produksi. Perhatikan prinsip F.I.R.S.T. untuk menghindari risiko, meningkatkan keterbacaan, dan integrasi perubahan yang lancar.
