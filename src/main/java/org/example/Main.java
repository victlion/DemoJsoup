package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://w.wiki/7qPH").get();

        //находим нужную часть страницы , а именно тег <tbody> -> <tr> -> <td> -> <a>
        //получаем массив elem со всем найденным
        Elements elem = document.select("tbody").select("tr").select("td").select("a");

        //танем со всех элеменетов значение title
        for(int i = 0 ; i<elem.size();i++){
            System.out.println(elem.get(i).attr("title"));
        }
    }
}