package com.example.a10119244uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/*
    Tanggal pengerjaan: 30 April 2021
    NIM: 10119244
    Nama: Mya Hauliyah
    Kelas: IF-6
*/

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            startActivity(new Intent(getApplicationContext(), OnboardingActivity.class));
            finish();
        }, 4000L); // 4 detik
    }
}
