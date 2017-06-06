package com.example.android.tourguidemadrid;

/**
 * Created by sgomezp on 29/05/2017.
 */

public class MadridInfo {

    // Constant value that represents no image was provided for the sight
    private static final int NO_IMAGE_PROVIDED = -1;

    //TopSight name
    private String mTopSightName;

    // Image Resource ID for the TopSight
    private int mImageResourceId;

    //TopSight Description
    private String mTopSightDescription;

    //TopSight Address
    private String mTopSightAddress;

    //TopSight Time
    private String mTopSightTime;

    //TopSight Price
    private String mTopSightPrice;

    //TopSight Web
    private String mTopSightWeb;

    //TopSight Map
    private String mTopSightMap;


    /**
     * Create a new TopSight extend Object.
     *
     * @param topSightName        is the name of the Top sight
     * @param topSightAddress     is the address of the Top sight
     * @param topSightTime        is the timetable of the Top sight
     * @param topSightPrice       is the price of the Top sight
     * @param topSightWeb         is the web of the Top sight
     * @param topSightMap         is the map location of the Top sight
     * @param topSightDescription is the description of the sight
     * @param imageResourceId     is the drawable  resource ID for the image associate
     *                            with the Top sight
     *
     */

    public MadridInfo(String topSightName, String topSightAddress, String topSightTime,
                      String topSightPrice, String topSightWeb, String topSightMap,
                      String topSightDescription, int imageResourceId ) {
        mTopSightName = topSightName;
        mTopSightAddress = topSightAddress;
        mTopSightTime = topSightTime;
        mTopSightPrice = topSightPrice;
        mTopSightWeb = topSightWeb;
        mTopSightMap = topSightMap;
        mTopSightDescription = topSightDescription;
        mImageResourceId = imageResourceId;

    }

    //Get TopSight Name
    public String getTopSightName() {

        return mTopSightName;
    }


    // Set TopSight Name
    public void setTopSightName(String topSightName) {
        mTopSightName = topSightName;

    }

    // Get TopSight Description
    public String getTopSightDescription() {

        return mTopSightDescription;
    }

    // Set TopSight Description
    public void setTopSightDescription(String topSightDescription) {
        mTopSightDescription = topSightDescription;
    }


    // Get TopSight Address
    public String getTopSightAddress() {

        return mTopSightAddress;
    }

    // Set TopSightAddress
    public void setTopSightAddress(String topSightAddress) {

        mTopSightAddress = topSightAddress;
    }

    // Get TopSight Time
    public String getTopSightTime() {

        return mTopSightTime;
    }

    // Set TopSightTime
    public void setTopSightTime(String topSightTime) {

        mTopSightTime = topSightTime;
    }

    //Get TopSight Price
    public String getTopSightPrice() {

        return mTopSightPrice;
    }

    // Set TopSightPrice
    public void setTopSightPrice(String topSightPrice) {

        mTopSightPrice = topSightPrice;
    }

    //Get TopSight Web
    public String getTopSightWeb() {

        return mTopSightWeb;
    }

    // Set TopSightWeb
    public void setTopSightWeb(String topSightWeb) {

        mTopSightWeb = topSightWeb;
    }

    //Get TopSight Map
    public String getTopSightMap() {

        return mTopSightMap;
    }

    // Set TopSightMap
    public void setTopSightMap(String topSightMap) {

        mTopSightMap = topSightMap;
    }


    //Get TopSight ImageResourceId
    public int getImageResourceId() {

        return mImageResourceId;
    }

    // Returns whether or not there is an image for this sight
    public boolean hasImage() {

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
