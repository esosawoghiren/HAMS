package com.example.hams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeMenu extends AppCompatActivity {
    private Button button_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu2);
        button_signup=findViewById(R.id.Signup);
        button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegisterpage();
            }
        });

    }

    public void openRegisterpage(){
        Intent intent= new Intent (this, RegisterMenuFragment.class);
        startActivity(intent);
    }
}
