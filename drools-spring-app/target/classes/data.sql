insert into player (id, level, race, role) values
	(1, 1.0, 'Nord', 0);

insert into skill (id, name, level, type, priority, orientation, player_id) values
	(1, 'Illusion', 15.0, 2, 9, 2, 1),
	(2, 'Conjuration', 15.0, 0, 5, 2, 1),
	(3, 'Destruction', 15.0, 0, 5, 2, 1),
	(4, 'Restoration', 15.0, 1, 4, 2, 1),
	(5, 'Alteration', 15.0, 2, 9, 2, 1),
	(6, 'Enchanting', 15.0, 2, 9, 2, 1),
	(7, 'Smithing', 15.0, 2, 9, 0, 1),
	(8, 'Heavy_Armor', 15.0, 1, 4, 0, 1),
	(9, 'Block', 15.0, 1, 4, 0, 1),
	(10, 'Onehanded', 15.0, 0, 5, 0, 1),
	(11, 'Twohanded', 15.0, 0, 5, 0, 1),
	(12, 'Archery', 15.0, 0, 5, 0, 1),
	(13, 'Light_Armor', 15.0, 1, 4, 1, 1),
	(14, 'Sneak', 15.0, 2, 9, 1, 1),
	(15, 'Lockpicking', 15.0, 2, 9, 1, 1),
	(16, 'Pickpocket', 15.0, 2, 9, 1, 1),
	(17, 'Speech', 15.0, 2, 9, 1, 1),
	(18, 'Alchemy', 15.0, 2, 9, 1, 1);
	
insert into subsets (skill_id, subset_name, value) values
	(11, 'Battleaxe', 0),
	(11, 'Greatsword', 0),
	(11, 'Warhammer', 0),
	(10, 'Sword', 0),
	(10, 'Mace', 0),
	(10, 'Axe', 0),
	(3, 'Frost', 0),
	(3, 'Fire', 0),
	(3, 'Shock', 0);
	
--illusion
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(1, 1, 'Novice Illusion', 'Cast Novice level Illusion spells for half magicka', false, true, false, 1, 15, 1),
	(2, 1, 'Illusion Dual Casting', 'Dual casting an Illusion spell overcharges the effects into an even more powerful version', false, true, false, 1, 20, 2),
	(3, 1, 'Animage', 'Illusion spells now work on higher level animals (+8 levels)', false, false, false, 1, 20, 2),
	(4, 1, 'Apprentice Illusion', 'Cast Apprentice level Illusion spells for half magicka', false, true, false, 1, 25, 2),
	(5, 1, 'Hypnotic Gaze', 'Calm spells now work on higher level opponents (+8 levels)', false, true, false, 1, 30, 3),
	(6, 1, 'Kindred Mage', 'All Illusion spells work on higher level people (+10 levels)', false, true, false, 1, 40, 4),
	(7, 1, 'Adept Illusion', 'Cast Adept level Illusion spells for half magicka', false, true, false, 1, 50, 5),
	(8, 1, 'Aspect of Terror', 'Fear spells work on higher level opponents (+10 levels)', false, true, false, 1, 50, 5),
	(9, 1, 'Quiet Casting', 'All spells cast from any school of magic are silent to others.', false, false, false, 1, 50, 5),
	(10, 1, 'Rage', 'Frenzy spells work on higher level opponents (+12 levels)', false, true, false, 1, 70, 6),
	(11, 1, 'Expert Illusion', 'Cast Expert level Illusion spells for half magicka.', false, true, false, 1, 75, 6),
	(12, 1, 'Master of the Mind', 'Illusion spells work on undead, daedra and automatons.', false, true, false, 1, 90, 7),
	(13, 1, 'Master Illusion', 'Cast Master level Illusion spells for half magicka.	', false, true, false, 1, 100, 7);

