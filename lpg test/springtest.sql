/*
 Navicat Premium Data Transfer

 Source Server         : MySQL56
 Source Server Type    : MySQL
 Source Server Version : 50651
 Source Host           : localhost:3306
 Source Schema         : springtest

 Target Server Type    : MySQL
 Target Server Version : 50651
 File Encoding         : 65001

 Date: 15/07/2021 09:43:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `id` int(11) NOT NULL,
  `category_name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES (1, 'Kitchen');
INSERT INTO `categories` VALUES (2, 'Power Tools');
INSERT INTO `categories` VALUES (3, 'Furniture');
INSERT INTO `categories` VALUES (4, 'Electric');
INSERT INTO `categories` VALUES (5, 'Washroom');
INSERT INTO `categories` VALUES (6, 'Textiles');
INSERT INTO `categories` VALUES (7, 'Misc.');

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `category_id` int(11) NULL DEFAULT NULL,
  `create_date` datetime(0) NULL DEFAULT NULL,
  `update_date` datetime(0) NULL DEFAULT NULL,
  `last_purchased_date` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of products
-- ----------------------------
INSERT INTO `products` VALUES (1, 'chonghai Gao', 'A set of knives in all shapes and sizes.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (2, 'Plate Rack', 'A storage solution for plates.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (3, 'Microwave', 'Cook food quick with this handy microwave.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (4, 'Juicer', 'When life gives you lemons, make lemonade.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 00:01:00');
INSERT INTO `products` VALUES (5, 'Meat Hooks', 'A butchers meat hook.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (6, 'Cabinet Knobs', 'Make sure you can open your cabinets.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (7, 'Frying Pans', 'Cook up a storm with this non stick frying pan.', 1, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (8, 'Power Drill', 'A drill, but with an electric motor.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (9, 'Jack Hammer', 'Demolish old concrete and removing pavement, it does it all1', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (10, 'Table Saw', 'A saw ideal for table top use.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (11, 'Sander', 'Get that smooth finish you\'ve been craving.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (12, 'Circular Saw', 'Its a saw, but circular.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (13, 'Diamond Core', 'Cut some really big holes in some really tough materials with this solid drill bit.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (14, 'Paddle Mixer', 'Mix just about anything with this paddle mixer.', 2, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 10:01:00');
INSERT INTO `products` VALUES (15, 'Sofas', 'Sofas galore, they\'re super soft and comfortable.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (16, 'Coffee Tables', 'Keep your coffee safe and stick it on one of these tables.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (17, 'Monoblocks', 'Lovely paving slabs which look great anywhere!', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (18, 'Footstool', 'Pop your feet up, you\'ve earned it.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-12-10 00:01:00');
INSERT INTO `products` VALUES (19, 'Armchair', 'Its a chair, but for you arms.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 00:01:00');
INSERT INTO `products` VALUES (20, '5 Chest Drawer', 'So many drawers.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (21, '3 Chest Drawer', 'Not so many drawers.', 3, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (22, 'Copper Wiring (10m)', 'A big ol\' spindle of copper wiring.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (23, 'Wire Strippers', 'Strip wire easily, with wire strippers.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 10:01:00');
INSERT INTO `products` VALUES (24, 'Torch', 'Shine on.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 00:01:00');
INSERT INTO `products` VALUES (25, 'Cable Knife', 'Cut cables, with a cable knife.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (26, 'Insulated Screwdrivers', 'Toasty screwdrivers.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (27, 'Light Bulb', 'What a great idea.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (28, 'Batteries', 'They last a really really long time.', 4, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (29, 'Hand Towel', 'Towels for your hands.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (30, 'Face Towel', 'Towels for you face.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (31, 'Toilet Seats', 'Seats for your toilet.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (32, 'Shower Head', 'Heads for your shower.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-09 00:01:00');
INSERT INTO `products` VALUES (33, 'Drain Plug', 'A high quality drain plug.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');
INSERT INTO `products` VALUES (34, 'Towel Rack', 'Hang your towels here.', 5, '2020-01-09 00:01:00', '2020-01-09 00:01:00', '2020-01-10 00:01:00');

SET FOREIGN_KEY_CHECKS = 1;
