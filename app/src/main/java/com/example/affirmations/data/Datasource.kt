package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.mobilcoupe),
            Affirmation(R.string.affirmation2, R.drawable.mobilcovertible),
            Affirmation(R.string.affirmation3, R.drawable.mobildoublecabin),
            Affirmation(R.string.affirmation4, R.drawable.mobilhatcback),
            Affirmation(R.string.affirmation5, R.drawable.mobilmpv),
            Affirmation(R.string.affirmation6, R.drawable.mobiloffroad),
            Affirmation(R.string.affirmation7, R.drawable.mobilsedan),
            Affirmation(R.string.affirmation8, R.drawable.mobilsport),
            Affirmation(R.string.affirmation9, R.drawable.mobilstationwagon),
            Affirmation(R.string.affirmation10, R.drawable.mobilsuv)
            )
        }

    }



