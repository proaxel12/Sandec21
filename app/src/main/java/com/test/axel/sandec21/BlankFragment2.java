package com.test.axel.sandec21;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

    private Button btnUbah;
    private TextView tvText;
    private View blankFragmentView;

    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        blankFragmentView = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);

        btnUbah = blankFragmentView.findViewById(R.id.btn_ubah_text_view);

        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvText.setText(Constant.TEXT_UBAH);
            }
        });

        return blankFragmentView;
    }

}
