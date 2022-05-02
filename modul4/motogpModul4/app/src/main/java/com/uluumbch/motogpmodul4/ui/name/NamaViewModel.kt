package com.uluumbch.motogpmodul4.ui.name

import androidx.lifecycle.ViewModel

class NamaViewModel : ViewModel() {


    fun loadData(): List<String> {
        return listOf(
            "Maverick Viñales",
            "Jack Miller",
            "Takaaki Nakagami",
            "Johann Zarco",
            "Luca Marini",
            "Fabio Quartararo",
            "Stefan Bradl",
            "Joan Mir",
            "Raul Fernandez",
            "Andrea Dovizioso",
            "Brad Binder",
            "Enea Bastianini",
        )
    }
}