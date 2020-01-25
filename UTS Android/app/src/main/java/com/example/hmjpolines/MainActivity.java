package com.example.hmjpolines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Hmj> hmjs;
    ArrayList<String> Nama,Desc;
    ArrayList<Integer> Photo;
    RecyclerView ListDISNEY;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListDISNEY = findViewById(R.id.rv_hmj);

        hmjs =new ArrayList<>();
        Nama = new ArrayList<>();
        Photo= new ArrayList<>();

        Nama.add("Snow White and the Seven Dwarfs");
        Nama.add("Pinocchio");
        Nama.add("Dumbo");
        Nama.add("Cinderella");
        Nama.add("Peterpan");
        Nama.add("Sleeping Beauty");
        Nama.add("The Little Mermaid");
        Nama.add("Beauty and The Beast");
        Nama.add("Aladdin");
        Nama.add("The Lion King");
        Nama.add("Tarzan");

        Desc = new ArrayList<>();
        Desc.add("Snow White and the Seven Dwarfs adalah film animasi yang dirilis Walt Disney pada 21 Desember 1937. Film animasi ini bercerita tentang seorang putri cantik jelita yang memiliki kulit seputih salju, Snow White. Snow White tinggal bersama ibu tirinya, Evil Queen, yang mana adalah seorang ratu yang sangat cantik dan selalu menanyakan siapa wanita tercantik pada cermin ajaib. cermin ajaib yang selalu menjawab bahwa sang ratu lah yang paling cantik tiba-tiba suatu hari s menjawab bahwa ada Snow White adalah gadis yang seribu kali lebih cantik dari sang Ratu. Ratu yang murka akhirnya memutuskan untuk membunuh Snow White. Namun, Snow White berhaasil kabur dan ditolong oleh 7 kurcaci."
                 + "Bagaimana kelanjutannya?"
                 +"SilahkanMenonton!!");
        Desc.add("Pinocchio adalah film animasi yang dirilis Walt Disney pada 7 Februari 1940. Film animasi ini bercerita tentang seorang kakek yang kesepian karena hidup sendirian. Sang kakek akhirnya memutuskan untuk membuat sebuah boneka kayu yang dia anggap sebagai anaknya. Pinocchio, nama boneka kayu hidup yang hidungnya akan memanjang bila berbohong. Mereka hidup bahagia. Hingga suatu hari Pinocchio berbohong dan mendapat batunya. Kakek yang sangat sedih berjuang untuk mencari Pinocchio."
                +"Apa yang terjadi?"
                +"Silahkan Menonton!");
        Desc.add("Dumbo adalah film animasi yang dirilis Walt Disney pada 23 Oktober 1941. Film Animasi ini bercerita tentang seekor gajah yang terlahir tidak normal. Ia terlahir dengan telinga yang sangat besar, hingga ia selalu menjadi bahan ejekan. Namun, gajah kecil lucu yang tidak normal ini ternyata dapat terbang dengan kupingnya yang besar."
                +"WOW"
                +"Penasaran?"
                +"Silahkan menonton filmnya!");
        Desc.add("Cinderella adalah film animasi yang dirilis Walt Disney pada 15 Februari 1950. Film Animasi ini bercerita tentang keluarga bahagia yang terdiri dari seorang ayah, ibu, dan anaknya, Ella. Suatu hari sang ibu meninggal, Ella hidup berdua dengan ayahnya. Hingga sang ayah menikah lagi dengan seorang janda beranak dua dari kota. Tanpa sang ayah ketahui, saat ayah sedang tidak berada dirumah, Ella akan diperlakukan sebagai pembantu oleh ibu dan kedua saudara tirinya. Hingga pada suatu hari, sang ayah meninggal saat sedang bekerja"
                +"Apa yang akan terjadi pada Cinderella sang cerobong asap?"
                +"Mari kita nonton bersama sama");
        Desc.add("Peterpan adalah film animasi yang dirilis Walt Disney pada 5 Februari 1953. Film Animasi ini bercerita tentang seorang bocah yang tidak pernah dewasa melawan bajak laut jahat di Neverland."
                +"Seperti apa film disney peterpan ini?"
                +"Bagaimana petualangan peri awet muda berwarna hijau ini?"
                +"Silahkan menonton!!");
        Desc.add("Sleeping Beauty adalah film animasi yang dirilis Walt Disney pada 29 Januari 1959. Film Animasi ini bercerita tentang seorang putri cantik yang lahir dan diberkati oleh 3 peri baik. Namun, sang peri jahat yang murka karena tak diundang pada pesta kelahiran sang putri memberi berkat buruk pada sang putri. Bahwa Aurora akan mati pada ulang tahunnya yang ke 17 dengan tertusuk jarum."
                +"Apa yang akan terjadi pada Aurora?"
                +"Bagaimana cara ketiga peri menyelamatkan Aurora?"
                +"Silahkan Menonton!");
        Desc.add("The Little Mermaid adalah film animasi yang dirilis Walt Disney pada 17 November 1989. Film Animasi ini bercerita tentang Ariel yang merupakan putri bungsu dari sebuah kerajaan didalam laut. Ariel selalu bermimpi dapat bertemu pangeran impiannya. Ursula, penyihir laut, membuat kesepakatan dengan Ariel. Jika ia ingin bertemu dengan Eric, pangeran pujaannya ia harus mengorbankan sesuatu."
                +"Apa yang akan terjadi pada Ariel yang sedang dibutakan cinta?"
                +"Silahkan Menonton!!");
        Desc.add("Beauty and The Beast adalah film animasi yang dirilis Walt Disney pada 22 November 1991. Film Animasi ini bercerita tentang seorang pangeran yang dikutuk menjadi raksasa buruk rupa. Hingga akhirnya ia bertemu dengan Putri cantik, Belle. Beast pun mulai jatuh cinta secara perlahan pada Belle karena ketulusan hatinya. Ia berharap suatu saat nanti, Belle lah yang akan mematahkan kutukkannya ini."
                +"Akankah ketulusan cinta Belle menyelamatkan Beast?"
                +" Silahkan Menonton!!");
        Desc.add("Aladdin adalah film animasi yang dirilis Walt Disney pada 25 November 1992. Film Animasi ini bercerita tentang Alladini, seorang anak jalanan yan jatuh cinta pada seorang putri. Dengan perbedaan kasta danharta, Aladdin berusaha mencari jalan agar bisa menjadi seorang pangeran, tak disangka ia menemukan lampu ajaib yang berisi Jin didalamnya. Aladdin pun berusaha meminta bantuan pada jin untuk membantunya."
                +"Akankah Jin menolong Aladdin?"
                +"Akankah Aladdin akan mendapatkan cinta sejatinya?"
                +"Silahkan Menonton!!");
        Desc.add("The Lion King adalah film animasi yang dirilis Walt Disney pada 24 Juni 1994. Film Animasi ini bercerita tentang Simba, seekor singa muda yang ditinggal mati ayahnya yang terbunuh. Simba akhirnya memutuskan untuk melarikan diri dari kelompoknya hanya untuk mempelajari arti sebenarnya dari tanggung jawab dan keberanian."
                +"Bagaimana kisah Simba selanjutnya?"
                +"Silahkan Menonton!!");
        Desc.add("Tarzan adalah film animasi yang dirilis Walt Disney pada 18 Juni 1999. Film Animasi ini bercerita tentang Tarzan, manusia yang dibesarkan oleh induk gorila, kini harus memilih apakah ia akan pergi dan hidup di dunia luar berperadaban seperti layaknya manusia atau tetap hidup di hutan liar ketika ia menyadari bahwa ia adalah seorang manusia."
                +" Apa pilihan Tarzan?"
                +"Silahkan Menonton!!");

        Photo.add(R.drawable.snow_white);
        Photo.add(R.drawable.pinocchio);
        Photo.add(R.drawable.dumbo);
        Photo.add(R.drawable.cinderella);
        Photo.add(R.drawable.peterpan);
        Photo.add(R.drawable.sleeping_beauty);
        Photo.add(R.drawable.ariel);
        Photo.add(R.drawable.beauty_beast);
        Photo.add(R.drawable.aladdin);
        Photo.add(R.drawable.lion_king);
        Photo.add(R.drawable.tarzan);



        layoutManager = new LinearLayoutManager(this);

        ListDISNEY.setHasFixedSize(true);
        ListDISNEY.setLayoutManager(layoutManager);


        for (int i = 0; i < Nama.size();i++) {
            Hmj currentItem = new Hmj();
//                    Toast.makeText(MainActivity.this, "" + Nama.get(i), Toast.LENGTH_LONG).show();
            try {
                currentItem.setName(Nama.get(i));
                currentItem.setDescription(Desc.get(i));
                currentItem.setPhoto(Photo.get(i));
            } catch (Exception e) {
                e.printStackTrace();
            }

            hmjs.add(currentItem);
        }
        adapter = new CardHmjAdapter(hmjs, MainActivity.this);

        ListDISNEY.setAdapter(adapter);



    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profil,menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()== R.id.menu_profil){
            Intent intent = new Intent(MainActivity.this,profil.class);
            intent.putExtra("namaProfile", "Adinda Reza");
            intent.putExtra("namaDesc", "3.34.18.0.02");
            startActivity(intent);
            finish();

        }
        return super.onOptionsItemSelected(item);
    }
}
