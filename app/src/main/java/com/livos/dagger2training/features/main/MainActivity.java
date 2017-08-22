package com.livos.dagger2training.features.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.livos.dagger2training.data.local.Datasource0;
import com.livos.dagger2training.features.eighth.EighthFragment;
import com.livos.dagger2training.features.fifth.FifthFragment;
import com.livos.dagger2training.features.first.FirstFragment;
import com.livos.dagger2training.R;
import com.livos.dagger2training.features.fourth.FourthFragment;
import com.livos.dagger2training.features.second.SecondFragment;
import com.livos.dagger2training.features.seventh.SeventhFragment;
import com.livos.dagger2training.features.sixth.SixthFragment;
import com.livos.dagger2training.features.third.ThirdFragment;

import javax.inject.Inject;

import com.livos.dagger2training.application.App;

/*
    MainActivity, OtherActivity, FirstFragment, secondFragment : Simple injection of AppModule

    ThirdFragment : simple SubComponent of AppComponent with its own Scope

    FourthFragment, FifthFragment : 2 Subcomponents of AppComponent sharing the same scope

    SixthFragment : 1 subComponent of AppComponent with its own scope

    SeventhFragment, EighthFragment : 2 dependant components of AppComponent sharing the same scope


 */

public class MainActivity extends AppCompatActivity {

    @Inject
    Datasource0 ds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);

        String name = ds.getName();


        FragmentManager fm = getSupportFragmentManager();

        Fragment firstFragment = fm.findFragmentById(R.id.fl_first_container);
        if (firstFragment == null) {
            firstFragment = new FirstFragment();
            fm.beginTransaction()
                    .add(R.id.fl_first_container, firstFragment)
                    .commit();
        }

        Fragment secondFragment = fm.findFragmentById(R.id.fl_second_container);
        if (secondFragment == null) {
            secondFragment = new SecondFragment();
            fm.beginTransaction()
                    .add(R.id.fl_second_container, secondFragment)
                    .commit();
        }

        Fragment thirdFragment = fm.findFragmentById(R.id.fl_third_container);
        if (thirdFragment == null) {
            thirdFragment = new ThirdFragment();
            fm.beginTransaction()
                    .add(R.id.fl_third_container, thirdFragment)
                    .commit();
        }

        Fragment fourthFragment = fm.findFragmentById(R.id.fl_fourth_container);
        if (fourthFragment == null) {
            fourthFragment = new FourthFragment();
            fm.beginTransaction()
                    .add(R.id.fl_fourth_container, fourthFragment)
                    .commit();
        }

        Fragment fifthFragment = fm.findFragmentById(R.id.fl_fifth_container);
        if (fifthFragment == null) {
            fifthFragment = new FifthFragment();
            fm.beginTransaction()
                    .add(R.id.fl_third_container, fifthFragment)
                    .commit();
        }

        Fragment sixthFragment = fm.findFragmentById(R.id.fl_sixth_container);
        if (sixthFragment == null) {
            sixthFragment = new SixthFragment();
            fm.beginTransaction()
                    .add(R.id.fl_third_container, sixthFragment)
                    .commit();
        }

        Fragment seventhFragment = fm.findFragmentById(R.id.fl_seventh_container);
        if (seventhFragment == null) {
            seventhFragment = new SeventhFragment();
            fm.beginTransaction()
                    .add(R.id.fl_seventh_container, seventhFragment)
                    .commit();
        }

        Fragment eighthFragment = fm.findFragmentById(R.id.fl_eighth_container);
        if (eighthFragment == null) {
            eighthFragment = new EighthFragment();
            fm.beginTransaction()
                    .add(R.id.fl_eighth_container, eighthFragment)
                    .commit();
        }

    }


}
