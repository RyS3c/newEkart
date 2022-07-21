-- ------ SALES ------

TRUNCATE TABLE categories;
TRUNCATE TABLE products;
TRUNCATE TABLE products_in_categories;

INSERT INTO categories VALUES
    ('1', 'books', 'books'),
    ('2', 'games-toys', 'games and toys'),
    ('3', 'others', 'others');

INSERT INTO products VALUES
    ('1', 'Stranger thing', 'by duffer-bother', 8.00),
    ('2', 'Dont Listen', 'by Dennis Lain', 9.00),
    ('3', 'Spider-man', 'by Stan Lee', 7.00),
    ('4', 'Apex', 'Futuristic BattleRoyale', 4.00),
    ('5', 'COD', 'Best Battle Royale', 2.00),
    ('6', 'Pancit', 'Philippines Food', 1.00);


INSERT INTO products_in_categories VALUES
    ('1', '1'),
    ('2', '1'),
    ('3', '1'),
    ('4', '2'),
    ('5', '2'),
    ('6', '3');

-- ------ WAREHOUSE ------

TRUNCATE TABLE products_in_stock;

INSERT INTO products_in_stock VALUES
    ('1', 5),
    ('2', 0),
    ('3', 13),
    ('4', 55),
    ('5', 102),
    ('6', 1);