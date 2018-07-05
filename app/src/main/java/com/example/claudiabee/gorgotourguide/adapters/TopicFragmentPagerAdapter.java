package com.example.claudiabee.gorgotourguide.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.claudiabee.gorgotourguide.InfoCard;
import com.example.claudiabee.gorgotourguide.R;
import com.example.claudiabee.gorgotourguide.fragments.DirectionsFragment;
import com.example.claudiabee.gorgotourguide.fragments.GeneralInfoFragment;
import com.example.claudiabee.gorgotourguide.fragments.ThingsToDoFragment;
import com.example.claudiabee.gorgotourguide.fragments.ThingsToSeeFragment;

/**
 * {@link TopicFragmentPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link InfoCard} objects.
 */
public class TopicFragmentPagerAdapter extends FragmentPagerAdapter{
    static final String LOG_TAG = "MyPager";
    private static final int PAGE_NUMBER = 4;
    private Context mContext;

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
       * @return the right fragment for the current position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GeneralInfoFragment();
            case 1:
                return new ThingsToSeeFragment();
            case 2:
                return new ThingsToDoFragment();
            case 3:
                return new DirectionsFragment();
            default:
                return null;
        }
    }

    /**
     * Return the title of each tabs
     */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getText(R.string.general_info_fragment);
            case 1:
                return mContext.getText(R.string.places_to_see_fragment);
            case 2:
                return mContext.getText(R.string.events_in_gorgonzola_fragment);
            case 3:
                return mContext.getText(R.string.flora_of_naviglio_della_martesana_fragment);
            default:
                return null;
        }
    }
}
