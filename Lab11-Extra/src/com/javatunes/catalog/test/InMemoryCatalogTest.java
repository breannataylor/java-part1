/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.Catalog;
import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();
        // testFindByKeyword();
        // testFindByCategory();
         //testSize();
        // testGetAll();

        //TASK method tests
        // testFindSelfTitled();
        // testFindCheapRock();
        // testNumberinGenre();
        // testgetAveragePrice();
         //testfindCheapest();
        testIsLessThanTen();
        testHasGenre();

    }


    //TASK method tests
    private static void testIsLessThanTen() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        boolean result = catalog.isLessThanTen();
    }

    private static void testHasGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        boolean result = catalog.hasGenre(MusicCategory.JAZZ);
        System.out.println(result);
    }

    private static void testfindCheapest() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.findCheapest(MusicCategory.CLASSIC_ROCK));
    }

    private static void testgetAveragePrice() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.getAveragePrice());
    }

    private static void testNumberinGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.numberInGenre(MusicCategory.POP));;
    }

    private static void testFindCheapRock() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        dump(catalog.findCheapRock(15.99));
    }

    private static void testFindSelfTitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        dump(catalog.findSelfTitled());
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(20L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);

        dump(popItems);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());
    }

    private static void testGetAll() {
    }

    //helper method to show the collection "vertically"
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}