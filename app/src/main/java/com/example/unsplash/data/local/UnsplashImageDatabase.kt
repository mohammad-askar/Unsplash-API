package com.example.unsplash.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.unsplash.data.local.dao.UnsplashImageDao
import com.example.unsplash.data.local.dao.UnsplashRemoteKeyDao
import com.example.unsplash.model.UnsplashImage
import com.example.unsplash.model.UnsplashRemoteKeys

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1,
    exportSchema = false
)
abstract class UnsplashImageDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao

    abstract fun unsplashRemoteKey(): UnsplashRemoteKeyDao
}