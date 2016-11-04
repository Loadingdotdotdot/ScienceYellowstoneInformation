package com.afhs.srinath.scienceyellowstoneinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YellowstoneInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellowstone_information);

        Button goToGeneralInfo = (Button) findViewById(R.id.button);
        goToGeneralInfo.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view){
                Intent generalInfoIntent = new Intent(YellowstoneInformation.this, GeneralInformation.class);
                startActivity(generalInfoIntent);
            }

        }

        );

        Button goToHistory = (Button) findViewById(R.id.button2);
        goToHistory.setOnClickListener(new View.OnClickListener(){


                                        public void onClick(View view) {
                                            Intent goToHistory = new Intent(YellowstoneInformation.this, History.class);
                                            startActivity(goToHistory);
                                        }
                                    }

        );

        Button goToVolcanicActivity = (Button) findViewById(R.id.button3);
        goToVolcanicActivity.setOnClickListener(new View.OnClickListener(){


                                        public void onClick(View view) {
                                            Intent goToVolcanicActivity = new Intent(YellowstoneInformation.this, VolcanicActivity.class);
                                            startActivity(goToVolcanicActivity);
                                        }
                                    }
        );
        Button goToScources = (Button) findViewById(R.id.button7);
        goToScources.setOnClickListener(new View.OnClickListener(){


            public void onClick(View view) {
                Intent goToScources = new Intent(YellowstoneInformation.this, Scources.class);
                startActivity(goToScources);


                                        }
                                     }
        );

        Button goToEruptions = (Button) findViewById(R.id.button10);
        goToEruptions.setOnClickListener(new View.OnClickListener(){


                                               public void onClick(View view){
                                                   Intent Eruptions = new Intent(YellowstoneInformation.this, Eruptions.class);
                                                   startActivity(Eruptions);
                                               }

                                           }

        );
    }
}
