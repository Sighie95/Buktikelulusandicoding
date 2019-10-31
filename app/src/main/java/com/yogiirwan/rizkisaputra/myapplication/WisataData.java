package com.yogiirwan.rizkisaputra.myapplication;

import java.util.ArrayList;

public class WisataData {
    private static String[] namaTempat = {
            "Taman Nasional Karimunjawa",
            "Candi Borobudur",
            "Museum Purbakala Sangiran",
            "Dataran Tinggi Dieng",
            "Kawasab Wisata Baturaden",
            "Kampung Batik Laweyan",
            "Pasar Malam Ngarsopura",
            "Kota Lama Semarang",
            "Lawang Sewu",
            "Masjid Agung Jateng"
    };
    private static String[] alamat = {
            "Jepara",
            "Magelang",
            "Sragen",
            "Wonosobo",
            "Purwokerto",
            "Solo",
            "Solo",
            "Semarang",
            "Semarang",
            "Semarang"

    };
    private static String[] jenis = {
            "Taman, Pantai dan Laut",
            "Candi",
            "Museum Prasejarah",
            "Telaga, Bukit, Candi",
            "Taman, Hutan, Kebun Binatang",
            "Kampung, Batik",
            "Pasar",
            "Bangunan",
            "Bangunan",
            "Bangunan, Masjid",

    };
    private static String[] deskripsi = {
            "Taman Nasional ini jaraknya hanya berkisar 83 km di arah barat laut Jepara, Karimunjawa adalah sebuah cagar alam laut yang dilindungi dan kini disebut sebagai" +
                    " Taman Nasional Karimunjawa. Karimunjawa adalah sebuah destinasi wisata yang populer di Indonesia, adalah pula salah satu " +
                    "tempat wisata di Jepara  yang sangat terkenal. Pengalaman wisata laut di Jawa Tengah paling menakjubkan dapat Anda temukan di Karimunjawa.",
            "Objek wisata di Jawa Tengah yang tidak kalah menariknya lagi adalah candi Borobudur masuk dalam 7 kejaiban dunia. Situs warisan Unesco ini wajib anda kunjungi " +
                    "saat berkunjung ke Magelang Jawa Timur. Terdapat 1460 relief dan 504 stupa Budha di kompleks Candi Borobudur ini. Untuk dapat masuk, Anda harus membayar tiket " +
                    "masuk Candi Borobudur sebesar Rp 30 ribu per orang (dewasa), anak-anak sebesar Rp 12.500 per orang. Untuk tiket masuk turis mancanegara adalah " +
                    "sebesar USD 20 (dewasa) dan USD 10 (anak-anak).",
            "Kalau anda berada di Sragen Jawa Tengah, jangan sampai tidak mampir ke Museum Purbakala yang memiliki 13.809 koleksi fosil manusia purba yang dapat Anda saksikan di Sangiran ini. " +
                    "Oleh karenanya, Sangiran dinyatakan UNESCO sebagai Situs Warisan Dunia (World Heritage). Museum Purbakala Sangiran di Sragen ini memberi sumbangsih besar bagi " +
                    "perkembangan ilmu pengetahuan di dunia, khususnya ilmu arkeologi, geologi, paleoanthropologi, dan biologi. Ada banyak pengetahuan yang dapat diperoleh dari " +
                    "tempat wisata di Jawa Tengah yang satu ini.",
            "Ada banyak sekali objek wisata di dataran Tinggi Dieng yang menarik untuk kita kunjungi. Dataran tinggi Dieng terletak di Wonosobo Jawa Tengah, berjarak sekitar 30 km " +
                    "saja dari pusat Kota Wonosobo, Di kawasan wisata Dieng ini, Anda dapat menemukan sejumlah landmark paling memikat. Mulai dari candi-candi Hindu, Bukit Sikunir Dieng, " +
                    "Telaga Warna Dieng, hingga Sumur Jalatunda.",
            "lereng arah selatan Gunung Slamet, salah satu tempat wisata di Jawa Tengah yang terkenal ini memiliki pemandangan alam yang indah dengan hawa udara yang sejuk. Di kawasan " +
                    "wisata ini pula, Anda dapat menyaksikan kota, Pulau Nusa Kambangan, serta sejumlah pantai berpanorama indah di Cilacap. Salah satu yang terkenal dari " +
                    "Baturaden adalah pemandian air panasnya yang selalu ramai dikunjungi oleh wisatawan, yaitu Pancuran Pitu. Tempat wisata di Banyumas ini adalah pula destinasi wisata " +
                    "keluarga yang patut Anda kunjungi. Di sana Anda dapat berekreasi di Wana Wisata Baturaden, sebuah hutan alam hijau yang sangat tepat untuk dijadikan tempat berkemah " +
                    "bersama keluarga atau teman-teman Anda. Lokasi Wana Wisata ini berjarak sekitar 2 km dari Baturaden. Masih ada juga Taman Kaloka Widya Mandala, sebuah kebun binatang " +
                    "di Baturaden serta memiliki museum untuk menyimpan kerangka satwa khas Indonesia.",
            "Di Kampung Batik Laweyan, Anda akan mendapati kesan arsitektural Eropa di kampung Laweyan ini. Banyak rumah-rumah di Laweyan dibangun dengan sentuhan arsitektur Eropa yang " +
                    "megah dan kokoh. Dulu, rumah-rumah itu adalah kediaman para saudagar batik. Tetapi kini, kampung yang berdiri di atas lahan seluas 24 hektar tersebut terbagi ke dalam tiga blok besar.",
            "Masih di Solo, kita akan jalan ke Ngarsopura Night Market. Disini anda bisa membeli aneka kerajinan, batik, souvenir, hingga makanan kuliner khas Solo. Ngarsopura Night Market " +
                    "merupakan pasar malam di Solo yang secara rutin dibuka pada hari Sabtu – Minggu mulai pukul 19.00 – 21.00 WIB. Ngarsopura ini adalah tempat berdagang yang hanya " +
                    "diperuntukkan bagi mereka yang memiliki KTP Solo.",
            "Disini anda bisa menemukan rekaman tata bangun wilayah berarsitektur Eropa yang ada di tempat ini. Objek wisata di Semarang yang satu ini dijuluki pula sebagai “Little Netherland”. " +
                    "Landmark paling menarik di kawasan Kota Lama adalah Gereja Blenduk, sebuah bangunan berusia lebih dari 2.5 abad. Kata blenduq berasal dari bahasa Jawa, yang berarti kubah, " +
                    "merujuk pada kubah gereja ini. Atapnya yang melengkung dan berwarna merah terasa kontras dengan dindingnya yang bercat putih. Empat pilar kokoh dan menara kembarnya yang khas " +
                    "di bagian depan membentuk ciri khas gereja yang satu ini. Kota Lama Semarang merupakan destinasi favorit bagi para penikmat sejarah dan pecinta fotografi yang ada di Indonesia. " +
                    "Selain Gereja Blenduk, Kawasan Stasiun Tawang dan Polder Air Tawang adalah landmark lain yang patut Anda kunjungi saat berada di Kota Lama Semarang. Di area Polder, terdapat " +
                    "pabrik rokok Praoe Lajar (Prau Layar) yang masih beroperasi sejak dulu sampai sekarang. Menikmati suasana di Kota Lama Semarang pada malam hari adalah salah satu cara terbaik di tempat ini.",
            "Bangunan bersejarah di Semarang ini masih terawat hingga kini. Bangunan ini dibangun pada 1904 pada masa penjajahan kolonial Belanda. Pada awalnya, Lawang Sewu adalah kantor pusat perusahaan kereta " +
                    "api (trem) Belanda. Sebenarnya pintu disini tidak benar-benar seribu, melainkan sekitar 429 buah dengan daun pintu lebih dari 1.200, masyarakat Semarang menamakannya Lawang (pintu) dan Sewu " +
                    "(seribu), artinya seribu pintu. Untuk dapat masuk, Anda harus membayar tiket masuk Lawang Sewu sebesar Rp 10 ribu per orang. Jika ingin memasuki ruangan bawah tananhya, maka Anda harus " +
                    "membayar Rp 30 ribu per orang.",
            "Jangan lupa ya untuk mampir dan Shalat di Masjid agung Jawa Tengah. Masjid ini merupakan kebanggaan warga Jawa Tengah, lokasinya ada di kota Semarang dan pembangunan masjid ini " +
                    "dimulai pada tahun 2001 dan diresmikan pada tahun 2006. Uniknya, bangunan masjid ini merupakan gabungan dari arsitektur Islam, Romawi, dan Jawa. Fasilitas yang dimiliki Masjid Agung Jawa Tengah di antaranya museum, " +
                    "studio radio, Al Quran raksasa, payung elektrik, dan lain-lain."

    };
    private static int[] foto = {
            R.drawable.karimunjawa_jepara,
            R.drawable.candi_borobudur,
            R.drawable.museum_sangiran_sragen,
            R.drawable.dieng,
            R.drawable.baturaden_purwokerto,
            R.drawable.laweyan_solo,
            R.drawable.ngarsopuro_night_market_solo,
            R.drawable.kota_lama_semarang,
            R.drawable.lawang_sewu_semarang,
            R.drawable.majt,
    };

    static ArrayList<WisataObject> getListWO() {
        ArrayList<WisataObject> list = new ArrayList<>();
        for (int posisi = 0; posisi < namaTempat.length; posisi++) {
            WisataObject wo = new WisataObject();
            wo.setNamaTempat(namaTempat[posisi]);
            wo.setAlamat(alamat[posisi]);
            wo.setJenis(jenis[posisi]);
            wo.setDeskripsi(deskripsi[posisi]);
            wo.setFoto(foto[posisi]);
            list.add(wo);
        }
        return list;
    }
}
