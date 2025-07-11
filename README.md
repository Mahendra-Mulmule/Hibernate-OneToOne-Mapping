# Hibernate-OneToOne-Mapping
Java Hibernate project demonstrating One-to-One mapping between Question and Answer entities
# Hibernate One-to-One Mapping

This project demonstrates a simple one-to-one mapping in Hibernate using annotations.

## Technologies Used
- Java
- Hibernate ORM (6.x)
- MySQL
- Maven or plain JARs (your choice)

## Description
- `Question` entity has a one-to-one relationship with `Answer`
- CascadeType is used to persist both entities together
- Tables are generated automatically using `hibernate.hbm2ddl.auto=create`

## Output
- Tables `question` and `answer` are created in MySQL
- Data inserted via Hibernate Session

## Author
Mahendra Mulmule
