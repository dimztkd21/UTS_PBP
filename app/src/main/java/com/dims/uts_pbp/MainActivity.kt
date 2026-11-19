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
            val jumlah: Int? = /* TODO-01: konversi aman ke Int? */ null
            if (teksSatu.isEmpty() || teksDua.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please fill in all fields",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            if (jumlah == null || jumlah !in 1..10) {
            }
                // TODO-02: validasi kedua String tidak kosong; beri error dan hentikan proses
                // TODO-03: validasi Int dalam rentang 1..10; beri error dan hentikan proses
                val tarif: Int = 75000
                val total: Int = 0 // FIXME-04: hitung dengan operasi perkalian Int
                // TODO-05: buat Explicit Intent menuju ResultActivity
                // TODO-06: kirim teksSatu sebagai String
                // TODO-07: kirim teksDua sebagai String
                // TODO-08: kirim jumlah sebagai Int
                // TODO-09: kirim total sebagai Int
                // TODO-10: buka Activity tujuan
            }
        }
    }