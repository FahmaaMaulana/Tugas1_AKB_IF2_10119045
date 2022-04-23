package com.example.tugas1_10119045_akb;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* tanggal pengerjaan : 23/04/2022
                  NIM : 10119045
                 Nama : Fahma Maulana
                Kelas : IF-2
    */
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run () {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }
}