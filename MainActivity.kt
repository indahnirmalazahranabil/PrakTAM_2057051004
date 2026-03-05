package com.example.praktam_2057051004

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktam_2057051004.ui.theme.PrakTAM_2057051004Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrakTAM_2057051004Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFF0F5) // Background Pink Muda (Momoe' Style)
                ) {
                    MomoeAppUI()
                }
            }
        }
    }
}

@Composable
fun MomoeAppUI() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // JUDUL
        Text(
            text = "Momoe’ Bakery Nails",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFD81B60)
        )
        Text(
            text = "Fresh Nail from the UV",
            fontSize = 14.sp,
            color = Color(0xFFAD1457)
        )

        Spacer(modifier = Modifier.height(30.dp))

        //NAMA SAYA
        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Nama: Indah Nirmala Zahra Nabil", fontSize = 14.sp)
                Text(text = "NPM: 2057051004", fontSize = 14.sp)
                Text(text = "Ide Projek : NailArt Booking", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // RANCANGAN UI
        Button(
            onClick = { Toast.makeText(context, "Membuka Katalog...", Toast.LENGTH_SHORT).show() },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF06292))
        ) {
            Text("Lihat Katalog Desain", fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = { Toast.makeText(context, "Membuka Booking...", Toast.LENGTH_SHORT).show() },
            modifier = Modifier.fillMaxWidth().height(55.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF06292))
        ) {
            Text("Reservasi Jadwal", fontWeight = FontWeight.Bold)
        }
    }
}