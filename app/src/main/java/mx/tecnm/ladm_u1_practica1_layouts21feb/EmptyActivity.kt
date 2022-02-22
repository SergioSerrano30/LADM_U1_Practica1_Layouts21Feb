package mx.tecnm.ladm_u1_practica1_layouts21feb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_empty.*

class EmptyActivity : AppCompatActivity() {
    var vectorImagenes = arrayOf(
        R.drawable.mood_serio,
        R.drawable.mood_sad,
        R.drawable.mood_preocupado,
        R.drawable.mood_feliz,
        R.drawable.mood_enojado,
        R.drawable.mood_enamorado,
        R.drawable.mood_debastado,
        R.drawable.mood_crying,
        R.drawable.mood_cool,
        R.drawable.mood_bien,
        R.drawable.mood_angustiado)
    var indice=0
    var vectorMoods = arrayOf("Serio","Sad","Preocupado","Feliz","Enojado"
        ,"Enamorado","Debastado","Llorando","Cool","Bien","Angustiado")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_empty)
        btnAnterior.setOnClickListener {
            indice--
            if (indice<0) indice=vectorImagenes.size-1
            imgMood.setImageResource(vectorImagenes[indice])
            txtMood.setText("Mood: ${vectorMoods[indice]}")
        }
        btnSiguiente.setOnClickListener {
            indice++
            if (indice==vectorImagenes.size) indice = 0
            imgMood.setImageResource(vectorImagenes[indice])
            txtMood.setText("Mood: ${vectorMoods[indice]}")
        }
        btnDespedida.setOnClickListener {
            val ventana3 = Intent(this,FullscreenActivity::class.java)

            startActivity(ventana3)
        }

    }
}