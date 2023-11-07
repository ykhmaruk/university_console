CREATE TABLE IF NOT EXISTS `departments`
(
    `id`                    BIGINT       NOT NULL AUTO_INCREMENT,
    `name`                  VARCHAR(255) DEFAULT NULL,
    `head_of_department_id` BIGINT       DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `head_of_department_id` (`head_of_department_id`),
    CONSTRAINT `head_of_department_fk` FOREIGN KEY (`head_of_department_id`) REFERENCES `lectors` (`id`)
    ) ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb3;