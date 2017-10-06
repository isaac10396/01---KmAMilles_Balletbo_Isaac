package edu.upc.eseiaat.pma.balletbo.isaac.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button btn_a_Milles = (Button) findViewById(R.id.btm_a_Milles);
        Button btn_a_Km = (Button) findViewById(R.id.btm_a_Km);*/
        final EditText edit_Km = (EditText) findViewById(R.id.edit_Km);
        final EditText edit_Milles = (EditText) findViewById(R.id.edit_Milles);

        edit_Km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String skm = edit_Km.getText().toString();
                float km = Float.parseFloat(skm);
                float milles = km / 1.609f;
                String smilles = String.format("%f", milles);
                edit_Milles.setText(smilles);

                Log.i("isaac","btn_a_milles clicat!");
            }
        });
        edit_Milles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smilles = edit_Milles.getText().toString();
                float milles = Float.parseFloat(smilles);
                float km = milles * 1.609f;
                String skm = String.format("%f", km);
                edit_Km.setText(skm);

                Log.i("isaac","btn_a_km clicat!");
            }
        });

    }
}
