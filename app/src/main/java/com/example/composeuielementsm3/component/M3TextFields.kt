package com.example.composeuielementsm3.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeuielementsm3.ui.theme.ComposeUIElementsM3Theme

@Composable
fun TextFields(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var filledText by remember {
            mutableStateOf("")
        }
        TextField(value = filledText, onValueChange = { filledText = it },
            textStyle = LocalTextStyle.current.copy(
                textAlign = TextAlign.Right
            ),
            label = {
                Text(text = "Enter your weight")
            },
            placeholder = {
                Text(text = "Weight")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Outlined.MonitorWeight, contentDescription = "Weight")
            },
            suffix = {
                Text(text = "kg")
            },
            supportingText = {
                Text(text = "Please choose a real weight")
            },
            isError = false,
            //visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {
                    println("Hello world!")
                }
            )
        )

        Spacer(modifier = modifier.height(32.dp))

        var outlinedText by remember {
            mutableStateOf("")
        }

        OutlinedTextField(value = outlinedText, onValueChange = { outlinedText = it },
            textStyle = LocalTextStyle.current.copy(
                textAlign = TextAlign.Right
            ),
            label = {
                Text(text = "Enter your weight")
            },
            placeholder = {
                Text(text = "Weight")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Outlined.MonitorWeight, contentDescription = "Weight")
            },
            suffix = {
                Text(text = "kg")
            },
            supportingText = {
                Text(text = "Please choose a real weight")
            },
            isError = false,
            //visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Decimal,
                imeAction = ImeAction.Next
            ),
            keyboardActions = KeyboardActions(
                onNext = {
                    println("Hello world!")
                }
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TextFieldsPreview() {
    ComposeUIElementsM3Theme {
        TextFields()
    }
}