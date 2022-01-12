INSERT INTO restaurant (name,description,address,image) VALUES ('KFC','fast food restaurant like burgers','calle 80','KFC_IMAGE.jpg');
INSERT INTO restaurant (name,description,address,image) VALUES ('BURGER_KING','fast food restaurant like burgers','calle 33','BURGER_KING_IMAGE.jpg');
INSERT INTO restaurant (name,description,address,image) VALUES ('MC_DONALD´S','fast food restaurant like burgers','calle 33','MC_DONALD´S_IMAGE.jpg');

INSERT INTO board (capacity, number, restaurant_id) VALUES (1, 21, 1);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 22, 1);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 23, 1);
INSERT INTO board (capacity, number, restaurant_id) VALUES (3, 24, 1);
INSERT INTO board (capacity, number, restaurant_id) VALUES (5, 25, 1);

INSERT INTO board (capacity, number, restaurant_id) VALUES (1, 21, 2);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 22, 2);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 23, 2);
INSERT INTO board (capacity, number, restaurant_id) VALUES (3, 24, 2);
INSERT INTO board (capacity, number, restaurant_id) VALUES (5, 25, 2);

INSERT INTO board (capacity, number, restaurant_id) VALUES (1, 21, 3);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 22, 3);
INSERT INTO board (capacity, number, restaurant_id) VALUES (2, 23, 3);
INSERT INTO board (capacity, number, restaurant_id) VALUES (3, 24, 3);
INSERT INTO board (capacity, number, restaurant_id) VALUES (5, 25, 3);

INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_10_00', 1);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_11_00', 1);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_12_00', 1);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_13_00', 1);

INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_10_00', 2);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_11_00', 2);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_12_00', 2);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_13_00', 2);

INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_10_00', 3);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_11_00', 3);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_12_00', 3);
INSERT INTO turn (name, restaurant_id) VALUES ('TURNO_13_00', 3);

INSERT INTO reservation (locator, person, date, turn, restaurant_id) VALUES ('KFC', 3, '2022-12-01', 'TURNO_10_00', 1);
INSERT INTO reservation (locator, person, date, turn, restaurant_id) VALUES ('KFC', 3, '2022-12-01', 'TURNO_11_00', 2);
INSERT INTO reservation (locator, person, date, turn, restaurant_id) VALUES ('KFC', 3, '2022-12-01', 'TURNO_12_00', 3);