package com.iit.glid2017.app;

import java.io.Serializable;

/**
 * Created by slim on 07/03/17.
 */

public class DataModel implements Serializable {

    private String mTitle;
    private String mDescription;
    private int mImageRes;
    private boolean isChecked;


    public DataModel() {
        //TODO
    }

    public DataModel(String title, String description, int imageRes) {
        mTitle = title;
        mDescription = description;
        mImageRes = imageRes;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getImageRes() {
        return mImageRes;
    }

    public void setImageRes(int mImageRes) {
        this.mImageRes = mImageRes;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
