package com.example.a10119244uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.example.a10119244uts.DailyFragment;
import com.example.a10119244uts.GalleryFragment;
import com.example.a10119244uts.HomeFragment;
import com.example.a10119244uts.MusicVideoFragment;
import com.example.a10119244uts.ProfileFragment;

import com.example.a10119244uts.R;

/*
    Tanggal pengerjaan: 30 April 2021
    NIM: 10119244
    Nama: Mya Hauliyah
    Kelas: IF-6
*/

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    private final static int HOME_ID = 1;
    private final static int DAILY_ID = 2;
    private final static int GALLERY_ID = 3;
    private final static int MUSICVIDEO_ID = 4;
    private final static int PROFILE_ID = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_bottom_navigation_baseline_home_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_bottom_navigation_baseline_daily_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_bottom_navigation_baseline_gallery_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4,R.drawable.ic_bottom_navigaiton_baseline_musicvideo_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5,R.drawable.ic_bottom_navigation_baseline_profile_24));

        // inisiasi awal framelayout sebagai root container akan direplace dengan fragment home
        getSupportFragmentManager().beginTransaction().replace(R.id.root_container, new HomeFragment()).commit();

        bottomNavigation.setOnClickMenuListener(item -> {

        });
        bottomNavigation.setOnReselectListener(item -> {

        });
        bottomNavigation.setOnShowListener(item -> {
            Fragment fragmentSelected = null;
            switch (item.getId())
            {
                case HOME_ID:
                    fragmentSelected = new HomeFragment();
                    break;
                case DAILY_ID:
                    fragmentSelected = new DailyFragment();
                    break;
                case GALLERY_ID:
                    fragmentSelected = new GalleryFragment();
                    break;
                case MUSICVIDEO_ID:
                    fragmentSelected = new MusicVideoFragment();
                    break;
                case PROFILE_ID:
                    fragmentSelected = new ProfileFragment();
                    break;
            }

            assert fragmentSelected != null;
            // inisiasi framelayout sebagai root container akan direplace dengan fragment yang dipilih
            getSupportFragmentManager().beginTransaction().replace(R.id.root_container,fragmentSelected).commit();
        });

    }
}
