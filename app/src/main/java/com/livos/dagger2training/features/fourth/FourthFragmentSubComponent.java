package com.livos.dagger2training.features.fourth;


import com.livos.dagger2training.util.SharedScope;

import dagger.Subcomponent;

@SharedScope
@Subcomponent(modules = {FourthFragmentModule.class})
public interface FourthFragmentSubComponent {
    void inject(FourthFragment target);
}
