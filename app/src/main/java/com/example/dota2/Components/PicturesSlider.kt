package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun ImgSlider(item: Int) {
    Box(contentAlignment = Alignment.Center,
        ) {
        Image(
            painter = painterResource(item), contentDescription = null,
            modifier = Modifier
                .width(240.dp)
                .height(128.dp)

                .padding(0.dp, 3.dp, 15.dp, 4.dp)
                .clip(RoundedCornerShape(size = 14.dp))
        )
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
            .clip(CircleShape)
            .border(width = 0.7.dp, color = Color(0x00FFFFFF))
            .padding(0.7.dp)
            .size(48.dp)
            .background(color = Color(0x3DFFFFFF))


            ) {
            Image(painter = painterResource(R.drawable.play), contentDescription = null,
                modifier = Modifier
                    .size(10.dp, 12.dp)
            )
        }

    }

}

@Preview
@Composable
fun PictureSlider() {
    Box(modifier = Modifier.padding(24.dp, 0.dp, 0.dp, 0.dp)) {
        LazyRow(modifier = Modifier
            .fillMaxWidth()

        ) {
            itemsIndexed(
                listOf(R.drawable.sliderimg1, R.drawable.sliderimg2)
            ) { _, item ->
                ImgSlider(item)
            }


        }
    }

}
