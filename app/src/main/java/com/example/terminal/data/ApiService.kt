package com.example.terminal.data

import retrofit2.http.GET

interface ApiService {

    @GET("https://api.polygon.io/v2/aggs/ticker/AAPL/range/1/hour/2022-01-09/2023-01-09?adjusted=true&sort=desc&limit=50000&apiKey=1X31VsWmKXosLQ8h9SLYzw7tEcOxJEPt")
    suspend fun loadBars(): Result
}