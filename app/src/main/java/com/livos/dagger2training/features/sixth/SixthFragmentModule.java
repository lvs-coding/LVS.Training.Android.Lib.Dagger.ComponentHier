package com.livos.dagger2training.features.sixth;

import com.livos.dagger2training.data.local.Datasource4;
import com.livos.dagger2training.data.local.Repository4;
import com.livos.dagger2training.util.SixthScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SixthFragmentModule {
    @Provides
    @SixthScope
    Datasource4 provideDatasource4() {
        return  new Repository4();
    }
}
