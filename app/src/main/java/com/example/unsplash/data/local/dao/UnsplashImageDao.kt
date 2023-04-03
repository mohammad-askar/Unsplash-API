package com.example.unsplash.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unsplash.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    /**
     * Get all images from paging source
     * @param[Int] represent the key which page should be loaded
     * @param[UnsplashImage] represent the value of images
     * @return[PagingSource]<[Int],[UnsplashImage]>
     */
    @Query("SELECT * FROM unsplash_image_table")
    fun getImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertImage(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteImages()
}