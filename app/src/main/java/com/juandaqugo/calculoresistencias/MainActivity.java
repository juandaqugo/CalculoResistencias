package com.juandaqugo.calculoresistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rnegro1,rnegro2, rnegro3, rcafe1, rcafe2, rcafe3, rrojo1, rrojo2, rrojo3;
    RadioButton rnaranja1, rnaranja2, rnaranja3, ramarillo1, ramarillo2, ramarillo3;
    RadioButton rverde1, rverde2, rverde3, razul1, razul2, razul3,rvioleta1, rvioleta2, rvioleta3;
    RadioButton rgris1, rgris2,rblanco1, rblanco2;
    String aux;
    Double resultado;
    TextView tresultado;
    Button bcalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tresultado = (TextView) findViewById(R.id.tresultado);
        bcalcular = (Button) findViewById(R.id.bcalcular);
        rnegro1 = (RadioButton) findViewById(R.id.rnegro1);
        rcafe1 = (RadioButton) findViewById(R.id.rcafe1);
        rrojo1 = (RadioButton) findViewById(R.id.rrojo1);
        rnaranja1 = (RadioButton) findViewById(R.id.rnaranja1);
        ramarillo1 = (RadioButton) findViewById(R.id.ramarillo1);
        razul1 = (RadioButton) findViewById(R.id.razul1);
        rvioleta1 = (RadioButton) findViewById(R.id.rvioleta1);
        rgris1 = (RadioButton) findViewById(R.id.rgris1);
        rblanco1 = (RadioButton) findViewById(R.id.rblanco1);
        rverde1 = (RadioButton) findViewById(R.id.rverde1);
        rnegro2 = (RadioButton) findViewById(R.id.rnegro2);
        rcafe2 = (RadioButton) findViewById(R.id.rcafe2);
        rrojo2 = (RadioButton) findViewById(R.id.rrojo2);
        rnaranja2 = (RadioButton) findViewById(R.id.rnaranja2);
        ramarillo2 = (RadioButton) findViewById(R.id.ramarillo2);
        razul2 = (RadioButton) findViewById(R.id.razul2);
        rvioleta2 = (RadioButton) findViewById(R.id.rvioleta2);
        rgris2 = (RadioButton) findViewById(R.id.rgris2);
        rblanco2 = (RadioButton) findViewById(R.id.rblanco2);
        rverde2 = (RadioButton) findViewById(R.id.rverde2);
        rnegro3 = (RadioButton) findViewById(R.id.rnegro3);
        rcafe3 = (RadioButton) findViewById(R.id.rcafe3);
        rrojo3 = (RadioButton) findViewById(R.id.rrojo3);
        rnaranja3 = (RadioButton) findViewById(R.id.rnaranja3);
        ramarillo3 = (RadioButton) findViewById(R.id.ramarillo3);
        razul3 = (RadioButton) findViewById(R.id.razul3);
        rvioleta3 = (RadioButton) findViewById(R.id.rvioleta3);
        rverde3 = (RadioButton) findViewById(R.id.rverde3);
        bcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rnegro1.isChecked()){
                    aux ="0";
                } else if(rcafe1.isChecked()){
                    aux = "1";
                } else if(rrojo1.isChecked()){
                    aux = "2";
                } else if(rnaranja1.isChecked()){
                    aux = "3";
                } else if(ramarillo1.isChecked()){
                    aux = "4";
                } else if(rverde1.isChecked()){
                    aux = "5";
                } else if(razul1.isChecked()){
                    aux = "6";
                } else if(rvioleta1.isChecked()){
                    aux = "7";
                } else if(rgris1.isChecked()){
                    aux = "8";
                } else if(rblanco1.isChecked()){
                    aux = "9";
                }
                if(rnegro2.isChecked()){
                    aux = aux + "0";
                } else if(rcafe2.isChecked()){
                    aux = aux + "1";
                } else if(rrojo2.isChecked()){
                    aux = aux + "2";
                } else if(rnaranja2.isChecked()){
                    aux = aux + "3";
                } else if(ramarillo2.isChecked()){
                    aux = aux + "4";
                } else if(rverde2.isChecked()){
                    aux = aux + "5";
                } else if(razul2.isChecked()){
                    aux = aux + "6";
                } else if(rvioleta2.isChecked()){
                    aux = aux + "7";
                } else if(rgris2.isChecked()){
                    aux = aux + "8";
                } else if(rblanco2.isChecked()){
                    aux = aux + "9";
                }
                if(rnegro3.isChecked()){
                    resultado = Double.parseDouble(aux) * 1;
                } else if(rcafe3.isChecked()){
                    resultado = Double.parseDouble(aux) * 10;
                } else if(rrojo3.isChecked()){
                    resultado = Double.parseDouble(aux) * 100;
                } else if(rnaranja3.isChecked()){
                    resultado = Double.parseDouble(aux) * 1000;
                } else if(ramarillo3.isChecked()){
                    resultado = Double.parseDouble(aux) * 10000;
                } else if(rverde3.isChecked()){
                    resultado = Double.parseDouble(aux) * 100000;
                } else if(razul3.isChecked()){
                    resultado = Double.parseDouble(aux) * 1000000;
                } else if(rvioleta3.isChecked()){
                    resultado = Double.parseDouble(aux) * 10000000;
                }
                tresultado.setText(String.valueOf(resultado));
            }
        });
    }
}
