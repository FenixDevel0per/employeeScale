package br.com.fenixdev.homeofficescale.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun ScaleScreen() {
    Column() {
        Text(text = "ScaleScreen")
        scale()
    }
}

@Composable
fun scale(){
    LazyColumn {
        // Add a single item
        item {
            Text(text = "First item")
        }

        // Add 5 items
        items(5) { index ->
            Text(text = "Item: $index")
        }

        // Add another single item
        item {
            Text(text = "Last item")
        }
    }
}


@Preview
@Composable
fun ScaleScreenPreview(){
    ScaleScreen()
}



