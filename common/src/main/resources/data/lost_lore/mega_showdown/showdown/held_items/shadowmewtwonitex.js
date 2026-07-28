({
    name: "Shadow Mewtwonite X",
    spritenum: 600,
    megaStone: {"Mewtwo-Shadow": "Mewtwo-Mega-SX"},
    itemUser: ["Mewtwo-Shadow"],
    onTakeItem(item, source) {
    	return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: -662,
    gen: 6,
    isNonstandard: "Past",
})