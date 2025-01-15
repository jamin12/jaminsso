CREATE TABLE IF NOT EXISTS accounts
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,                              -- 기본 키
    email               VARCHAR(255) NOT NULL,                                          -- 이메일 (필수)
    password            VARCHAR(255) NOT NULL,                                          -- 패스워드 (필수)
    provider            VARCHAR(50)  NOT NULL,                                          -- Provider 정보
    provider_account_id VARCHAR(50)  NOT NULL,                                          -- Provider의 계정 ID
    created_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP,                            -- 생성일
    updated_at          TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- 수정일
);

CREATE UNIQUE INDEX idx_accounts_provider ON accounts (provider, provider_account_id);
