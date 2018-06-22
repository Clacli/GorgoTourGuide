package com.example.claudiabee.gorgotourguide;

public class Info {
    // Member variables
    /**
     * Title of the info card
     */
    private String mInfoTitle;

    /**
     * Text in the info card
     */
    private String mInfoText;

    /**
     * The resource ID of the drawable resource
     */
    private int mImageResourceId;

    // Constructors
    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the infoTitle of the info card
     * @param infoText is the infoText of the info card
     */
    public Info(String infoTitle, String infoText){
        mInfoTitle = infoTitle;
        mInfoText = infoText;
    }

    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the infoTitle of the info card
     * @param imageResourceId is the ID for the drawable resource
     */
    public Info(String infoTitle, int imageResourceId){
        mInfoTitle = infoTitle;
        mImageResourceId = imageResourceId;
    }

    /**
     * Create an {@link Info} object
     *
     * @param infoTitle is the infoTitle of the info card
     * @param infoText is the infoText of the info card
     * @param imageResourceId is the ID for the drawable resource
     */
    public Info(String infoTitle, String infoText, int imageResourceId){
        mInfoTitle = infoTitle;
        mInfoText = infoText;
        mImageResourceId = imageResourceId;
    }

    /**
     * return the title of the info card
     */
    public String getInfoTitle(){
        return mInfoTitle;
    }

    /**
     * return the text of the info card
     */
    public String getInfoText(){
        return mInfoTitle;
    }

    /**
     * return the ID for the drawable resource
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Returns the string representation of the {@link Info} object.
     */
    @Override
    public String toString() {
        return "Info{" +
                "mInfoTitle='" + mInfoTitle + '\'' +
                ", mInfoText='" + mInfoText + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
