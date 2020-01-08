package id.ac.poliban.mi.indrawan.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvResult = (ListView) findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASEAN", "indonesia"}, {"Palestina", "Timur Tengah", "palestine"}, {"Malaysia", "ASEAN", "malaysia"}};


        NegaraAdapter adapter = new NegaraAdapter(MainActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}
