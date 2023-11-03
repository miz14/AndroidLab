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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun Main() {
    Column (
        modifier = Modifier
            .background(Color(0xFF050B18))
            .height(1230.dp)
            .offset(y = -31.dp)

    ){
        Row (modifier = Modifier
            .padding(24.dp, 0.dp)
            ){
            Icon()
            Column (Modifier
                .padding(12.dp, 34.dp, 0.dp, 0.dp)){
                Text(text = "DoTA 2",
                    fontSize = 20.sp,
                    lineHeight = 26.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFFFFF),

                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 7.dp))
                Row {
                    Image(painter = painterResource(R.drawable.starslogo), contentDescription = null,
                        modifier = Modifier
                            .width(76.dp)
                            .height(12.dp))
                    Text(text = "70M",
                        fontSize = 12.sp,
                        fontFamily = fontF,
                        fontWeight = FontWeight.Normal,
                        color = Color(0xFF45454D),
                        letterSpacing = 0.5.sp,
                        modifier = Modifier
                            .padding(10.dp, 0.dp, 0.dp, 0.dp))
                }
            }
        }
        Text(text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the 'Ancient', whilst defending their own.",
            fontFamily = fontF, fontWeight = FontWeight.Normal,
            fontSize = 12.sp, lineHeight = 19.sp,
            color = Color(0xB2EEF2FB),
            modifier = Modifier.padding(24.dp, 49.dp, 24.dp, 46.dp)
        )
        PictureSlider()
        Rating()
        Comments()
        InstallButton()
    }
}