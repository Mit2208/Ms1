package com.example.ms1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity

{
    Button btn_1;
    EditText edt_2;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        edt_2=findViewById(R.id.edt_2);
        btn_1=findViewById(R.id.btn_1);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                name=edt_2.getText().toString();
                 Intent intent=new Intent(LoginActivity.this, HomeActivity.class);
                intent.putExtra("text","name");
                  startActivity(intent);
            }
        });
    }
    private void Body(){
        String name;
        name=edt_2.getText().toString();

    }
}