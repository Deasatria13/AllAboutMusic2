package com.example.allaboutmusic;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
        RecyclerView recyclerView;
        List<Model> main_list;
        RecyclerView.Adapter adapter;

        DialogInterface.OnClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        main_list = new ArrayList<>();
        recyclerView = findViewById(R.id.rv_musik);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        main_list.add(new Model(R.drawable.kurt, "Kurt Donald Cobain ", "lahir di Aberdeen, 20 Februari 1967 – meninggal di Seattle, 6 April 1994 pada umur 27 tahun dalah penyanyi, penulis lagu dan gitaris dalam band grunge dari Seattle, Nirvana. Dengan suksesnya grup musik ini, Cobain menjadi selebriti nasional dan internasional, suatu posisi yang disandangnya dengan berat hati.\n" +
                "\n" +
                "Pada 1991, melejitnya lagu Cobain yang paling terkenal, Smells Like Teen Spirit, menandai bermulanya perubahan besar dalam musik pop dari jenis musik yang populer pada tahun 1980-an seperti glam metal, arena rock, dan dance-pop menjadi grunge dan rock alternatif. Selain itu lagu-lagu tulisan Cobain lainnya misalnya About a Girl, Come as You Are, In Bloom, Lithium, Heart-Shaped Box, All Apologies, dan Rape Me."));


        main_list.add(new Model(R.drawable.ozzy, "Ozzy Osbourne", "Ozzy Osbourne bernama asli John Michael Osbourne lahir di Birmingham, Inggris pada tanggal 3 Desember 1948. Ozzy Osbourne adalah salah satu legenda aliran musik Heavy Metal yang masih hidup. Ia menjadi vokalis grup musik Black Sabbath sekitar sepuluh tahun, mulai dari tahun 1969 sampai tahun 1979. Ia dipecat dari grup musik yang dibangunnya tersebut karena kebiasaannya atas penggunaan obat-obatan terlarang juga alkohol yang berlebihan Ozzy memiliki tato di pergelangan tangan yang dibuat pada ketika ia berusia 14 tahun, tato itu bertuliskan namanya sendiri “OZZY”. Ketika ia pulang dan memamerkan tato tersebut pada ayahnya, ia di hajar habis-habisan karena tato tersebut. Fakta lain ialah Ozzy Osbourne adalah pekerja keras, Ia pernah melakukan pekerjaan apa saja bahkan sampai tukang jagal Ia kerjakan. Ia mengatakan “Aku pernah kerja dikamar mayat selama kurang lebih seminggu. Aku benar-benar edan. Apa saja ku lakukan. Waktu dirumah jagal, selama dua minggu pertama kerjaan ku hanya muntah, tetapi aku bisa mengatasi masalah kecil itu.”\n" +
                "\n" +
                "Ozzy Osbourne membentuk sebuah festival musik yang bernamakan Ozzfest, acara ini memiliki 2 sampai 3 panggung besar di dalamnya. Ozzfest adalah festival musik tahunan di Amerika Serikat yang menyuguhkan band band bergenre Heavy Metal dan genre lain lain nya. Festival ini dibentuk pertama kali oleh Ozzy Osbourne pada tahun 1996. Ide ini berawal ketika saat dia dilarang tampil di festival musik Lollapalooza lalu Ia berminat membuat konser tandingan, juga demi kepuasan batin Ia selalu jadi headline di acaranya sendiri. "));


        main_list.add(new Model(R.drawable.james, "James Alan Hetfield", "(lahir di Dowey, California, 3 Agustus 1963; umur 56 tahun[1]) adalah penulis lagu utama, pendiri, penyanyi dan pemain gitar ritme kelompok heavy metal Metallica.James bersama tiga kawannya yang tergabung dalam Metallica merupakan salah satu dari The Big Four, yaitu Metallica, Anthrax, Slayer, dan Megadeth, melalui keunikan dan gaya masing masing keempat band itulah genre thrash metal pernah meraih puncak kejayaannya.James Hetfield terkenal karena riff gitarnya yang tidak terlalu 'njelimet' namun sangat pas dan cocok ketika bersandingan dengan instrumen lain dan juga penampilannya ketika di atas panggung yang garang dan kerap mengundang decak kagum setiap penonton yang melihatnya."));


        main_list.add(new Model(R.drawable.fredy, "Freddie Mercury", "(lahir Farrokh Bulsara; 5 September 1946 – 24 November 1991) adalah seorang penyanyi-penulis lagu dan produser rekaman dan vokalis utama dari band rock Queen berkebangsaan Inggris. Dia dianggap sebagai salah satu dari penyanyi terbaik dalam sejarah musik populer,dan dikenal atas kepribadian flamboyan di panggung dan jangkauan vokal empat-oktafnya Mercury lahir di Zanzibar dari orang tua Parsi yang berasal dari India. Setelah tumbuh di Zanzibar dan kemudian India, keluarganya pindah ke Middlesex, Inggris, di akhir masa remajanya. Dia membentuk Queen pada tahun 1970 bersama gitaris Brian May dan drummer Roger Taylor. Mercury menulis banyak hit untuk Queen, termasuk \"Bohemian Rhapsody\", \"Killer Queen\", \"Somebody to Love\", \"Don't Stop Me Now\", \"Crazy Little Thing Called Love\", dan \"We Are the Champions\". Dia juga bersolo karier disamping Queen, dan terkadang menjadi seorang produser dan musisi tamu untuk artis lain. Mercury meninggal di tahun 1991 pada usia 45 tahun karena komplikasi dari AIDS, setelah mengkonfirmasi sehari sebelum kematiannya bahwa dia telah tertular penyakit itu.\n" +
                "\n" +
                "Sebagai anggota dari Queen, dia dimasukkan kedalam Rock and Roll Hall of Fame pada tahun 2001, Songwriters Hall of Fame pada tahun 2003, dan UK Music Hall of Fame pada tahun 2004. Ditahun 1992, setahun setelah kematiannya, Mercury secara anumerta dianugerahi di Brit Award sebagai Outstanding Contribution to British Music, dan sebuah konser penghormatan diadakan di Stadion Wembley, London. Pada tahun 2002, dia berada di nomor 58 dalam jajak pendapat oleh BBC sebagai 100 Greatest Britons. Mercury terpilih sebagai penyanyi pria terbaik sepanjang masa dalam sebuah jajak pendapat tahun 2005 yang diadakan oleh Blender dan MTV2"));

        main_list.add(new Model(R.drawable.bob, "Bob Dylan ", "terlahir sebagai Robert Allen Zimmerman lahir di Duluth, Minnesota, Amerika Serikat, 24 Mei 1941; umur 78 tahun) adalah seorang penyanyi-penulis lagu, musikus dan penyair Amerika yang sumbangannya terhadap musik Amerika bertahan lama dan dapat dibandingkan, dalam kemasyhuran dan pengaruhnya, dengan karya-karya Stephen Foster, Irving Berlin, Woody Guthrie, Bruce Springsteen, dan Hank Williams. Tempatnya dalam budaya Amerika dan Eropa pada sepertiga terakhir dari abad ke-20 hingga sekarang memang unik. Dia menerima Penghargaan Nobel Sastra tahun 2016 karena karyanya yang telah menciptakan jenis ekspresi puitis baru dalam tradisi lagu Amerika yang mengagumkan.\n" +
                "\n" +
                "Majalah musik Rolling Stone menempatkan Bob dylan dalam urutan kedua pada daftar \"Greatest Artists of All Time\". Dylan hanya kalah satu tingkat tepat di bawah The Beatles, padahal sejatinya band yang dipimpin John dan Paul ini termasuk band yang terpengaruh gaya bermusik Dylan dan sering mendengarkan lagu - lagu milik Dylan. Tentu saja penghargaan dari media musik tersebut berkaitan dengan fakta bahwa perjuangan dan dedikasi Bob Dylan di dunia musik sudah sangat panjang serta mengagumkan. Dia adalah musisi mulltidimensional, penyanyi, penulis lagu, sastrawan, dan disc jockey. Dylan bahkan berhasil memprovokasi lahirnya sejumlah genre dalam musik pop, termasuk folk rock dan country rock. Seperti halnya Beatles, Dylan mencampur berbagai jenis musik sehingga hasilnya lebih enak di dengar. Dia adalah vokalis yang sangat berpengaruh sekaligus musisi yang memiliki begitu banyak karakter melalui suaranya. Namun, yang paling mengesankan adalah bagaimana dia dipengaruhi oleh kehidupan yang penuh perubahan."));


        main_list.add(new Model(R.drawable.ian, "Ian MacKaye", "jika Iggy Pop adalah godfather punk, maka godfather dari hardcore seharusnay adalah Ian MacKaye. Sedikit musisi yang lain telah menjalani karir selama dengan MacKaye – terutama penolakannya untuk teken kontrak dengan label rekaman besar, juga hidup dengan gaya hidup bersih dan sober (atau straight-edge). Lahir pada 16 April 1962, dan tumbuh di Washington, D.C., MacKaye menemukan kecintaannya akan musik via banyak penayangan dari dokumenter filem terkenal Woodstock. Tapi suatu ketika di Palo Alto, California, yang secara tidak langsung merubaha arah hidup MacKaye. Ayahnya mendapatkan relasi di Stanford University, maka keluarga itu pindah ke California, tinggal selama 9 bulan pada 1974.\n" +
                "\n" +
                "\n" +
                "Saat MacKaye kembali ke D.C., dia tidak kuat untuk melihat sebagia besar temannya telah berubah menjadi pengguna narkoba. Alih-laih menjadi pengikut mereka, MacKaye memberontak terhadap hal itu (dia kemudian menemukan semangat membara di anak muda D.C. lainnya, Henry Garfield, yang suatu ketika merubah namanya menjadi Henry Rollins). Walaupun MacKaye adalah seorang penggemar berat musik hard rock (Led Zeppelin, Ted Nugent, dll), hal itu tidak lama hingga dia mengenal punk rock dimana pada akhirnya dia memutuskan dia ingin bermain musik sendiri. Terinspirasi oleh kancah punk lokal D.C. dan California (sebut saja Bad Brains, Black Flag, dll.), MacKaye membentuk band pertamanya, the Teen Idles, pada 1979."));

        main_list.add(new Model(R.drawable.chuck, "Charles Michael \"Chuck\" Schuldiner", "(13 Mei 1967 - 13 Desember 2001) adalah seorang penyanyi, penulis lagu, dan gitaris Amerika. Ia mendirikan band Death pada tahun 1983 dan menjadi vokalis utama mereka sampai kematiannya pada tahun 2001. Obituari-nya di Kerrang UK edisi 5 Januari 2002! majalah mengatakan bahwa \"Chuck Schuldiner adalah salah satu tokoh paling penting dalam sejarah logam.\" Schuldiner menduduki peringkat No. 10 dalam buku Joel McIver, The 100 Greatest Metal Guitarists pada 2009 dan No. 20 pada Maret 2004 Guitar World \"The 100 Greatest Metal Guitarists\". Schuldiner mendirikan perusahaan penerbitan Mutilation Music pada tahun 1987, berafiliasi dengan organisasi hak kinerja BMI. Schuldiner meninggal pada tahun 2001 setelah pertempuran dua tahun dengan glioma.\n" +
                "\n" +
                "Schuldiner sering disebut sebagai \"The Godfather of death metal\", meskipun ia \"tidak nyaman\" dengan julukan ini, mengatakan bahwa \"Saya tidak berpikir saya harus mengambil kredit untuk barang-barang death metal ini. Saya hanya seorang pria dari sebuah band, dan saya pikir Death adalah sebuah band metal. \""));


        main_list.add(new Model(R.drawable.dead, "Per Yngve Ohlin", "  (16 Januari 1969 – 8 April 1991) adalah seorang penyanyi berkebangsaan Swedia, terutama dalam kelompok black metal Norwegia Mayhem. Ia memiliki nama panggung Dead dan juga penyanyi dalam band black/thrash metal Swedia Morbid dalam satu demo tape berjudul December Moon.\n" +
                "\n" +
                "Dead dikenal dengan aksi panggungnya yang aneh. Misalnya ia mengubur pakaiannya beberapa minggu sebelum sebuah konser dan menggalinya lagi sebelum naik pentas. Dengan cara ini, menurutnya, ia dapat merasakan \"intisari kematian\"; dengan pakaian yang robek-robek, kotor, berlumut, dan dimakan serangga. Dalam sebuah tur dengan Mayhem ia menemukan seekor burung gagak mati yang ia masukkan ke dalam sebuah kantong plastik. Sebelum mulai pertunjukan ia sering mencium isi kantong itu untuk \"menghirup bau kematian\".\n" +
                "\n" +
                "Beberapa kali ia melukai dirinya sendiri dengan pecahan kaca dan pisau berburu. Dalam suatu konser di Sarpsborg, Norwegia pada 1990, ia melukai dirinya sendiri sedemikian parah sehingga ia harus dibawa ke rumah sakit karena kehilangan darah. Dead juga adalah bagian dari \"inner circle\" atau \"the Black Circle\", sebuah kelompok musisi black metal Norwegia dengan anggota-anggota seperti Øystein 'Euronymous' Aarseth, Varg Vikernes (Burzum), dan Faust (Emperor) yang berhubungan dengan toko rekaman Øystein Helvete."));


        main_list.add(new Model(R.drawable.jon, "Jon Andreas Nödtveidt", "(28 Juni 1975 - 13 Agustus 2006) adalah seorang musisi Swedia. Terkenal sebagai gitaris utama dan vokalis band Dissection black metal Swedia, ia ikut mendirikan band ini pada 1989 dengan bassis Peter Palmdahl.\n" +
                "\n" +
                "Pada awal karir musiknya, ia membentuk band heavy metal bernama Thunder dengan saudaranya Emil pada tahun 1988. Lagu-lagu mereka disajikan dalam album kompilasi sekolah musik Jon di Strömstad.\n" +
                "\n" +
                "Nödtveidt juga tampil di beberapa proyek lain, termasuk The Black (sebagai Rietas), De Infernali, Nifelheim, Ophthalamia (sebagai Shadow), Setan, Siren Yell, dan Terror, sebuah band grindcore yang menampilkan anggota At the Gates.\n" +
                "\n" +
                "Dia juga bekerja sebagai jurnalis di Metal Zone, di mana dia bertanggung jawab untuk melacak adegan black metal yang berkembang. Dia adalah anggota dari Misanthropic Luciferian Order, sekarang dikenal sebagai Temple of the Black Light, dan Werewolf Legion, geng Swedia (jangan bingung dengan Legiun Serigala Rusia). Bertolak belakang dengan kepercayaan umum, ia bukan pencipta bersama, tetapi \"diperkenalkan oleh teman-teman dekat pada tahap yang cukup awal.\"\n" +
                "\n" +
                "Nödtveidt dihukum karena menjadi aksesori untuk pembunuhan Josef ben Meddour tahun 1997, seorang pria gay Aljazair. Dia memulai kembali Diseksi setelah dibebaskan dari penjara pada tahun 2004."));

        main_list.add(new Model(R.drawable.eben, "Eben", "Eben yang bernama asli Aries Tanto adalah pendiri dan gitaris metal asal Bandung, Burgerkill. Ia juga satu-satunya personil awal Burgerkill yang masih bertahan. Burgerkill sendiri terbentuk di Bandung dari tahun 1995. Dan kini di umur 23 tahun telah melalanglang buana di berbagai panggung. Dari panggung kecil maupun besar di Indonesia, hingga panggung besar berskala internasional macam Soundwave, Big Day Out di Australia, Bloodstock Festival di Inggris, Wacken Open Air di Jerman dan yang terdekat akan menyambangi Eropa untuk tur Eropa pertama mereka.\n" +
                "\n" +
                "Saat ini Burgerkill tengah memporomosikan album yang baru mereka yang baru rilis Agustus tahun ini, Adamantine. Juga tengah mempersiapkan diri untuk menjalankan tur besar Eropa pertama mereka di Oktober mendantang yang dimulai di Paris dan akan mengunjungi Mons, Belgia; Hamburg, Jerman; Groningen, Amsterdam dan Roterdam di Belanda"));


        adapter = new CustomAdapter(main_list,getApplicationContext());
        recyclerView.setAdapter(adapter);
    }

    public void btnProfile(View view) {
        Intent profile = new Intent(Home.this,Profile.class);
        startActivity(profile);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}