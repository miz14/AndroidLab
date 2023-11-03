package com.example.dota2

//import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape

@Preview
@Composable
fun Icon() {
    Box (Modifier
        .padding(0.dp, 0.dp, 0.dp, 7.dp),
        contentAlignment = Alignment.TopCenter

    ) {
        Image(
            painter = painterResource(R.drawable.iconblur), contentDescription = null,
            modifier = Modifier
                .size(76.dp)
                .offset(y = 20.dp)
        )

        Box(modifier = Modifier
            .size(88.dp)
            .background(Color(0xFF000000), shape = RoundedCornerShape(size = 21.dp))
            .border(2.dp, Color(0xFF1F2430), RoundedCornerShape(size = 20.dp)),


            contentAlignment = Alignment.Center) {


            Image(
                painter = painterResource(R.drawable.icon), contentDescription = null,
                modifier = Modifier
                    .size(54.dp)
            )
        }
    }
}
