INSERT INTO user (user_id, user_pw, nick)
VALUES
('user1','1234','철수'),
('user2','1234','영희'),
('user3','1234','민수');

INSERT INTO post
(title, writer, content, post_type, status, category, location)
VALUES
('전동드릴 빌려드립니다','user1','공구 필요하신 분','LEND','AVAILABLE','공구','서울'),
('기타 빌려주세요','user2','기타 연습하려고 합니다','BORROW',NULL,'음악','서울'),
('캠핑 텐트 빌려드립니다','user1','4인용 텐트입니다','LEND','AVAILABLE','캠핑용품','경기'),
('축구공 빌려주세요','user3','주말에 필요합니다','BORROW',NULL,'스포츠','서울');