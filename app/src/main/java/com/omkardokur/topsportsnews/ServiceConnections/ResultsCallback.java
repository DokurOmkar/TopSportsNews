package com.omkardokur.topsportsnews.ServiceConnections;

import com.omkardokur.topsportsnews.models.SportsItem;

import java.util.List;

/**
 * Created by omkardokur on 1/14/16.
 */
public interface ResultsCallback {

    public void onSuccess(List<SportsItem> sportsItemList);
    public void onFailure(String errorMessage);
}
