package com.example.a1stpartialchallenge_natalia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class SongsAdapter(private val songs : List<Song>, var context:Context) : RecyclerView.Adapter<SongsAdapter.SongViewHolder>(){
    inner class SongViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var titulo = renglon.findViewById<TextView>(R.id.tituloDetail)
        var artista = renglon.findViewById<TextView>(R.id.artista)
        var album = renglon.findViewById<TextView>(R.id.album)
        var foto = renglon.findViewById<ImageView>(R.id.fotoDetail)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.songs_renglon,parent, false)
        return SongViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: SongViewHolder, position: Int) {
        val song= songs[position]

        holder.foto.setImageResource(song.picture)
        holder.titulo.text = song.title
        holder.artista.text = song.artist
        holder.album.text = song.album

        holder.itemView.setOnClickListener {

            val text = song.secret
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(context, text, duration)
            toast.show()

            val action = SongsFragmentDirections.actionSongsFragmentToSongFragment(song)
            holder.itemView.findNavController().navigate(action)
            //Navigation.createNavigateOnClickListener(R.id.action_songsFragment_to_songFragment)
        }
    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return songs.size
    }
}