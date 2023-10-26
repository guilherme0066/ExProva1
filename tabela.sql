drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table trm_termostato (
 trm_id bigint primary key auto_increment,
 trm_data_hora datetime not null,
 trm_temperatura float not null,
 trm_umidade float,
 trm_particulas float
);

insert into trm_termostato (trm_data_hora, trm_temperatura, trm_umidade, trm_particulas)
 values ('2023-10-24 10:00', 25.4, null, 31.3),
        ('2023-10-24 11:00', 26.1, 43.2, null);

