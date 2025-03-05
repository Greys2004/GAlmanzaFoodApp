package com.example.foodapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.myColor
import com.example.foodapp.utils.Account_circle
import com.example.foodapp.utils.Logout

@Composable
fun HomeScreen(innerPadding: PaddingValues){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(15.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Account_circle,
                contentDescription = "Icono de sesion",
                modifier = Modifier.padding(start = 8.dp).size(30.dp),
                tint = myColor
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Hola, Greys", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                imageVector = Logout,
                contentDescription = "Icono de inicio",
                modifier = Modifier.padding(end = 8.dp).size(30.dp),
                tint = myColor
            )
        }

        Text(text= "Nuestras Categorias")
    }
}