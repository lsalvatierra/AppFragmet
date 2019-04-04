package com.example.luisangel.appfragmet;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Fragment_1.OnFragmentInteractionListener, Fragment_2.OnFragmentInteractionListener {

    private Button btnFrag1 , btnFrag2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Fragment_1 fr_1 = new Fragment_1();

        getSupportFragmentManager().beginTransaction().add(R.id.flcontenedor, fr_1);

        btnFrag1 = (Button)findViewById(R.id.btnFragment1);
        btnFrag2 = (Button)findViewById(R.id.btnFragment2);


        btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_1 frag_1 = new Fragment_1();
                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.flcontenedor, frag_1);
                trans.commit();

            }
        });

        btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_2 frag_2 = new Fragment_2();
                FragmentTransaction trans = getSupportFragmentManager().beginTransaction();
                trans.replace(R.id.flcontenedor, frag_2);
                trans.commit();
            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
