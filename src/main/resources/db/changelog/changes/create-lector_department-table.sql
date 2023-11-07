CREATE TABLE IF NOT EXISTS `lector_department`
(
    `lector_id`     BIGINT         NOT NULL,
    `department_id` BIGINT         NOT NULL,
    PRIMARY KEY (`department_id`, `lector_id`),
    KEY `lector_id` (`lector_id`),
    KEY `department_id` (`department_id`),
    CONSTRAINT `lector_fk` FOREIGN KEY (`lector_id`) REFERENCES `lectors` (`id`),
    CONSTRAINT `department_fk` FOREIGN KEY (`department_id`) REFERENCES `departments` (`id`)
    ) ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb3;