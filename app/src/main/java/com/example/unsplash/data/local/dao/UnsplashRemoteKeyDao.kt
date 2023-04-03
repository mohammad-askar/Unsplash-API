package com.example.unsplash.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.unsplash.model.UnsplashRemoteKeys

/**
 * created by Mohammad askar 2/2/2023
 */
@Dao
interface UnsplashRemoteKeyDao {

    @Query("SELECT * FROM unsplash_remote_key_table WHERE id=:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    /**
     * Suspend function to insert all [List] of [UnsplashRemoteKeys]
     * and in case they have the same id [OnConflictStrategy] will just replace the old key
     * with new key
     * @param [List]<[UnsplashRemoteKeys]>
     * @return [Unit]
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM unsplash_remote_key_table")
    suspend fun deleteRemoteKeys()
}