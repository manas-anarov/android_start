package com.example.android_start;


import com.example.android_start.model.PostModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PostApi {


    String root = "http://192.168.0.104:8000/";

    String API_URL = root + "api/v1/";





    @GET("post/list/")
    Call<List<PostModel>> getListPost();


}