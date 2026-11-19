package com.dims.uts_pbp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val satu = findViewById<EditText>(R.id.etSatu)
        val dua = findViewById<EditText>(R.id.etDua)
        val jumlahView = findViewById<EditText>(R.id.etJumlah)
        val tombol = findViewById<Button>(R.id.btnHitung)
        tombol.setOnClickListener {
            val teksSatu = satu.text.toString().trim()
            val teksDua = dua.text.toString().trim()
            val jumlah: Int? = jumlahView.text.toString().trim().toIntOrNull()//perbaikan

            if (teksSatu.isEmpty() || teksDua.isEmpty()) {//perbaikan
                Toast.makeText(
                    this,
                    "Please fill in all fields",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            if (jumlah == null || jumlah !in 1..10) {//perbaikan
                Toast.makeText(this, "Jumlah harus angka 1 sampai 10", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
                val tarif: Int = 75000
                val total: Int = tarif * jumlah //perbaikan
                // TODO-05: buat Explicit Intent menuju ResultActivity
                // TODO-06: kirim teksSatu sebagai String
                // TODO-07: kirim teksDua sebagai String
                // TODO-08: kirim jumlah sebagai Int
                // TODO-09: kirim total sebagai Int
                // TODO-10: buka Activity tujuan
            }
        }
    }