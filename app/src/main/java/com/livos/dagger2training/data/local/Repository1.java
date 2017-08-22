package com.livos.dagger2training.data.local;


public class Repository1 implements Datasource1 {
    @Override
    public int getAge() {
        return 27;
    }
}
