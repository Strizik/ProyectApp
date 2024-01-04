package com.pepe.elias.superheroapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("api/7197292553662378/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName:String): Response<SeperHeroDataResponse>

    @GET("/api/7197292553662378/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId:String): Response<SuperHeroDetailResponse>


}