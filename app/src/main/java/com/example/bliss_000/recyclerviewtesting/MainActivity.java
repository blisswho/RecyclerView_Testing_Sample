package com.example.bliss_000.recyclerviewtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ArrayList<Post> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rvPosts);

        posts = Post.createPostsList();

        PostsAdapter adapter = new PostsAdapter(this, posts);

        rv.setAdapter(adapter);

        rv.setLayoutManager(new LinearLayoutManager(this));

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("MMM-dd-yyyy");
        String formattedDate = df.format(c.getTime());

        Log.i("tag", "Formatted time => " + formattedDate);
    }
}
