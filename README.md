# TermoGuia ️ — Alertas e Rotas de Refúgio contra Ondas de Calor

##  Sobre o Projeto
O **TermoGuia** é um aplicativo desenvolvido em Android com Jetpack Compose para auxiliar idosos, pessoas com doenças crônicas e a comunidade a encontrarem locais de refúgio (UBS, bibliotecas, praças com sombra e comércios parceiros) e rotas seguras durante ondas de calor extremo nos bairros.

##  Tema da Global Solution (CitizenTech)
O projeto conecta-se aos Objetivos de Desenvolvimento Sustentável (ODS):
- **ODS 3:** Saúde e bem-estar (redução de riscos do calor extremo).
- **ODS 10:** Redução das desigualdades (foco em populações vulneráveis).
- **ODS 11:** Cidades e comunidades sustentáveis.

##  Principais Funcionalidades
- **Lista vertical de refúgios:** Exibição dinâmica de locais de apoio com imagem, endereço, categorias e temperatura percebida.
- **Seletor horizontal de categorias:** Filtro rápido por categorias de refúgio utilizando `enum class` e `FilterChip`.
- **Destaques da comunidade:** Seção horizontal em destaque para os locais mais críticos ou prioritários.
- **Repositório em memória:** Dados centralizados estruturados em classes de modelo Kotlin.

##  Arquitetura e Organização de Pacotes
- `model/`: Contém as classes de dados (`Refugio`) e enumerações (`RefugiosCategory`).
- `data/`: Repositório de dados em memória (`RefugioData.kt`).
- `ui/components/`: Componentes reutilizáveis (`RefugioListItem`, `CategorySelector`, `FeaturedRefugiosSection`).
- `ui/screens/`: Telas principais (`HomeScreen.kt`).

##  Integrantes do Grupo
- **RM 560551** - Gabriel Imperio Parizotto
- **RM 559931** - Gabriel Matos Marques Rosa