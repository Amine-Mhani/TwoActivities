package mine.ensaj.twoactivities;


import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button send;
    private EditText txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = findViewById(R.id.button_main);

        txtMessage = findViewById(R.id.editText_main);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String msg = txtMessage.getText().toString();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("message", msg);
                startActivity(intent);

                Log.d(TAG, "onClick: test");

                /*Intent intent = new Intent(MainActivity.this, SecondActivity.class);


                startActivity(intent);

                MainActivity.this.finish();*/

                //modifications
            }
        });
    }
}