package com.example.hardy.data.datasource.network_data_source;

import retrofit2.Retrofit;

public class RestClient {

    public static GitHubService getGithubClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();
        return retrofit.create(GitHubService.class);
    }

    public static CountryService getCountries() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.printful.com/")
                .build();
        return retrofit.create(CountryService.class);
    }


}
