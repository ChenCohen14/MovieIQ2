package com.example.win10.movie_iq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class QuestionsActivity extends AppCompatActivity {
    private GridLayout questionsActivityGrid;
    private ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        Intent intent = getIntent();

        questions = (ArrayList<Question>) intent.getSerializableExtra("questions");
        questionsActivityGrid = findViewById(R.id.questionsActivityGrid);

        questionsActivityGrid.setColumnCount(0);
        questionsActivityGrid.setRowCount(questions.size());

        for (int i = 0; i < questions.size(); i++){
            questionsActivityGrid.addView(new Button(this));
        }


    }
}
