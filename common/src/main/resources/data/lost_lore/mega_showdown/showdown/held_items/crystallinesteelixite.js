({
    name: "Crystalline Steelixite",
    spritenum: 621,
    megaStone: { "Steelix-Crystal": "Steelix-Crystal-Mega" },
    itemUser: ["Steelix-Crystal"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: -761,
    gen: 6,
    isNonstandard: "Past",
})