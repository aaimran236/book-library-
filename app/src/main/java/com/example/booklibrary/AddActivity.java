package com.example.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText title_input,author_input,pages_input;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        title_input=findViewById(R.id.title_input);
        author_input=findViewById(R.id.author_input);
        pages_input=findViewById(R.id.pages_input);
        button=findViewById(R.id.addButtonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title,author,pages;
                title=title_input.getText().toString().trim();
                author=author_input.getText().toString().trim();
                pages=pages_input.getText().toString().trim();

                if (title.isEmpty() || author.isEmpty() || pages.isEmpty()){
                    Toast.makeText(AddActivity.this, "Fields can not be empty", Toast.LENGTH_SHORT).show();
                }else{
                    DatabaseHelper databaseHelper=new DatabaseHelper(AddActivity.this);
                    databaseHelper.addBook(title,
                            author,Integer.parseInt(pages));
                    button.setEnabled(false);
                    Intent intent=new Intent(AddActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}