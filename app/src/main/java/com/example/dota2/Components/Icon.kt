package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.Black
import com.example.dota2.ui.theme.BorderBlack

@Composable
fun Icon() {
    Box(
        Modifier
            .padding(bottom = 7.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(R.drawable.iconblur), contentDescription = null,
            modifier = Modifier
                .size(76.dp)
                .offset(y = 20.dp)
        )
        Box(
            modifier = Modifier
                .size(88.dp)
                .background(Black, shape = RoundedCornerShape(size = 16.dp))
                .border(2.dp, BorderBlack, RoundedCornerShape(size = 15.dp)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.icon), contentDescription = null,
                modifier = Modifier
                    .size(54.dp)
            )
        }
    }
}

@Preview
@Composable
fun Preview_Icon() {
    Icon()
}
