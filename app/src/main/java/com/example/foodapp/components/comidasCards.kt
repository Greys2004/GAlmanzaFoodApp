package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.foodapp.models.Categorias
import com.example.foodapp.models.Comidas
import com.example.foodapp.ui.theme.myColor
import com.example.foodapp.utils.Account_circle
import com.example.foodapp.utils.Star

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun comidasCards(comidas: Comidas){

    Column(
        modifier = Modifier.padding(20.dp)
    ){
        Box(
            modifier = Modifier
                .size(100.dp),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                model = comidas.imagen,
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .width(80.dp)
                    .height(40.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(myColor)
                    .align(Alignment.BottomEnd),

                ) {
                Text(
                    text = "$${String.format("%.2f", comidas.precio)}",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center),

                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Icon(
                imageVector = Star,
                contentDescription = "Icono de sesion",
                modifier = Modifier.padding(start = 8.dp).size(30.dp),
                tint = Color.Green
            )
            Text( text = comidas.calificacion.toString())
            Text( text = comidas.nombre)
        }
    }
}