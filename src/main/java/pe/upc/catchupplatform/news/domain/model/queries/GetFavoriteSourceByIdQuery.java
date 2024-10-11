package pe.upc.catchupplatform.news.domain.model.queries;

public record GetFavoriteSourceByIdQuery (Long id) {
    public GetFavoriteSourceByIdQuery {
        if (id == null) {
            throw new IllegalArgumentException("id is required");
        }
    }
}
