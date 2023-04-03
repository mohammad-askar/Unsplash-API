package com.example.unsplash.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.unsplash.data.local.UnsplashImageDatabase
import com.example.unsplash.data.paging.UnsplashRemoteMediator
import com.example.unsplash.data.remote.UnsplashApi
import com.example.unsplash.model.UnsplashImage
import com.example.unsplash.util.Constants.TIMES_PER_PAGE
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class UnsplashRepository @Inject constructor(
    private val api: UnsplashApi,
    private val db: UnsplashImageDatabase
) {

    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = {db.unsplashImageDao().getImages()}

        return Pager(
            config = PagingConfig(TIMES_PER_PAGE),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = api,
                unsplashDatabase = db
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}