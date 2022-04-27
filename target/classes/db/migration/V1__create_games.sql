CREATE TABLE IF NOT EXISTS games (
id BIGSERIAL PRIMARY KEY,
red_team_player_1 VARCHAR NOT NULL,
red_team_player_2 VARCHAR NOT NULL,
red_team_score INT NOT NULL,
blue_team_player_1 VARCHAR NOT NULL,
blue_team_player_2 VARCHAR NOT NULL,
blue_team_score INT NOT NULL
);