package com.example.joseg.weathertime;
import java.util.List;


/**
 * Created by joseg on 3/15/18.
 */


public class Daily {
    private String summary;
    private String icon;
    private List<Information> data = null;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<Information> getData() {
        return data;
    }

    public void setData(List<Information> data) {
        this.data = data;
    }

}

