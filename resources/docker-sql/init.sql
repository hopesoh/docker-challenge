drop user if exists 'myuser'@'%';
create user if not exists 'myuser'@'%' identified by 'secret';
grant all on mydatabase.* to 'myuser'@'%';
flush privileges;

use mydatabase;

CREATE TABLE IF NOT EXISTS language (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar (255) NOT NULL UNIQUE,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=DYNAMIC;