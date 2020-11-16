package com.ffix.engine.characters

import com.ffix.engine.characters.equipment.CharacterEquipment
import com.ffix.engine.characters.stats.CharacterStats
import com.ffix.engine.items.EquipmentItem

open class Character(
    private val characterStats: CharacterStats = CharacterStats(),
    private val characterEquipment: CharacterEquipment = CharacterEquipment()
) {

    fun equipItem(item: EquipmentItem) {
        characterEquipment.equip(item)
    }

}
