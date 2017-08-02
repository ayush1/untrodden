package example.com.untrodden.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ayushgarg on 02/08/17.
 */

public class SongsModel implements Serializable{

    private int resultCount;
    private ArrayList<Results> results;

    public int getResultCount() {
        return resultCount;
    }

    public SongsModel setResultCount(int resultCount) {
        this.resultCount = resultCount;
        return this;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public SongsModel setResults(ArrayList<Results> results) {
        this.results = results;
        return this;
    }

}
