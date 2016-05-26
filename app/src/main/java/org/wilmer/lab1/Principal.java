package org.wilmer.lab1;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    private EditText txtpedir;
    private Button btnpedir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtpedir= (EditText) findViewById(R.id.txtpedir);
        btnpedir= (Button) findViewById(R.id.btnpedir);

        btnpedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Snackbar.make(v,"Click en boton pedido", Snackbar.LENGTH_SHORT).show();

                Intent intent=new Intent(Principal.this,Factura.class);
                intent.putExtra("pedido", txtpedir.getText().toString());
                startActivity(intent);
            }
        });

    }
}
