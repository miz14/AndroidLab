package com.example.dota2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Category() {
    LazyRow (Modifier.padding(24.dp, 16.dp, 0.dp, 0.dp)){

        itemsIndexed(listOf("MOBA", "MULTIPLAYER", "STRATEGY")) {
            _, item ->
            Box(Modifier
                .padding(0.dp, 0.dp, 10.dp, 0.dp)
                .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
            )

            {
                Text(text = item,
                    fontSize = 10.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF44A9F4),
                    modifier = Modifier.padding(10.dp, 5.dp))
            }
        }


    }
}

