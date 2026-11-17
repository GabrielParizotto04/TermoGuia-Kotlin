package br.com.exemplo.termoguia.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.com.exemplo.termoguia.data.refugiosList
import br.com.exemplo.termoguia.model.RefugiosCategory
import br.com.exemplo.termoguia.ui.components.CategorySelector
import br.com.exemplo.termoguia.ui.components.FeaturedRefugiosSection
import br.com.exemplo.termoguia.ui.components.RefugioListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    var selectedCategory by rememberSaveable { mutableStateOf<RefugiosCategory?>(null) }

    val visibleRefugios = refugiosList.filter { refugio ->
        selectedCategory == null || selectedCategory in refugio.categories
    }
    val featuredRefugios = refugiosList.filter { it.featured }

    Scaffold(
        topBar = { TopAppBar(title = { Text("TermoGuia ☀️") }) }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // 1. Destaques globais
            item {
                FeaturedRefugiosSection(refugios = featuredRefugios)
            }

            // 2. Título das categorias
            item {
                Text("Categorias de Refúgio", style = MaterialTheme.typography.titleLarge)
            }

            // 3. Seletor horizontal
            item {
                CategorySelector(
                    categories = RefugiosCategory.entries,
                    selectedCategory = selectedCategory,
                    onCategorySelected = { selectedCategory = it }
                )
            }

            // 4. Título do catálogo
            item {
                Text(
                    "Locais disponíveis (${visibleRefugios.size})",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold
                )
            }

            // 5. Lista de refúgios na mesma rolagem vertical
            if (visibleRefugios.isEmpty()) {
                item { Text("Nenhum local encontrado.") }
            } else {
                items(visibleRefugios) { refugio ->
                    RefugioListItem(refugio = refugio)
                }
            }
        }
    }
}

