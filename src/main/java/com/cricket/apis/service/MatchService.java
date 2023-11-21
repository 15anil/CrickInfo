package com.cricket.apis.service;

import com.cricket.apis.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get CWC2023 point table
    List<List<String>> getPointTable();
}
