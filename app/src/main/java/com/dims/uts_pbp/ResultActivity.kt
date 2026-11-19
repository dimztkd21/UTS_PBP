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
        //Terima data String dan Int dari Intent memakai getStringExtra dan getIntExtra.
        val satu: String = intent.getStringExtra("EXTRA_SATU").orEmpty() //perbaikan
        val dua: String = intent.getStringExtra("EXTRA_DUA").orEmpty() //perbaikan
        val jumlah: Int = intent.getIntExtra("EXTRA_JUMLAH", 0) //perbaikan
        val total: Int = intent.getIntExtra("EXTRA_TOTAL", 0) //perbaikan

        //Tampilkan hasil output ringkasan dan total ke TextView lewat string resource.
        ringkasan.text = getString(R.string.format_ringkasan, satu, dua, jumlah)//perbaikan
        totalView.text = getString(R.string.format_total, total)//perbaikan

    }
}