package com.ksasanka.coronaautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.url);
        Button button = findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().length() > 0){
                    Intent i = new Intent(MainActivity.this, WebActivity.class);
                    i.putExtra("url", editText.getText().toString());
                    startActivity(i);
//                    finish();
                }else{
                    Toast.makeText(view.getContext(), "Enter a proper IP", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
