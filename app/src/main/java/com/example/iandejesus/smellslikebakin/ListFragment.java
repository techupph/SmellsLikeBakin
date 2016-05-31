package com.example.iandejesus.smellslikebakin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ListFragment extends android.app.ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //inflater = layout to be displayed, container = wher the layout will be displayed
        View view = inflater.inflate(R.layout.fragment_list, container);
        return view;

    }
}
