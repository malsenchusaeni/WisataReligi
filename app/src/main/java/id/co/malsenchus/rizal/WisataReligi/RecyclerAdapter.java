package id.co.malsenchus.rizal.WisataReligi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;



public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

        //public TextView tv3;
    //deklarasi variable context

    private final Context context;
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    String [] name={"Masjid Agung Jawa Tengah","Sampokong","Gereja Blenduk","Candi Prambanan","Makam Sunan Bonang","Candi Borobudur","Makam Sunan Drajat","Makam Sunan Kalijaga",
            "Makam Sunan Gresik","Makam Sunan Muria","Makam Sunan Giri","Masjid Seribu Pintu","Makam Sunan Ampel","Kraton Surakarta","Kelenteng Kong Miao","Kelenteng Kwan Sing Bio","Masjid Agung Kudus"};
    int thumb []= {R.drawable.gungjat,R.drawable.sampokong,R.drawable.grejablenduk,R.drawable.prambanan,R.drawable.sunanbonang,R.drawable.borbudur,R.drawable.sunandrajat,R.drawable.sunankalijaga,
            R.drawable.sunangresik,R.drawable.sunanmuria,R.drawable.sunangiri,R.drawable.masjidseribupintu,R.drawable.sunanampel,R.drawable.kratonsurakarta,R.drawable.klentengkongmiao,R.drawable.kelentengkwansingbio,R.drawable.kudus};
    String[] desk = {"Masjid Agung Jawa Tengah adalah Masjid yang terletak di jalan Gajah Raya, Kelurahan Sambirejo, Kecamatan Gayamsari, Kota Semarang Jawa Tengah. Masjid ini sangat megah dengan luas lahan mencapai 10 Hektar dan luas bangunan induk untuk shalat 7.669 meter persegi tersebut bargaya arsitektur perpaduan antara Jawa, Jawa Tengah dan Yunani. Dilengkapi dengan 6 buah payung elektrik ukuran besar yang dibuka jika jemaah sholat cukup banyak.\n" +
            "Masjid Agung Jawa Tengah Semarang ini dibangun pada hari Jumat, 6 September 2002 yang ditandai dengan pemasangan tiang pancang perdana yang dilakukan Menteri Agama Ri, Prof. Dr. H. Said Agil Husen al-Munawar, KH. MA Sahal Mahfudz dan Gubernur Jawa Tengah, H. Mardiyanto, akhirnya Masjid Agung Jawa Tengah Ini diresmikan oleh Presiden Indonesia Susilo Bambang Yudhoyono pada tanggal 14 November 2006.\n" +
            "Meskipun baru diresmikan pada tanggal 14 Nopember 2006, namun masjid ini telah difungsikan untuk ibadah jauh sebelum tanggal tersebut. Masjid megah ini telah digunakan ibadah shalat jum’at untuk pertama kalinya pada tanggal 19 Maret 2004 dengan Khatib Drs. H. M. Chabib Thoha, MA, Kakanwil Depag Jawa Tengah.\n" +
            "Di kompleks Masjid Agung Jawa Tengah Semarang ini terdapat Museum Perkembangan Islam Jawa Tengah di Tower Asmaul Husna Lantai 2 dan 3, Hotel Graha Agung di sisi Utara dan resto yang memiliki view terbaik di Kota Semarang ini di Tower Asmaul Husna Lantai 18.\n \n",

            "Kelenteng Sam Po Kong merupakan bekas tempat persinggahan dan pendaratan pertama seorang Laksamana Tiongkok yang bernama Zheng He / Cheng Ho. Tempat ini biasa disebut Gedung Batu, karena bentuknya merupakan sebuah Gua Batu besar yang terletak pada sebuah bukit batu. Terletak di daerah Simongan, sebelah barat daya Kota Semarang.\n" +
                    "Hampir di keseluruhan bangunan bernuansa merah khas bangunan China. Sekarang tempat tersebut dijadikan tempat peringatan dan tempat pemujaan atau bersembahyang serta tempat untuk berziarah. Untuk keperluan tersebut, di dalam gua batu itu diletakan sebuah altar, serta patung-patung Sam Po Tay Djien. Padahal laksamana Cheng Ho adalah seorang muslim, tetapi oleh mereka di anggap dewa. Hal ini dapat dimaklumi mengingat agama Kong Hu Cu atau Tau menganggap orang yang sudah meninggal dapat memberikan pertolongan kepada mereka.\n",

            "Gereja Blenduk Semarang merupakan gereja yang dibangun pada 1753 ini merupakan salah satu landmark di kota lama. Berbeda dari bangunan lain di Kota Lama yang pada umumnya memagari jalan dan tidak menonjolkan bentuk, gedung yang bergaya Neo-Klasik ini justru tampil kontras. Bentuknya lebih menonjol . Lokasi bangunan ini berada di Jalan Letjend Suprapto No 32 Kota Lama Semarang dan bernama Gereja GPIB Immanuel. Bangunan gereja yang sekarang merupakan bangunan setangkup dengan facade tunggal yang secara vertikal terbagi atas tiga bagian. Jumlah lantainya adalah dua buah. Bangunan ini menghadap ke Selatan. Gereja ini masih dipergunakan untuk peribadatan setiap hari Minggu. Di sekitar gereja ini juga terdapat sejumlah bangunan lain dari masa kolonial Belanda seperti Gedung Marba. Bangunan kuno ini juga sering menjadi salah satu tempat untuk foto foto Pre Wedding.",

            "Candi Prambanan merupakan candi Hindu yang terbesar di Indonesia. Sampai saat ini belum dapat dipastikan kapan candi ini dibangun dan atas perintah siapa, namun kuat dugaan bahwa Candi Prambanan dibangun sekitar pertengahan abad ke-9 oleh raja dari Wangsa Sanjaya, yaitu Raja Balitung Maha Sambu. Dugaan tersebut didasarkan pada isi Prasasti Syiwagrha yang ditemukan di sekitar Prambanan dan saat ini tersimpan di Museum Nasional di Jakarta. Prasasti berangka tahun 778 Saka (856 M) ini ditulis pada masa pemerintahan Rakai Pikatan. \n" +
                    "\n" +
                    "Candi Prambanan adalah salah satu kompleks candi yang terkenal di Indonesia dan ditetapkan UNESCO sebagai situs warisan dunia pada tahun 1991 selain Candi Borobudur. Tidak sama dengan Candi Borobudur yang merupakan candi Buddha, Candi Prambanan adalah sebuah kompleks candi Hindu.\n" +
                    "Meskipun demikian, Lokasi keduanya yang berada di Jawa Tengah juga membuktikan bahwa dahulu umat Buddha dan Hindu hidup berdampingan dengan rukun. Kedua candi besar ini juga menjadi bukti kemajuan peradaban manusia pada saat itu karena mampu membangun candi-candi dengan seni arsitektur yang luar biasa tanpa bantuan teknologi canggih.\n" +
                    "Kompleks Candi Prambanan juga disebut memiliki seribu buah candi karena adanya cerita rakyat Roro Jonggrang, namun sebenarnya hanya ada sekitar 240 candi di kompleks tempat wisata ini. Tempat wisata ini menghadap timur, tetapi terdapat empat pintu masuk di masing-masing mata angin. Gerbang utama candi ini adalah yang berada di sebelah timur.\n" +
                    "Candi ini merupakan persembahan bagi Dewa Siwa yang dalam ajaran Hindu dikenal sebagai Dewa Penghancur. Menurut prasasti Siwaghra yang saat ini disimpan di Museum Nasional Indonesia, nama asli kompleks candi ini adalah Siwaghra yang berasal dari bahasa Sansekerta, yang mempunyai arti Rumah Siwa.\n\n",

            "Wisata Religi Ziarah Makam Sunan Bonang Tuban. Tuban, yang saat ini mempunyai moto “tuban bumi wali” memang terbukti menyimpan cerita dibalik wali. Baik itu jumlah wali yang disemayamkan di bumi tuban, maupun dari sejarah tuban yang dulunya pernah di gunakan sidang dan pertemuan dari kesembilan wali yang dikenal ditanah jawa sampai saat ini. Siapa sih yang tidak kenal dengan Wali 9 ?. yah, wali merupakan seorang ulama besar pada zaman dahulu yang menyebarkan syiar agama islam. Jumlah wali di tanah jawa dikenal Sembilan tokoh yang biasa di sebut wali songo, songo yang berarti Sembilan . Diantara Sembilan wali tresebut dikenal tokoh Sunan Bonang yang dimakamkam di kota tuban. Makam sunan bonang sampai saat ini terus ramai dikunjungi peziarah. Setiap harinya mengalir hilir-mudik orang-orang berziarah kemakam beliau bak air sungai yang \n" +
                    "mengalir terus menerus tiada henti. Para pengunjung atau peziarah datang dari berbagai kota, berbagai wilayah di Indonesia sampai mancanegara dan tentunya warga tuban sendiri. Selain wisata religi Ziarah Makam Sunan Bonang dituban juga terdapat wisata Religi berkunjung dan istighosah di Masjid dan Pesantren perut bumi. Lokasinya tak jauh dari lokasi makam sunan bonang tuban. Sekitar 2KM kearah Timur-selatan/tenggara pesantren perut bumi dan masjid perut bumi yang masih berada dikawasan kota tuban. ",

            "Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia. Monumen ini terdiri atas enam teras berbentuk bujur sangkar yang diatasnya terdapat tiga pelataran melingkar, pada dindingnya dihiasi dengan 2.672 panel relief dan aslinya terdapat 504 arca Buddha.\n",

            "Wisata Ziarah Makam Sunan Drajat Lamongan , adalah salah satu tempat wisata religi  yang berada di desa drajat , kecamatan paciran ,  kabupaten lamongan , provinsi jawa timur , negara indonesia  . \n" +
                    "Wisata Ziarah Makam Sunan Drajat Lamongan , adalah Tempat wisata yang ramai wisatawan pada hari hari biasa maupun pada weekand atau hari libur. Tempat sangat indah dan bisa memberikan suasana yang menghibur kejenuhan akan aktivitas kita sehari hari. Harga tiket masuk ke Wisata Ziarah Makam Sunan Drajat Lamongan , terbilang sangat murah, tetapi jangan salah menilai pesona keindahan yang di hidangkan oleh Wisata Ziarah Makam Sunan Drajat Lamongan , bukanlah hal yang murahan.Sangat di sayangkan jika anda berada di kota lamongan  tidak menggunjungi wisata religi  yang mempunyai pesona keindahan yang tiada duanya.\n\n",

            "Sunan Kalijaga merupakan salah satu dari Walisongo, penyebar Agama Islam di Tanah Jawa yang sudah sangat dikenal luas di masyarakat. Kepopuleran Sunan Kalijaga karena cara dakwah beliau yang bia dibilang sangat toleran terhadap masyarakat asli Jawa yang sebelumnya beragama Hindu. Sunan Kalijaga menyebarkan agama Islam tidak dengan kekerasan, namun dengan cara yang lembut melalui seni dan kebudayaan. Diantara karya beliau adalah gamelan jawa, wayang, tembang jawa dll. Dengan cara beliau berdakwah ini akhirnya bamya penguasa Jawa yang akhirnya memeluk agama Islam, dan akhirnya diikuti oleh rakyat kebanyakan.",
            "Wisata Religi Sunan Gresik  terletak di Jalan Malik Ibrahim, Desa Gapurosukolilo, Gresik, Jawa Timur. Sunan Gresik atau yang lebih dikenal dengan nama Maulana Malik Ibrahim merupakan Wali pertama dalam menyebarkan agama Islam di Pulau Jawa. Beliau juga ayahanda Sunan Ampel. \n" +
                    "\n" +
                    "Sunan Gresik nama aslinya Syekh Maulana Malik Ibrahim, datang di pulau Jawa pada tahun 1380 dan wafat di Gresik pada tahun 1419. Beliau bukan saja seorang ulama tetapi juga ahli sosiologi. Ayahnya bernama  Barabad Zainal Alam berasal dari Gujarat India, tetapi ibunya wanita dari Campa.\n" +
                    "Rombongan Syekh Maulana Malik Ibrahim dari Campa, tiba di Gresik pada tahun 1381 lalu menetap di desa Leran 9 km dari kota Gresik. Adapun rombongan ini terdiri dari 40 orang datang dengan sebuah kapal dengan maksud akan mengislamkan Majapahit  yang ketika itu mulai runtuh. Maka jadilah beliau Wali pertama dari sembilan wali yang terbentuk kemudian hari\n" +
                    "Dengan Jalan berdagang, membuka toko, beliau mencoba mendekati rakyat membantu dan mengajari hal-hal yang belum dikenal oleh mereka, lalu menjadi tabib dan karena banyak orang yang berhasil di tolong maka nama Sunan Gresik pun kian harum\n" +
                    "Syekh Maulana Malik Ibrahim (Sunan Gresik) wafat 9 april 1419 masehi di Gresik  setelah lama meninggalkan desa Leran dimana Beliau untuk pertama kalinya datang di pulau jawa.\n\n",

            "Di Kabupaten Kudus Jawa Tengah ada dua buah makam Walisongo yang sangat terkenal, yaitu Makam Sunan Kudus dan Makam Sunan Muria. Kedua makam ini banyak dikunjungi oleh masyarakat baik warga Kudus sendiri maupun masyarakat diluar Kudus. Makam Sunan Muria setiap harinya banyak dikunjungi oleh para peziarah. Namun akan lebih ramai lagi pada hari Kamis Wage karena pada hari itu dipercaya sebagai hari neton Sunan Muria. Makam Sunan Muria merupakan makam yang cukup unik karena berlokasi di lereng Gunung Muria. Akses ke lokasi makam lumayan berat karena berada di puncak sebuah bukut. Untuk sampai ke lokasi makam, anda harus menempuh perjalanan yang naik turun. Namun  anda jangan khawatir karena disini banyak sekali ojek yang siap mengantarkan anda ke lokasi Makam. Biaya ojek di Makam Sunan Muria tidak lah mahal, yaitu sekitar Rp. 8000 sekali jalan, itu sudah diantar sampai ke lokasi Makam.",

            "Sunan Giri merupakan putera dari Syekh Maulana Ishaq dan Dewi Sekardadu (putri Raja Blambangan, Menak Sembuyu) yang lahir pada Tahun 1442 M, di masa kecilnya bernama Raden Paku atau Joko Samudro, kemudian diberi julukan Ainul Yaqin oleh Sunan Ampel atau Raden Rachmat yang tak lain adalah guru sekaligus pamannya sendiri/ adik dari dari ayahnya (Syekh Maulana Ishaq). \n" +
                    "\n" +
                    "Selain sebagai ulama atau wali, beliau juga bertindak sebagai raja bergelar Prabu Satmoto dan memerintah Kerajaan Giri Kedaton pada tahun 1487-1506 M. Beliau memerintah Gresik dan sekitarnya selama beberapa generasi. Ketenaran beliau meliputi wilayah Madura, Lombok, Kalimantan, Sumbawa, Sumba, Flores, Ternate, Sulawesi dan Maluku." +
                    "  Sunan Giri wafat pada tahun 1506 M, dan dimakamkan diatas bukit dalam cungkup berarsitektur khas Jawa yang sangat unik. Makam Sunan Giri terletak di Dusun Giri Gajah Desa Giri Kecamatan Kebomas berjarak 4 Km dari pusat Kota Gresik.\n" +
                    "Secara keseluruhan lingkungan makam ini nampak sakral dan berwibawa. Secara tata kelola keruangan arkeologis, area komplek makam Sunan Giri ini terbagi menjadi 3 langkan (area/bagian menuju bangunan utama dalam budaya Jawa) dengan gapuro sebagai penandanya, yaitu : area pertama/terluar berupa Gapura Bentar dengan Kala Makara berbentuk sepasang naga, area kedua juga berupa Gapura Bentar yang sudah tidak berbentuk, dan area ketiga berupa Gapura Paduraksa, kemudian area inti/ utama yaitu cungkup kubur Sunan Giri.\n\n",

            "Masjid pintu seribu terletak di Kampung Bayur, Kelurahan Periuk Jaya, Kecamatan Periuk, Tangerang, Banten. Masjid yang terlihat sudah usang itu dibangun pada tahun 1978.\n" +
                    "Masjid tersebut sebenarnya bernama Masjid Nurul Yaqin. Namun karena memiliki banyak pintu yang tak terhitung biasa disebut pintu seribu. Di dalam masjid itu juga terdapat makam Syeikh Al Faqir Mahdi.\n" +
                    " Menurut salah satu penjaga masjid tersebut, masjid pintu seribu sering dikunjungi banyak warga dari berbagai daerah. Mereka datang untuk wisata religi atau berziarah ke makam Syeikh Al Faqir Mahdi.",

            "Wisata Religi Sunan Ampel terletak di kelurahan Ampel, kecamatan Semampir, Surabaya Jawa Timur, dengan tujuan obyek yaitu makam Sunan Ampel dan Masjid Ampel. Kawasan wisata ini berarsitektur Tiongkok dan Arab. Sunan Ampel merupakan salah satu dari Wali Songo dalam menyebarkan agama Islam di Jawa," +
                    "Makam Sunan Ampel sangat sederhana, hanya berselubung kain putih pada batu nisan dan dibatasi pagar aluminium tahan karat setinggi 1,5 meter, yang melingkar dan luasnya sekitar 64 meter persegi. Makam Sunan Ampel berada di sebelah barat Masjid Agung Sunan Ampel dan berdampingan dengan makam istrinya, Nyai Condrowati, beserta lima kerabatnya.",

            "Sebuah kerajaan Jawa yang memerintah beberapa abad yang lalu telah menjadi ikon Kota Solo. Kerajaan ini bernama Keraton Kasunanan, didirikan oleh Susuhan Pakubuwono II (Sunan PB II) pada tahun 1744 sebagai pengganti Keraton Kartasura yang rusak akibat Geger Pecinan pada tahun 1743. Memiliki luas area sekitar 54 are dan banyak koleksi patung, senjata dan pusaka kerajaan. Salah satu bangunan bertingkat yang menarik di Keraton Kasunanan yaitu Menara Sanggabuwana, konon menjadi tempat bertemunya Ratu Laut Selatan dengan Raja. Menara ini didirikan oleh Sri Susuhan Pakubuwono III pada tahun 1782. Menara setinggi 30 meter ini berfungsi sebagai menara dan tempat memata-matai Belanda pada masa penjajahan.\n",

            "Kelenteng Kong Miao adalah rumah ibadah umat agaman khonghucu. Kelenteng terletak berdampingan dengan deretan rumah ibadah lainnya yang sudah ada di TMII, yakni: Masjid Pangeran Diponogoro, Gereja Katholik Santa Chatarina, Gereja Kristen Protestan Haleluya, Pura Hindu Darma,Wihara Arya Dwipa Arama, dan Sasana Adirasa mencerminkan keragaman dan kerukunan umat beragama di Indonesia.\n" +
                    "\n" +
                    "Pembangunan Kelenteng Kong Miao diawali dengan peletakan batu pertama oleh Menteri Agama RI, Dr. Maftuh Basyuni pada 2 februari 2009, dan diresmikan oleh Ketua Yayasan Harapan Kita, Hj.Siti Hardiyanti Rukmana pada 23 Desember 2010. Saat peresmian kelenteng ini dikunjungi oleh Presiden Republik Indonesia Susilo Bambang Yudhoyono bersama Ibu Ani Yudhoyono usai membuka musyawarah nasional Majelis Tinggi Agama Konghucu Indonesia (Matakin) ke XXI menyempatkan menanam pohon cemara di halaman klenteng.\n" +
                    "\n" +
                    "\n" +
                    "Kompleks kelenteng kong miao terdiri tiga bangunan inti, yakni Tian Tan (Altar Suci), Da Cheng Dian (Kelenteng Nabi Agung) dan Qi Fu Dian (Kelenteng keberkahan). Bangunan pertama adalan Tian Tan berbentuk bundar melambang kesempurnaan (TUhan) dan beratap tiga susun melambangkan Tian (Tuhan), atap paling atas;Ren (Manusia), atap tengah; dan Di (bumi atau alam semesta), atap paling bawah. di atas atap terdapat guci tempat meletakkan dupa (hiolo) berfungsi untuk bersembahyang kepada Tuhan.\n\n",

            "Wisata Klenteng Kwan Sing Bio di Tuban  adalah salah satu tempat wisata yang berada di Jl. RE. Martadinata No.1, Desa Karangsari, Kecamatan Tuban, Kabupaten Tuban, Jawa Timur, Indonesia. Wisata Klenteng Kwan Sing Bio di Tuban adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari. Wisata Klenteng Kwan Sing Bio di Tuban memiliki pesona keindahan yang sangat menarik untuk dikunjungi. Sangat di sayangkan jika anda berada di kota Tuban tidak mengunjungi wisata Klenteng Kwan Sing Bio di Tuban yang mempunyai keindahan yang tiada duanya tersebut.\n" +
                    "Wisata Klenteng Kwan Sing Bio di Tuban sangat cocok untuk mengisi kegiatan liburan anda, apalagi saat liburan panjang seperti libur nasional, ataupun hari ibur lainnya.  Keindahan wisata Klenteng Kwan Sing Bio di Tuban ini sangatlah baik bagi anda semua yang berada di dekat atau di kejauhan untuk merapat mengunjungi tempat wisata Klenteng Kwan Sing Bio di kota Tuban.\n",

            "Masjid Menara Kudus merupakan peninggalan salah satu Wali Songo yaitu Sunan Kudus dalam menyebarkan agama Islam di wilayah Jawa Tengah. Masjid Menara Kudus yang masih lestari ini telah menjadi landmark Kota Kudus dan menjadi salah satu tujuan wisata religi di Jawa Tengah.\n" +
                    "\n" +
                    "Lokasi Masjid Menara kudus atau yang juga dikenal dengan nama Masjid Al-Aqsa berada di daerah Kauman, kecamatan kota Kudus, sekitar 1,5 Km ke arah barat pusat kota (Simpang Tujuh). Kota Kudus merupakan sebuah kabupaten yang terletak di wilayah Jawa Tengah, kota ini berada di pantai utara antara Jawa Tengah dan Jawa Timur dan berada 51 kilometer dari kota Semarang."};

    String [] gambar= {"gungjat.jpg","sampokong.jpg","grejablenduk.jpg","prambanan.jpg","sunanbonang.jpg","borbudur.jpg","sunandrajat.jpg","sunankalijaga.jpg",
            "sunangresik.png","sunanmuria.jpg","sunangiri.jpg","masjidseribupintu.jpg","sunanampel.jpg","kratonsurakarta.jpg","klentengkongmiao.jpg","kelentengkwansingbio.jpg","kudus.jpg"};

    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater= LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        // holder.tv3.setText(desk[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(thumb[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv2.setText(gambar[position]);
        //holder.tv3.setTag(holder);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();




                Intent intent = new Intent(context, DetailWisata.class);
                intent.putExtra("judul", vholder.tv1.getText().toString());
                intent.putExtra("gambar", vholder.tv2.getText().toString());
                intent.putExtra("desk",desk[position]);

                context.startActivity(intent);



            Log.e(TAG,"kondisi bekerja");
        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
