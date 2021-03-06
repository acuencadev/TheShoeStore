package com.acuencadev.shoestore.screens.shoelist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acuencadev.shoestore.R

/**
 * Fragment for the shoe list screen of the app
 */
class ShoeListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shoe_list, container, false)
    }
}