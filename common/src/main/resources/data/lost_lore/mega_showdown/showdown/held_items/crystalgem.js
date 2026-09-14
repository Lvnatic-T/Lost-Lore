{
	name: "Crystal Gem",
	spritenum: 10101,
	isGem: true,
	onSourceTryPrimaryHit(target, source, move) {
		if (target === source || move.category === 'Status') return;
		if (move.type === 'Crystal' && source.useItem()) {
			source.addVolatile('gem');
		}
	},
	num: 10101,
	gen: 5,
	isNonstandard: "Past",
}
