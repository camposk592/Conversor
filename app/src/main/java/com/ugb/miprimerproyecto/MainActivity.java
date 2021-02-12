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
import android.widget.Toast;

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
                try {
                    tempVal = (TextView)findViewById(R.id.txtcantidad);
                    double cantidad = Double.parseDouble(tempVal.getText().toString());

                    spnOpcionDe = findViewById(R.id.cboDe);
                    spnOpcionA = findViewById(R.id.cboA);

                    tempVal = findViewById(R.id.lblRespuesta);
                    tempVal.setText( "Respuesta: "+ miConversor.convertir(0, spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(), cantidad) );
                }catch (Exception e){
                    tempVal = findViewById(R.id.lblRespuesta);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }

            }

        });
        /*Calcular Longuitud*/
        btnConvertir = findViewById(R.id.btnCalcular2);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtCantidad2);
                    double cantidad=Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista2);
                    spnOpcionA=findViewById(R.id.cbo2);
                    tempVal = findViewById(R.id.lblRespuesta2);
                    tempVal.setText("Respuesta" + miConversor.convertir(1,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad ));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta2);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Porfavor ingrese algun valor",Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Masa*/
        btnConvertir = findViewById(R.id.btnCalcular3);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad3);
                    double cantidad=Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe = findViewById(R.id.lista3);
                    spnOpcionA = findViewById(R.id.lista3_1);
                    tempVal = findViewById(R.id.lblRespuesta3);
                    tempVal.setText("Respuesta" + miConversor.convertir(2,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta3);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Almacenamiento*/
        btnConvertir = findViewById(R.id.btnCalcular4);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad4);
                    double cantidad= Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista4);
                    spnOpcionA=findViewById(R.id.lista4_1);
                    tempVal = findViewById(R.id.lblRespuesta4);
                    tempVal.setText("Respuesta" + miConversor.convertir(3,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta4);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Tiempo*/
        btnConvertir = findViewById(R.id.btnCalcular5);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad5);
                    double cantidad= Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista5);
                    spnOpcionA=findViewById(R.id.lista5_1);
                    tempVal = findViewById(R.id.lblRespuesta5);
                    tempVal.setText("Respuesta" + miConversor.convertir(4,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta5);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Temperatura*/
        btnConvertir = findViewById(R.id.btnCalcular6);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad6);
                    double cantidad= Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista6);
                    spnOpcionA=findViewById(R.id.lista6_1);
                    tempVal = findViewById(R.id.lblRespuesta6);
                    tempVal.setText("Respuesta" + miConversor.convertir(5,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta6);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Volumen*/
        btnConvertir = findViewById(R.id.btnCalcular7);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad7);
                    double cantidad= Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista7);
                    spnOpcionA=findViewById(R.id.lista7_1);
                    tempVal = findViewById(R.id.lblRespuesta7);
                    tempVal.setText("Respuesta" + miConversor.convertir(6,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta7);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*Calcular Area*/
        btnConvertir = findViewById(R.id.btnCalcular8);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = findViewById(R.id.txtcantidad8);
                    double cantidad= Double.parseDouble(tempVal.getText().toString());
                    spnOpcionDe=findViewById(R.id.lista8);
                    spnOpcionA=findViewById(R.id.lista8_1);
                    tempVal = findViewById(R.id.lblRespuesta8);
                    tempVal.setText("Respuesta" + miConversor.convertir(7,spnOpcionDe.getSelectedItemPosition(),spnOpcionA.getSelectedItemPosition(),cantidad));
                }catch(Exception e){
                    tempVal = findViewById(R.id.lblRespuesta8);
                    tempVal.setText("Por favor ingrese algun valor correspondiente");
                    Toast.makeText(getApplicationContext(),"Por Favor ingrese algun valor" ,Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }
}

class conversores{
    double[][] conversor = {
        {1.0,8.75,7.77, 24.03,34.8,105.0,0.72,20.04,1.27,8.32},/*Monedas*/
        {1.0,100.0,1000.0,39.37008,3.28084,0.001,1.093613,0.000621,0.00054,1000000000.0},/*Longitud*/
            {1.0,0.453592,2267.962,0.000454,453.5924,16.0,45.35924,4535.924,0.071429,4.535924},/*Masa*/
            {1.0,0.125,0.000125,0.000000125,0.000000000125,0.000000000000125,1.250000e-16,1.250000e-19,1.250000e-22,1.250000e-25},/*Almacenamiento*/
            {1.0,0.016667,0.000278,0.000012,0.000002,3.8052e-7,0.000000031688088,3.171e-9,3.171e-10,1000},/*Tiempo*/
            {1.0,-272.15,-457.87},/*Temperatura*/
            {1.0,1.0,0.001,0.000001,0.202884,0.004227,0.002113,0.001057,0.000264,0.061024},/*Volumen*/
            {1.0,100.0,247.1054,1000000.0,1195990.0,10000000000.0,1000000000000.0,1550003100.0,10763910.0,0.386102},/*Area*/
    };
    public double convertir(int opcion, int de, int a, double cantidad){
        return conversor[opcion][a] / conversor[opcion][de] * cantidad;
    }
}