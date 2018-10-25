package com.dact.dao;

import com.dact.beans.TestCard;

import java.util.List;

public interface TestCardDAO {

    /**
     * @return list with all found test cards
     */
    List<TestCard> findAll();

}