--conjuration
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(14, 2, 'Novice Conjuration', 'Cast Novice level Conjuration spells for half magicka', false, true, false, 1, 15, 1),
	(15, 2, 'Conjuration Dual Casting', 'Dual casting an Conjuration spell overcharges the effects into an even more powerful version', false, true, false, 1, 20, 2),
	(16, 2, 'Mystic Binding', 'Bound weapons do more damage', false, true, true, 1, 20, 2),
	(17, 2, 'Apprentice Conjuration', 'Cast Apprentice level Conjuration spells for half magicka', false, true, false, 1, 25, 2),
	(18, 2, 'Summoner', 'Can summon Atronachs, raise undead or Dremora Lords twice as far away', false, true, true, 2, 30, 3),
	(19, 2, 'Soul Stealer', 'Bound weapons cast Soul Trap on targets', false, false, true, 1, 30, 3),
	(20, 2, 'Necromancy', 'Greater duration for reanimated undead', false, true, true, 1, 40, 4),
	(21, 2, 'Atromancy', 'Double duration for conjured Atronachs and Dremora Lords', false, true, true, 1, 40, 4),
	(22, 2, 'Adept Conjuration', 'Cast Adept level Conjuration spells for half magicka', false, true, false, 1, 50, 5),
	(23, 2, 'Oblivion Binding', 'Bound weapons will banish summoned creatures and turn raised ones', false, false, true, 1, 50, 5),
	(24, 2, 'Dark Souls', '	Reanimated undead have 100 points more health', false, true, true, 1, 70, 6),
	(25, 2, 'Expert Conjuration', 'Cast Expert level Conjuration spells for half magicka', false, true, false, 1, 75, 6),
	(26, 2, 'Elemental Potency', 'Conjured Atronachs are 50% more powerful', false, true, true, 1, 80, 7),
	(27, 2, 'Twin Souls', 'The player can have two conjured creatures', false, true, true, 1, 100, 8),
	(28, 2, 'Master Conjuration', 'Cast Master level Conjuration spells for half magicka', false, true, false, 1, 100, 8);
	
	
--destruction
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(29, 3, 'Novice Destruction', 'Cast Novice level Destruction spells for half magicka', false, true, false, 1, 15, 1),
	(30, 3, 'Destruction Dual Casting', 'Dual casting an Destruction spell overcharges the effects into an even more powerful version', false, true, false, 1, 20, 2),
	(31, 3, 'Apprentice Destruction', 'Cast Apprentice level Destruction spells for half magicka', false, true, false, 1, 25, 2),
	(32, 3, 'Augmented Flames', 'Fire spells do 25% more damage', false, true, true, 2, 30, 3),
	(33, 3, 'Augmented Frost', 'Frost spells do 25% more damage', false, true, true, 2, 30, 3),
	(34, 3, 'Augmented Shock', 'Shock spells do 25% more damage', false, true, true, 2, 30, 3),
	(35, 3, 'Impact', 'Most destruction spells will stagger an opponent when dual cast', false, false, false, 1, 40, 4),
	(36, 3, 'Rune Master', 'Can place runes five times farther away', false, false, false, 1, 40, 4),
	(37, 3, 'Adept Destruction', 'Cast Adept level Destruction spells for half magicka', false, true, false, 1, 50, 5),
	(38, 3, 'Intense Flames', 'Fire damage causes targets to flee if their health is low', false, true, true, 1, 50, 5),
	(39, 3, 'Deep Freeze', 'Frost damage paralyzes targets if their health is low', false, true, true, 1, 60, 6),
	(40, 3, 'Disintegrate', 'Shock damage disintegrates targets if their health is low', false, true, true, 1, 70, 7),
	(41, 3, 'Expert Destruction', 'Cast Expert level Destruction spells for half magicka', false, true, false, 1, 75, 7),
	(42, 3, 'Master Destruction', 'Cast Master level Destruction spells for half magicka', false, true, false, 1, 100, 8);
	
--restoration
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(43, 4, 'Novice Restoration', 'Cast Novice level Restoration spells for half magicka', false, true, false, 1, 15, 1),
	(44, 4, 'Restoration Dual Casting', 'Dual casting an Restoration spell overcharges the effects into an even more powerful version', false, true, false, 1, 20, 2),
	(45, 4, 'Regeneration', 'Healing spells cure 50% more', false, true, false, 2, 20, 2),
	(46, 4, 'Apprentice Restoration', 'Cast Apprentice level Restoration spells for half magicka', false, true, false, 1, 25, 2),
	(47, 4, 'Recovery', 'Magicka regenerates 25% faster', false, true, false, 2, 30, 3),
	(48, 4, 'Respite', 'Healing spells also restore stamina', false, false, false, 1, 40, 4),
	(49, 4, 'Adept Restoration', 'Cast Adept level Restoration spells for half magicka', false, true, false, 1, 50, 5),
	(50, 4, 'Ward Absorb', 'Wards that are cast absorb 25% of magicka that hits them.', false, false, false, 1, 60, 6),
	(51, 4, 'Necromage', 'All spells are more effective against undead', false, false, false, 1, 70, 7),
	(52, 4, 'Expert Restoration', 'Cast Expert level Restoration spells for half magicka', false, true, false, 1, 75, 7),
	(53, 4, 'Avoid Death', 'Once a day, heals 250 points automatically if the caster falls below 10% health', false, true, false, 1, 90, 8),
	(54, 4, 'Master Restoration', 'Cast Master level Restoration spells for half magicka', false, true, false, 1, 100, 9);

