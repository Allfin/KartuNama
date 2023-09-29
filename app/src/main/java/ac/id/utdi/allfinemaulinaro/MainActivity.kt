package ac.id.utdi.allfinemaulinaro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ac.id.utdi.allfinemaulinaro.ui.theme.KartuNamaTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCard(TextCard("+081364329173", "@allfine99", "maulinaro@yahoo.com"))
                }
            }
        }
    }
}

data class TextCard(val phoneNumber: String, val socialMedia: String,val email: String)

@Composable
fun NameCard(txt: TextCard) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()){
        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "Contact profile picture",
        )
            Row{
                Column{
                    Text(txt.phoneNumber)
                    Text(txt.socialMedia)
                    Text(txt.email)
                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KartuNamaTheme {
        NameCard(TextCard("+081364329173", "@allfine99", "maulinaro@yahoo.com"))
    }
}