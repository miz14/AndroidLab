package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dota2.ui.theme.Black
import com.example.dota2.ui.theme.Yellow
import com.example.dota2.ui.theme.fontF

@Preview
@Composable
fun InstallButton() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .height(70.dp)
            .padding(24.dp, 0.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.buttonblur), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .offset(y = 30.dp)
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Yellow, contentColor = Black),
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
        ) {
            Text(
                text = stringResource(R.string.Install),
                fontFamily = fontF,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
        }
    }
}
