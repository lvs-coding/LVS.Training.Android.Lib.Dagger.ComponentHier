package com.livos.dagger2training.features.fifth;

import com.livos.dagger2training.util.SharedScope;

import dagger.Subcomponent;

@SharedScope
@Subcomponent(modules = {FifthFragmentModule.class})
public interface FifthFragmentSubComponent {
    void inject(FifthFragment target);
}
