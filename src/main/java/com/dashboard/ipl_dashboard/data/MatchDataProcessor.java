package com.dashboard.ipl_dashboard.data;

import com.dashboard.ipl_dashboard.model.Match;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class MatchDataProcessor implements ItemProcessor <MatchInput, Match>{

    private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

    @Override
    public Match process(final MatchInput item) throws Exception {
        return null;
    }
}
