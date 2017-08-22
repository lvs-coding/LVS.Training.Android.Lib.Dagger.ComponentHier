package com.livos.dagger2training.features.sixth;

import com.livos.dagger2training.util.SixthScope;

import dagger.Subcomponent;

@SixthScope
@Subcomponent(modules = {SixthFragmentModule.class})
public interface SixthFragmentSubComponent {
    void inject(SixthFragment target);
}
