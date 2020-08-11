DROP database IF EXISTS webshop;

CREATE TABLE IF NOT EXISTS shop_user (
    shop_user_id SERIAL,
    email VARCHAR(128) NOT NULL UNIQUE,
    name VARCHAR(128) NOT NULL,
    password VARCHAR(128) NOT NULL,
    username VARCHAR(128) NOT NULL UNIQUE,
    zip INTEGER NOT NULL,
    address VARCHAR(128) NOT NULL,
    is_admin BOOLEAN DEFAULT FALSE,
    PRIMARY KEY (shop_user_id)
);

CREATE TABLE IF NOT EXISTS cart (
    cart_id SERIAL,
    product_name VARCHAR(128) NOT NULL,
    
	user_id INTEGER NOT NULL,
	 FOREIGN KEY (user_id) REFERENCES shop_user(shop_user_id),
    PRIMARY KEY (cart_id)
);

CREATE TABLE IF NOT EXISTS product (
    product_id SERIAL,
    name VARCHAR(128) NOT NULL,
    is_active BOOLEAN,
    price INTEGER NOT NULL,
    category VARCHAR(128) NOT NULL,
	img VARCHAR(512) NOT NULL,
    PRIMARY KEY (product_id)
);


CREATE TABLE IF NOT EXISTS add_to_cart (
    cart_id INTEGER NOT NULL,
    product_id INTEGER NOT NULL,
    FOREIGN KEY (cart_id) REFERENCES cart(cart_id),
    FOREIGN KEY (product_id) REFERENCES product(product_id)
);

CREATE TABLE IF NOT EXISTS receipt (
    receipt_id SERIAL,
    product_name VARCHAR(128) NOT NULL,
    product_quantity INTEGER NOT NULL,
    total INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES shop_user(shop_user_id),
    PRIMARY KEY (receipt_id)
);