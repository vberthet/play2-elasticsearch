package elasticsearch;

import org.elasticsearch.search.facet.Facets;

import java.util.List;

/**
 * The Class IndexResult.
 *
 * @param <T> the generic type
 */
public class IndexResults<T extends Indexable> {

    /** The total count. */
    public long totalCount;

    /** The results. */
    public List<T> results;

    /** The facets. */
    public Facets facets;

    /**
     * Instantiates a new search results.
     *
     * @param totalCount the total count
     * @param results the results
     * @param facets the facets
     */
    public IndexResults(long totalCount, List<T> results, Facets facets) {
        this.totalCount = totalCount;
        this.results = results;
        this.facets = facets;
    }

}

