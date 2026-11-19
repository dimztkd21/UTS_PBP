package com.dims.uts_pbp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val ringkasan = findViewById<TextView>(R.id.tvRingkasan)
        val totalView = findViewById<TextView>(R.id.tvTotal)
        val satu = intent.getStringExtra("NAMA PESERTA")//perbaikan
        val dua = intent.getStringExtra("NAMA EVENT")//perbaikan
        val jumlah = intent.getIntExtra("JUMLAH", 0)//perbaikan
        val total = intent.getIntExtra("TOTAL", 0)//perbaikan
// TODO-15: tampilkan String dan jumlah pada ringkasan
// TODO-16: tampilkan total (konversi Int ke teks hanya di UI)
    }
}