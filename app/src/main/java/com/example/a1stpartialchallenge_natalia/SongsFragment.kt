package com.example.a1stpartialchallenge_natalia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_songs.*


class SongsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_songs, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        songs_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = SongsAdapter(createData(), context)
        }
    }

    fun createData(): ArrayList<Song>{
        val songs = ArrayList<Song>()
        songs.add(Song(R.drawable.isolation, "Chasing Kites", "iamamiwhoami","Isolation live in Ödeshög", "Cuando la vida parezca muy abrumadora, no hay nada mejor que un poco de relajación solitaria. Solo cerrar los ojos.", "Relajarse"))
        songs.add(Song(R.drawable.innocents,"A Little Respect", "Erasure", "The Innocents", "Si me siento enojada, pero no quiero estarlo, bailo esta canción.", "Bailar"))
        songs.add(Song(R.drawable.anthropocene, "Delete Forever", "Grimes", "Miss Anthropocene","Un día, sentada en una biblioteca de Mixcoac, me di cuenta de que en realidad estaba triste...y lo aceptaba", "Triste"))
        songs.add(Song(R.drawable.outoforder, "Lost in You", "Rod Stewart","Out of Order","Estoy feliz, soy libre, y siento el viento en mi cara. Canto a todo pulmón", "Feliz"))
        songs.add(Song(R.drawable.suburbs, "Suburban War", "Arcade Fire", "The Suburbs", "Alguna vez fui joven. Quise escaparme de noche, sin que nadie se fijara, y no volver nunca.", "Triste"))
        songs.add(Song(R.drawable.soulcages,"All this time", "Sting", "The Soul Cages", "Es un día fresco, de cielos azules infinitos, y voy manejando por la carretera, hacia un lugar donde pueda descansar", "Feliz"))
        songs.add(Song(R.drawable.pikul, "Kissing Families", "Silversun Pickups", "Pikul", "Mis amigos me venderían por una papa. Mejor juego algo sangriento y difícil, como Bloodbourne, para fingir que no me importa", "Enojado"))
        songs.add(Song(R.drawable.pastlife, "Light On", "Maggie Rogers", "Heard it in a Past Life", "Un día desperté, me sentí mejor y comencé de nuevo", "Feliz"))
        songs.add(Song(R.drawable.cosmicocean,"Summer Lover", "Mia Doi Todd", "Cosmic Ocean Ship", "Tomando un café, en casa, en la cafetería, camindando por las calles, escuchando el follaje", "Feliz"))
        songs.add(Song(R.drawable.images,"Take the Time", "Dream Theater", "Images and Words", "Me siento podersa, no me importa nada. Voy a ganar.", "Poderoso"))
        songs.add(Song(R.drawable.illuminate, "Treat you Better", "Shawn Mendez", "Illuminate", "Me siento básica y fresa y que soy joven e ilusa otra vez.", "Feliz"))
        songs.add(Song(R.drawable.blue, "The Last Time I saw Richard", "Joni Mitchell", "Blue", "Lamentablemente, nací romántica. La tragedia más grande de mi historia.", "Triste"))
        songs.add(Song(R.drawable.whyareyouok, "Casual Party", "Band of Horses", "Why are you OK", "Estoy harta de todos y de todo. Típicas vidas aburridas", "Enojado"))
        songs.add(Song(R.drawable.iii,"Kerosene", "Crystal Castles", "III", "Voy caminando por los callejones de una ciudad oscura y peligrosa. Probablemente me pierda para siempre.", "Asustado, Triste"))
        songs.add(Song(R.drawable.wincing, "Phantom Limb", "The shins", "Wincing the Night Away", "El maravilloso y conmovedor himno de todos los rechazados ahí afuera.","Liberado"))
        return songs
    }
}