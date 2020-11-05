package edu.cs.birzeit.task5_ee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtMessage;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMessage=findViewById(R.id.txtMessage);
        btnSend=findViewById(R.id.btnSend);

    }


    public void OnClickSend(View view) {
        String msg= txtMessage.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("data",msg);
        startActivity(intent);


    }

    public void btnsend2OnClick(View view) {
        Intent intent2 = new Intent(Intent.ACTION_SEND);
        intent2.putExtra(Intent.EXTRA_TEXT,"This is a sample message ");
        intent2.putExtra(Intent.EXTRA_SUBJECT,"hello there");
        intent2.setType("text/plain");

        Intent chooser=Intent.createChooser(intent2,null);
        startActivity(chooser);
    }
}