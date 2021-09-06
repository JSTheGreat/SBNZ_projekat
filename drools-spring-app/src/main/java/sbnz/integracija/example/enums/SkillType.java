package sbnz.integracija.example.enums;

public enum SkillType {
	
	ATTACK,
	DEFENSE,
	ASSIST;
	
	private static SkillType[] vals = values();
	
    public SkillType next()
    {
        return vals[(this.ordinal()+1) % vals.length];
    }

}
