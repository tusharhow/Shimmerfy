package com.tmahmudev.shimmerfy

import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color



@Composable
 fun ShimmerSkeleton(
    modifier: Modifier = Modifier,
    duration: Int = 1200,
    easing: Easing = EaseIn,
    repeatMode: RepeatMode = RepeatMode.Reverse,

    shimmerColors: List<Color> = listOf(
        Color.LightGray.copy(0.9f),
        Color.LightGray.copy(0.2f),
        Color.LightGray.copy(0.9f)
    ),
) {
    ShimmerAnimation(
        modifier = modifier,
        duration = duration,
        easing = easing,
        repeatMode = repeatMode,
        shimmerColors = shimmerColors,
    )
}


@Composable
internal fun ShimmerAnimation(
    modifier: Modifier = Modifier,
    repeatMode: RepeatMode = RepeatMode.Reverse,
    duration: Int = 1200,
    easing: Easing = EaseIn,
    shimmerColors: List<Color> = listOf(
        Color.LightGray.copy(0.9f),
        Color.LightGray.copy(0.2f),
        Color.LightGray.copy(0.9f)
    ),

) {

    val shimmerAnimation = rememberInfiniteTransition(label = "").animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = duration, easing = easing),
            repeatMode = repeatMode,

            ), label = ""
    )

    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset(10f, 10f),
        end = Offset(shimmerAnimation.value, shimmerAnimation.value)
    )

    Box(
        modifier = modifier
            .background(brush = brush)
    )
}