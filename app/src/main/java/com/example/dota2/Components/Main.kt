package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.ui.theme.BlackUnContrast
import com.example.dota2.ui.theme.DarkGray
import com.example.dota2.ui.theme.NewGray
import com.example.dota2.ui.theme.White
import com.example.dota2.ui.theme.fontF

@Preview
@Composable
fun Main() {
    Column(
        modifier = Modifier
            .background(BlackUnContrast)
            .height(930.dp)
            .offset(y = -31.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(24.dp, 0.dp)
        ) {
            Icon()
            Column(
                Modifier
                    .padding(start = 12.dp, top = 34.dp)
            ) {
                Text(
                    text = stringResource(R.string.app_name),
                    fontSize = 20.sp,
                    lineHeight = 26.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Bold,
                    color = White,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(bottom = 7.dp)
                )
                Row {
                    Image(
                        painter = painterResource(R.drawable.starslogo), contentDescription = null,
                        modifier = Modifier
                            .width(76.dp)
                            .height(12.dp)
                    )
                    Text(
                        text = stringResource(R.string.downloads),
                        fontSize = 12.sp,
                        fontFamily = fontF,
                        fontWeight = FontWeight.Normal,
                        color = DarkGray,
                        letterSpacing = 0.5.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                }
            }
        }
        Category()
        Text(
            text = stringResource(R.string.game_description),
            fontFamily = fontF, fontWeight = FontWeight.Normal,
            fontSize = 12.sp, lineHeight = 19.sp,
            color = NewGray,
            modifier = Modifier.padding(24.dp, 24.dp, 24.dp, 21.dp)
        )
        PictureSlider()
        Rating()
        Comments()
        InstallButton()
    }
}