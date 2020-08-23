package edu.northsouth.plasmabank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthenticationActivity extends AppCompatActivity {

    private EditText mPhone;
    private Button mNext;

    String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        mPhone = findViewById(R.id.et_phoneNumber);
        mNext = findViewById(R.id.btn_next);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNumber = mPhone.getText().toString().trim();

                if(phoneValidation(phoneNumber)) {
                    Intent intent = new Intent(AuthenticationActivity.this, VerificationActivity.class);
                    intent.putExtra("phoneNumber", "+88"+phoneNumber);

                    startActivity(intent);
                }

            }
        });
    }

    private boolean phoneValidation(String phoneNumber) {
        if(phoneNumber.length() < 11) {
            mPhone.setError("Invalid");
            return false;
        } else {
            return true;
        }
    }


}