--alteration
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(55, 5, 'Novice Alteration', 'Cast Novice level Alteration spells for half magicka', false, true, false, 1, 15, 1),
	(56, 5, 'Alteration Dual Casting', 'Dual casting an Alteration spell overcharges the effects into an even more powerful version', false, true, false, 1, 20, 2),
	(57, 5, 'Apprentice Alteration', 'Cast Apprentice level Alteration spells for half magicka', false, true, false, 1, 25, 2),
	(58, 5, 'Mage Armor', 'Protection spells like Stoneflesh are twice as strong if not wearing armor', false, false, false, 3, 30, 3),
	(59, 5, 'Magic Resistance', 'Blocks 10%/20%/30% of a spells effect.', false, true, false, 3, 30, 3),
	(60, 5, 'Adept Alteration', 'Cast Adept level Alteration spells for half magicka', false, true, false, 1, 50, 4),
	(61, 5, 'Stability', 'Alteration spells have greater duration', false, true, false, 1, 70, 5),
	(62, 5, 'Expert Alteration', 'Cast Expert level Alteration spells for half magicka', false, true, false, 1, 75, 5),
	(63, 5, 'Atronach', 'Grants 30% Spell Absorption', false, true, false, 1, 100, 6),
	(64, 5, 'Master Alteration', 'Cast Master level Alteration spells for half magicka', false, true, false, 1, 100, 6);

--enchanting
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(65, 6, 'Enchanter', 'New enchantments are 20/40/60/80/100% stronger', false, true, false, 5, 0, 1),
	(66, 6, 'Soul Squeezer', 'Soul gems provide extra magicka for recharging', false, true, false, 1, 20, 2),
	(67, 6, 'Fire Enchanter', 'Fire enchantments on weapons and armor are 25% stronger', false, true, true, 1, 30, 3),
	(68, 6, 'Soul Siphon', 'Death blows to creatures, but not people, trap 5% of the victims soul, recharging the weapon', false, false, false, 1, 40, 4),
	(69, 6, 'Frost Enchanter', 'Frost enchantments on weapons and armor are 25% stronger', false, true, true, 1, 40, 4),
	(70, 6, 'Insightful Enchanter', 'Skill enchantments on armor are 25% stronger', false, false, false, 1, 50, 5),
	(71, 6, 'Storm Enchanter', 'Schock enchantments on weapons and armor are 25% stronger', false, true, true, 1, 50, 5),
	(72, 6, 'Corpus Enchanter', 'Health, magicka and stamina enchantments on armor are 25% stronger', false, false, false, 1, 70, 6),
	(73, 6, 'Extra Effect', 'Can put two enchantments on the same item', false, true, false, 1, 100, 7);
	
