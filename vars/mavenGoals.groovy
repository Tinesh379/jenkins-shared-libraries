def call(Map config = [:]) {

    sh "cd ${workspace}/"
    sh "ls -altr"
    sh "echo 'Building the Code Now'"
    sh "mvn clean package"
}