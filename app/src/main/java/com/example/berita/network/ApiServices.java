package com.example.berita.network;

import com.example.berita.response.ResponseBerita;

import retrofit2.Call;
import retrofit2.http.GET;

/**


 */

public interface ApiServices {

    //@TIPEMETHOD("API_END_POINT")
    @GET("tampil_berita.php")
    Call<ResponseBerita> request_show_all_berita();
    // <ModelData> nama_method()

}

