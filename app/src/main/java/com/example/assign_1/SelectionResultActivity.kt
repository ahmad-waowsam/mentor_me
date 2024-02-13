import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assign_1.R

class SelectionResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_result)

        val selectedCountry = intent.getStringExtra("selectedCountry")

        val resultTextView: TextView = findViewById(R.id.resultTextView)
        resultTextView.text = "Selected Country: $selectedCountry"
    }
}
