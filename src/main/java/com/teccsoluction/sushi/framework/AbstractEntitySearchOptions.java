package com.teccsoluction.sushi.framework;

/**
 * Created by clebr on 21/07/2016.
 */
public abstract class AbstractEntitySearchOptions {
    private Integer startPosition;
    private Integer maxResults;

    public void setStartPosition(Integer startPosition) {
        this.startPosition = startPosition;
    }

    public Integer getStartPosition() {
        return startPosition;
    }

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    public Integer getMaxResults() {
        return maxResults;
    }
}
