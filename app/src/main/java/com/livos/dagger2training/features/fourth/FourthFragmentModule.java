package com.livos.dagger2training.features.fourth;


import com.livos.dagger2training.data.local.Datasource3;
import com.livos.dagger2training.data.local.Repository3;
import com.livos.dagger2training.util.SharedScope;

import dagger.Module;
import dagger.Provides;

@Module
public class FourthFragmentModule {

    @Provides
    @SharedScope
    public Datasource3 provideDatasource() {
        return  new Repository3();
    }
}
