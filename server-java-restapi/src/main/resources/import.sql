insert into user (username, password, enabled, role) values ('admin', '$2a$10$Xtv0umJn1DDZ3ds5FTWHUOHuwJnRQ0qrYpTA1ANaRl8vdiwo1R1iW', true, 'ROLE_ADMIN');
-- password: admin
insert into user (username, password, enabled, role) values ('user', '$2a$10$QUhsliTs8Ufe9nSQgIwzzeDktWOdDw8WY77lN.3AAXL5vVDI2EoVO', true, 'ROLE_USER');
-- password: user

INSERT INTO MOVIE (user_id, title, category, director, description, length, poster_url, create_at, modified_at) VALUES (1, 'film cim1', 'fantasy', 'nem en1', 'ez egy gaz film lett1', 133, 'pont_itt_van1.jpg', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO MOVIE (user_id, title, category, director, description, length, poster_url, create_at, modified_at) VALUES (1, 'film cim2', 'scifi', 'nem en2', 'ez egy gaz film lett2', 143, 'pont_itt_van2.jpg', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
INSERT INTO MOVIE (user_id, title, category, director, description, length, poster_url, create_at, modified_at) VALUES (2, 'film cim3', 'fantasy', 'nem en3', 'ez egy gaz film lett3', 141, 'pont_itt_van3.jpg', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());
