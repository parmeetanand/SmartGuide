package com.example.anandparmeetsingh.smartguide;

public class Word {

    private static final int No_IMAGE_PROVIDED = -1;
    private String mName;
    private String mRating;
    private String mDescription;
    private int mImageResourseID = No_IMAGE_PROVIDED;

    public Word(String name, String rating, String description, int imageResourceID) {
        mName = name;
        mRating = rating;
        mDescription = description;
        mImageResourseID = imageResourceID;
    }

    public String getname() {
        return mName;
    }

    public String getrating() {
        return mRating;
    }

    public String getdescription() {
        return mDescription;
    }

    public int ImageResourceId() {
        return mImageResourseID;
    }

}

