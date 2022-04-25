package com.model.football;

import java.util.List;

public class Football {

    private List<Table> table = null;

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }

    public Football() {
    }

    public Football(List<Table> table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Football{" +
                "table=" + table +
                '}';
    }
}
