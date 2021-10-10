def call (Map  config = [:]){

     sh "echo 'Hi $config.name'"
     sh "echo 'Today is $config.day'"
}