package com.livos.dagger2training.features.eighth;

import com.livos.dagger2training.application.AppComponent;
import com.livos.dagger2training.util.SharedScope;

import dagger.Component;

@SharedScope
@Component(dependencies = {AppComponent.class}, modules = {EighthFragmentModule.class})
public interface EighthFragmentComponent {
    void inject(EighthFragment target);
}
