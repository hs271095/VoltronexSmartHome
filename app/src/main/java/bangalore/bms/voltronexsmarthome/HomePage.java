package bangalore.bms.voltronexsmarthome;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Harshit on 15-11-2017.
 */

public class HomePage extends AppCompatActivity {
    ImageButton b1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        b1=(ImageButton)findViewById(R.id.light);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go= new Intent(HomePage.this,SmartLighting.class);
                startActivity(go);
            }
        });
    }
}
