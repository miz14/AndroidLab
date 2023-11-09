package com.example.dota2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dota2.ui.theme.Dota2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Dota2Theme {
                LazyColumn() {
                    item {
                        HeaderIMG()
                        Main()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun Fun() {
    Column {
        HeaderIMG()
        Main()
    }
}
