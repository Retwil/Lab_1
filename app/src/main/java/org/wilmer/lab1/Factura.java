package org.wilmer.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Factura extends AppCompatActivity {

    private TextView txtpedidos, txttotal;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txtpedidos=(TextView) findViewById(R.id.txtpedidos);
        txttotal=(TextView) findViewById(R.id.txttotal);
        btnRegresar=(Button) findViewById(R.id.btnRegresar);

        Bundle bundle=this.getIntent().getExtras();
        txtpedidos.setText(bundle.getString("pedido").toString());
        Double total= Double.parseDouble(bundle.getString("pedido"))*7.50;
        txttotal.setText(total.toString());


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Factura.this, Principal.class));
            }
        });
    }
}
