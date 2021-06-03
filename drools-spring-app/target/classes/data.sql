insert into skill (id, name, level, type, priority, orientation) values
	(1, 'Illusion', 15.0, 2, 1, 2),
	(2, 'Conjuration', 15.0, 0, 1, 2),
	(3, 'Destruction', 15.0, 0, 1, 2),
	(4, 'Restoration', 15.0, 1, 1, 2),
	(5, 'Alteration', 15.0, 2, 1, 2),
	(6, 'Enchanting', 15.0, 2, 1, 2),
	(7, 'Smithing', 15.0, 2, 1, 0),
	(8, 'Heavy Armor', 15.0, 1, 1, 0),
	(9, 'Block', 15.0, 1, 1, 0),
	(10, 'One-handed', 15.0, 0, 1, 0),
	(11, 'Two-handed', 15.0, 0, 1, 0),
	(12, 'Archery', 15.0, 0, 1, 0),
	(13, 'Light Armor', 15.0, 1, 1, 1),
	(14, 'Lockpicking', 15.0, 2, 1, 1),
	(15, 'Sneak', 15.0, 2, 1, 1),
	(16, 'Pickpocket', 15.0, 2, 1, 1),
	(17, 'Speech', 15.0, 2, 1, 1),
	(18, 'Alchemy', 15.0, 2, 1, 1);
	
insert into subsets (skill_id, subset_name, value) values
	(11, 'Battleaxe', 0),
	(11, 'Greatsword', 0),
	(11, 'Warhammer', 0),
	(10, 'Sword', 0),
	(10, 'Mace', 0),
	(10, 'War Axe', 0),
	(3, 'Frost', 0),
	(3, 'Fire', 0),
	(3, 'Shock', 0);
	