package com.example.beratbadanideal_desiana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nama : EditText
    private lateinit var tBadan : EditText
    private lateinit var LakiLaki : RadioButton
    private lateinit var perempuan : RadioButton
    private lateinit var cek : Button
    private lateinit var hasil : TextView

    private var TB: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.ETNama)
        tBadan = findViewById(R.id.ETtb)
        LakiLaki = findViewById(R.id.rbLk2)
        perempuan = findViewById(R.id.rbPr)
        cek = findViewById(R.id.btCek)
        hasil = findViewById(R.id.tvHasil)

        cek.setOnClickListener {
            var tinggiBadan = tBadan.text.toString().toInt()

            if (LakiLaki.isChecked){
                TB = (tinggiBadan - 100) - ((tinggiBadan - 100) * 10 / 100)
                hasil.setText(TB.toString() + "Kg")
            }else {
                TB = (tinggiBadan - 100) - ((tinggiBadan - 100) * 15 / 100)
                hasil.setText(TB.toString() + "Kg")
            }
        }

    }
}