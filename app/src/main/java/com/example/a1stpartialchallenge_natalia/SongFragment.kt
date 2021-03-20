package com.example.a1stpartialchallenge_natalia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_song.*
import kotlinx.android.synthetic.main.songs_renglon.fotoDetail
import kotlinx.android.synthetic.main.songs_renglon.tituloDetail

class SongFragment : Fragment() {

    private val args by navArgs<SongFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_song, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fotoDetail.setImageResource(args.song.picture)
        tituloDetail.text = args.song.title
        artistaDetail.text = args.song.artist
        albumDetail.text = args.song.album
        moodDetail.text = args.song.mood
    }
}