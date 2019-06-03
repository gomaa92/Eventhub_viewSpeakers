package com.example.viewspkears;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class ViewSpeakers extends AppCompatActivity {

    String names[] = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name7"};
    String titles[] = {"title 1", "title 2", "title 3", "title 4", "title 5", "title 6", "title 7", "title 8"};
    int images[] = {R.drawable.messi, R.drawable.ronaldo, R.drawable.messi, R.drawable.treka,
            R.drawable.grizmann, R.drawable.nymar, R.drawable.pogba, R.drawable.terstegen};

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(ViewSpeakers.this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(ViewSpeakers.this, names, titles, images);
        recyclerView.setAdapter(adapter);
    }
}
