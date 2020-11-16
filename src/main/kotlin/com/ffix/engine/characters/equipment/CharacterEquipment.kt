package com.ffix.engine.characters.equipment

import com.ffix.engine.items.*

class CharacterEquipment {

    private var weaponEquipment: WeaponItem = NoEquipmentItem()
    private var headEquipment: HeadItem = NoEquipmentItem()
    private var wristEquipment: WristItem = NoEquipmentItem()
    private var vestEquipment: VestItem = NoEquipmentItem()
    private var accessoryEquipment: AccessoryItem = NoEquipmentItem()

    fun equip(item: EquipmentItem) {
        when (item) {
            is WeaponItem -> equipWeapon(item)
            is HeadItem -> equipHead(item)
            is WristItem -> equipWrist(item)
            is VestItem -> equipVest(item)
            is AccessoryItem -> equipAccessory(item)
            else -> throw IllegalArgumentException()
        }
    }

    private fun equipWeapon(weaponItem: WeaponItem) {
        weaponEquipment = weaponItem
    }

    private fun equipHead(headItem: HeadItem) {
        headEquipment = headItem
    }

    private fun equipWrist(wristItem: WristItem) {
        wristEquipment = wristItem
    }

    private fun equipVest(vestItem: VestItem) {
        vestEquipment = vestItem
    }

    private fun equipAccessory(accessoryItem: AccessoryItem) {
        accessoryEquipment = accessoryItem
    }
}
