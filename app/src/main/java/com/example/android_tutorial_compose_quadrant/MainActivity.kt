package com.example.android_tutorial_compose_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android_tutorial_compose_quadrant.ui.theme.Android_tutorial_compose_quadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_tutorial_compose_quadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainLayout()
                }
            }
        }
    }
}

@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column {
            Row(modifier = modifier.weight(0.5f)) {
                Card(
                    title = stringResource(id = R.string.text_composable_title),
                    description = stringResource(id = R.string.text_composable_description),
                    modifier = modifier
                        .weight(0.5f)
                        .background(color = Color.Green)
                )
                Card(
                    title = stringResource(id = R.string.image_composable_title),
                    description = stringResource(id = R.string.image_composable_description),
                    modifier = modifier
                        .weight(0.5f)
                        .background(color = Color.Yellow)
                )
            }
            Row(modifier = modifier.weight(0.5f)) {
                Card(
                    title = stringResource(id = R.string.row_composable_title),
                    description = stringResource(id = R.string.row_composable_description),
                    modifier = modifier
                        .weight(0.5f)
                        .background(color = Color.Cyan)
                )
                Card(
                    title = stringResource(id = R.string.column_composable_title),
                    description = stringResource(id = R.string.column_composable_description),
                    modifier = modifier
                        .weight(0.5f)
                        .background(color = Color.Gray)
                )
            }
        }
    }
}

@Composable
fun Card(title: String, description: String, modifier: Modifier) {
    Box(
        modifier = modifier.padding(16.dp),
    ) {
        Column (
            modifier = Modifier.fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = title,
                fontWeight = Bold,
                modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 16.dp)
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_tutorial_compose_quadrantTheme {
        MainLayout()
    }
}