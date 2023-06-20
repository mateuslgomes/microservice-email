CREATE TABLE email (
    email_id binary(16) NOT NULL DEFAULT (UUID_TO_BIN(UUID(), TRUE)),
    owner_ref VARCHAR(255),
    email_from VARCHAR(255),
    email_to VARCHAR(255),
    subject VARCHAR(255),
    text TEXT,
    send_date_email DATETIME,
    status_email VARCHAR(255)
);
