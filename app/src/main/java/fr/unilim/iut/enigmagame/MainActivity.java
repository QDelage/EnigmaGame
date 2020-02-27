package fr.unilim.iut.enigmagame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bouton;
    TextView question;
    EditText saisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton = (Button) findViewById(R.id.bouton);
        question = (TextView) findViewById(R.id.question);
        saisie = (EditText) findViewById(R.id.saisie);

        bouton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if ("Jonathan".equals(saisie.getText().toString())){
                    question.setText("BRAVO !");
                }
            }
        });

    }
}
