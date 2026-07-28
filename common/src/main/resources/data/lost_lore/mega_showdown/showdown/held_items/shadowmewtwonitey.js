({
    name: "Shadow Mewtwonite Y",
    spritenum: 601,
    megaStone: {"Mewtwo-Shadow": "Mewtwo-Mega-SY"},
    itemUser: ["Mewtwo-Shadow"],
    onTakeItem(item, source) {
    	return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: -663,
    gen: 6,
    isNonstandard: "Past",
})