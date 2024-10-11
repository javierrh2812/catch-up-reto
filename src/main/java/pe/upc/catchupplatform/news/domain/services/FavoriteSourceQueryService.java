package pe.upc.catchupplatform.news.domain.services;

import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.model.queries.GetAllFavoriteSourceQuery;
import pe.upc.catchupplatform.news.domain.model.queries.GetFavoriteSourceByIdQuery;

import java.util.Optional;

public interface FavoriteSourceQueryService {

    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);
    Optional<FavoriteSource> handle(GetAllFavoriteSourceQuery query);

}
