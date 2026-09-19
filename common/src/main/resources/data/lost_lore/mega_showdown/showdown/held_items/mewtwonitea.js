({
    name: "Shadow Mewtwonite X",
    spritenum: 600,
    megaStone: {"Mewtwo-Armored": "Mewtwo-Mega-Armored"},
    itemUser: ["Mewtwo-Armored"],
    onTakeItem(item, source) {
    	return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: -662,
    gen: 6,
    isNonstandard: "Past",
})