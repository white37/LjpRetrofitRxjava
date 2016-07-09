package com.yyeeo.ljpretrofitrxjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Observer;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Observable.timer(2, TimeUnit.SECONDS, AndroidSchedulers.mainThread()).map(l->{
//            startActivity(new Intent(this, LoginActivity.class));
//            finish();
//            return null;
//        }).subscribe();
        Observable.timer(2, TimeUnit.MINUTES, AndroidSchedulers.mainThread()).map(new Func1<Long, String>() {
            @Override
            public String call(Long aLong) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish();
                return null;
            }


        }).subscribe();
    }
}
