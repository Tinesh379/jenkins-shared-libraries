def call(Map config = [:]) {
    
    if(isUnix()){
        
    sh "cd ${workspace}/"
    sh "ls -altr"
    sh "echo 'Building the Code Now'"
    sh "mvn clean package"
    }
    else{
        
    bat "cd ${workspace}/"
    bat "dir"
    bat "echo 'Building the Code Now'"
    bat "mvn clean package"
             
}
