package com.example.vkongv.a5thingstoeatmmumelaka;

/**
 * Created by vkongv on 20/4/2016.
 */
public class Shop {
    private String mName;
    private String mGoogleMapUrl;
    private String mType;
    private String mOperatingHour;
    private String mDescription;

    /**
     * Default constructor
     */
    public Shop(){}

    /**
     * Overload constructor
     */
    public Shop(String name, String url, String type, String operatingHour, String description){
        this.mName = name;
        this.mGoogleMapUrl = url;
        this.mType = type;
        this.mOperatingHour = operatingHour;
        this.mDescription = description;
    }

    /**
     * Set shop's name
     * @param name is the new name of the shop
     */
    public void setName(String name){
        this.mName = name;
    }

    /**
     * Set shop's address
     * @param address is the new address of the shop
     */
    public void setAddress(String url){
        this.mGoogleMapUrl = url;
    }

    /**
     * Set shop's type (Eg: Chinese Restaurant, Western Restaurant, etc.)
     * @param type is the new type of the shop
     */
    public void setType(String type){
        this.mType = type;
    }

    /**
     * Set shop's operating hour (Eg: 8am to 5pm)
     * @param operatingHour is the new operating hour of the shop
     */
    public void setOperatingHour(String operatingHour){
        this.mOperatingHour = operatingHour;
    }

    /**
     * Set shop's description
     * @param description is the new description that let user briefly know what the shop is
     */
    public void setDescription(String description){
        this.mDescription = description;
    }

    /**
     * Return shop's name
     * @return shop's name
     */
    public String getName(){
        return this.mName;
    }

    /**
     * Return shop's address
     * @return shop's address
     */
    public String getAddress(){
        return this.mGoogleMapUrl;
    }

    /**
     * Return shop's type
     * @return shop's type
     */
    public String getType(){
        return this.mType;
    }

    /**
     * Return shop's operating hour
     * @return shop's operating hour
     */
    public String getOperatingHour(){
        return this.mOperatingHour;
    }

    /**
     * Return shop's description
     * @return shop's description
     */
    public String getDescription() {
        return this.mDescription;
    }
}
