package com.livos.dagger2training.features.third;

import com.livos.dagger2training.data.local.Datasource1;
import com.livos.dagger2training.data.local.Repository1;
import com.livos.dagger2training.util.ThirdScope;

import dagger.Module;
import dagger.Provides;

@Module
public class ThirdFragmentModule {

    @Provides
    @ThirdScope
    public Datasource1 provideDataSource() {
        return new Repository1();
    }
}
