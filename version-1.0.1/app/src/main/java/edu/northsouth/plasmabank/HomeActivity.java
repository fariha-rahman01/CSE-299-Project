package edu.northsouth.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    private TextView mTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mTest = findViewById(R.id.tv_test);

        mTest.setText(FirebaseAuth.getInstance().getCurrentUser().getPhoneNumber());
    }
}