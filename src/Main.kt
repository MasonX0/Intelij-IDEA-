fun main(){
    var Wolf = Stalker(NameOrNickname = "Wolf", Rank = "Veteran", Location = "Newcomer's vilage", Group = "Stalker")
    Wolf.SwitchRank("Master")
    Wolf.SwitchLocation("Army Depots")
    Wolf.AddEquipment("Ak-74M")
    Wolf.AddEquipment("\"Soul\"")
    Wolf.AddEquipment("F-1")
    Wolf.SwitchGroup("Bandit")
    println("Ранг сталкера Wolf: ${Wolf.Rank} \nЕго локация: ${Wolf.Location}\nЕго Группировка: ${Wolf.Group} \nЕго снаряга: ${Wolf.Equipment}" )


}