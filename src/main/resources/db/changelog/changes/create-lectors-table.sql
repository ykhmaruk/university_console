CREATE TABLE IF NOT EXISTS `lectors`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT,
    `full_name`  VARCHAR(255) DEFAULT NULL,
    `degree`     VARCHAR(255) DEFAULT NULL,
    `salary`     DECIMAL      NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`)
    ) ENGINE = InnoDB
    DEFAULT CHARSET = utf8mb3;