package com.aristidevs.appmovil_v1

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aristidevs.appmovil_v1.ui.theme.AppMovil_v1Theme
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun Tabs_Principal(){
    Text(
        text = "Tabs Principal",
        style = MaterialTheme.typography.h1
    )
}

@Composable
fun CardRazaPerros () {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { }
            .fillMaxWidth(),
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp)
    ) {
        Column() {

            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Imagen"
            )
            Column (
                modifier = Modifier
                    .padding(16.dp)
            ){
                Text(
                    text = "Cuidado de  cachorros en los primeros meses",
                    style = MaterialTheme.typography.h3
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCardRazaPerros (){
    AppMovil_v1Theme {
        CardRazaPerros()
    }
}