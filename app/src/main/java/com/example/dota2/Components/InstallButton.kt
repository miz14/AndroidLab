package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun InstallButton() {
    Box (
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .height(70.dp)
            .padding(24.dp, 0.dp)
            .fillMaxWidth()
            ) {
        Image(
            painter = painterResource(R.drawable.buttonblur), contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp, 0.dp)
                .offset(y = 20.dp)
        )
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFF4D144))

        ) {
            Text(text = "Install", fontFamily = fontF, fontWeight = FontWeight.Bold, fontSize = 20.sp,)
        }
    }

}