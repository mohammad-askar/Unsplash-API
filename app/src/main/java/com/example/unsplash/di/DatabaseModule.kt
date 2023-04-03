package com.example.unsplash.di

import android.content.Context
import androidx.room.Room
import com.example.unsplash.data.local.UnsplashImageDatabase
import com.example.unsplash.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesDatabase(
        @ApplicationContext context: Context
    ): UnsplashImageDatabase {
        return Room.databaseBuilder(
            context,
            UnsplashImageDatabase::class.java,
            DATABASE_NAME
        ).build()
    }
}