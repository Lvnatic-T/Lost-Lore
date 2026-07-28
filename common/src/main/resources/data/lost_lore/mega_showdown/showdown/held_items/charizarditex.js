({
    name: "Charizardite X",
    spritenum: 585,
    megaStone: {
        "Charizard": "Charizard-Mega-X",
        "Charizard-Clone": "Charizard-Clone-Mega-X"
    },
    itemUser: ["Charizard", "Charizard-Clone"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 660,
    gen: 6,
    isNonstandard: "Past",
})