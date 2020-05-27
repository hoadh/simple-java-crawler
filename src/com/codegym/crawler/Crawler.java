package com.codegym.crawler;

import com.codegym.crawler.utils.IHttpService;
import com.codegym.models.ClassifiedAd;

import java.util.ArrayList;
import java.util.List;

public abstract class Crawler {
    protected IHttpService httpService;

    public Crawler(IHttpService httpService) {
        this.httpService = httpService;
    };

    /**
     * Đây là thao tác chung cho tất cả các trang web mà chúng ta muốn thu thập tin
     * @return Iterable<ClassifiedAd>
     */
    public Iterable<ClassifiedAd> inspect() throws Exception {
        List<ClassifiedAd> classifiedAds = new ArrayList<>();
        Iterable<String> subpages = inspectHomepage();

        for (String subpage: subpages) {
            System.out.println("SubPages: " + subpage);
            Iterable<String> detailPages = inspectSubpage(subpage);

            for (String detailPage: detailPages) {
                System.out.println("Detail page: " + detailPage);
                ClassifiedAd classifiedAd = inspectDetailPage(detailPage);
                System.out.println(classifiedAd);
                classifiedAds.add(classifiedAd);
            }
        }

        return classifiedAds;
    }

    protected abstract Iterable<String> inspectHomepage();                    // bước 1
    protected abstract Iterable<String> inspectSubpage(String subpage);       // bước 2
    protected abstract ClassifiedAd inspectDetailPage(String detailPage) throws Exception;     // bước 3
}
