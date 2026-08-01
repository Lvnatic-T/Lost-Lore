{
	name: "Eternal Bloom",
	num: 3101,
	rating: 5,
	flags: {},

	onBasePowerPriority: 23,
	onBasePower(basePower, attacker, defender, move) {
    	if (move.type === 'Fairy') {
    		return this.chainModify([5325, 4096]);
    	}
    },

    onDamagePriority: -1,
    onDamage(damage, target, source, effect) {
    	if (!target || !target.hp) return;
    	if (!effect || effect.effectType !== 'Move') return;
    	if (!source) return;
    	if (target.eternalBloomUsed) return;
    	if (target.hp - damage <= target.maxhp / 3) {
    		target.eternalBloomUsed = true;
    		for (const ally of target.side.active) {
    			if (!ally || ally.fainted) continue;
    			this.boost({spa: 2}, ally, target, null, true);
    			this.heal(Math.floor(ally.baseMaxhp / 4), ally);
    		}
    		this.field.addPseudoWeather('trickroom', target);
    	}
    }
}