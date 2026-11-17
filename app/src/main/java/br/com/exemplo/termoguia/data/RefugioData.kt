package br.com.exemplo.termoguia.data

import br.com.exemplo.termoguia.model.Refugio
import br.com.exemplo.termoguia.model.RefugiosCategory

val refugiosList = listOf(
    Refugio(
        name = "UBS Central de Atendimento",
        categories = listOf(RefugiosCategory.UBS),
        address = "Rua das Palmeiras, 120",
        temperaturePerceived = 36.5,
        imageUrl = "https://images.unsplash.com/photo-1584515979956-d9f6e5d09982?auto=format&fit=crop&w=600&q=80",
        featured = true
    ),
    Refugio(
        name = "Biblioteca Municipal Mário de Andrade",
        categories = listOf(RefugiosCategory.BIBLIOTECA, RefugiosCategory.COMERCIO),
        address = "Av. São João, 500",
        temperaturePerceived = 34.0,
        imageUrl = "https://images.unsplash.com/photo-1521587760476-6c12a4b040da?auto=format&fit=crop&w=600&q=80",
        featured = true
    ),
    Refugio(
        name = "Praça da Árvore com Bebedouro",
        categories = listOf(RefugiosCategory.PRACA),
        address = "Praça da Sé, s/n",
        temperaturePerceived = 38.2,
        imageUrl = "https://images.unsplash.com/photo-1519331379826-f10be5486c6f?auto=format&fit=crop&w=600&q=80"
    ),
    Refugio(
        name = "Farmácia Popular Bem-Estar",
        categories = listOf(RefugiosCategory.COMERCIO),
        address = "Rua Direita, 85",
        temperaturePerceived = 35.8,
        imageUrl = "https://images.unsplash.com/photo-1576091160399-112ba8d25d1d?auto=format&fit=crop&w=600&q=80",
        featured = true
    ),
    Refugio(
        name = "UBS Vila Nova",
        categories = listOf(RefugiosCategory.UBS),
        address = "Alameda dos Anjos, 300",
        temperaturePerceived = 37.0,
        imageUrl = "https://images.unsplash.com/photo-1519494026892-80bbd2d6fd0d?auto=format&fit=crop&w=600&q=80"
    ),
    Refugio(
        name = "Praça Central com Sombra Densa",
        categories = listOf(RefugiosCategory.PRACA),
        address = "Praça da Matriz, 10",
        temperaturePerceived = 35.1,
        imageUrl = "https://images.unsplash.com/photo-1470071459604-3b5ec3a7fe05?auto=format&fit=crop&w=600&q=80",
        featured = true
    )
)

