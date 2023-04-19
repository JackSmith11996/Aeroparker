CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  registered DATETIME NOT NULL,
  email_address VARCHAR(255) UNIQUE NOT NULL,
  title VARCHAR(5) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  address_line_1 VARCHAR(255) NOT NULL,
  address_line_2 VARCHAR(255),
  city VARCHAR(255) NOT NULL,
  postcode VARCHAR(10),
  phone_number VARCHAR(20) NOT NULL
);
