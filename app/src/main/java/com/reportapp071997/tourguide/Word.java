package com.reportapp071997.tourguide;


public class Word {
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPlaceName;

    public Word(int imageResourceId, int placeName) {
        this.mImageResourceId = imageResourceId;
        this.mPlaceName = placeName;
    }

    public Word(int placeName) {
        this.mPlaceName = placeName;
    }

    public int getImageView() {
        return mImageResourceId;
    }

    public int getPlaceDesc() {
        return mPlaceName;
    }

    public void setImageResourceId(int image) {
        mImageResourceId = image;
    }

    public void setPlaceName(int placeDesc) {
        mPlaceName = placeDesc;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}

