package com.model.youtube;

public class PageInfo {

    private Integer totalResults;
    private Integer resultsPerPage;

    public PageInfo() {
    }

    public PageInfo(Integer totalResults, Integer resultsPerPage) {
        this.totalResults = totalResults;
        this.resultsPerPage = resultsPerPage;
    }

    public Integer getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }
    public Integer getResultsPerPage() {
        return resultsPerPage;
    }
    public void setResultsPerPage(Integer resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

}
