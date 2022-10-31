CREATE SCHEMA wordle;

CREATE TABLE word_list (
id int(4) not null Primary key,
word varchar(5)
);

insert into word_list(id, word) values (1,"Boxer");
insert into word_list(id, word) values (2,"Busto");
insert into word_list(id, word) values (3,"Burro");
insert into word_list(id, word) values (4,"Burla");
insert into word_list(id, word) values (5,"Bufon");
insert into word_list(id, word) values (6,"Bufet");
insert into word_list(id, word) values (7,"Bueno");
insert into word_list(id, word) values (8,"Bucal");
insert into word_list(id, word) values (9,"Bingo");
insert into word_list(id, word) values (10,"Codex");
insert into word_list(id, word) values (11,"Cenit");
insert into word_list(id, word) values (12,"Comic");
insert into word_list(id, word) values (13,"Caliz");
insert into word_list(id, word) values (14,"Conos");
insert into word_list(id, word) values (15,"Debil");
insert into word_list(id, word) values (16,"Dulce");
insert into word_list(id, word) values (17,"Dogma");
insert into word_list(id, word) values (18,"Drama");
insert into word_list(id, word) values (19,"Fosil");
insert into word_list(id, word) values (20,"Femur");
insert into word_list(id, word) values (21,"Fumar");
insert into word_list(id, word) values (22,"Fresa");
insert into word_list(id, word) values (23,"Freno");
insert into word_list(id, word) values (24,"Guiso");
insert into word_list(id, word) values (25,"Guapo");
insert into word_list(id, word) values (26,"Gusto");
insert into word_list(id, word) values (27,"Grumo");
insert into word_list(id, word) values (28,"Hurto");
insert into word_list(id, word) values (29,"Huevo");
insert into word_list(id, word) values (30,"Hotel");
insert into word_list(id, word) values (31,"Justo");
insert into word_list(id, word) values (32,"Jugar");
insert into word_list(id, word) values (33,"Jarra");
insert into word_list(id, word) values (34,"Kioto");
insert into word_list(id, word) values (35,"Karma");
insert into word_list(id, word) values (36,"Lemur");
insert into word_list(id, word) values (37,"Lunar");
insert into word_list(id, word) values (38,"Movil");
insert into word_list(id, word) values (39,"Multa");
insert into word_list(id, word) values (40,"Mason");
insert into word_list(id, word) values (41,"Morir");
insert into word_list(id, word) values (42,"Novel");
insert into word_list(id, word) values (43,"Natal");
insert into word_list(id, word) values (44,"Pauta");
insert into word_list(id, word) values (45,"Pausa");
insert into word_list(id, word) values (46,"Patan");
insert into word_list(id, word) values (47,"Rimel");
insert into word_list(id, word) values (48,"Regla");
insert into word_list(id, word) values (49,"Surco");
insert into word_list(id, word) values (50,"Solar");
insert into word_list(id, word) values (51,"Tunel");
insert into word_list(id, word) values (52,"Trufa");
insert into word_list(id, word) values (53,"Tiara");
insert into word_list(id, word) values (54,"Tarta");
insert into word_list(id, word) values (55,"Video");
insert into word_list(id, word) values (56,"Voraz");
insert into word_list(id, word) values (57,"Vimos");
insert into word_list(id, word) values (58,"Valle");
insert into word_list(id, word) values (59,"Zanco");
insert into word_list(id, word) values (60,"Zanja");

select *from word_list;