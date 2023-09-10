package enrich.waste.adminpage.navigation

sealed class Screens(val route: String) {
    object Admin : Screens("admin")
    object CollectWaste : Screens("collectwaste")
    object Decision : Screens("decision")

}