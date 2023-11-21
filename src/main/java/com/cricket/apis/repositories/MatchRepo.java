package com.cricket.apis.repositories;

import com.cricket.apis.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
    //fetch the match details by providing team details and fetching its data
    Optional<Match> findByTeamHeading(String teamheading);
}
