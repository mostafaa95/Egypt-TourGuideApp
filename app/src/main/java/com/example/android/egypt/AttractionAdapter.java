package com.example.android.egypt;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AttractionAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public AttractionAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CairoFragment();
        } else if (position == 1) {
            return new AlexFragment();
        }
        else if (position == 2) {
            return new AswanFragment();
        } else if (position == 3) {
            return new SharmFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.cairo);
            case 1:
                return mContext.getString(R.string.alex);
            case 2:
                return mContext.getString(R.string.aswan);
            case 3:
                return mContext.getString(R.string.sharm);
            default:
                return null;
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }
}

