package com.livos.dagger2training.features.seventh;

import com.livos.dagger2training.data.local.Datasource5;
import com.livos.dagger2training.data.local.Repository5;
import com.livos.dagger2training.util.SharedScope;

import dagger.Module;
import dagger.Provides;

@Module
public class SeventhFragmentModule {
    @Provides
    @SharedScope
    Datasource5 provideDatasource5() {
        return  new Repository5();
    }
}
