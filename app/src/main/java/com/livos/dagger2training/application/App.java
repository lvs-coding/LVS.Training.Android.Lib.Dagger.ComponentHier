package com.livos.dagger2training.application;


import android.app.Application;

import com.livos.dagger2training.features.eighth.DaggerEighthFragmentComponent;
import com.livos.dagger2training.features.eighth.EighthFragmentComponent;
import com.livos.dagger2training.features.eighth.EighthFragmentModule;
import com.livos.dagger2training.features.seventh.DaggerSeventhComponent;
import com.livos.dagger2training.features.seventh.SeventhComponent;
import com.livos.dagger2training.features.seventh.SeventhFragmentModule;

public class App extends Application {
    private AppComponent component;
    private SeventhComponent seventhComponent;
    private EighthFragmentComponent eighthComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        seventhComponent = DaggerSeventhComponent.builder()
                .appComponent(component)
                .seventhFragmentModule(new SeventhFragmentModule())
                .build();

        eighthComponent = DaggerEighthFragmentComponent.builder()
                .appComponent(component)
                .eighthFragmentModule(new EighthFragmentModule())
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }

    public SeventhComponent getSeventhComponent() {
        return seventhComponent;
    }

    public EighthFragmentComponent getEighthComponent() {
        return eighthComponent;
    }
}
