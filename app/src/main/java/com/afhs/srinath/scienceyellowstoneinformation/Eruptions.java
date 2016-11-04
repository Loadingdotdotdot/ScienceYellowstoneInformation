package com.afhs.srinath.scienceyellowstoneinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Eruptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eruptions);

        Button goToGeneralMain = (Button) findViewById(R.id.button9);
        goToGeneralMain.setOnClickListener(new View.OnClickListener(){


                                               public void onClick(View view){
                                                   Intent generalInfoIntent = new Intent(Eruptions.this, YellowstoneInformation.class);
                                                   startActivity(generalInfoIntent);
                                               }

                                           }

        );
    }
}
