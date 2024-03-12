package kotltin.test.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logged_activity)

        // Получаем данные из Intent
        val username = intent.getStringExtra("USERNAME")
        val password = intent.getStringExtra("PASSWORD")

        // Находим TextView в макете
        val usernameTextView: TextView = findViewById(R.id.usernameTextView)
        val passwordTextView: TextView = findViewById(R.id.passwordTextView)

        // Устанавливаем полученные данные в TextView
        usernameTextView.text = "Username: $username"
        passwordTextView.text = "Password: $password"

        val backButton: Button = findViewById(R.id.button)

        backButton.setOnClickListener {
            val intent = Intent()
            intent.putExtra("CLEARED_USERNAME", "")
            intent.putExtra("CLEARED_PASSWORD", "")
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}