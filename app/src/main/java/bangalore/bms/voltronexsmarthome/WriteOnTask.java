package bangalore.bms.voltronexsmarthome;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Harshit on 15-11-2017.
 */

class WriteOnTask extends AsyncTask<Void, Void, String> {

    private Exception exception;
    ProgressBar progressBar;


    protected void onPreExecute() {

    }

    protected String doInBackground(Void... urls) {



        try {
            URL url = new URL("https://api.thingspeak.com/update?api_key=2116L9K68LHHKMM2&field1=1");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                bufferedReader.close();
                return stringBuilder.toString();
            }
            finally{
                urlConnection.disconnect();
            }
        }
        catch(Exception e) {
            Log.e("ERROR", e.getMessage(), e);
            return null;
        }
    }

    protected void onPostExecute(String response) {
        if(response == null) {
            response = "THERE WAS AN ERROR";
        }

        Log.i("INFO", response);

    }
}