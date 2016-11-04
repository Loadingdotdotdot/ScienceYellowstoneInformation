package com.afhs.srinath.scienceyellowstoneinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GeneralInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_information);

        Button goToMain = (Button) findViewById(R.id.button4);
        goToMain.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view) {
                Intent goToMain = new Intent(GeneralInformation.this, YellowstoneInformation.class);
                startActivity(goToMain);
            }
        }

        );

    }
}
