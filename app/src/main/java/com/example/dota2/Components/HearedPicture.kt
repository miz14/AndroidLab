package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun HeaderIMG() {
    Box (modifier = Modifier
        .fillMaxWidth()

    ){
        Image(painter = painterResource(R.drawable.gamebg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(312.64.dp)
                .aspectRatio(1f),

        )


    }
}
