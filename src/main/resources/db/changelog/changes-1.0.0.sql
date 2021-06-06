create table position
(
    position_type       varchar(31) not null,
    id                  bigint      not null
        constraint position_pkey
            primary key,
    description         varchar(255),
    genre               varchar(255),
    release_date        date,
    score               numeric(19, 2),
    thumbnail           varchar(255),
    title               varchar(255),
    uuid                uuid,
    director_birth_date date,
    director_name       varchar(255),
    director_surname    varchar(255),
    duration            bigint,
    number_of_episodes  integer
);

create table aspot
(
    id       bigint not null
        constraint aspot_pkey
            primary key,
    size     varchar(255),
    movie_id bigint
        constraint position_fkey
            references position
);

create table screen
(
    id        bigint not null
        constraint screen_pkey
            primary key,
    title     varchar(255),
    a_spot_id bigint
        constraint aspot_fkey
            references aspot
);

create table lane
(
    id        bigint not null
        constraint lane_pkey
            primary key,
    title     varchar(255),
    screen_id bigint
        constraint screen_fkey
            references screen
);

create table lane_positions
(
    lanes_id     bigint not null
        constraint lann_fkey
            references lane,
    positions_id bigint not null
        constraint position_fkey
            references position,
    constraint lane_positions_pkey
        primary key (lanes_id, positions_id)
);

