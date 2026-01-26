package com.team3.mygquestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.team3.mygquestapp.navigation.AppNavigation
import com.team3.mygquestapp.theme.AppTheme
import com.google.firebase.FirebaseApp  // Firebase initializes automatically when you add google-services.json
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize Firebase Analytics
        firebaseAnalytics = Firebase.analytics

        // Log an event to test
        val bundle = Bundle()
        bundle.putString("test_event", "firebase_setup_complete")
        firebaseAnalytics.logEvent("setup_test", bundle)
    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                AppNavigation()
            }
        }
    }
}