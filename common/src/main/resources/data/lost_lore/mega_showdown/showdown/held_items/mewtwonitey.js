({
    name: "Mewtwonite Y",
    spritenum: 601,
    megaStone: {
      "Mewtwo": "Mewtwo-Mega-Y",
      "Mewtwo-Armored": "Mewtwo-Mega-Y"
    },
    itemUser: ["Mewtwo", "Mewtwo-Armored"],
    onTakeItem(item, source) {
    	return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 663,
    gen: 6,
    isNonstandard: "Past",
})