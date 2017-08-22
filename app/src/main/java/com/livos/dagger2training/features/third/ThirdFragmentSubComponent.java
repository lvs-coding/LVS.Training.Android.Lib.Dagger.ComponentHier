package com.livos.dagger2training.features.third;

import com.livos.dagger2training.util.ThirdScope;

import dagger.Subcomponent;

@ThirdScope
@Subcomponent(modules = {ThirdFragmentModule.class})
public interface ThirdFragmentSubComponent {
    void inject(ThirdFragment target);
}
