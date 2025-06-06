//import javax.management.ImmutableDescriptor
//
//class Stalker (
//    val age:Int? = 30,
//    var Inzone:Boolean = true,
//    var Location:String = "Bar",
//    var Rank: String = "Newcomer",
//    var NameOrNickname: String = "Unknown",
//    var Attitude: String = "Neutral",
//    var Group: String = "Stalker",
//    var Score: Int = 0,
//    var Equipment: MutableList<String> = mutableListOf("Knife")
//    )
//{   fun SwitchGroup( NewGroup: String){
//        var AvailableGroups = listOf("Stalker","Bandit","Duty","Freedom","Monolith","Clear Sky","Scientists","Mercenaries","Hunters" )
//        if (NewGroup in AvailableGroups) {
//         Group = NewGroup
//    }
//        else {
//        println("Unknown group")
//    }
//}
//
//    fun SwitchLocation ( NewLocation: String){
//        Location = NewLocation
//    }
//    fun SwichAttitude (NewAttitude: String){
//        Attitude = NewAttitude
//    }
//
//    fun SwitchRank (NewRank:String){
//        var Ranks = listOf("Newcomner","Experienced","Ветеран","Master")
//        if (NewRank in Ranks){
//            Rank = NewRank
//        }
//        else{
//            println("Unknown Rank")
//        }
//
//    }
//    fun AddEquipment (NewItem:String){
//        Equipment.add(NewItem)
//    }
//
//
//}



open class Character constructor(val Name: String,
                                 var Inventory: MutableList<String> = mutableListOf(),
                                 var _Health: Int = 100) {

    init{
        println("Персонаж создан")
    }

    open fun Takedamage(damage:Int){
        _Health-=damage
    }
    open fun MakeSound(){
        println("Здарова, я $Name")
    }
    open fun TakeItem(Item: String){
        Inventory.add(Item)
        println("Теперь в инвентаре у $Name : $Inventory")
    }

}
class Bandit (Name: String, Inventory: MutableList<String>, _Health: Int): Character(Name,Inventory,_Health){
    var Health : Int
        get() {if (_Health<=0) {
            println("Персонаж мертв")
            return 0
        } else {
            println("Здоровье персонажа $Name: ${this._Health}")
            return _Health
        }}
        private set(value) {_Health = value}

    override fun MakeSound() {
        println("Опана, а ну стоять, Фраерок!")
    }

    override fun Takedamage(damage: Int) {
        if ((1..100).random() >20) { if (_Health<=0){
            _Health = 0
            println("$Name мертв(а)")}
        else {
            super.Takedamage(damage)
            if (_Health<=0){
                _Health = 0
                println("$Name мертв(а)")}
             else println("Нанесен урон $damage \nЗдоровье $Name: ${this._Health}")}}
        else {println("Бандит увернулся от урона")}

    }

    override fun TakeItem(Item: String) {
        println("Ага, ништяк")
        Inventory.add(Item)
        println("Теперь в инвентаре у $Name : $Inventory")
    }
}



