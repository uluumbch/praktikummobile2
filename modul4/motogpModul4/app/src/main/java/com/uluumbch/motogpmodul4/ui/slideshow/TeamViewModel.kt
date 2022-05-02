package com.uluumbch.motogpmodul4.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeamViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is slideshow Fragment"
    }
    val text: LiveData<String> = _text

    val team: List<String> = listOf(
        "Ducati Team",
        "Yamaha Factory Racing",
        "Repsol Honda",
        "Aprilia Racing Team",
        "Team Suzuki MotoGP",
        "Gresini Racing",
        "Red Bull KTM Factory Racing",
    )
}