package com.example.unsplash.retry


import com.google.gson.annotations.SerializedName

data class ImageItem(
    @SerializedName("blur_hash")
    val blurHash: String?,
    val color: String?,
    @SerializedName("created_at")
    val createdAt: String?,
    @SerializedName("current_user_collections")
    val currentUserCollections: List<CurrentUserCollection>?,
    val description: String?,
    val height: Int?,
    val id: String?,
    @SerializedName("liked_by_user")
    val likedByUser: Boolean?,
    val likes: Int?,
    val links: Links?,
    @SerializedName("updated_at")
    val updatedAt: String?,
    val urls: Urls?,
    val user: User?,
    val width: Int?
)