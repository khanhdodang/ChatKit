package com.stfalcon.chatkit.sample.features.main.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.stfalcon.chatkit.sample.R;

/*
 * Created by troy379 on 11.04.17.
 */
public class MainActivityPagerAdapter extends FragmentStatePagerAdapter {

    public static final int ID_DEFAULT = 5;
    public static final int ID_STYLED = 1;
    public static final int ID_CUSTOM_LAYOUT = 2;
    public static final int ID_CUSTOM_VIEW_HOLDER = 3;
    public static final int ID_CUSTOM_CONTENT = 4;
    public static final int ID_ITA = 0;

    private Context context;

    public MainActivityPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        String title = null;
        String description = null;
        switch (position) {
            case ID_DEFAULT:
                title = context.getString(R.string.sample_title_default);
                description = context.getString(R.string.sample_subtitle_default);
                break;
            case ID_STYLED:
                title = context.getString(R.string.sample_title_attrs);
                description = context.getString(R.string.sample_subtitle_attrs);
                break;
            case ID_CUSTOM_LAYOUT:
                title = context.getString(R.string.sample_title_layout);
                description = context.getString(R.string.sample_subtitle_layout);
                break;
            case ID_CUSTOM_VIEW_HOLDER:
                title = context.getString(R.string.sample_title_holder);
                description = context.getString(R.string.sample_subtitle_holder);
                break;
            case ID_CUSTOM_CONTENT:
                title = context.getString(R.string.sample_title_custom_content);
                description = context.getString(R.string.sample_subtitle_custom_content);
                break;
            case ID_ITA:
                title = context.getString(R.string.sample_title_ita);
                description = context.getString(R.string.sample_subtitle_ita);
                break;
        }
        return DemoCardFragment.newInstance(position, title, description);
    }

    @Override
    public int getCount() {
        return 6;
    }
}