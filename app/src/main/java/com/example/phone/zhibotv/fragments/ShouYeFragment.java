package com.example.phone.zhibotv.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phone.zhibotv.BaseFragment;
import com.example.phone.zhibotv.R;

/**
 * Created by Administrator on 2016-11-26.
 */
public class ShouYeFragment extends BaseFragment {
    public static final String TAG=ShouYeFragment.class.getSimpleName();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.shouye_layout, container, false);
        return inflate;
    }
}
