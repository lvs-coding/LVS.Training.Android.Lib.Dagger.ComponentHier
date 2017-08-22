package com.livos.dagger2training.features.other;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.livos.dagger2training.R;
import com.livos.dagger2training.application.App;
import com.livos.dagger2training.data.local.Datasource0;

import javax.inject.Inject;

public class OtherActivity extends AppCompatActivity {

    @Inject
    Datasource0 ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ((App)getApplication()).getComponent().inject(this);

        String name = ds.getName();
    }
}
