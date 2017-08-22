package com.livos.dagger2training.features.fifth;

import com.livos.dagger2training.data.local.Datasource2;
import com.livos.dagger2training.data.local.Repository2;
import com.livos.dagger2training.util.SharedScope;

import dagger.Module;
import dagger.Provides;

@Module
public class FifthFragmentModule {

    @Provides
    @SharedScope
    public Datasource2 provideDataSource() {
        return new Repository2();
    }

}
