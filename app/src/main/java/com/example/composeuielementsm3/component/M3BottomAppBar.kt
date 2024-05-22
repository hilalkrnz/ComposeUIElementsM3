package com.example.composeuielementsm3.component

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeuielementsm3.ui.theme.ComposeUIElementsM3Theme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomAppBars() {
    // Sayfalar arasında gezinme için kullanılmaz. Simgelere tıklandığında kullanıcıyı farklı bir ekrana yönlendirmemleidir.
    //Mevcut ekran üzerinde  bir eylem ve etkiye sahip olmalıdır.

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "Share contact"
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.FavoriteBorder,
                            contentDescription = "Mark as favorite"
                        )
                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email contact"
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = "Call contact"
                        )
                    }
                }
            )
        }
    ) {}
}

@Preview(showBackground = true)
@Composable
fun BottomAppBarsPreview() {
    ComposeUIElementsM3Theme {
        BottomAppBars()
    }
}