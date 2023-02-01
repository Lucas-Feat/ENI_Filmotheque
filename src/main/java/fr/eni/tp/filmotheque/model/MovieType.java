package fr.eni.tp.filmotheque.model;

public enum MovieType {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    HORROR("Horror"),
    SCIENCE_FICTION("Science Fiction"),
    WESTERN("Western"),
    ANIMATION("Animation"),
    FANTASY("Fantasy"),
    THRILLER("Thriller"),
    ROMANCE("Romance"),
    ADVENTURE("Adventure"),
    MYSTERY("Mystery"),
    CRIME("Crime"),
    WAR("War"),
    BIOGRAPHY("Biography"),
    DOCUMENTARY("Documentary"),
    HISTORY("History"),
    FAMILY("Family"),
    MUSICAL("Musical"),
    SPORT("Sport"),
    SHORT("Short"),
    FILM_NOIR("Film Noir"),
    MUSIC("Music"),
    TALK_SHOW("Talk Show"),
    NEWS("News"),
    GAME_SHOW("Game Show"),
    REALITY_TV("Reality-TV"),
    ADULT("Adult"),
    ANIME("Anime"),
    SHORT_FILM("Short Film");

    private final String movieType;

    MovieType(String label) {
        this.movieType = label;
    }

    @Override
    public String toString() {
        return movieType;
    }
}
