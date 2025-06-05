class Stalker (
    val age:Int? = 30,
    var Inzone:Boolean = true,
    var Location:String = "Bar",
    var Rank: String = "Newcomer",
    var NameOrNickname: String = "Unknown",
    var Attitude: String = "Neutral",
    var Group: String = "Stalker",
    var Score: Int = 0,
    var Equipment: MutableList<String> = mutableListOf("Knife")
    )
{   fun SwitchGroup( NewGroup: String){
        var AvailableGroups = listOf("Stalker","Bandit","Duty","Freedom","Monolith","Clear Sky","Scientists","Mercenaries","Hunters" )
        if (NewGroup in AvailableGroups) {
         Group = NewGroup
    }
        else {
        println("Unknown group")
    }
}

    fun SwitchLocation ( NewLocation: String){
        Location = NewLocation
    }
    fun SwichAttitude (NewAttitude: String){
        Attitude = NewAttitude
    }

    fun SwitchRank (NewRank:String){
        var Ranks = listOf("Newcomner","Experienced","Ветеран","Master")
        if (NewRank in Ranks){
            Rank = NewRank
        }
        else{
            println("Unknown Rank")
        }

    }
    fun AddEquipment (NewItem:String){
        Equipment.add(NewItem)
    }


}
