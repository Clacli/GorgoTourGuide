package com.example.claudiabee.gorgotourguide;

public class Info {
    // Member variables
    /**
     * Title of the info card
     */
    private String mInfoTitle;

    /**
     * Constant value that represents no image was provided for this info
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Description in the info card
     */
    private String mInfoDescription;
    /**
     * The resource ID of the drawable resource for the info
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constructors
    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the title of the info card
     * @param infoDescription is the description of the info card
     */
    public Info(String infoTitle, String infoDescription) {
        mInfoTitle = infoTitle;
        mInfoDescription = infoDescription;
    }

    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the title of the info card
     * @param imageResourceId is the ID for the drawable resource
     */
    public Info(String infoTitle, int imageResourceId){
        mInfoTitle = infoTitle;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the title of the info card
     * @param infoDescription is the description of the info card
     * @param imageResourceId is the ID for the drawable resource
     */
    public Info(String infoTitle, String infoDescription, int imageResourceId) {
        mInfoTitle = infoTitle;
        mInfoDescription = infoDescription;
        mImageResourceId = imageResourceId;
    }

    /**
     * return the title of the info card
     */
    public String getInfoTitle(){
        return mInfoTitle;
    }

    /**
     * return the description of the info card
     */
    public String getInfoDescription() {
        return mInfoDescription;
    }

    /**
     * return the ID for the drawable resource for the Info
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Info.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link Info} object.
     */
    @Override
    public String toString() {
        return "Info{" + "mInfoTitle='" + mInfoTitle + '\'' + ", mInfoDescription='" + mInfoDescription + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
