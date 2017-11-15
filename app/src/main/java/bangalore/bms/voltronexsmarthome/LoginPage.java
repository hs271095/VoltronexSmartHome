package bangalore.bms.voltronexsmarthome;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Harshit on 10-10-2017.
 */

public class LoginPage extends AppCompatActivity {
    Button but;
    EditText pwd,un;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        un=(EditText)findViewById(R.id.un);
        pwd=(EditText)findViewById(R.id.pwd);
        but=(Button)findViewById(R.id.login1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password= pwd.getText().toString();
                String UserName= un.getText().toString();
                if(password.equals("123") && UserName.equals("voltronex")){
                    Intent go= new Intent(LoginPage.this,HomePage.class);
                    startActivity(go);

                }
                else{
                    alert();
                }
            }
        });
    }
    public void alert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.MyDialogTheme);
        builder.setMessage("Register the User First ");
        builder.setTitle("User Not Registered");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent go = new Intent(LoginPage.this,RegisterPage.class);
                startActivity(go);
            }
        });
        builder.show();
    }
}
