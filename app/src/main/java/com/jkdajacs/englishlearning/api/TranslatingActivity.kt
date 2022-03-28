package com.jkdajacs.englishlearning.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkdajacs.englishlearning.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TranslatingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translating)

        val retrofit = RetrofitClient()
            .getClient("https://api.weatherapi.com/")
            .create(API::class.java)
        retrofit.getRandomIdea().enqueue(object  : Callback<TestingDataClass> {
            override fun onResponse(call: Call<TestingDataClass>, response: Response<TestingDataClass>) {
               // btReNewWeather.setOnClickListener {
                   // val city = etEnterCity.text.toString().trim()

//                    tvWeatherDescription.text = response.body()?.current?.condition?.text
//                    tvTempWeather.text = response.body()?.current?.temp_c.toString()
//                    tvHumidityWeather.text = response.body()?.current?.humidity.toString()
//                    tvSpeedWind.text = response.body()?.current?.wind_kph.toString()
//                    tvSideWind.text = response.body()?.current?.wind_dir
//                    tvFeelWeather.text = response.body()?.current?.feelslike_c.toString()
//                    tvQuantityWeather.text = response.body()?.current?.precip_mm.toString()
               // }
            }
            override fun onFailure(call: Call<TestingDataClass>, t: Throwable) {
            }
        })
    }
}