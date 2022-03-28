package com.example.todolist;
/*Xaver Zak*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Druha_Aktivita extends AppCompatActivity {

    Button button_potvrdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druha_aktivita);

        EditText editText = (EditText) findViewById(R.id.editText_todo);

        button_potvrdit = findViewById(R.id.button_potvrdit);
        button_potvrdit.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            String data = editText.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("STRING_DATA",data);
            intent.putExtras(bundle);
            setResult(RESULT_OK,intent);
            finish();
        });

    }

}