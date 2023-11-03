package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Rating() {
    Column (Modifier
        .padding(24.dp, 20.dp, 24.dp, 0.dp)){
        Text(text = "Review and Ratings",
            fontSize = 16.sp,
            fontFamily = fontF,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFEEF2FB),

            letterSpacing = 0.6.sp,

            modifier = Modifier
                .padding(0.dp, 0.dp, 0.dp, 12.dp))
        Row {
            Text(text = "4.9",
                fontSize = 48.sp,
                fontFamily = fontF,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFFFFFF))
            Column (Modifier
                .padding(16.dp, 17.dp, 0.dp, 0.dp)){
                Image(painter = painterResource(R.drawable.stars), contentDescription = null,
                    modifier = Modifier
                        .width(76.dp)
                        .height(12.dp))
                Text(text = "70M Reviews",
                    fontSize = 12.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFFA8ADB7),
                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(0.dp, 8.dp, 0.dp, 0.dp))
            }
        }
    }
}