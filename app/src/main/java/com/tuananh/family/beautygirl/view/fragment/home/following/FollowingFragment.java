package com.tuananh.family.beautygirl.view.fragment.home.following;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tuananh.family.beautygirl.R;

/**
 * Created by FRAMGIA\vu.tuan.anh on 08/05/2018.
 */

public class FollowingFragment extends Fragment {
    public static FollowingFragment newInstance() {
        return new FollowingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trending, container, false);
    }
}
