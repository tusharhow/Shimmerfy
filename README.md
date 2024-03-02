# Shimmerfy

![Shimmerfy](screenshot/header.png)

🚀A Jetpack Compose utility library for  
_Made with ❤️ for Android Developers and Composers_ 

 <img src="screenshot/shimmer.gif" width="250" height="30%"/>


## 💡Introduction 

Shimmerfy is a lightweight library for Jetpack Compose that enables you to effortlessly integrate shimmer loading effects into your UI components. Enhance your app's user experience with smooth and appealing loading animations using Shimmerfy.

## 🚀 Implementation

You can check [/app](/app) directory which includes example application for demonstration. 

### Gradle setup

In `build.gradle` of app module, include this dependency

```gradle
dependencies {
    implementation 'com.tmahmudev.shimmerfy:shimmerfy:1.0.3'
}
```

_You can find latest version and changelogs in the [releases](https://github.com/tusharhow/Shimmerfy/releases)_.

### Usage

#### 1. Initialize Shimmer Animation in your Composable function:

```kotlin
LazyColumn {
  items(6) {
    // design your content skeleton with shimmerfy

  }
 }
```


#### 2. Create a ShimmerItemRow


```kotlin
Row(){
     ShimmerSkeleton(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(8)),
    )
}
```

#### 3. Dummy card

For the idea i've created a dummy shimmer card. 

```kotlin
// Example: Created a dummy shimmer card
Row(
    modifier = Modifier
        .padding(16.dp),
) {
    ShimmerSkeleton(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .clip(RoundedCornerShape(8)),
    )
    Spacer(modifier = Modifier.width(16.dp))
    Column {
        ShimmerSkeleton(
            modifier = Modifier
                .width(200.dp)
                .height(20.dp),
        )
        Spacer(modifier = Modifier.height(16.dp))
        ShimmerSkeleton(
            modifier = Modifier
                .width(100.dp)
                .height(20.dp),
        )
        Spacer(modifier = Modifier.height(8.dp))
        ShimmerSkeleton(
            modifier = Modifier
                .width(150.dp)
                .height(20.dp),
        )
    }
}
```

## ShimmerSkeleton with Customization

The `ShimmerSkeleton` composable now supports additional customization options:

- **Shimmer Colors:** You can set custom shimmer colors using the `shimmerColors` parameter. For example:

    ```kotlin
    shimmerColors = listOf(
        Color.LightGray.copy(0.9f),
        Color.LightGray.copy(0.2f),
        Color.LightGray.copy(0.9f)
    )
    ```

- **Easing Function:** Customize the easing function for the shimmer animation using the `easing` parameter. For example:

    ```kotlin
    easing = EaseIn
    ```

- **Animation Duration:** Adjust the duration of the shimmer animation with the `duration` parameter (in milliseconds). For example:

    ```kotlin
    duration = 1200
    ```

- **Repeat Mode:** Set the repeat mode for the shimmer animation using the `repeatMode` parameter. For example:

    ```kotlin
    repeatMode = RepeatMode.Reverse
    ```

### Example Usage

```kotlin
@Composable
fun ShimmerItem(modifier: Modifier) {
    ShimmerSkeleton(
        modifier = modifier,
        shimmerColors = listOf(
            Color.LightGray.copy(0.9f),
            Color.LightGray.copy(0.2f),
            Color.LightGray.copy(0.9f)
        ),
        easing = EaseIn,
        duration = 1200,
        repeatMode = RepeatMode.Reverse
    )
}

```


## 📝 License

```
MIT License

Copyright (c) 2024 Tushar Mahmud

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```