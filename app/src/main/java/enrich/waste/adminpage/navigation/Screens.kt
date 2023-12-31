package enrich.waste.adminpage.navigation

sealed class Screens(val route: String) {
    object Admin : Screens("admin")
    object CollectWaste : Screens("collectwaste")
    object Decision : Screens("decision")
    object StartScreen : Screens("SplashScreen")
    object AfterCollectedWaste : Screens("AfterCollectedWaste")
    object AfterCollectedDecision : Screens("AfterCollectedDecision")

}