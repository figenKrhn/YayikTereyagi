package com.yayiktereyagi.www.yayiktereyagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.yayiktereyagi.www.yayiktereyagi.model.GoruntulenenSiparis;
import com.yayiktereyagi.www.yayiktereyagi.model.Siparis;

import java.util.List;

public class SiparisGoruntuleActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private List<Siparis> siparisList;
    FirebaseDatabase db;

    SiparisAdapter fa = new SiparisAdapter(siparisList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siparis_goruntule);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);

        db = FirebaseDatabase.getInstance();


        SiparisAdapter fa = new SiparisAdapter(siparisList);
        recyclerView.setAdapter(fa);
    }
    public void katitlariGetir(){

        DatabaseReference dbGelebler=db.getReference("Siparisler");
        dbGelebler.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               for (DataSnapshot gelenler:dataSnapshot.getChildren()){

               }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}

