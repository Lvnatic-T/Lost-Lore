({
    name: "Charizardite Y",
    spritenum: 586,
    megaStone: {
        "Charizard": "Charizard-Mega-Y",
        "Charizard-Clone": "Charizard-Clone-Mega-Y"
    },
    itemUser: ["Charizard", "Charizard-Clone"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 678,
    gen: 6,
    isNonstandard: "Past",
})