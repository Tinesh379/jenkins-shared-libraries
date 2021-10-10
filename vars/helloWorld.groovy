def call (Map  config = [:]){

     sh "echo'Hi $config.name, how are you?'"
     sh "echo'Today is $config.day'"
}