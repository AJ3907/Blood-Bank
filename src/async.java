package taadnairsshha.apps.bloodbank;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import android.os.AsyncTask;

public class async extends AsyncTask<String, Integer, String>{

@Override
protected String doInBackground(String... params) {
    String line;
    try {  
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost("http://10.0.2.2/php/login.php");
        List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
		nameValuePairs.add(new BasicNameValuePair("ph", params[0]));
		nameValuePairs.add(new BasicNameValuePair("pass", params[1]));
		httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        HttpResponse httpResponse = httpClient.execute(httpPost);
        HttpEntity httpEntity = httpResponse.getEntity();
        line = EntityUtils.toString(httpEntity);

    } catch (UnsupportedEncodingException e) {
        line = "<results status=\"error\"><msg>Can't connect to server</msg></results>";
    } catch (MalformedURLException e) {
        line = "<results status=\"error\"><msg>Can't connect to server</msg></results>";
    } catch (IOException e) {
        line = "<results status=\"error\"><msg>Can't connect to server</msg></results>";
    }
    return line;
}

@Override
protected void onPostExecute(String result) {
    super.onPostExecute(result);
}

}
