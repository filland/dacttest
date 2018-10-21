package com.dact.dao;

import com.dact.beans.TestCard;

import java.util.List;
import java.util.Objects;

/**
 *
 * This implementation allows to work with JSON
 * file as a source of test cards
 *
 *
 */
public class TestCardDAOJSONImp implements TestCardDAO {

    private String pathToFileWithJSONs;

    public TestCardDAOJSONImp(String pathToFileWithJSONs) {

        Objects.requireNonNull(pathToFileWithJSONs);

        this.pathToFileWithJSONs = pathToFileWithJSONs;
    }

    @Override
    public List<TestCard> findAll() {

        // read JSON file and create TestCard objects

        // generate unique ID for each test card


        return null;
    }

}
