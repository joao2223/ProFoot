package devandroid.viana.profoot.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import devandroid.viana.profoot.model.Time;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class TimesDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "times.db";
    private static final int DB_VERSION = 1;
    Cursor cursor;
    SQLiteDatabase db;

    public TimesDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
        adicionarTimes();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaTimes = "CREATE TABLE Times (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeDoTime TEXT, " +
                "localizacao INTEGER, " +
                "divisao INTEGER, " +
                "libertadores INTEGER, " +
                "sulamericana INTEGER, " +
                "jogador INTEGER)";

        db.execSQL(sqlTabelaTimes);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private void adicionarTimes() {
        if(listarTimes().size() == 0){
            String sqlInserirTimes = "INSERT INTO Times (nomeDoTime, localizacao, divisao, libertadores, sulamericana, jogador) VALUES " +
                    "('Athletico-PR', 1, 1, 0, 0, 0), " +
                    "('Atlético-GO', 1, 1, 0, 0, 0), " +
                    "('Atlético-MG', 1, 1, 0, 0, 0), " +
                    "('Bahia', 1, 1, 0, 0, 0), " +
                    "('Botafogo', 1, 1, 0, 0, 0), " +
                    "('Bragantino', 1, 1, 0, 0, 0), " +
                    "('Corinthians', 1, 1, 0, 0, 0), " +
                    "('Criciúma', 1, 1, 0, 0, 0), " +
                    "('Cruzeiro', 1, 1, 0, 0, 0), " +
                    "('Cuiabá', 1, 1, 0, 0, 0), " +
                    "('Flamengo', 1, 1, 0, 0, 0), " +
                    "('Fluminense', 1, 1, 0, 0, 0), " +
                    "('Fortaleza', 1, 1, 0, 0, 0), " +
                    "('Grêmio', 1, 1, 0, 0, 0), " +
                    "('Internacional', 1, 1, 0, 0, 0), " +
                    "('Juventude', 1, 1, 0, 0, 0), " +
                    "('Palmeiras', 1, 1, 0, 0, 0), " +
                    "('São Paulo', 1, 1, 0, 0, 0), " +
                    "('Vasco', 1, 1, 0, 0, 0), " +
                    "('Vitória', 1, 1, 0, 0, 0)";

            db.execSQL(sqlInserirTimes);
        }

    }

    public List<Time> listarTimes () {
        List<Time> times =new ArrayList<>();
        Time time;

        String querySql = "SELECT * FROM Times";
        cursor = db.rawQuery(querySql, null);

        if(cursor.moveToFirst()){
            do {
                time = new Time();

                time.setId(cursor.getInt(0));
                time.setNomeDoTime(cursor.getString(1));
                time.setLocalizacao(cursor.getInt(2));
                time.setDivisao(cursor.getInt(3));
                time.setLibertadores(cursor.getInt(4));
                time.setSulamericana(cursor.getInt(5));
                time.setJogador(cursor.getInt(6));

                times.add(time);

            } while(cursor.moveToNext());
        }

        return times;
    }
}