--smithing
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(74, 7, 'Steel Smithing', 'Can create Steel armor and weapons at forges, and improve them twice as much.', false, true, false, 1, 15, 1),
	(75, 7, 'Elven Smithing', 'Can create Elven armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 30, 2),
	(76, 7, 'Dwarven Smithing', 'Can create Dwarven armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 30, 2),
	(77, 7, 'Advanced Armors', 'Can create scaled and steel plate armor at forges, and improve them twice as much.', false, true, true, 1, 50, 3),
	(78, 7, 'Orcish Smithing', 'Can create Orcish armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 50, 3),
	(79, 7, 'Arcane Blacksmith', 'Magical weapons and armor can now be improved.', false, false, false, 1, 60, 4),
	(80, 7, 'Glass Smithing', 'Can create Glass armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 70, 5),
	(81, 7, 'Ebony Smithing', 'Can create Ebony armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 80, 6),
	(82, 7, 'Daedric Smithing', 'Can create Daedric armor and weapons at forges, and improve them twice as much.', false, true, true, 1, 90, 7),
	(83, 7, 'Dragon Smithing', 'Can create Dragon armor and weapons at forges, and improve them twice as much.', false, true, false, 1, 100, 8);

--heavy armor
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(84, 8, 'Juggernaut', 'Increases armor rating for Heavy Armor by 20%', false, true, false, 5, 0, 1),
	(85, 8, 'Fists of Steel', 'Unarmed attacks with Heavy Armor gauntlets do their base armor rating in extra damage. Sneak attack bonus is two times the damage.', false, false, false, 1, 30, 2),
	(86, 8, 'Well Fitted', '25% armor bonus if wearing all Heavy Armor: head, chest, hands, feet.', false, true, false, 1, 30, 2),
	(87, 8, 'Cushioned', 'Half damage from falling if wearing all Heavy Armor: head, chest, hands, feet', false, false, false, 1, 50, 3),
	(88, 8, 'Tower of Strength', '50% less stagger when wearing only Heavy Armor', false, true, false, 1, 50, 3),
	(89, 8, 'Conditioning', 'Wearing Heavy armor no longer affects how much stamina is used when sprinting. Any heavy armor worn no longer counts towards the carry weight.', false, true, false, 1, 70, 4),
	(90, 8, 'Matching Set', 'Additional 25% armor bonus if wearing a matched set of Heavy Armor', false, true, false, 1, 70, 4),
	(91, 8, 'Reflect Blows', '10% chance to reflect melee damage back to the enemy while wearing all Heavy Armor: head, chest, hands, feet.', false, false, false, 1, 100, 5);

--block
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(92, 9, 'Shield Wall', 'Blocking is 20% more effective', false, true, false, 5, 0, 1),
	(93, 9, 'Deflect Arrows', 'Arrows that hit the shield do no damage', false, false, false, 1, 30, 2),
	(94, 9, 'Quick Reflexes', 'Time slows down if you are blocking during an enemys power attack', false, true, false, 1, 30, 2),
	(95, 9, 'Power Bash', 'Able to do a power bash', false, false, false, 1, 30, 2),
	(96, 9, 'Elemental Protection', 'Blocking with a shield reduces incoming fire, frost and shock damage by 50%', false, true, false, 1, 50, 3),
	(97, 9, 'Deadly Bash', 'Bashing does five times more damage', false, true, false, 1, 50, 3),
	(98, 9, 'Block Runner', 'Able to move faster with a shield or weapon raised', false, false, false, 1, 70, 4),
	(99, 9, 'Disarming Bash', 'Chance to disarm when power bashing (50% chance)', false, true, false, 1, 70, 4),
	(100, 9, 'Shield Charge', 'Sprinting with a shield raised knocks down most targets', false, false, false, 1, 100, 5);

--two-handed
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(101, 10, 'Barbarian', 'Two-Handed weapons do 20% more damage', false, true, false, 5, 0, 1),
	(102, 10, 'Champions Stance', 'Power attacks with two-handed weapons cost 25% less stamina', false, false, false, 1, 20, 2),
	(103, 10, 'Limbsplitter', 'Attacks with battle axes cause extra bleeding damage', false, true, true, 3, 30, 3),
	(104, 10, 'Deep Wounds', 'Attacks with greatswords have a 10% chance of doing critical damage', false, true, true, 3, 30, 3),
	(105, 10, 'Skull Crusher', 'Attacks with warhammers ignore 25% of armor', false, true, true, 3, 30, 3),
	(106, 10, 'Devastating Blow', 'Standing power attacks do 25% bonus damage with a chance to decapitate your enemies', false, true, false, 1, 50, 4),
	(107, 10, 'Great Critical Charge', 'Can do a two-handed power attack while sprinting that does double critical damage', false, false, false, 1, 50, 4),
	(108, 10, 'Sweep', 'Sideways power attacks with two-handed weapons hit all targets in front of you', false, false, false, 1, 70, 5),
	(109, 10, 'Warmaster', 'Backwards power attack has a 25% chance to paralyze the target', false, false, false, 1, 100, 6);

--one-handed
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(110, 11, 'Armsman', 'One-handed weapons do 20% more damage', false, true, false, 5, 0, 1),
	(111, 11, 'Fighting Stance', 'Power attacks with one-handed weapons cost 25% less stamina', false, false, false, 1, 20, 2),
	(112, 11, 'Hack and Slash', 'Attacks with war axes cause extra bleeding damage', false, true, true, 3, 30, 3),
	(113, 11, 'Bone Breaker', 'Attacks with maces ignore 25% of armor', false, true, true, 3, 30, 3),
	(114, 11, 'Bladesman', 'Attacks with swords have a 10% chance of doing critical damage', false, true, true, 3, 30, 3),
	(115, 11, 'Dual Flurry', 'Dual wielding attacks are 20% faster ', false, true, true, 2, 30, 3),
	(116, 11, 'Savage Strike', 'Standing power attacks do 25% bonus damage with a chance to decapitate your enemies', false, true, false, 1, 50, 4),
	(117, 11, 'Critical Charge', 'Can do a one-handed power attack while sprinting that does double critical damage', false, false, false, 1, 50, 4),
	(118, 11, 'Dual Savagery', 'Dual wielding power attacks do 50% bonus damage', false, false, false, 1, 70, 5),
	(119, 11, 'Warmaster', 'Backwards power attack has a 25% chance to paralyze the target', false, false, false, 1, 100, 6);

--archery
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(120, 12, 'Overdraw', 'Bows do 20% more damage', false, true, false, 5, 0, 1),
	(121, 12, 'Eagle Eye', 'Pressing Block while aiming will zoom in your view', false, true, false, 3, 20, 2),
	(122, 12, 'Critical Shot', '10% chance of a critical hit that does extra damage', false, true, false, 1, 30, 2),
	(123, 12, 'Steady Hand', 'Zooming in with a bow slows time by 25% ', false, true, false, 2, 40, 3),
	(124, 12, 'Power Shot', 'Arrows stagger all but the largest opponents 50% of the time', false, true, false, 1, 50, 4),
	(125, 12, 'Hunters Discipline', 'Recover twice as many arrows from dead bodies', false, false, false, 1, 50, 4),
	(126, 12, 'Ranger', 'Able to move faster with a drawn bow', false, false, false, 1, 60, 5),
	(127, 12, 'Quick Shot', 'Can draw a bow 30% faster', false, false, false, 1, 70, 6),
	(128, 12, 'Bullseye', '15% chance of paralyzing the target for a few seconds', false, true, false, 1, 100, 7);

--light armor
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(129, 13, 'Agile Defender', 'Increases armor rating for Light Armor by 20%', false, true, false, 5, 0, 1),
	(130, 13, 'Custom Fit', '25% armor bonus if wearing all Light Armor: head, chest, hands, feet.', false, true, false, 1, 30, 2),
	(131, 13, 'Unhindered', 'Light Armor weighs nothing and doesnt slow you down when worn', false, false, false, 1, 50, 3),
	(132, 13, 'Wind Walker', 'Stamina regenerates 50% faster in all Light Armor: head, chest, hands, feet', false, true, false, 1, 60, 4),
	(133, 13, 'Matching Set', 'Additional 25% armor bonus if wearing a matched set of Light Armor', false, true, false, 1, 70, 5),
	(134, 13, 'Deft Movement', '10% chance to reflect melee damage back to the enemy while wearing all Light Armor: head, chest, hands, feet.', false, false, false, 1, 100, 6);

--sneak
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(135, 14, 'Stealth', 'You are 20% harder to detect when sneaking', false, true, false, 5, 0, 1),
	(136, 14, 'Muffled Movement', 'Noise from armor is reduced by 50%', false, true, false, 1, 30, 2),
	(137, 14, 'Backstab', 'Sneak attacks with one-handed weapons now do six times damage.', false, true, false, 1, 30, 2),
	(138, 14, 'Light Foot', 'You wont trigger pressure plates', false, false, false, 1, 40, 3),
	(139, 14, 'Deadly Aim', 'Sneak attacks with bows now do three times damage.', false, true, false, 1, 40, 3),
	(140, 14, 'Silent Roll', 'Sprinting while sneaking executes a silent forward roll', false, false, false, 1, 50, 4),
	(141, 14, 'Assassins Blade', 'Sneak attacks with daggers now do a total of fifteen times normal damage.', false, true, false, 1, 50, 4),
	(142, 14, 'Silence', 'Walking and running does not affect detection', false, true, false, 1, 70, 5),
	(143, 14, 'Shadow Warrior', 'Crouching stops combat for a moment and forces distant opponents to search for a target', false, false, false, 1, 100, 6);

--lockpicking
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(144, 15, 'Novice Locks', 'Novice locks are much easier to pick', false, true, false, 1, 0, 1),
	(145, 15, 'Apprentice  Locks', 'Apprentice locks are much easier to pick', false, true, false, 1, 25, 2),
	(146, 15, 'Quick Hands', 'Able to pick locks without being noticed', false, false, false, 1, 40, 3),
	(147, 15, 'Wax Key', 'Automatically gives you a copy of a picked locks key if it has one', false, false, false, 1, 50, 4),
	(148, 15, 'Adept Locks', 'Adept locks are much easier to pick', false, true, false, 1, 50, 4),
	(149, 15, 'Golden Touch', 'Find more gold in chests', false, false, false, 1, 60, 5),
	(150, 15, 'Treasure Hunter', '50% greater chance of finding special treasure', false, false, false, 1, 70, 6),
	(151, 15, 'Expert Locks', 'Expert locks are much easier to pick', false, true, false, 1, 75, 6),
	(152, 15, 'Locksmith', 'Pick starts close to the lock opening position', false, false, false, 1, 80, 7),
	(153, 15, 'Unbreakable', 'Lockpicks never break', false, false, false, 1, 100, 8),
	(154, 15, 'Master Locks', 'Master locks are much easier to pick', false, true, false, 1, 100, 8);

--pickpocket
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(155, 16, 'Light Fingers', 'Pickpocketing bonus of 20%. Item weight and value reduce pickpocketing odds', false, true, false, 5, 0, 1),
	(156, 16, 'Night Thief', '+25% chance to pickpocket if the target is asleep', false, true, false, 1, 30, 2),
	(157, 16, 'Poisoned', 'Silently harm enemies by placing poisons in their pockets', false, false, false, 1, 40, 3),
	(158, 16, 'Cutpurse', 'Pickpocketing gold becomes 50% easier', false, false, false, 1, 40, 3),
	(159, 16, 'Extra Pockets', 'Carrying capacity is increased by 100.', false, true, false, 1, 50, 4),
	(160, 16, 'Keymaster', 'Pickpocketing keys almost always works', false, false, false, 1, 60, 5),
	(161, 16, 'Misdirection', 'Can pickpocket equipped weapons (when hidden)', false, true, false, 1, 70, 6),
	(162, 16, 'Perfect Touch', 'Can pickpocket equipped items, clothes and armor (when hidden)', false, false, false, 1, 100, 7);

--speech
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(163, 17, 'Haggling', 'Buying and selling prices are 10% better', false, true, false, 5, 0, 1),
	(164, 17, 'Allure', '10% better prices with the opposite sex', false, false, false, 1, 30, 2),
	(165, 17, 'Bribery', 'Can bribe guards to ignore crimes', false, true, false, 1, 30, 2),
	(166, 17, 'Merchant', 'Can sell any type of item to any kind of merchant', false, true, false, 1, 50, 3),
	(167, 17, 'Persuasion', 'Persuasion attempts are 30% easier', false, true, false, 1, 50, 3),
	(168, 17, 'Investor', 'Can invest 500 gold with a shopkeeper to increase their available gold permanently', false, false, false, 1, 70, 4),
	(169, 17, 'Intimidation', 'Intimidation is twice as successful', false, true, false, 1, 70, 4),
	(170, 17, 'Fence', 'Can barter stolen goods with any merchant the Dragonborn has invested in', false, false, false, 1, 90, 5),
	(171, 17, 'Master Trader', 'Every merchant in the world gains 1000 gold for bartering', false, false, false, 1, 100, 6);

--alchemy
insert into skill_node (id, skill_id, name, description, activated, essential, specific, perks_available, skill_level_needed, position) values
	(172, 18, 'Alchemist', 'Potions and poisons are 20% / 40% / 60% / 80% / 100% stronger.', false, true, false, 5, 0, 1),
	(173, 18, 'Physician', 'Potions you mix that restore health or stamina are 25% more powerful.', false, true, false, 1, 20, 2),
	(174, 18, 'Poisoner', 'Poisons you mix are 25% more effective.', false, true, false, 1, 30, 3),
	(175, 18, 'Benefactor', 'Potions you mix with beneficial effects have an additional 25% greater magnitude.', false, true, false, 1, 30, 3),
	(176, 18, 'Experimenter', 'Eating an ingredient reveals the first two / three / four effects.', false, false, false, 3, 50, 4),
	(177, 18, 'Concentrated Poison', 'Poisons applied to weapons last for twice as many hits.', false, true, false, 1, 60, 5),
	(178, 18, 'Green Thumb', 'Two ingredients are gathered from plants', false, false, false, 1, 70, 6),
	(179, 18, 'Snakeblood', '50% resistance to all poisons.', false, true, false, 1, 80, 7),
	(180, 18, 'Purity', 'All negative effects are removed from created potions while all positive effects are removed from created poisons.', false, false, false, 1, 100, 8);
