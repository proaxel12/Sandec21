package com.test.axel.sandec21;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.axel.sandec21.adapter.ViawPagerVpAdapter;

public class VieaPagerActivity extends AppCompatActivity {

    private ViewPager vpViewPager;
    private TabLayout tlViewPager;
    private ViawPagerVpAdapter adapter;
    private BlankFragment blankFragment;
    private BlankFragment2 blankFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viea_pager);

        tlViewPager = findViewById(R.id.tl_view_pager);
        vpViewPager = findViewById(R.id.vp_view_pager);

        setViewPager();

    }

    private void setViewPager() {

        adapter = new ViawPagerVpAdapter(getSupportFragmentManager());
        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();

        adapter.addFragment(blankFragment);
        adapter.addFragment(blankFragment2);

        vpViewPager.setAdapter(adapter);
        tlViewPager.setupWithViewPager(vpViewPager);

    }
}
