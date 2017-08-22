package com.livos.dagger2training.application;

import com.livos.dagger2training.data.local.Datasource0;
import com.livos.dagger2training.features.fifth.FifthFragmentModule;
import com.livos.dagger2training.features.fifth.FifthFragmentSubComponent;
import com.livos.dagger2training.features.first.FirstFragment;
import com.livos.dagger2training.features.fourth.FourthFragmentModule;
import com.livos.dagger2training.features.fourth.FourthFragmentSubComponent;
import com.livos.dagger2training.features.main.MainActivity;
import com.livos.dagger2training.features.other.OtherActivity;
import com.livos.dagger2training.features.second.SecondFragment;
import com.livos.dagger2training.features.seventh.SeventhFragment;
import com.livos.dagger2training.features.seventh.SeventhFragmentModule;
import com.livos.dagger2training.features.sixth.SixthFragmentModule;
import com.livos.dagger2training.features.sixth.SixthFragmentSubComponent;
import com.livos.dagger2training.features.third.ThirdFragmentModule;
import com.livos.dagger2training.features.third.ThirdFragmentSubComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity target);
    void inject(OtherActivity target);
    void inject(FirstFragment target);
    void inject(SecondFragment target);

    ThirdFragmentSubComponent plus(ThirdFragmentModule module);
    FourthFragmentSubComponent plus(FourthFragmentModule module);
    FifthFragmentSubComponent plus(FifthFragmentModule module);
    SixthFragmentSubComponent plus(SixthFragmentModule module);

    // Used by SeventhFragment and EighthFragment. Have to be put here because SeventhComponent
    // depends on AppComponent and in component dependency parent component have to explicitly
    // declare objects which can be used in child component
    Datasource0 datasource0();


}
