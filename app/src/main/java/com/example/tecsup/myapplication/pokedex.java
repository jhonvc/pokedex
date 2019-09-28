package com.example.tecsup.myapplication;

import java.util.List;

public class pokedex {
    int cout;
    List<Pokemon>results;

    public pokedex() {

    }

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    public List<Pokemon> getResults() {
        return results;
    }

    public void setResults(List<Pokemon> results) {
        this.results = results;
    }
}
