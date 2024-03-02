package com.example.composeshimmer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.composeshimmer.ui.theme.ComposeShimmerTheme
import com.tmahmudev.shimmerfy.ShimmerSkeleton


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Surface {
               ComposeShimmerTheme {
                     LazyColumn {
                          items(6) {
                            ShimmerSkeleton(
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(100.dp)
                                    .clip(RoundedCornerShape(8)),

                            )
                          }
                     }

               }
           }
        }
    }
}







//Row(
//modifier = Modifier
//.padding(16.dp),
//) {
//    ShimmerSkeleton(
//        modifier = Modifier
//            .width(100.dp)
//            .height(100.dp)
//            .clip(RoundedCornerShape(8)),
//    )
//    Spacer(modifier = Modifier.width(16.dp))
//    Column {
//        ShimmerSkeleton(
//            modifier = Modifier
//                .width(200.dp)
//                .height(20.dp),
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        ShimmerSkeleton(
//            modifier = Modifier
//                .width(100.dp)
//                .height(20.dp),
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        ShimmerSkeleton(
//            modifier = Modifier
//                .width(150.dp)
//                .height(20.dp),
//        )
//    }
//}