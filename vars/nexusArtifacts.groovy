def call(Map config = [:]) {

    pom = readMavenPom file: 'pom.xml'
    filesByGlob = findFiles  glob: 'target/*.${pom.packaging}'
    artifactPath = filesByGlob[0].path

    nexusArtifactUploader artifacts: 
    [[artifactId: 'pom.artifactId', 
    classifier: '', 
    file: artifactPath,
    type: 'pom.packaging']], 
    credentialsId: 'nexus', 
    groupId: 'pom.groupId', 
    nexusUrl: 'localhost:8081', 
    nexusVersion: 'nexus3',
    protocol: 'http', 
    repository: config.repository, 
    version: 'pom.version'
}