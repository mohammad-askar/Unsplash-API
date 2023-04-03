package com.example.unsplash.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.unsplash.util.Constants
import kotlinx.serialization.Serializable

@Entity(tableName = Constants.UNSPLASH_REMOTE_KEY_TABLE)
data class UnsplashRemoteKeys(

    @PrimaryKey(autoGenerate = false)
    val id: String,
    val nextKey: Int?,
    val prevKey: Int?
)
