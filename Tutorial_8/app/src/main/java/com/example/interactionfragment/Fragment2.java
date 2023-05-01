package com.example.interactionfragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Fragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(
                R.layout.fragment2, container, false);
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        mContext = context;
//    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println(this.getActivity().getComponentName());
        Button btnGetText = (Button)getActivity().findViewById(R.id.btnGetText);
        System.out.println(btnGetText.getText());
        TextView lbl = (TextView)((MainActivity)getActivity()).findViewById(R.id.lblFragment1);
//        System.out.println(lbl.getText());
        System.out.println(getActivity().findViewById(R.id.fragment1));
        btnGetText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView lbl = (TextView)((MainActivity)getActivity()).findViewById(R.id.lblFragment1);
                System.out.println(getActivity().findViewById(R.id.fragment1));
                Toast.makeText(getActivity(), lbl.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
