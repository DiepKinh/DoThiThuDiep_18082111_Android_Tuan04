package dp.thudiep.th_tuan04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.SeekBar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    SeekBar mSeekBarTime, mSeekBarVol;
    static MediaPlayer sMediaPlayer;
    private Runnable mRunnable;
    int currentIndex = 0;

    RecyclerView rcv;
    CustomRecyclerView adt;
    List<Song> mSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv);
        mSongs = new ArrayList<Song>();

        mSongs.add(new Song("Love yourseft","Justin Biber",R.drawable.anhnen,R.drawable.redheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Anything","Issac",R.drawable.songjus,R.drawable.nonheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.songputh,R.drawable.nonheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.anhnen,R.drawable.redheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.songgil,R.drawable.nonheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.songjus,R.drawable.redheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.songgil,R.drawable.nonheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Borderline","Temp lmpala",R.drawable.songputh,R.drawable.redheart,R.drawable.menu,R.raw.gia_nhu_ngay_dau));
        adt = new CustomRecyclerView(mSongs,this);
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adt);
        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }

    @Override
    public void clickItem(Song song) {
        Intent intent  = new Intent(MainActivity.this,PlaySong.class);
        intent.putExtra("song",song);
        intent.putExtra("listMusic", (Serializable) mSongs);
        intent.putExtra("index",mSongs.indexOf(song));
        startActivity(intent);
    }
}