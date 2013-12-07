
INSERT INTO demo (data) VALUES ('Hello, world!');
INSERT INTO demo (data) VALUES ('Hello, world again!');
INSERT INTO demo (data) VALUES ('Hello, world for the third time!');

INSERT INTO conference (name, startDate, endDate, description, category_id, creator_id) VALUES ('Conference A', '2013-09-30 17:00:00', '2013-09-30 18:00:00', 'Simple description', 1, 1);
INSERT INTO conference (name, startDate, endDate, description, category_id, creator_id) VALUES ('Conference B', '2013-10-01 17:00:00', '2013-10-02 18:00:00', 'Simple description', 1, 1);
INSERT INTO conference (name, startDate, endDate, description, category_id, creator_id) VALUES ('Conference C', '2013-10-20 00:00:00', '2013-10-30 00:00:00', 'Simple description', 1, 1);

INSERT INTO Users (id, name, surname, username, password, email) VALUES (1, 'AudriusA', 'ADanielevicius', 'AAudrys0218', 'AApassword', 'AAudrys0218@gmail.com');
INSERT INTO Users (id, name, surname, username, password, email) VALUES (2, 'AudriusB', 'BDanielevicius', 'BAudrys0218', 'BApassword', 'BAudrys0218@gmail.com');
INSERT INTO Users (id, name, surname, username, password, email) VALUES (3, 'AudriusC', 'CDanielevicius', 'CAudrys0218', 'CApassword', 'CAudrys0218@gmail.com');

INSERT INTO Categories (id, category_title) VALUES (1, 'Informacines technologijos');
INSERT INTO Categories (id, category_title) VALUES (2, 'Marketingas');
INSERT INTO Categories (id, category_title) VALUES (3, 'Mokymai');

COMMIT;