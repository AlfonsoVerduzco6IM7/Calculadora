package ipn.a6im7.alfonsoverduzco.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText pant;
    public double operacion1, operacion2, res;
    int ope;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(EditText)findViewById(R.id.caja);
    }

    public void b1(View v){
        String captura=pant.getText().toString();
        captura=captura+"1";
        pant.setText(captura);
    }
    public void b2(View v){
        String captura=pant.getText().toString();
        captura=captura+"2";
        pant.setText(captura);
    }
    public void b3(View v){
        String captura=pant.getText().toString();
        captura=captura+"3";
        pant.setText(captura);
    }
    public void b4(View v){
        String captura=pant.getText().toString();
        captura=captura+"4";
        pant.setText(captura);
    }
    public void b5(View v){
        String captura=pant.getText().toString();
        captura=captura+"5";
        pant.setText(captura);
    }
    public void b6(View v){
        String captura=pant.getText().toString();
        captura=captura+"6";
        pant.setText(captura);
    }
    public void b7(View v){
        String captura=pant.getText().toString();
        captura=captura+"7";
        pant.setText(captura);
    }
    public void b8(View v){
        String captura=pant.getText().toString();
        captura=captura+"8";
        pant.setText(captura);
    }
    public void b9(View v){
        String captura=pant.getText().toString();
        captura=captura+"9";
        pant.setText(captura);
    }
    public void b0(View v){
        String captura=pant.getText().toString();
        captura=captura+"0";
        pant.setText(captura);
    }
    public void bpt(View v){
        String captura=pant.getText().toString();
        captura=captura+".";
        pant.setText(captura);
    }


    public void suma (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=1;
    }
    public void resta (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=3;
    }
    public void division (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=4;
    }
    public void potencia (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("");
        ope=5;
    }
    public void raiz (View v){
        try{
            String auxiliar= pant.getText().toString();
            operacion1=Double.parseDouble(auxiliar);
        }catch(NumberFormatException nfe){}
        pant.setText("√ ("+operacion1+")");
        ope=6;
    }

    public void igual (View v) {
        try {
            String auxiliar2 = pant.getText().toString();
            operacion2 = Double.parseDouble(auxiliar2);
        } catch (NumberFormatException nfe) {
        }
        pant.setText("");


        if (ope == 1) {
            res = operacion1 + operacion2;
        } else if (ope == 2) {
            res = operacion1 - operacion2;
        } else if (ope == 3) {
            res = operacion1 * operacion2;
        } else if (ope == 4) {
            if (operacion2 == 0) {
                Toast toast1 = Toast.makeText(getApplicationContext(),
                                "ERROR", Toast.LENGTH_SHORT);
                toast1.show();
            } else {
                res = operacion1 / operacion2;
            }
        } else if (ope == 5) {
            res = Math.pow(operacion1, operacion2);
        } else if (ope == 6) {
            res = Math.sqrt(operacion1);
        }
        pant.setText("" + res);
        operacion1 = res;

    }

    public void clear(View v){
        pant.setText("");
        operacion1=0.0;
        operacion2=0.0;
        res=0.0;
    }

}
