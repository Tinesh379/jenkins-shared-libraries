def call(Map config) {

    sh "cd ${workspace}/${project}/"
    sh "ls -altr"
    sh "Building the Code Now"
    sh "mvn clean package"
}