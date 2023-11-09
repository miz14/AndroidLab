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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.ui.theme.Gray
import com.example.dota2.ui.theme.LightGray
import com.example.dota2.ui.theme.LineBorder
import com.example.dota2.ui.theme.White
import com.example.dota2.ui.theme.fontF

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
            Image(
                painter = painterResource(com.img), contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
            )
            Column(
                modifier = Modifier
                    .padding(16.dp, 0.dp)
            ) {
                Text(
                    text = com.name,
                    fontSize = 16.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = White,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier
                        .padding(bottom = 7.dp)
                )
                Text(
                    text = com.data,
                    fontSize = 12.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = Gray,
                    letterSpacing = 0.5.sp,
                )
            }
        }
        Text(
            text = com.comment,
            fontSize = 12.sp,
            lineHeight = 20.sp,
            fontFamily = fontF,
            fontWeight = FontWeight.Normal,
            color = LightGray,
            letterSpacing = 0.5.sp,
            modifier = Modifier
                .padding(top = 17.dp)
        )
    }
}

@Preview
@Composable
fun Comments() {
    val data1 = stringArrayResource(R.array.Comment1)
    val data2 = stringArrayResource(R.array.Comment2)
    val com1 = CommentInfo(R.drawable.comment1, data1[0], data1[1], data1[2])
    val com2 = CommentInfo(R.drawable.comment2, data2[0], data2[1], data2[2])
    Column(
        modifier = Modifier
            .padding(24.dp, 30.dp, 24.dp, 40.dp)
    ) {
        Comment(com1)
        Box(
            Modifier
                .padding(0.dp, 24.dp)
        ) {
            Box(
                Modifier
                    .border(width = 1.dp, color = LineBorder)
                    .height(1.dp)
                    .padding(14.dp, 0.dp)
                    .fillMaxWidth()
            )
        }
        Comment(com2)
    }
}
