package devandroid.viana.profoot.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import java.util.ArrayList;
import java.util.List;
import devandroid.viana.profoot.R;
import devandroid.viana.profoot.controller.TimesController;
import devandroid.viana.profoot.model.Time;

public class NovoJogoActivity extends AppCompatActivity {

    TimesController timesController;
    List<Time> timesList;
    List<String> times;
    ListView listaTimes;
    CustomArrayAdapter timeAdapter;
    ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_jogo);
        timesController = new TimesController(NovoJogoActivity.this);
        listaTimes = findViewById(R.id.listaTimes);

        imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(NovoJogoActivity.this));

        timesList = timesController.getListaTimes();

        times = new ArrayList<>();
        for(Time time : timesList){
            times.add(time.getNomeDoTime());
        }

        timeAdapter = new CustomArrayAdapter(this, R.layout.listar_time_item, times);
        listaTimes.setAdapter(timeAdapter);
    }

    private class CustomArrayAdapter extends ArrayAdapter<String> {
        private List<String> times;
        private int layoutResourceId;

        public CustomArrayAdapter(Context context, int layoutResourceId, List<String> times) {
            super(context, layoutResourceId, times);
            this.layoutResourceId = layoutResourceId;
            this.times = times;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View listItemView = convertView;

            if (listItemView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                listItemView = inflater.inflate(layoutResourceId, parent, false);
            }

            ImageView imageViewTime = listItemView.findViewById(R.id.imageViewTime);
            TextView textViewNomeTime = listItemView.findViewById(R.id.textViewNomeTime);

            String nomeTime = times.get(position);

            textViewNomeTime.setText(nomeTime);

            String imageUrl = getImageUrlForTeam(nomeTime);

            DisplayImageOptions options = new DisplayImageOptions.Builder()
                    .resetViewBeforeLoading(true)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .considerExifParams(true)
                    .imageScaleType(ImageScaleType.EXACTLY)
                    .bitmapConfig(Bitmap.Config.RGB_565)
                    .build();

            imageLoader.displayImage(imageUrl, imageViewTime, options);


            return listItemView;
        }

        private String getImageUrlForTeam(String teamName) {
            if (teamName.equals("Athletico-PR")) {
                return "https://static.wixstatic.com/media/29c778_5b9c1928968f40759013de41fcafdfcb~mv2.png/v1/fit/w_500,h_500,q_90/29c778_5b9c1928968f40759013de41fcafdfcb~mv2.webp";
            }
            if(teamName.equals("Atlético-GO")){
                return "https://static.wixstatic.com/media/29c778_be2645553ac74851b3b4f0bcecd4bff0~mv2.png/v1/fit/w_500,h_500,q_90/29c778_be2645553ac74851b3b4f0bcecd4bff0~mv2.webp";
            }
            if(teamName.equals("Atlético-MG")) {
                return "https://static.wixstatic.com/media/29c778_dc8eafdf136d4154ae36340df2a81f3e~mv2.png/v1/fit/w_500,h_500,q_90/29c778_dc8eafdf136d4154ae36340df2a81f3e~mv2.webp ";
            }
            if(teamName.equals("Bahia")) {
                return "https://static.wixstatic.com/media/29c778_57234607199b4ad8911a5bd42865b13d~mv2.png/v1/fit/w_500,h_500,q_90/29c778_57234607199b4ad8911a5bd42865b13d~mv2.webp";
            }
            if(teamName.equals("Botafogo")) {
                return "https://static.wixstatic.com/media/29c778_888dbc9a928f4d0894c37b6a232b993e~mv2.png/v1/fit/w_500,h_500,q_90/29c778_888dbc9a928f4d0894c37b6a232b993e~mv2.webp";
            }
            if(teamName.equals("Bragantino")) {
                return "https://static.wixstatic.com/media/29c778_ab7d319eb46d425dbe8eb9d47c76b56d~mv2.png/v1/fit/w_500,h_500,q_90/29c778_ab7d319eb46d425dbe8eb9d47c76b56d~mv2.webp";
            }
            if(teamName.equals("Corinthians")){
                return "https://static.wixstatic.com/media/29c778_9e9c69fafce641ae8608994e6f36a51b~mv2.png/v1/fit/w_500,h_500,q_90/29c778_9e9c69fafce641ae8608994e6f36a51b~mv2.webp";
            }
            if(teamName.equals("Criciúma")) {
                return "https://static.wixstatic.com/media/29c778_323eb6737a4f40c987abcf11ac3e867d~mv2.png/v1/fit/w_500,h_500,q_90/29c778_323eb6737a4f40c987abcf11ac3e867d~mv2.webp";
            }
            if(teamName.equals("Cruzeiro")) {
                return "https://static.wixstatic.com/media/29c778_b1fd820f77c144efb0646f8dda173685~mv2.png/v1/fit/w_500,h_500,q_90/29c778_b1fd820f77c144efb0646f8dda173685~mv2.webp";
            }
            if(teamName.equals("Cuiabá")) {
                return "https://static.wixstatic.com/media/29c778_49271988a9214e92ab04c0afa4bee630~mv2.png/v1/fit/w_500,h_500,q_90/29c778_49271988a9214e92ab04c0afa4bee630~mv2.webp";
            }
            if(teamName.equals("Flamengo")) {
                return "https://static.wixstatic.com/media/29c778_42a1f46bcbe8412e8fdb8da12d0f654d~mv2.png/v1/fit/w_512,h_512,q_90/29c778_42a1f46bcbe8412e8fdb8da12d0f654d~mv2.webp";
            }
            if(teamName.equals("Fluminense")) {
                return "https://static.wixstatic.com/media/29c778_a5dad38430c44511afdb0074c5a5bb7b~mv2.png/v1/fit/w_500,h_500,q_90/29c778_a5dad38430c44511afdb0074c5a5bb7b~mv2.webp";
            }
            if(teamName.equals("Fortaleza")) {
                return "https://static.wixstatic.com/media/29c778_ff7cb6559d184e82bfa4941bb2f7d8ea~mv2.png/v1/fit/w_500,h_500,q_90/29c778_ff7cb6559d184e82bfa4941bb2f7d8ea~mv2.webp ";
            }
            if(teamName.equals("Grêmio")) {
                return "https://static.wixstatic.com/media/29c778_c3f8f8d7fa614f49b0dd0d71f0a44272~mv2.png/v1/fit/w_500,h_500,q_90/29c778_c3f8f8d7fa614f49b0dd0d71f0a44272~mv2.webp ";
            }
            if(teamName.equals("Internacional")) {
                return "https://static.wixstatic.com/media/29c778_4d4acc7534f84343b452618b76ad3c01~mv2.png/v1/fit/w_500,h_500,q_90/29c778_4d4acc7534f84343b452618b76ad3c01~mv2.webp";
            }
            if(teamName.equals("Juventude")) {
                return "https://static.wixstatic.com/media/29c778_12d3d43160854f8b885c9d704c76ed87~mv2.png/v1/fit/w_500,h_500,q_90/29c778_12d3d43160854f8b885c9d704c76ed87~mv2.webp";
            }
            if(teamName.equals("Palmeiras")) {
                return "https://static.wixstatic.com/media/29c778_22d25f5604e348dc8289c810238ce4d3~mv2.png/v1/fit/w_500,h_500,q_90/29c778_22d25f5604e348dc8289c810238ce4d3~mv2.webp";
            }
            if(teamName.equals("São Paulo")) {
                return "https://static.wixstatic.com/media/29c778_29fa8884c14f4c12b0d323210f7d6267~mv2.png/v1/fit/w_500,h_500,q_90/29c778_29fa8884c14f4c12b0d323210f7d6267~mv2.webp ";
            }
            if(teamName.equals("Vasco")) {
                return "https://static.wixstatic.com/media/29c778_f3d6773ce1634fc7b1c7e58ce9755b7e~mv2.png/v1/fit/w_500,h_500,q_90/29c778_f3d6773ce1634fc7b1c7e58ce9755b7e~mv2.webp";
            }
            if(teamName.equals("Vitória")) {
                return "https://static.wixstatic.com/media/29c778_fdc94bcbe11a4353aad4c89423a8fad9~mv2.png/v1/fit/w_500,h_500,q_90/29c778_fdc94bcbe11a4353aad4c89423a8fad9~mv2.webp";
            }

            return "";
        }
    }
}
