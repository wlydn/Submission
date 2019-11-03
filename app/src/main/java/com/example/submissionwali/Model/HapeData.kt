package com.example.submissionwali.Model

import com.example.submissionwali.R

object HapeData {
    private val hapeNama = arrayOf(
        "Redmi Note 7",
        "Xiaomi Redmi Note 5A",
        "Xiaomi Redmi 4X",
        "Xiaomi Redmi 4A",
        "Xiaomi Redmi Note 4",
        "Xiaomi Redmi Note 3 Pro",
        "Xiaomi Redmi 1S",
        "Xiaomi Redmi 2",
        "Xiaomi Redmi Note",
        "Xiaomi Mi 4i")

    private val hapeDetails = arrayOf(
        "Redmi Note 7 membawa kejutan dengan mengusung fitur yang menggiurkan yaitu dual kamera berkonfigurasi 48MP + 5MP. Untuk kamera 48MP memakai sensor Samsung GM1 bersama aperture f/1.8.",
        "Xiaomi Redmi Note 5A sudah diproduksi di Indonesia, sejalan dengan visi Xiaomi \"Inovasi untuk SemuaOrang\". Dijual dengan menggandeng salah satu e-commerce Indonesia yakni JD.id dan juga tersedia di Authorized Mi Store. Xiaomi Redmi Note 5A memiliki luas layar 5.5 inch kualitas HD dengan proteksi Corning Gorilla Glass 3.",
        "Xiaomi Redmi 4X memiliki keunggulan pada penggunaan baterai 4100 mAh yang diklaim dapat bertahan selama 2 hari untuk pemakaian aktif. Hp Xiaomi yang resmi di Indonesia ini dilengkapi layar HD berukuran 5 inci yang sangat pas di tangan. Redmi 4X dilengkapi juga dengan kaca depan lengkung 2.5D yang mempercantik tampilannya.",
        "Hp Xiaomi yang resmi di Indonesia ini dibekali layar seluas 5 inci dengan resolusi HD. Dilengkapi juga dengan Reading mode yang mencegah kelelahan mata akibat pancaran sinar biru dari layar. Sudah disediakan kamera belakang 13MP dengan aperture f/2.2, autofocus, LED flash yang memberikan kualitas foto memikat. Untuk kamera depannya sudah beresolusi 5MP dengan aperture f/2.2.",
        "Xiaomi Redmi Note 4 hadir dengan layar berukuran 5.5 inci beresolusi FullHD 1080 x 1920 piksel. Sangat tajam dan detail. Berjalan dengan OS Android 6.0 Marshmallow, Xiaomi Redmi Note 4 ditenagai prosesor Qualcomm Snapdragon 625. Kinerja prosesornya akan disokong memori RAM besar dalam pilihan kapasitas 3GB dan ROM 32GB atau RAM 4GB ROM 64GB. Penyimpanannya juga masih bisa diperbesar hingga 256 GB melalui slot microSD yang digabung bersama slot SIM 2.",
        "Xiaomi Redmi Note 3 Pro hadir dengan layar IPS berukuran 5.5 inci. Redmi Note 3 Pro resmi ini menghadirkan resolusi Full HD 1080 x 1920 piksel dengan kerapatan sekitar 403 ppi. Namun yang cukup disayangkan adalah tidak menggunakan pelindung layar yang sudah anti gores. Sehingga cukup rawan saat diletakkan di sembarang tempat. Selain itu, hp Xiaomi murah yang resmi dirilis di Indonesia ini berjalan dengan OS Android 5.0 Lollipop melalui antarmuka kustom MIUI 8.",
        "Merupakan hp Xiaomi yang resmi di Indonesia pertama. Pada saat pertama kali dirilis, Xiaomi Redmi 1S ini dihadirkan dengan berbagai fitur menarik. Salah satunya adalah kehadiran fitur dual sim yang memungkinkan pengguna menyisipkan dua kartu sim. Menariknya dua kartu SIM ini dapat diaktifkan secara bersamaan. Hape Xiaomi murah ini hadir dengan layar berukuran 4,7 inci berjenis IPS dengan ketajaman resolusi HD 1280 x 720 piksel.",
        "Hp Xiaomi Redmi 2 merupakan generasi penerus dari Xiaomi Redmi 1S yang juga resmi dirilis di Indonesia. Hape Xiaomi murah ini memadukan layar yang apik dengan desain menawan. Salah satu peningkatan penting ada pada dukungan jaringan 4G LTE. Ukuran layarnya masih tetap sama dengan hape Xiaomi Redmi 1S yaitu memiliki bentang 4,7 inci dengan resolusi HD 720 x 1280 piksel dan dilengkapi dengan panel IPS.",
        "Hp Xiaomi Redmi Note generasi pertama sekaligus hape berlayar lebar pertama yang resmi dirilis di Indonesia. Datang dengan layar berukuran 5.5 inci yang memiliki resolusi HD 1280 x 720 piksel berjenis IPS. Kerapatan pikselnya mencapai 267 ppi dan sudah diproteksi oleh lapisan Corning Gorilla Glass 3 untuk menghindari resiko layar tergores. ",
        "Hp Xiaomi Mi4i pertama kali dirilis pada kuartal pertama 2015. Hape Xiaomi di lini Mi series ini mengusung cover uni-body bermaterial polikarbonat dengan lapisan Anti-Greasing Coating untuk mencegah menempelnya kotoran dan pudarnya warna. Bahkan kotoran atau noda yang menempel di cover bisa dihilangkan menggunakan penghapus. Hape Xiaomi Mi4i hadir dengan layar IPS dari Sharp berukuran 5 inci dengan tingkat resolusi FullHD.")


    private val hapeImages = intArrayOf(
        R.drawable.redminote7,
        R.drawable.xiaomiredminote5a,
        R.drawable.xiaomiredmi4x,
        R.drawable.xiaomiredmi4a,
        R.drawable.xiaomiredminote4,
        R.drawable.xiaomiredminote3pro,
        R.drawable.xiaomiredmi1s,
        R.drawable.xiaomiredmi2,
        R.drawable.xiaomiredminote,
        R.drawable.xiaomimi4i)

    val listData: ArrayList<Hape>
        get() {
            val list = arrayListOf<Hape>()
            for (position in hapeNama.indices) {
                val hape = Hape()
                hape.name = hapeNama[position]
                hape.detail = hapeDetails[position]
                hape.photo = hapeImages[position]
                list.add(hape)
            }
            return list
        }
}