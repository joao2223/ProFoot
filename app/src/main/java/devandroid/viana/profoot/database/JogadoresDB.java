package devandroid.viana.profoot.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class JogadoresDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "jogadores.db";
    private static final int DB_VERSION = 1;
    Cursor cursor;
    SQLiteDatabase db;

    public JogadoresDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
        adicionarJogadores();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTabelaJogadores = "CREATE TABLE Jogadores (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeJogador TEXT, " +
                "idade INTEGER, " +
                "idTime INTEGER, " +
                "nacionalidade INTEGER, " +
                "gols INTEGER, " +
                "assistencias INTEGER, " +
                "qualidade INTEGER, " +
                "posicao INTEGER, " +
                "numero Integer, " +
                "valor TEXT)";

        db.execSQL(sqlTabelaJogadores);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private void adicionarJogadores() {
        String sqlInserirJogadores = "INSERT INTO Jogadores (nomeJogador, idade, idTime, nacionalidade, gols, assistencias, qualidade, posicao, numero, valor) VALUES " +
                "('Arthur Dias', 16, 1, 'Brasil', 0, 0, 80, 'D', 65, 0), " +
                "('Fábio Lucas', 17, 1, 'Brasil', 0, 0, 80, 'D', 67, 0), "  +
                "('João Vigolo', 18, 1, 'Brasil', 0, 0, 80, 'D', 70, 0), " +
                "('Marcos André Paulino Maia', 17, 1, 'Brasil', 0, 0, 80, 'D', 46, 0), " +
                "('Leonardo Ataíde', 20, 1, 'Brasil', 0, 0, 80, 'D', 60, 0), " +
                "('Leonardo Derik', 18, 1, 'Brasil', 0, 0, 80, 'D', 61, 0), " +
                "('Filipinho', 22, 1, 'Brasil', 0, 0, 80, 'D', 23, 0), " +
                "('Daniel Martins', 23, 1, 'Escócia', 0, 0, 80, 'D', 51, 0), " +
                "('Emersonn', 19, 1, 'Brasil', 0, 0, 80, 'A', 90, 0), " +
                "('Pablo', 31, 1, 'Brasil', 0, 0, 80, 'A', 92, 0), " +
                "('Pedro Henrique', 28, 1, 'Brasil', 0, 0, 80, 'M', 34, 0), " +
                "('Thiago Heleno', 35, 1, 'Brasil', 0, 0, 80, 'D', 44, 0), " +
                "('Carlos Biro', 20, 1, 'Brasil', 0, 0, 80, 'M', 31, 0), " +
                "('Lucas Esquivel', 22, 1, 'Argentina', 0, 0, 80, 'D', 30, 0), " +
                "('Fernandinho', 38, 1, 'Brasil', 0, 0, 80, 'M', 5, 0), " +
                "('Hugo Moura', 26, 1, 'Brasil', 0, 0, 80, 'M', 17, 0), " +
                "('Jader', 20, 1, 'Brasil', 0, 0, 80, 'M', 18, 0), " +
                "('Erick', 26, 1, 'Brasil', 0, 0, 80, 'M', 26, 0), " +
                "('Eduardo', 18, 1, 'Brasil', 0, 0, 80, 'M', 53, 0), " +
                "('Chiqueti', 19, 1, 'Brasil', 0, 0, 80, 'M', 54, 0), " +
                "('João Cruz', 17, 1, 'Brasil', 0, 0, 80, 'M', 57, 0), " +
                "('João Vitor', 20, 1, 'Brasil', 0, 0, 80, 'M', 58, 0), " +
                "('Lucca', 20, 1, 'Brasil', 0, 0, 80, 'M', 62, 0), " +
                "('Diogo Riquelme', 18, 1, 'Brasil', 0, 0, 80, 'M', 63, 0), " +
                "('Guilherme Back', 17, 1, 'Brasil', 0, 0, 80, 'M', 71, 0), " +
                "('Alex Santana', 28, 1, 'Brasil', 0, 0, 80, 'M', 80, 0), " +
                "('Christian', 23, 1, 'Brasil', 0, 0, 80, 'M', 88, 0), " +
                "('Walace', 18, 1, 'Brasil', 0, 0, 80, 'A', 66, 0), " +
                "('Sorriso', 17, 1, 'Brasil', 0, 0, 80, 'A', 73, 0), " +
                "('Kauê Sestrem', 17, 1, 'Brasil', 0, 0, 80, 'A', 74, 0), " +
                "('Julimar', 23, 1, 'Brasil', 0, 0, 80, 'A', 78, 0), " +
                "('Emersonn', 19, 1, 'Brasil', 0, 0, 80, 'A', 90, 0), " +
                "('Pablo', 31, 1, 'Brasil', 0, 0, 80, 'A', 92, 0);";

        db.execSQL(sqlInserirJogadores);

    }
}
