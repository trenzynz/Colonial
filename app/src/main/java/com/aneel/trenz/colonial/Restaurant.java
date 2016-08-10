package com.aneel.trenz.colonial;

/**
 * Created by trenz on 9/08/2016.
 */
import android.util.Log;
import android.util.StringBuilderPrinter;

import java.net.URI;
import java.net.URISyntaxException;

public class Restaurant {
    private static final String TAG = Restaurant.class.getSimpleName();
    static final long serialVersionUID = 727566175075960653L;
    private long id;
    private String name;
    private String address;

    private String cardImageUrl;

    public String getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(String cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

    public URI getCardImageURI() {
        try {
            return new URI(getCardImageUrl());
        } catch (URISyntaxException e) {
            return null;
        }
    }

    public Restaurant(){
    }
    public long getID(){
        return id;
    }

    public void setID(long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public  String toString(){
        return  "Restaurant{" + "id=" + id +",Name='" + name + '\'' + '}';
    }
}
