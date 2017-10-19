package com.example.aluno.exercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button calcularButton;
    private EditText gasolinaField;
    private EditText alcoolField;
    private TextView resultadoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onSaveInstanceState(savedInstanceState);
        calcularButton = (Button) findViewById(R.id.calcular_button);
        gasolinaField = (EditText) findViewById(R.id.gasolina_field);
        alcoolField = (EditText) findViewById(R.id.alcool_field);
        resultadoText = (TextView) findViewById(R.id.info_view);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valorGasolina = Double.parseDouble(gasolinaField.getText().toString());
                double valorAlcool = Double.parseDouble(alcoolField.getText().toString());

                if((valorAlcool/valorGasolina) < 0.7)
                {
                    resultadoText.setText("A melhor opção é: é Ácool");
                }
                else
                {
                    resultadoText.setText("A melhor opção é: Gasolina");
                }
            }
        });
    }
}
