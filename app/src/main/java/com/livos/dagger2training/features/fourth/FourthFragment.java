package com.livos.dagger2training.features.fourth;


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
import com.livos.dagger2training.data.local.Datasource3;

import javax.inject.Inject;

public class FourthFragment extends Fragment {

    @Inject
    Datasource3 ds;

    // From parent component (AppModule)
    @Inject
    Datasource0 ds0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth,container,false);

        int weight = ds.getWeigth();
        String name = ds0.getName();

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        AppComponent appComponent = ((App)getActivity().getApplication()).getComponent();
        appComponent.plus(new FourthFragmentModule()).inject(this);
    }
}
