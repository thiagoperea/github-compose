package com.thiagoperea.githubcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.thiagoperea.githubcompose.ui.theme.GithubComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScreenUI()
                }
            }
        }
    }
}

@Composable
fun ScreenUI() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        BackgroundUI()
        HeadlineUI()
    }
}

@Composable
fun BackgroundUI() {
    val backgroundShape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 16.dp, bottomEnd = 16.dp)

    Box(
        modifier = Modifier.fillMaxWidth()
            .height(100.dp)
            .clip(backgroundShape)
            .background(Color.DarkGray)
    )
}

@Composable
fun HeadlineUI() {
    Column(
        modifier = Modifier.padding(top = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(96.dp),
            shape = CircleShape,
            elevation = 0.dp
        ) {
            Image(
                painterResource(R.drawable.fake_picture),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Text("Thiago Neves", fontSize = 24.sp)
        Text("thiagoperea", fontSize = 16.sp)
        Text("Desenvolvedor Android @ Mirai", fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun HeadlinePreview() {
    GithubComposeTheme {
        ScreenUI()
    }
}