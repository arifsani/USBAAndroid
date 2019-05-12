package com.example.usba.apihelper;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface BaseApiService {
    // Fungsi ini untuk memanggil API base_url/cbt/api.php
    @FormUrlEncoded
    @POST("cbt/adm/act_login")
    Call<ResponseBody> loginRequest(@Field("username") String username,
                                    @Field("password") String password);

}
