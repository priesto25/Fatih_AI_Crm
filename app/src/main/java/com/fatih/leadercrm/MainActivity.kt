package com.fatih.leadercrm

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val container = findViewById<LinearLayout>(R.id.containerLayout)
        val btnDash = findViewById<Button>(R.id.btnDash)
        val btnLeads = findViewById<Button>(R.id.btnLeads)

        fun loadDashboard() {
            container.removeAllViews()
            val tv = TextView(this)
            tv.text = "📊 Toplam Müşteri: 4\n💰 Açık Fırsatlar: ₺500,000\n📍 Şehirler: İstanbul, Ankara, İzmir, Bursa"
            tv.setTextColor(android.graphics.Color.WHITE)
            tv.textSize = 16f
            tv.setPadding(16, 16, 16, 16)
            container.addView(tv)
        }

        fun loadLeads() {
            container.removeAllViews()
            val leads = listOf(
                "Ahmet Yılmaz - Yılmaz Holding (₺120,000) - İstanbul",
                "Ayşe Demir - Demir Enerji (₺85,000) - Ankara",
                "Mehmet Kaya - Kaya Lojistik (₺250,000) - İzmir",
                "Fatma Şahin - Şahin Mimarlık (₺45,000) - Bursa"
            )
            for (lead in leads) {
                val tv = TextView(this)
                tv.text = "• $lead"
                tv.setTextColor(android.graphics.Color.parseColor("#38BDF8"))
                tv.textSize = 14f
                tv.setPadding(12, 12, 12, 12)
                container.addView(tv)
            }
        }

        btnDash.setOnClickListener { loadDashboard() }
        btnLeads.setOnClickListener { loadLeads() }

        loadDashboard()
    }
}
