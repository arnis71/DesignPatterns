package ru.arnis.designpatterns.Strategy_pattern;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data("post1",0,"hello");
        Data data2 = new Data("post2",1,"hi");
        Data data3 = new Data("post3",2,"hey");
        ArrayList<Data> db = new ArrayList<>();
        db.add(data1);
        db.add(data2);
        db.add(data3);
        LoadData loader;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Load all/latest data");
        String in = scanner.nextLine();
        switch (in){
            case "all": loader = new LoadData.LoadAllPosts();break;
            case "latest" : loader = new LoadData.LoadLastPost();break;
            default:loader=null;
        }

        ArrayList<Data> out = new ArrayList<>();
        if (loader!=null){
            out=loader.load(db);
        }

        for (Data data:out)
            System.out.println(data);
    }
}
