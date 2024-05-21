package com.example.composeuielementsm3.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuielementsm3.ui.theme.ComposeUIElementsM3Theme

@Composable
fun Buttons(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Kullanıcı deneyiminde oldukça büyük bir etkisi olan işlemlerde kullanılmalıdır. (Add, Delete vb.)
        Button(onClick = {}) {
            Text(text = "Subscribe")
        }

        ElevatedButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Add to cart",
                modifier = modifier.size(18.dp)
            )
            Spacer(modifier = modifier.width(8.dp))
            Text(text = "Add to cart")
        }

        // Kullanıcı deneyiminde büyük bir etkisi olmayan işlemlerde kullanılabilir. (Add, Delete vb.)
        FilledTonalButton(onClick = {}) {
            Text(text = "Open in browser")
        }

        OutlinedButton(onClick = {}) {
            Text(text = "Back")
        }

        TextButton(onClick = {}) {
            Text(text = "Learn more")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeUIElementsM3Theme {
        Buttons()
    }
}