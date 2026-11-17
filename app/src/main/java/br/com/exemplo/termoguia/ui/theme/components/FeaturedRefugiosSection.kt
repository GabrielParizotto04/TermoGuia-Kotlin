package br.com.exemplo.termoguia.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import br.com.exemplo.termoguia.model.Refugio
import coil3.compose.AsyncImage

@Composable
fun FeaturedRefugiosSection(refugios: List<Refugio>) {
    if (refugios.isEmpty()) return

    Column {
        Text(
            "Locais em Destaque contra o Calor",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(8.dp))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(refugios) { refugio ->
                Card(modifier = Modifier.width(190.dp)) {
                    Column {
                        AsyncImage(
                            model = refugio.imageUrl,
                            contentDescription = "Foto de ${refugio.name}",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(104.dp)
                        )
                        Text(
                            text = refugio.name,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.padding(8.dp)
                        )
                    }
                }
            }
        }
    }
}

