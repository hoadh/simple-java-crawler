package com.codegym;

import com.codegym.crawler.Crawler;
import com.codegym.crawler.impl.BatdongsanCrawler;
import com.codegym.crawler.utils.URLGet;

public class MySimpleCrawler {

    public static void main(String[] args) throws Exception {
        URLGet urlGet = new URLGet();
        Crawler[] crawlers = new Crawler[2];
        crawlers[0] = new BatdongsanCrawler(urlGet);

        for (Crawler crawler: crawlers) {
            crawler.inspect();
        }
    }
}
