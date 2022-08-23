insert into users (username,email,password) values('celes','celes@gmail.com','123');
insert into users (username,email,password) values('jose','jose@gmail.com','321');

insert into games (name) values('PUBG');
insert into games (name) values('COD');

insert into parties (name,party_creator_id,game_id) values('COD Fanatics',1,2);

insert into users_parties(user_id,party_id) values(1,1);
insert into users_parties(user_id,party_id) values(2,1);

insert into messages(text,user_id,party_id) values('Deja de pillar respawn!',2,1);