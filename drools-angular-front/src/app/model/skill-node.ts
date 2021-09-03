export interface SkillNode{
    id?: number,
	skillName: string,
	name: string,
	description: string,
	essential: boolean,
	specific: boolean,
	perksAvailable: number,
	skillLevelNeeded: number,
	activated: number
}