package com.example.farmer_portalnew.PaymentMethod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.farmer_portalnew.R;

public class PaymentsMethod extends AppCompatActivity {
   Button debit,paytmpay,cash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payments_method);
        paytmpay=findViewById(R.id.paytmpay);
        cash=findViewById(R.id.cash);
        debit=findViewById(R.id.credit);
        debit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentsMethod.this,creditcard.class);
                startActivity(intent);
            }
        });
    }
}
