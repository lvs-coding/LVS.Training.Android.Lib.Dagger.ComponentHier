package com.livos.dagger2training.features.eighth;


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
import com.livos.dagger2training.data.local.Datasource3;

import javax.inject.Inject;

public class EighthFragment extends Fragment {

    @Inject
    Datasource3 ds3;

    // From the component parent dependency AppComponent
    @Inject
    Datasource0 ds0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_eighth,container,false);

        int weigth = ds3.getWeigth();
        String name = ds0.getName();

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        EighthFragmentComponent eighthComponent = ((App) getActivity().getApplication()).getEighthComponent();
        eighthComponent.inject(this);



    }
}
