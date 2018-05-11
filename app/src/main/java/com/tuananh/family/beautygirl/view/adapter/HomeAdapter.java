package com.tuananh.family.beautygirl.view.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.tuananh.family.beautygirl.R;
import com.tuananh.family.beautygirl.view.fragment.home.following.FollowingFragment;
import com.tuananh.family.beautygirl.view.fragment.home.trending.TrendingFragment;

/**
 * Created by FRAMGIA\vu.tuan.anh on 08/05/2018.
 */

public class HomeAdapter extends FragmentStatePagerAdapter {
    private static final int COUNT = 2;
    private static final int FOLLOWING = 0;
    private static final int TRENDING = 1;
    private Context mContext;

    public HomeAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case FOLLOWING:
                return FollowingFragment.newInstance();
            case TRENDING:
            default:
                return TrendingFragment.newInstance();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        int resTitle;
        switch (position) {
            case FOLLOWING:
                resTitle = R.string.text_tab_following;
                break;
            case TRENDING:
            default:
                resTitle = R.string.text_tab_trending;
                break;
        }
        return mContext.getResources().getString(resTitle);
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
