package pe.upc.catchupplatform.news.domain.model.aggregates;

import org.springframework.data.domain.AbstractAggregateRoot;

public class FavoriteSource extends AbstractAggregateRoot<FavoriteSource> {

    public Long id;
}
