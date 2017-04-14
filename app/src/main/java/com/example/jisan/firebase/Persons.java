package com.example.jisan.firebase;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Persons extends AppCompatActivity {

    LinearLayoutManager mLinearLayoutManager;
    FirebaseRecyclerAdapter<Info, InfoViewHolder> mFirebaseAdapter;
    DatabaseReference reference;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persons);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        Toast.makeText(this,"Please wait while the data is loading..",Toast.LENGTH_SHORT).show();
        reference = FirebaseDatabase.getInstance().getReference();

        mLinearLayoutManager= new LinearLayoutManager(this);

        mFirebaseAdapter=new FirebaseRecyclerAdapter<Info, InfoViewHolder>(
                Info.class,R.layout.recycler_row,
                InfoViewHolder.class,
                reference.child("people")
        ) {
            @Override
            protected void populateViewHolder(InfoViewHolder viewHolder, Info model, int position) {
                viewHolder.nameTextView.setText(model.getName());
                viewHolder.idTextView.setText(model.getId());
            }
        };
        recyclerView.setLayoutManager(mLinearLayoutManager);
        recyclerView.setAdapter(mFirebaseAdapter);
    }
}
