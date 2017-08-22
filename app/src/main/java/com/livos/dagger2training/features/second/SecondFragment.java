package com.livos.dagger2training.features.second;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.livos.dagger2training.R;
import com.livos.dagger2training.application.App;
import com.livos.dagger2training.data.local.Datasource0;

import javax.inject.Inject;

public class SecondFragment extends Fragment {
    @Inject
    Datasource0 ds;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first,container,false);

        ((App) getActivity().getApplication()).getComponent().inject(this);

        String name = ds.getName();

        return v;
    }
}
