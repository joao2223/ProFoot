package devandroid.viana.profoot.view;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import devandroid.viana.profoot.R;
import devandroid.viana.profoot.controller.TimesController;
import devandroid.viana.profoot.model.Time;

public class NovoJogoActivity extends AppCompatActivity {

    TimesController timesController;
    List<Time> times;
    ListView listaTimes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_novo_jogo);
        timesController = new TimesController(NovoJogoActivity.this);
        listaTimes = findViewById(R.id.listaTimes);

        times = timesController.getListaTimes();

        for(Time time : times){
            System.out.println(time.getNomeDoTime());
        }

    }
}
