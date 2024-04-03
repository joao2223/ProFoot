package devandroid.viana.profoot.controller;

import android.content.Context;

import java.util.List;

import devandroid.viana.profoot.database.TimesDB;
import devandroid.viana.profoot.model.Time;

public class TimesController extends TimesDB {

    public TimesController(Context context) {
        super(context);
    }
    public List<Time> getListaTimes() {return listarTimes();}
}
