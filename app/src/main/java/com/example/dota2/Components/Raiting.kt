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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.ui.theme.LightGray
import com.example.dota2.ui.theme.NewGray
import com.example.dota2.ui.theme.White
import com.example.dota2.ui.theme.fontF

@Preview
@Composable
fun Rating() {
    Column(
        Modifier
            .padding(24.dp, 20.dp, 24.dp, 0.dp)
    ) {
        Text(
            text = stringResource(R.string.Raiting_title),
            fontSize = 16.sp,
            fontFamily = fontF,
            fontWeight = FontWeight.Bold,
            color = NewGray,
            letterSpacing = 0.6.sp,
            modifier = Modifier
                .padding(bottom = 12.dp)
        )
        Row {
            Text(
                text = stringResource(R.string.Raiting_num),
                fontSize = 48.sp,
                fontFamily = fontF,
                fontWeight = FontWeight.Bold,
                color = White
            )
            Column(
                Modifier
                    .padding(start = 16.dp, top = 17.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.stars), contentDescription = null,
                    modifier = Modifier
                        .width(76.dp)
                        .height(12.dp)
                )
                Text(
                    text = stringResource(R.string.Raiting_rev),
                    fontSize = 12.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = LightGray,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)
                )
            }
        }
    }
}
