package bangalore.bms.voltronexsmarthome;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Harshit on 15-11-2017.
 */

public class SmartLighting extends AppCompatActivity {
    Button b1,b2;
    ImageView iv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smartlight);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        iv=(ImageView)findViewById(R.id.imageView3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WriteOffTask writecall= new WriteOffTask();
                writecall.execute();
                Resources res = getResources();
                iv.setImageDrawable(res.getDrawable(R.drawable.off));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resources res = getResources();
                WriteOnTask writeoncall= new WriteOnTask();
                writeoncall.execute();
                iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                iv.setImageDrawable(res.getDrawable(R.drawable.ic_on));

            }
        });
    }
}
