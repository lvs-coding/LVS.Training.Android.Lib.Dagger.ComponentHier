package com.livos.dagger2training.features.seventh;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.livos.dagger2training.R;
import com.livos.dagger2training.application.App;
import com.livos.dagger2training.data.local.Datasource0;
import com.livos.dagger2training.data.local.Datasource5;

import javax.inject.Inject;

public class SeventhFragment extends Fragment {
    @Inject
    Datasource5 ds;

    @Inject
    Datasource0 ds0;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_seventh,container,false);

        String city = ds.getCity();
        String name = ds0.getName();

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        SeventhComponent seventhComponent = ((App) getActivity().getApplication()).getSeventhComponent();
        seventhComponent.inject(this);



    }
}
