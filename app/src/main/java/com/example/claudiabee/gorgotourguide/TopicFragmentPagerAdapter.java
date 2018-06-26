package com.example.claudiabee.gorgotourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.claudiabee.gorgotourguide.fragments.EventsFragment;
import com.example.claudiabee.gorgotourguide.fragments.FloraOfNaviglioFragment;
import com.example.claudiabee.gorgotourguide.fragments.GeneralInfoFragment;
import com.example.claudiabee.gorgotourguide.fragments.PlacesFragment;

/**
 * {@link TopicFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Info} objects.
 */
public class TopicFragmentPagerAdapter extends FragmentPagerAdapter{

    private Context mContext;

    private static final int PAGE_NUMBER = 4;

    /**
     * Create a new {@link TopicFragmentPagerAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public TopicFragmentPagerAdapter(Context context, android.support.v4.app.FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the total number of pages
     */
    @Override
    public int getCount(){
        return PAGE_NUMBER;
    }

      /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GeneralInfoFragment();
            case 1:
                return new PlacesFragment();
            case 2:
                return new EventsFragment();
            case 3:
                return new FloraOfNaviglioFragment();
            default:
                return null;
        }
    }
}
