package mind.chan.mean.watchchild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView LatTextView, LngTextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Explicit

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View
        LatTextView = (TextView) findViewById(R.id.txtLat);
        LngTextView = (TextView) findViewById(R.id.txtLng);
        button = (Button) findViewById(R.id.btnSent);


        //button Controller

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LatTextView.setText("Lat =123.4567");
                LngTextView.setText("Lat = 456.1234");

            }
        });


    }//Main Method
}//Main class
