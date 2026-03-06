package com.example.praktam_2057051004

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktam_2057051004.ui.theme.PrakTAM_2057051004Theme
import com.example.praktam_2057051004.model.NailSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrakTAM_2057051004Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFF0F5)
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
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Momoe’ Bakery Nails", fontSize = 26.sp, fontWeight = FontWeight.ExtraBold, color = Color(0xFFD81B60))
        Text(text = "Cute & Pop Nail Art Studio", fontSize = 14.sp, color = Color(0xFFAD1457))

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Nama: Indah Nirmala Zahra Nabil", fontSize = 14.sp)
                Text(text = "NPM: 2057051004", fontSize = 14.sp)
                Text(text = "Projek: NailArt Booking", fontSize = 14.sp, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Panggil fungsi katalog
        Greeting()

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { Toast.makeText(context, "Membuka Katalog...", Toast.LENGTH_SHORT).show() },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF06292))
        ) {
            Text("Lihat Katalog Desain", fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun Greeting() {
    val nail = NailSource.dummyNail[0]

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFE4E1))
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Nampilin Gambar
            Image(
                painter = painterResource(id = nail.imageRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(100.dp).padding(bottom = 8.dp)
            )

            Text(text = "Contoh Produk: ${nail.nama}", fontWeight = FontWeight.Bold)
            Text(text = "Deskripsi: ${nail.deskripsi}", fontSize = 12.sp)
            Text(text = "Harga: Rp ${nail.harga}", fontSize = 12.sp, color = Color(0xFFD81B60))
        }
    }
}