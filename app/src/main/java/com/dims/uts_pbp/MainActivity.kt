package com.dims.uts_pbp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

            //penjelasan untuk melakukan validasi jika teks tidak diisi
            if (teksSatu.isEmpty()) {
                satu.error = getString(R.string.error_isi_data)
                satu.requestFocus()
                return@setOnClickListener
            }

            if (teksDua.isEmpty()) {
                dua.error = getString(R.string.error_isi_data)
                dua.requestFocus()
                return@setOnClickListener
            }
            //untuk melaakukna validasi jika jumlah tidak sesuai
            if (jumlah == null || jumlah !in 1..10) {
                jumlahView.error = getString(R.string.error_jumlah_range)
                jumlahView.requestFocus()
                return@setOnClickListener
            }
                val tarif: Int = 75000
                // Perkalian Int menghasilkan total biaya setelah jumlah aman dari null.
                val total: Int = tarif * jumlah //perbaikan
            //mengiirm data lewat explisit intent
            val intent = Intent(this, ResultActivity::class.java).apply {//perbaikan
                //menambahkan data ke intent
                putExtra("EXTRA_SATU", teksSatu)//perbaikan
                putExtra("EXTRA_DUA", teksDua)//perbaikan
                putExtra("EXTRA_JUMLAH", jumlah)//perbaikan
                putExtra("EXTRA_TOTAL", total)//perbaikan
            }
            startActivity(intent)//perbaikan
        }
    }
}
