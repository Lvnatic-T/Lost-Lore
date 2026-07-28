({
    name: "Blastoisinite",
    spritenum: 586,
    megaStone: {
        "Blastoise": "Blastoise-Mega",
        "Blastoise-Clone": "Blastoise-Clone-Mega"
    },
    itemUser: ["Blastoise", "Blastoise-Clone"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 678,
    gen: 6,
    isNonstandard: "Past",
})