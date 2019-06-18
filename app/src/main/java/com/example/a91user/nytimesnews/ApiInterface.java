package com.example.a91user.nytimesnews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("v2/science.json?")
    Call<MyPojo> getTopStoriesSci(@Query("api-key") String apikey);


    @GET("v2/technology.json?")
    Call<MyPojo> getTopStoriesTech(@Query("api-key") String apikey);


}
