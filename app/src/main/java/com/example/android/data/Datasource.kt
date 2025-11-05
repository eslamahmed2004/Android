package com.example.android.data

import com.example.android.R
import com.example.android.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.string.about_1 ,R.drawable.image1),
            Affirmation(R.string.affirmation2, R.string.about_2 ,R.drawable.image2),
            Affirmation(R.string.affirmation3, R.string.about_3 ,R.drawable.image3),
            Affirmation(R.string.affirmation4, R.string.about_4 ,R.drawable.image4),
            Affirmation(R.string.affirmation5, R.string.about_5 ,R.drawable.image5),
            Affirmation(R.string.affirmation6, R.string.about_6 ,R.drawable.image6),
            Affirmation(R.string.affirmation7, R.string.about_7 ,R.drawable.image7),
            Affirmation(R.string.affirmation8,R.string.about_8 , R.drawable.image8),
            Affirmation(R.string.affirmation9, R.string.about_9 ,R.drawable.image9),
            Affirmation(R.string.affirmation10, R.string.about_10 ,R.drawable.image10),
            Affirmation(R.string.affirmation1,R.string.about_1 ,R.drawable.image1),
            Affirmation(R.string.affirmation2, R.string.about_2 ,R.drawable.image2),
            Affirmation(R.string.affirmation3, R.string.about_3 ,R.drawable.image3),
            Affirmation(R.string.affirmation4, R.string.about_4 ,R.drawable.image4),
            Affirmation(R.string.affirmation5, R.string.about_5 ,R.drawable.image5),
            Affirmation(R.string.affirmation6, R.string.about_6 ,R.drawable.image6),
            Affirmation(R.string.affirmation7, R.string.about_7 ,R.drawable.image7),
            Affirmation(R.string.affirmation8,R.string.about_8 , R.drawable.image8),
            Affirmation(R.string.affirmation9, R.string.about_9 ,R.drawable.image9),
            Affirmation(R.string.affirmation10, R.string.about_10 ,R.drawable.image10)
        )
    }
}