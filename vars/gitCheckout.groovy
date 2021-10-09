def call(Map config) {

    checkout(
    [$class: 'GitSCM', 
    branches: [[name: config.name]], 
    userRemoteConfigs: [[url: config.url]]]
    )
}