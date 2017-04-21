package com.example.wassim.akher_karar;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
//import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
//import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Intent intent = new Intent(this, MainActivity.class);
    private MainActivity loadingScreen;
    Button bour1;
    Button bour2;
    Button bour3;
    Button bour4;
    int ans; //a variable that will be used to identify the answer gived by the users
    //TextView test = (TextView) findViewById(R.id.test);
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView err = (TextView) findViewById(R.id.numq);
        err.setGravity(Gravity.CENTER);
        err.setTextColor(Color.RED);
        err.setText("السؤال رقم 1");
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       /* String tabq[]=new String[5];
        tabq[0]="ماأسم آخر سوره نزلت في مكه ؟";
        tabq[1]="ماهو النهر الوحيد في العالم ينبع من الجنوب إلى الشمال ؟";
                tabq[2]=" ماأسم عاصمه كازاخستان ؟";
                        tabq[3]="كم دولة عربية عملتها الريال ؟";
                                tabq[4]=" من هي الدوله التي أستضافت كاس العالم لعام 1998 ؟";
        String tabr[]=new String[20];
                tabr[0]="العاديات";
                tabr[1]="الروم";//reponse correcte
                tabr[2]="التوبة";
                tabr[3]="الإنسان";

        tabr[4]="الفرات";
        tabr[5]="دجلة";
        tabr[6]="العاصي";
        tabr[7]="النيل";//reponse correcte

        tabr[8]="كاساخستان";
        tabr[9]="جيبوتي";
        tabr[10]="المآتا";
        tabr[11]="استانا";//reponse correcte

        tabr[12]="4";//reponse correcte
        tabr[13]="5";
        tabr[14]="6";
        tabr[15]="7";

        tabr[16]="ألمانيا";
        tabr[17]=" فرنسا";//reponse correcte
        tabr[18]="البرازيل";
        tabr[19]="أنقلترا";
*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<String> lisq = new ArrayList<>();  //declaration du liste des questions
        lisq.add(0, "ماأسم آخر سوره نزلت في مكه ؟");
        lisq.add(1, "ماهو النهر الوحيد في العالم ينبع من الجنوب إلى الشمال ؟");
        lisq.add(2, " ماأسم عاصمه كازاخستان ؟");
        lisq.add(3, "كم دولة عربية عملتها الريال ؟");
        lisq.add(4, " من هي الدوله التي أستضافت كاس العالم لعام 1998 ؟");
        List<String> lisr = new ArrayList<>();
        lisr.add(0, "العاديات");
        lisr.add(1, "الروم");//reponse correcte
        lisr.add(2, "التوبة");
        lisr.add(3, "الإنسان");

        lisr.add(4, "الفرات");
        lisr.add(5, "دجلة");
        lisr.add(6, "العاصي");
        lisr.add(7, "النيل");//reponse correcte

        lisr.add(8, "كاساخستان");
        lisr.add(9, "جيبوتي");
        lisr.add(10, "المآتا");
        lisr.add(11, "استانا");//reponse correcte

        lisr.add(12, "4");//reponse correcte
        lisr.add(13, "5");
        lisr.add(14, "6");
        lisr.add(15, "7");

        lisr.add(16, "ألمانيا");
        lisr.add(17, " فرنسا");//reponse correcte
        lisr.add(18, "البرازيل");
        lisr.add(19, "أنقلترا");
        int numq, numr;
        numq = 0;
        numr = 0;
        TextView test = (TextView) findViewById(R.id.test);
        TextView que = (TextView) findViewById(R.id.que);
        que.setGravity(Gravity.CENTER);
        que.setTextColor(Color.BLUE);
        //que.setText(tabq[0]);
        que.setText(lisq.get(0));
        bour1 = (Button) findViewById(R.id.rep1);
        bour1.setText(lisr.get(numr));
        // bour1.setText(tabr[0]);
        bour2 = (Button) findViewById(R.id.rep2);
        bour2.setText(lisr.get(numr + 1));
        // bour2.setText(tabr[1]);
        bour3 = (Button) findViewById(R.id.rep3);
        bour3.setText(lisr.get(numr + 2));
        // bour3.setText(tabr[2]);
        bour4 = (Button) findViewById(R.id.rep4);
        bour4.setText(lisr.get(numr + 3));
       // TextView testView = (TextView) findViewById(R.id.test);
    }
    public void onClick(View v) {
        TextView testView = (TextView) findViewById(R.id.test);
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.rep1:
               ans=1;
                //inactivate the others buttons
                bour2.setEnabled(false);
                bour3.setEnabled(false);
                bour4.setEnabled(false);
                //testView.setText("mrigel 1");
                //Toast.makeText(MainActivity.this,"button1", 1000).show();
                break;
            case R.id.rep2:
                ans=2;
                //inactivate the others buttons
                bour1.setEnabled(false);
                bour3.setEnabled(false);
                bour4.setEnabled(false);
                //testView.setText("mrigel 2");
                //Toast.makeText(MainActivity.this,"button2", 1000).show();
                break;
            case R.id.rep3:
               ans=3;
                //inactivate the others buttons
                bour1.setEnabled(false);
                bour2.setEnabled(false);
                bour4.setEnabled(false);
                //testView.setText("mrigel 3");
                //Toast.makeText(MainActivity.this,"button3", 1000).show();
                break;
            case R.id.rep4:
                ans=4;
                //inactivate the others buttons
                bour1.setEnabled(false);
                bour2.setEnabled(false);
                bour3.setEnabled(false);
                //testView.setText("mrigel 4");
                 break;
       /*  if (ans==2){
            // bour2.setBackgroundColor(Color.GREEN);
             //bour1.setBackgroundColor(Color.WHITE);
             //bour2.setTextColor(Color.BLACK);
         }*/
        }
        if (ans==2) {

            bour2.setBackgroundColor(Color.GREEN);
            Toast.makeText(getApplicationContext(),"اجابة صحيحة",Toast.LENGTH_LONG).show();
            
           // Toast.makeText(Context,"ijaba s7i7a", 1000);
            //bour1.setBackgroundColor(Color.WHITE);
          //bour2.setTextColor(Color.BLACK);

    }else{
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setCancelable(false);
            dialog.setTitle("Game Over");
            dialog.setMessage("you lose ... do you want to replay" );
            dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                  //  Intent myIntent1 = new Intent(getApplicationContext(), MainActivity.class);
                //    MainActivity.this.startActivities(myIntent1);
                   // startActivity(intent);

                    finish();
                    startActivity(getIntent());
                }
            })
                    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent myIntent1 = new Intent(getApplicationContext(), MainActivity.class);
                            System.exit(0);
                        }
                    });

            final AlertDialog alert = dialog.create();
            alert.show();
        }

}


        ;



}
