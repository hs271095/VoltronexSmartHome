package bangalore.bms.voltronexsmarthome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Harshit on 10-10-2017.
 */

public class RegisterPage extends AppCompatActivity {
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_page);
        reg=(Button)findViewById(R.id.register_but);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go= new Intent(RegisterPage.this,LoginPage.class);
                startActivity(go);
            }
        });
    }
}
