package com.livos.dagger2training.features.eighth;

import com.livos.dagger2training.data.local.Datasource3;
import com.livos.dagger2training.data.local.Datasource5;
import com.livos.dagger2training.data.local.Repository3;
import com.livos.dagger2training.util.SharedScope;

import dagger.Module;
import dagger.Provides;

@Module
public class EighthFragmentModule {

    @SharedScope
    @Provides
    Datasource3 provideDatasource() { return new Repository3(); }
}
