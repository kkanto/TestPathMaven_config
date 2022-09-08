 
listView('TestPathMaven Jobs') {
    description('TestPathMaven Jobs')
    jobs {
        regex('TestPathMaven_.+')
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
