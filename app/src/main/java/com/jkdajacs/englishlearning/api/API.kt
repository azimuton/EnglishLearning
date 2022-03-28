package com.jkdajacs.englishlearning.api

import retrofit2.Call
import retrofit2.http.GET

interface API {

    @GET("v1/current.json?key=370aeaf616824b3f8cb201548212212&q=Torkov&lang=RU")
    fun getRandomIdea() : Call<TestingDataClass>
}
