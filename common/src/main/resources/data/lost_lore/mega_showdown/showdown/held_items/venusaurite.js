({
    name: "Venusaurite",
    spritenum: 586,
    megaStone: {
        "Venusaur": "Venusaur-Mega",
        "Venusaur-Clone": "Venusaur-Clone-Mega"
    },
    itemUser: ["Venusaur", "Venusaur-Clone"],
    onTakeItem(item, source) {
        return !item.megaStone?.[source.baseSpecies.baseSpecies];
    },
    num: 678,
    gen: 6,
    isNonstandard: "Past",
})