package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setAdapterSetting();
    }


    public static List<Fibonacci> generateNumbers () {
        List<Fibonacci> list = new ArrayList<>();
        BigInteger first = new BigInteger("1");
        BigInteger second = new BigInteger("1");
        BigInteger third;
        Fibonacci current = new Fibonacci();
        current.id = 1;
        current.number = Integer.toString(1);
        list.add(current);
        current = new Fibonacci();
        current.id = 2;
        current.number = Integer.toString(1);
        list.add(current);

        for (int i = 3; i <= 1000; i++){
            current = new Fibonacci();
            current.id = i;
            third = first.add(second);
            first = second;
            second = third;
            current.number = third.toString();
            list.add(current);
        }
        return list;
    }

    private void setAdapterSetting() {
        recyclerView =findViewById(R.id.layoutRecycler);
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager.
        layoutManager = new LinearLayoutManager(this);
        mAdapter = new RecyclerAdapter(this, generateNumbers());
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}