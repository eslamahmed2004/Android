package com.example.android.tasks

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.R

@Composable
fun Task2(onBack: () -> Unit) {

    var currentIndex by remember { mutableStateOf(0) }

    val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3
    )

    val titles = listOf(
        "Sailing Under the Bridge",
        "Mountain View",
        "Sunset by the Beach"
    )

    val artists = listOf(
        "Kat Kuan",
        "John Doe",
        "Sara Ali"
    )

    val years = listOf(
        "2017",
        "2019",
        "2021"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = images[currentIndex]),
            contentDescription = titles[currentIndex],
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(0.9f)
                .aspectRatio(3f / 4f)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Surface(
            shadowElevation = 8.dp,
            tonalElevation = 3.dp,
            modifier = Modifier.padding(8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = titles[currentIndex],
                    fontSize = 18.sp
                )
                Text(
                    text = artists[currentIndex],
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "(${years[currentIndex]})"
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = {
                currentIndex = if (currentIndex == 0) images.lastIndex else currentIndex - 1
            }) {
                Text("Previous")
            }

            Button(onClick = {
                currentIndex = if (currentIndex == images.lastIndex) 0 else currentIndex + 1
            }) {
                Text("Next")
            }

        }
        Spacer(modifier = Modifier.height(40.dp))

        Button(onClick = { onBack() }) {
            Text("Back")
        }
    }
}
