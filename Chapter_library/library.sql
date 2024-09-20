/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80037 (8.0.37)
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 80037 (8.0.37)
 File Encoding         : 65001

 Date: 11/06/2024 20:21:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`
(
    `book_id`      int                                                           NOT NULL AUTO_INCREMENT,
    `book_no`      varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci  NOT NULL COMMENT '图书编号',
    `book_name`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图书名',
    `author`       varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '作者',
    `type`         varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '分类',
    `publisher`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '出版社',
    `price`        double                                                        NOT NULL COMMENT '价格',
    `synopsis`     varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '简介',
    `borrow_count` int                                                           NOT NULL COMMENT '借阅数',
    `borrow_sum`   int                                                           NOT NULL COMMENT '库存量',
    PRIMARY KEY (`book_id`) USING BTREE,
    INDEX `book_name` (`book_name` ASC) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 17
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book`
VALUES (3, 'ts_0003', '西游记', '吴承恩', '文学类', '上海出版社', 60,
        '《西游记》是中国古典四大名著之一，是由明代小说家吴承恩整理创作的中国古代浪漫主义的长篇神魔小说。主要描写了孙悟空、猪八戒、沙僧三人保护唐僧西行取经，唐僧从投胎到取经归来共遇到八十一难，一路降妖伏魔，化险为夷，到达西天、取得真经的故事。《西游记》自问世以来在中国乃至世界各地广为流传，被翻译成多种语言。孙悟空的形象，以其鲜明的个性特征，在中国文学史上立起了一座不朽的艺术丰碑。',
        5, 5);
INSERT INTO `book`
VALUES (4, 'ts_0004', 'C++入门', '删库跑路', '计算机类', '大专出版社', 44,
        '除令全球无数程序员从中受益，甚至为之迷醉的——C++ 大师 Stanley B. Lippman 的丰富实践经验，C++标准委员会原负责人 Josée Lajoie 对C++标准的深入理解，以及C+ + 先驱 Barbara E. Moo 在 C++教学方面的真知灼见外，更是基于全新的 C++11标准进行了全面而彻底的内容更新。 非常难能可贵的是，本书所有示例均全部采用 C++11 标准改写，这在经典升级版中极其罕见——充分体现了 C++ 语言的重大进展及其全面实践。 ',
        2, 8);
INSERT INTO `book`
VALUES (5, 'ts_0002', '红楼梦', '曹雪芹', '文学类', '北京出版社', 68,
        '《红楼梦》，中国古代章回体长篇小说，中国古典四大名著之一。其通行本共120回，一般认为前80回是清代作家曹雪芹所著，后40回作者为无名氏，整理者为程伟元、高鹗。小说以贾、史、王、薛四大家族的兴衰为背景，以富贵公子贾宝玉为视角，以贾宝玉与林黛玉、薛宝钗的爱情婚姻悲剧为主线，描绘了一些闺阁佳人的人生百态，展现了真正的人性美和悲剧美，是一部从各个角度展现女性美以及中国古代社会百态的史诗性著作。',
        3, 7);
INSERT INTO `book`
VALUES (6, 'ts_0006', 'Java入门', '删库跑路', '计算机类', '天津出版社', 88,
        '本书基于目前使用最为广泛的JDK 11进行讲解。 全书共13章。 第1章为Java开发入门；第2～7章讲解Java编程的基础知识，包括Java编程基础、面向对象、异常、Java API和集合等；第8～13章讲解Java编程的进阶知识，包括泛型、反射机制、I/O、JDBC、多线程、网络编程等内容。本书通俗易懂，针对较难理解的问题，都是由浅入深地剖析案例，便于读者将所学知识融会贯通。 本书配套资源包括视频、源代码、题库、教学课件等。 ',
        7, 3);

-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS `borrow`;
CREATE TABLE `borrow`
(
    `borrow_id`   int                                                           NOT NULL AUTO_INCREMENT,
    `user_id`     int                                                           NULL DEFAULT NULL,
    `book_id`     int                                                           NULL DEFAULT NULL,
    `book_name`   varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
    `status`      tinyint                                                       NULL DEFAULT NULL,
    `borrow_date` datetime                                                      NULL DEFAULT NULL,
    `return_date` datetime                                                      NULL DEFAULT NULL,
    PRIMARY KEY (`borrow_id`) USING BTREE,
    INDEX `1` (`user_id` ASC) USING BTREE,
    INDEX `2` (`book_id` ASC) USING BTREE,
    INDEX `3` (`book_name` ASC) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 166
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO `borrow`
VALUES (164, 2, 4, 'C++入门', 0, '2024-06-11 16:16:46', '2024-06-11 16:16:56');
INSERT INTO `borrow`
VALUES (165, 2, 4, 'C++入门', 1, '2024-06-11 16:49:44', NULL);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `user_id`  int                                                           NOT NULL AUTO_INCREMENT,
    `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
    `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
    `email`    varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '邮件',
    `role`     varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci   NOT NULL DEFAULT '1' COMMENT '账号分类(0-管理员 1-用户)',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 14
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user`
VALUES (1, 'admin', '123456', '', '0');
INSERT INTO `user`
VALUES (2, 'tom', 'tom123', 'a@q.com', '1');
INSERT INTO `user`
VALUES (9, 'lisi', 'lisi123', 'aaaa@fsffs', '1');
INSERT INTO `user`
VALUES (11, 'spark', 'spark123', 'ddddd@qq.com', '1');
INSERT INTO `user`
VALUES (12, 'wangwu', '123123', 'a@qq.com', '1');
INSERT INTO `user`
VALUES (13, 'ddsdsd', 'dsd', 'ss@gmail.com', '1');

SET FOREIGN_KEY_CHECKS = 1;
