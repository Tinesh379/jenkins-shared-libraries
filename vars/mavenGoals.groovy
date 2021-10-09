def call(Map config) {

    sh "cd ${workspace}/${project_name}/"
    sh "ls -altr"
    sh "Building the Code Now"
    sh "mvn clean package"
}