export interface Skill{
    id?: number,
    playerId: number,
    subsets: Map<string, number>,
    name: string,
    level: number,
    type: string,
    priority: number,
    orientation: string
}