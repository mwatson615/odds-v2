package com.rosebay.odds.network;


import com.rosebay.odds.BuildConfig;
import com.rosebay.odds.Constants;
import com.rosebay.odds.model.ImageResponse;

import io.reactivex.Observable;

public class ImageClient {

    private ImageApi mImageApi;

    public ImageClient(ImageApi imageApi) {
        mImageApi = imageApi;
    }

    public Observable<ImageResponse> fetchImages(String description, String queryTerms) {
        return mImageApi.getImages(
                BuildConfig.ImgApiKey, BuildConfig.CustomSearchEngine, description, queryTerms,
                Constants.IMAGE_SEARCH_NUM, Constants.IMAGE_SEARCH_TYPE);
    }

}
