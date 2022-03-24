package com.example.lab6mc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<contactModel>arrContacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrContacts.add(new contactModel(R.drawable.la,"Linear Algebra","1-april-2022"));
        arrContacts.add(new contactModel(R.drawable.mc,"Mobile Computing","2-april-2022"));
        arrContacts.add(new contactModel(R.drawable.oop,"Operating System","3-april-2022"));
        arrContacts.add(new contactModel(R.drawable.oooop,"Object Oriented Programming","4-april-2022"));
        arrContacts.add(new contactModel(R.drawable.pp,"Professional Practices","5-april-2022"));
        arrContacts.add(new contactModel(R.drawable.ps,"Probility","6-april-2022"));
        arrContacts.add(new contactModel(R.drawable.english,"English","7-april-2022"));
        arrContacts.add(new contactModel(R.drawable.physices,"Physices","9-april-2022"));
        arrContacts.add(new contactModel(R.drawable.bio,"Biology","10-april-2022"));
        arrContacts.add(new contactModel(R.drawable.chemistry,"Chemistry","13-april-2022"));
        arrContacts.add(new contactModel(R.drawable.eco,"Economics","17-april-2022"));
        arrContacts.add(new contactModel(R.drawable.pak,"Pakistan Studies","19-april-2022"));




        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}