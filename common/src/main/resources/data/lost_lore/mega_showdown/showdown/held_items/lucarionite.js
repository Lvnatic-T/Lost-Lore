({
  name: "Lucarionite",
	spritenum: 594,
	megaStone: {
	  "Lucario": "Lucario-Mega"
	  "Lucario-PMD-Scarf": "Lucario-Mega"
	  "Lucario-PSMD-Scarf": "Lucario-Mega"
	  "Lucario-Cafe-Costume": "Lucario-Mega"
	  "Lucario-Captain-Costume": "Lucario-Mega"
	  "Lucario-Chef-Costume": "Lucario-Mega"
	  "Lucario-Concert-Costume": "Lucario-Mega"
	  "Lucario-Costume_Party-Costume": "Lucario-Mega"
	  "Lucario-Holiday-Costume": "Lucario-Mega"
	  "Lucario-Martial_Arts-Costume": "Lucario-Mega"
	  "Lucario-Ruins-Costume": "Lucario-Mega"
	  "Lucario-Space-Costume": "Lucario-Mega"
	},
	itemUser: [
	  "Lucario",
      "Lucario-PMD-Scarf",
      "Lucario-PSMD-Scarf",
      "Lucario-Cafe-Costume",
      "Lucario-Captain-Costume",
      "Lucario-Chef-Costume",
      "Lucario-Concert-Costume",
      "Lucario-Costume_Party-Costume",
      "Lucario-Holiday-Costume",
      "Lucario-Martial_Arts-Costume" ,
      "Lucario-Ruins-Costume" ,
      "Lucario-Space-Costume"
	],
	onTakeItem(item, source) {
		return !item.megaStone?.[source.baseSpecies.baseSpecies];
	},
	num: 673,
	gen: 6,
	isNonstandard: "Past",
})