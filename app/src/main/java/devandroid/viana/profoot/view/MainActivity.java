package devandroid.viana.profoot.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import devandroid.viana.profoot.R;

public class MainActivity extends AppCompatActivity {
    Button btnNovoJogo;
    Button btnCarregarJogo;
    Button btnEditarEquipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovoJogo = findViewById(R.id.btnNovoJogo);
        btnCarregarJogo = findViewById(R.id.btnCarregarJogo);
        btnEditarEquipes = findViewById(R.id.btnEditarEquipes);

    }
}