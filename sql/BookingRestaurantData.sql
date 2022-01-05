-- ---------------------------------------------------------------
-- INSERT INTO RESTAURANTS
-- ---------------------------------------------------------------
INSERT INTO `booking_restaurant`.`restaurant` (`NAME`, `DESCRIPTION`, `ADDRESS`, `IMAGE`) 
VALUES ('BURGER_KING', 'sale of fast food especially hamburgers', 'manrique calle 80', 'BURGER_KING_RESTAURANT.jpg');
INSERT INTO `booking_restaurant`.`restaurant` (`NAME`, `DESCRIPTION`, `ADDRESS`, `IMAGE`) 
VALUES ('MAC_DONALS´S', 'sale of fast food especially hamburgers', 'manrique calle 33', 'MAC_DONALS´S_RESTAURANT.jpg');
INSERT INTO `booking_restaurant`.`restaurant` (`NAME`, `DESCRIPTION`, `ADDRESS`, `IMAGE`) 
VALUES ('KFC', 'sale of fast food especially hamburgers', 'manrique calle 45', 'KFC_RESTAURANT.jpg');
-- ---------------------------------------------------------------
-- INSERT INTO TURNS
-- ---------------------------------------------------------------
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_10_00', '1');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_11_00', '1');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_12_00', '1');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_13_00', '1');

INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_10_00', '2');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_11_00', '2');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_12_00', '2');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_13_00', '2');

INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_10_00', '3');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_11_00', '3');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_12_00', '3');
INSERT INTO `booking_restaurant`.`turn` (`NAME`, `RESTAURANT_ID`) VALUES ('TURNO_13_00', '3');

-- ---------------------------------------------------------------
-- INSERT INTO BOARDS
-- ---------------------------------------------------------------
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '21', '1');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '22', '1');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '23', '1');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '24', '1');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('5', '25', '1');

INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '21', '2');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '22', '2');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '23', '2');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '24', '2');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('5', '25', '2');

INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '21', '3');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('2', '22', '3');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '23', '3');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('3', '24', '3');
INSERT INTO `booking_restaurant`.`board` (`CAPACITY`, `NUMBER`, `RESTAURANT_ID`) VALUES ('5', '25', '3');

