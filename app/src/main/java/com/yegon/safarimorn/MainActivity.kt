package com.yegon.safarimorn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yegon.safarimorn.ui.theme.SafarimornTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafarimornTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    home()
                }
            }
        }
    }
}

@Composable
fun home(){
    
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text(text = "Yegon's App",
                    color = Color.Red,
                    fontSize = 28.sp,
                    fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(22.dp))

        Text(text = "Welcome to Android APP",
                    color = Color.Magenta,
                    fontSize = 14.sp,
                    fontFamily = FontFamily.SansSerif
        )
        Text(text = "Kotlin on Android")

    }
    
}

@Preview
@Composable
private fun homepreview() {
    home()
    
}
