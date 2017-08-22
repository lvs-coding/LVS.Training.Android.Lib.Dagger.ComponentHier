package com.livos.dagger2training.features.sixth;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.livos.dagger2training.R;
import com.livos.dagger2training.application.App;
import com.livos.dagger2training.application.AppComponent;
import com.livos.dagger2training.data.local.Datasource0;
import com.livos.dagger2training.data.local.Datasource4;

import javax.inject.Inject;

public class SixthFragment extends Fragment {
    @Inject
    Datasource4 ds;

    // From parent component (AppModule)
    @Inject
    Datasource0 ds0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sixth,container,false);

        int age = ds.getFootSize();
        String name = ds0.getName();

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        AppComponent appComponent = ((App) getActivity().getApplication()).getComponent();
        appComponent.plus(new SixthFragmentModule()).inject(this);
    }
}
