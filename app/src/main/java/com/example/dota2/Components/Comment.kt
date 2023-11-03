package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


data class CommentInfo(
    val img: Int,
    val name: String,
    val data: String,
    val comment: String
)

@Composable
fun Comment(com: CommentInfo) {
    Column() {
        Row {
            Image(painter = painterResource(com.img), contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
                    )
            Column (
                modifier = Modifier
                    .padding(16.dp, 0.dp)){
                Text(text = com.name,
                    fontSize = 16.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFFFFFFFF),
                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(0.dp, 0.dp, 0.dp, 7.dp))
                Text(text = com.data,
                    fontSize = 12.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = Color(0x66FFFFFF),
                    letterSpacing = 0.5.sp,)
            }
        }
        Text(text = com.comment,
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = fontF,
            fontWeight = FontWeight.Normal,
            color = Color(0xFFA8ADB7),
            letterSpacing = 0.5.sp,
            modifier = Modifier
                .padding(0.dp, 17.dp, 0.dp, 0.dp)
            )

    }
}

var data1 = CommentInfo(R.drawable.comment1, "Auguste Conte", "February 14, 2023", "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”")
var data2 = CommentInfo(R.drawable.comment2, "Jang Marcelino", "February 14, 2019", "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”")
@Preview
@Composable
fun Comments() {
    Column (modifier = Modifier
        .padding(24.dp, 30.dp, 24.dp, 40.dp)
        ) {
        Comment(data1)
        Box(Modifier
            .padding(0.dp, 24.dp)) {
            Box(
                Modifier
                    .border(width = 1.dp, color = Color(0xFF1A1F29))
                    .height(1.dp)
                    .padding(14.dp, 0.dp)
                    .fillMaxWidth()
            )
        }
        Comment(data2)
    }

}