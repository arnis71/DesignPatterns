package ru.arnis.designpatterns.Strategy_pattern;

import java.util.ArrayList;

/**
 * Created by arnis on 26/08/16.
 */
public interface LoadData {
    ArrayList<Data> load(ArrayList<Data> src);

    class LoadAllPosts implements LoadData{

        @Override
        public ArrayList<Data> load(ArrayList<Data> src) {
            ArrayList<Data> db = new ArrayList<>();
            for (Data data: src){
                db.add(data);
            }
            return db;
        }
    }

    class LoadLastPost implements LoadData{
        @Override
        public ArrayList<Data> load(ArrayList<Data> src) {
            ArrayList<Data> db = new ArrayList<>();
            db.add(src.get(0));
            return db;
        }
    }
}
