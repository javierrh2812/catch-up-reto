package pe.upc.catchupplatform.news.domain.services;

import pe.upc.catchupplatform.news.domain.model.aggregates.FavoriteSource;
import pe.upc.catchupplatform.news.domain.model.commands.CreateFavoriteSourceCommand;

import java.util.Optional;

public interface FavoriteSourceCommandService {

    Optional<FavoriteSource> handle(CreateFavoriteSourceCommand command);
}
