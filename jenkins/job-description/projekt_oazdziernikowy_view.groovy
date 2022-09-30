 
listView('projekt_oazdziernikowy Jobs') {
    description('projekt_oazdziernikowy Jobs')
    jobs {
        regex('projekt_oazdziernikowy_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
