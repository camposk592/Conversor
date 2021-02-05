package com.ugb.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TabHost tbhConversores;
    Button btnConvertir;
    TextView tempVal;
    Spinner spnOpcionDe, spnOpcionA;
    conversores miConversor = new conversores();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbhConversores = findViewById(R.id.tbhConversores);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Monedas").setContent(R.id.M).setIndicator("M"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.L).setIndicator("L"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Masa").setContent(R.id.Ma).setIndicator("P"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Almacenamiento").setContent(R.id.A).setIndicator("A"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Tiempo").setContent(R.id.T).setIndicator("T"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Temperatura").setContent(R.id.Tª).setIndicator("Tª"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Volumen").setContent(R.id.V).setIndicator("V"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Area").setContent(R.id.Ar).setIndicator("Ar"));

        btnConvertir = findViewById(R.id.btnCalcular);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal = (TextView)findViewById(R.id.txtcantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                spnOpcionDe = findViewById(R.id.cboDe);
                spnOpcionA = findViewById(R.id.cboA);

                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText( "Respuesta: "+ miConversor.convertir(0, spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(), cantidad) );
            }
        });

    }
}

class conversores{
    double[][] conversor = {
        {1.0,8.75,7.77, 24.03,34.8,611.10},/*Monedas*/
        {1.0},/*Longitud*/
            {1.0}/*Masa*/
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return conversor[opcion][a] / conversor[opcion][de] * cantidad;
    }
}