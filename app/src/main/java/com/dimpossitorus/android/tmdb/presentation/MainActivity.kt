package com.dimpossitorus.android.tmdb.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.dimpossitorus.android.tmdb.R
import com.dimpossitorus.android.tmdb.presentation.feature.genre.GenreListFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onResume() {
        super.onResume()
        replaceFragment(GenreListFragment())
    }

}
