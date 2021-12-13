package com.example.Sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.meuprojeto.R
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
fun sortearNumero(view: View){
var texto = findViewById(R.id.textoSorteio) as TextView
var numeroSorteado = Random().nextInt(11)
texto.setText("Número sorteado é: $numeroSorteado ")


}
}