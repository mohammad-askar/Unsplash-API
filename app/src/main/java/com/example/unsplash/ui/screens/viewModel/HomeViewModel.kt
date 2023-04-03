package com.example.unsplash.ui.screens.viewModel

import androidx.lifecycle.ViewModel
import com.example.unsplash.data.repository.UnsplashRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: UnsplashRepository
): ViewModel() {
    val getAllImages = repository.getAllImages()
}