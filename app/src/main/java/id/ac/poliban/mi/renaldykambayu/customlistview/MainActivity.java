package id.ac.poliban.mi.renaldykambayu.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASEAN", "indonesia"}, {"Palestina", "Timur Tengah", "palestine"}, {"Malaysia", "ASEAN", "malaysia"}};


        NegaraAdapter adapter = new NegaraAdapter(MainActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}