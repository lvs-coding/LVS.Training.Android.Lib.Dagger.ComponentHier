package com.livos.dagger2training.features.seventh;

import com.livos.dagger2training.application.AppComponent;
import com.livos.dagger2training.features.sixth.SixthFragmentSubComponent;
import com.livos.dagger2training.util.SharedScope;

import dagger.Component;

@SharedScope
@Component(dependencies = AppComponent.class, modules = {SeventhFragmentModule.class})
public interface SeventhComponent {
    void inject(SeventhFragment target);
}
