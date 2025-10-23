package com.example.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.android.tasks.Task1
import com.example.android.tasks.Task2
import com.example.android.ui.theme.AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    var selectedTask by remember { mutableStateOf<String?>(null) }


    when (selectedTask) {
        "task1" -> Task1(onBack = { selectedTask = null })
        "task2" -> Task2(onBack = { selectedTask = null })
        else -> MainMenu(onSelectTask = { selectedTask = it })
    }
}

@Composable
fun MainMenu(onSelectTask: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Select Task:", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { onSelectTask("task1") }) {
            Text(" Task 1")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onSelectTask("task2") }) {
            Text(" Task 2")
        }
    }
}
