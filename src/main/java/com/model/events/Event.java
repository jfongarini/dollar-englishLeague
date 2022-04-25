
package com.model.events;


import java.util.List;

public class Event {

    private List<Result> results = null;

    public Event() {
    }

    public Event(List<Result> results) {
        this.results = results;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}
