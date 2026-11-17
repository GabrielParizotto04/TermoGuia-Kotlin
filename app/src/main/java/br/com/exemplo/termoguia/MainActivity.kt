package br.com.exemplo.termoguia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.exemplo.termoguia.ui.screens.HomeScreen
import br.com.exemplo.termoguia.ui.theme.TermoGuiaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TermoGuiaTheme {
                HomeScreen()
            }
        }
    }
}