package com.example.claudiabee.gorgotourguide;

public class InfoCard {
    // Member variables
    /**
     * Constant value that represents no image was provided for this info
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Title of the {@link InfoCard}
     */
    private String mInfoCardTitle;
    /**
     * Description in the {@link InfoCard}
     */
    private String mInfoCardDescription;
    /**
     * The resource ID of the drawable resource for the info
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constructors

    /**
     * Create an {@link InfoCard} object
     *
     * @param infoCardTitle       is the title of the info card
     * @param infoCardDescription is the description of the info card
     */
    public InfoCard(String infoCardTitle, String infoCardDescription) {
        mInfoCardTitle = infoCardTitle;
        mInfoCardDescription = infoCardDescription;
    }

    /**
     * Create an {@link InfoCard} object
     *
     * @param infoCardTitle   is the title of the info card
     * @param imageResourceId is the ID for the drawable resource
     */
    public InfoCard(String infoCardTitle, int imageResourceId) {
        mInfoCardTitle = infoCardTitle;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create an {@link InfoCard} object
     *
     * @param infoCardTitle       is the title of the info card
     * @param infoCardDescription is the description of the info card
     * @param imageResourceId     is the ID for the drawable resource
     */
    public InfoCard(String infoCardTitle, String infoCardDescription, int imageResourceId) {
        mInfoCardTitle = infoCardTitle;
        mInfoCardDescription = infoCardDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * return the title of the info card
     */
    public String getInfoCardTitle() {
        return mInfoCardTitle;
    }

    /**
     * return the description of the info card
     */
    public String getInfoCardDescription() {
        return mInfoCardDescription;
    }

    /**
     * return the ID for the drawable resource for the Info
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Info.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link InfoCard} object.
     */
    @Override
    public String toString() {
        return "Info{" + "mInfoCardTitle='" + mInfoCardTitle + '\'' + ", mInfoCardDescription='" + mInfoCardDescription + '\'' + ", mImageResourceId=" + mImageResourceId + '}';
    }

}
