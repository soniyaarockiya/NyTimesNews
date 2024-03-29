package com.example.a91user.nytimesnews;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results {
    private String[] per_facet;

    private String subsection;

    private String item_type;

    private String[] org_facet;

    private String section;

    @SerializedName("abstract")
    private String description;

    private String title;

    private String[] des_facet;

    private String url;

    private String short_url;

    private String material_type_facet;


    @SerializedName("multimedia")
    private List<Multimedia> multimediaList;

    private String[] geo_facet;

    private String updated_date;

    private String created_date;

    private String byline;

    private String published_date;

    private String kicker;

    public String[] getPer_facet() {
        return per_facet;
    }

    public void setPer_facet(String[] per_facet) {
        this.per_facet = per_facet;
    }

    public String getSubsection() {
        return subsection;
    }

    public void setSubsection(String subsection) {
        this.subsection = subsection;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String[] getOrg_facet() {
        return org_facet;
    }

    public void setOrg_facet(String[] org_facet) {
        this.org_facet = org_facet;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getDes_facet() {
        return des_facet;
    }

    public void setDes_facet(String[] des_facet) {
        this.des_facet = des_facet;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShort_url() {
        return short_url;
    }

    public void setShort_url(String short_url) {
        this.short_url = short_url;
    }

    public String getMaterial_type_facet() {
        return material_type_facet;
    }

    public void setMaterial_type_facet(String material_type_facet) {
        this.material_type_facet = material_type_facet;
    }

    public List<Multimedia> getMultimediaList() {
        return multimediaList;
    }

    public void setMultimediaList(List<Multimedia> multimediaList) {
        this.multimediaList = multimediaList;
    }

    public String[] getGeo_facet() {
        return geo_facet;
    }

    public void setGeo_facet(String[] geo_facet) {
        this.geo_facet = geo_facet;
    }

    public String getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(String updated_date) {
        this.updated_date = updated_date;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getByline() {
        return byline;
    }

    public void setByline(String byline) {
        this.byline = byline;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getKicker() {
        return kicker;
    }

    public void setKicker(String kicker) {
        this.kicker = kicker;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "ClassPojo [per_facet = " + per_facet + ", subsection = " + subsection + ", item_type = " + item_type + ", org_facet = " + org_facet + ", section = " + section + ", description = " + description + ", title = " + title + ", des_facet = " + des_facet + ", url = " + url + ", short_url = " + short_url + ", material_type_facet = " + material_type_facet + ", multimediaList = " + multimediaList + ", geo_facet = " + geo_facet + ", updated_date = " + updated_date + ", created_date = " + created_date + ", byline = " + byline + ", published_date = " + published_date + ", kicker = " + kicker + "]";
    }
}
