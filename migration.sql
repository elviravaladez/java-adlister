USE adlister_db;

# DROP TABLE IF EXISTS ads;
# DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
                                     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                     username VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS ads (
                                   id INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                   user_id INT UNSIGNED NOT NULL,
                                   title VARCHAR(100) NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
    );

SHOW TABLES;

DESCRIBE users;
DESCRIBE ads;

# TODO: For now, manually insert a record into the
#  users table and note the id of the newly created
#  record. In your controller, when an ad is being
#  created, hardcode this id into the ad.

# INSERT INTO users (username, email, password)
# VALUES ('user', 'user@email.com', 'codeup');

# DESCRIBE users;