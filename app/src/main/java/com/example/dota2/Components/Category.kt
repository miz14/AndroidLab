package com.example.dota2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dota2.ui.theme.BlueContrast
import com.example.dota2.ui.theme.BlueUnContrast
import com.example.dota2.ui.theme.fontF

@Preview
@Composable
fun Category() {
    val cat = stringArrayResource(R.array.category_list)
    LazyRow(Modifier.padding(start = 24.dp, top = 16.dp)) {
        itemsIndexed(cat) { _, item ->
            Box(
                Modifier
                    .padding(bottom = 10.dp, end = 10.dp)
                    .background(color = BlueUnContrast, shape = RoundedCornerShape(size = 100.dp))
            )
            {
                Text(
                    text = item,
                    fontSize = 10.sp,
                    fontFamily = fontF,
                    fontWeight = FontWeight.Normal,
                    color = BlueContrast,
                    modifier = Modifier.padding(10.dp, 5.dp)
                )
            }
        }
    }
}
