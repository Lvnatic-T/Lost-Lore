({
    name: "Slowbrogonite",
    spritenum: 620,
    megaStone: {"Slowbro-Galar": "Slowbro-Mega-Y"},
    itemUser: ["Slowbro-Galar"],
    onTakeItem(item, source) {
    	return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: -760,
    gen: 6,
    isNonstandard: "Past",
})