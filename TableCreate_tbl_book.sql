DROP TABLE IF EXISTS tbl_book;
CREATE TABLE tbl_book (
  id int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  type varchar(20) NULL DEFAULT NULL,
  name varchar(50) NULL DEFAULT NULL,
  description varchar(255) NULL DEFAULT NULL
)

INSERT INTO `tbl_book` VALUES (1, '計算機理論', 'Spring實戰 第5版', 'Spring入門經典教程，深入理解Spring原理技術內幕');
INSERT INTO `tbl_book` VALUES (2, '計算機理論', 'Spring 5核心原理與30個類手寫實戰', '十年沈澱之作，手寫Spring精華思想');
INSERT INTO `tbl_book` VALUES (3, '計算機理論', 'Spring 5設計模式', '全方位解析面向Web應用的輕量級框架，帶你成為Spring MVC開發高手');
INSERT INTO `tbl_book` VALUES (4, '計算機理論', 'Spring MVC+MyBatis開發從入門到項目實戰', '源碼級剖析Spring框架，適合已掌握Java基礎的讀者');
INSERT INTO `tbl_book` VALUES (5, '計算機理論', '輕量級Java Web企業應用實戰', '源碼級剖析Spring框架，適合已掌握Java基礎的讀者');
INSERT INTO `tbl_book` VALUES (6, '計算機理論', 'Java核心技術卷I基礎知識(原書第11版)','CoreJava第11版，Jolt大獎獲獎作品，針對JavaSE9、10、11全面更新');
INSERT INTO `tbl_book` VALUES (7, '計算機理論', '深入理解Java虛擬機', '5個維度全面剖析JVM，大廠面試知識點全覆蓋');
INSERT INTO `tbl_book` VALUES (8, '計算機理論', 'Java編程思想(第4版)', 'Java學習必讀經典,殿堂級著作!贏得了全球程序員的廣泛讚譽');
INSERT INTO `tbl_book` VALUES (9, '計算機理論', '零基礎學Java(全彩版)', '零基礎自學編程的入門圖書，由淺入深，詳解Java語言的編程思想和核心技術');
INSERT INTO `tbl_book` VALUES (10, '市場營銷', '直播就該這麼做:主播高效溝通實戰指南', '李子染、李佳琦、薇婭成長為網紅的秘密都在書中');
INSERT INTO `tbl_book` VALUES (11, '市場營銷', '直播銷講實戰一本通', '和秋葉一起學系列網絡營銷書籍');
INSERT INTO `tbl_book` VALUES (12, '市場營銷', '直播帶貨:淘寶、天貓直播從新手到高手', '一本教你如何玩轉直播的書，10堂課輕鬆實現帶貨月入3W+');

SELECT * FROM tbl_book;