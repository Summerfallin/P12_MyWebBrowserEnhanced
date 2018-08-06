package sg.edu.rp.c346.myapplicationenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnLoadURL;
    WebView wvMypage;
    EditText etURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMypage = findViewById(R.id.webViewMypage);
        etURL=findViewById(R.id.editText);
        wvMypage.setWebViewClient(new WebViewClient());
        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = etURL.getText().toString();
                wvMypage.loadUrl(url);
            }
        });
    }
}
