package com.cylogics.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    View view;
    Button firstButton;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    view = inflater.inflate(R.layout.fragment_first,container,false);

    firstButton = view.findViewById(R.id.butFirstFrag);
    firstButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_SHORT).show();
        }
    });
        return view;
    }

}
